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
import java.util.Map;
import java.util.HashMap;
public class InternalTransitionLabelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'/'", "','", "'('", "')'", "':='", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'not'", "'or'", "'and'", "'pre'", "'+'", "'-'", "'*'", "'div'", "'mod'"
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
            ruleMemo = new HashMap[88+1];
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:74:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:74:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:75:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction79);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction89); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:82:1: ruleAction returns [EObject current=null] : ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        EObject lv_trigger_2 = null;

        EObject lv_effects_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:6: ( ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:88:1: ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:88:1: ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:88:2: (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:88:2: (lv_isImmediate_0= '#' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:90:6: lv_isImmediate_0= '#'
                    {
                    lv_isImmediate_0=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleAction135); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0(), "isImmediate"); 
                          
                    }
                    if ( backtracking==0 ) {

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

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:109:3: (lv_delay_1= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_INT && LA2_1<=RULE_BOOLEAN)||LA2_1==14||LA2_1==16||LA2_1==19||LA2_1==25||LA2_1==28) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:111:6: lv_delay_1= RULE_INT
                    {
                    lv_delay_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction171); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_1_0(), "delay"); 
                      	
                    }
                    if ( backtracking==0 ) {

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

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:129:3: (lv_trigger_2= ruleBooleanExpression )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_BOOLEAN)||LA3_0==16||LA3_0==19||LA3_0==25||LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:132:6: lv_trigger_2= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAction214);
                    lv_trigger_2=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:150:3: ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:150:4: '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )*
                    {
                    match(input,14,FOLLOW_14_in_ruleAction229); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:154:1: ( (lv_effects_4= ruleEffect ) ( ',' )? )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:154:2: (lv_effects_4= ruleEffect ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:154:2: (lv_effects_4= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:157:6: lv_effects_4= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleAction264);
                    	    lv_effects_4=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

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

                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:175:2: ( ',' )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==15) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:175:3: ','
                    	            {
                    	            match(input,15,FOLLOW_15_in_ruleAction278); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_3_1_1(), null); 
                    	                  
                    	            }

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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:186:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:186:48: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:187:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect317);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect327); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:194:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_HostCode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:199:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:200:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:200:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
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
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("200:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("200:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:201:5: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect374);
                    this_Emission_0=ruleEmission();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Emission_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:211:5: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect401);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:221:5: this_HostCode_2= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleEffect428);
                    this_HostCode_2=ruleHostCode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_HostCode_2; 
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
    // $ANTLR end ruleEffect


    // $ANTLR start entryRuleEmission
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:236:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:236:50: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:237:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission460);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission470); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:244:1: ruleEmission returns [EObject current=null] : ( ( RULE_ID ) ( ( '(' (lv_newValue_2= ruleValueExpression ) ')' ) | ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' ) )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2 = null;

        EObject lv_newValue_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:249:6: ( ( ( RULE_ID ) ( ( '(' (lv_newValue_2= ruleValueExpression ) ')' ) | ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:250:1: ( ( RULE_ID ) ( ( '(' (lv_newValue_2= ruleValueExpression ) ')' ) | ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:250:1: ( ( RULE_ID ) ( ( '(' (lv_newValue_2= ruleValueExpression ) ')' ) | ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' ) )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:250:2: ( RULE_ID ) ( ( '(' (lv_newValue_2= ruleValueExpression ) ')' ) | ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:250:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:253:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission517); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:2: ( ( '(' (lv_newValue_2= ruleValueExpression ) ')' ) | ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred9()) ) {
                    alt8=1;
                }
                else if ( (synpred10()) ) {
                    alt8=2;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:3: ( '(' (lv_newValue_2= ruleValueExpression ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:3: ( '(' (lv_newValue_2= ruleValueExpression ) ')' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:4: '(' (lv_newValue_2= ruleValueExpression ) ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleEmission531); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:270:1: (lv_newValue_2= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:273:6: lv_newValue_2= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleEmission565);
                    lv_newValue_2=ruleValueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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

                    }

                    match(input,17,FOLLOW_17_in_ruleEmission578); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:296:6: ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:296:6: ( '(' (lv_newValue_5= ruleBooleanExpression ) ')' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:296:7: '(' (lv_newValue_5= ruleBooleanExpression ) ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleEmission595); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:300:1: (lv_newValue_5= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:303:6: lv_newValue_5= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleEmission629);
                    lv_newValue_5=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "newValue", lv_newValue_5, "BooleanExpression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,17,FOLLOW_17_in_ruleEmission642); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2(), null); 
                          
                    }

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
    // $ANTLR end ruleEmission


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:332:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:332:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:333:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment678);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment688); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:340:1: ruleAssignment returns [EObject current=null] : ( ( RULE_ID ) ':=' ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2 = null;

        EObject lv_expression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:345:6: ( ( ( RULE_ID ) ':=' ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:346:1: ( ( RULE_ID ) ':=' ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:346:1: ( ( RULE_ID ) ':=' ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:346:2: ( RULE_ID ) ':=' ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:346:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:349:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment735); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }

            match(input,18,FOLLOW_18_in_ruleAssignment747); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA9_1 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA9_5 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA9_6 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )", 9, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 25:
                {
                alt9=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("366:1: ( (lv_expression_2= ruleValueExpression ) | (lv_expression_3= ruleBooleanExpression ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:366:2: (lv_expression_2= ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:366:2: (lv_expression_2= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:369:6: lv_expression_2= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleAssignment782);
                    lv_expression_2=ruleValueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:388:6: (lv_expression_3= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:388:6: (lv_expression_3= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:391:6: lv_expression_3= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAssignment826);
                    lv_expression_3=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "expression", lv_expression_3, "BooleanExpression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:416:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:416:57: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:417:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference864);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference874); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:424:1: ruleSignalReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:429:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:430:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:430:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:433:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReference920); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0(), "signal"); 
              	
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
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:453:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:453:59: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:454:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference955);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference965); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:461:1: ruleVariableReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:466:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:467:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:467:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:470:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getVariableReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference1011); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0(), "variable"); 
              	
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
    // $ANTLR end ruleVariableReference


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:494:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:494:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:495:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1050);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1060); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:502:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INT ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:507:6: ( (lv_value_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:508:1: (lv_value_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:508:1: (lv_value_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:510:6: lv_value_0= RULE_INT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue1106); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
              	
            }
            if ( backtracking==0 ) {

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
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleFloatValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:535:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:535:52: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:536:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1146);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1156); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:543:1: ruleFloatValue returns [EObject current=null] : (lv_value_0= RULE_FLOAT ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:548:6: ( (lv_value_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:549:1: (lv_value_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:549:1: (lv_value_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:551:6: lv_value_0= RULE_FLOAT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue1202); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0(), "value"); 
              	
            }
            if ( backtracking==0 ) {

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
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleBooleanValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:576:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:576:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:577:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1242);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1252); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:584:1: ruleBooleanValue returns [EObject current=null] : (lv_value_0= RULE_BOOLEAN ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:589:6: ( (lv_value_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:590:1: (lv_value_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:590:1: (lv_value_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:592:6: lv_value_0= RULE_BOOLEAN
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue1298); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0(), "value"); 
              	
            }
            if ( backtracking==0 ) {

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
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:619:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:619:54: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:620:2: iv_ruleValOperation= ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation1340);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation1350); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:627:1: ruleValOperation returns [EObject current=null] : ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:632:6: ( ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:633:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:633:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:633:2: (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:633:2: (lv_operator_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:636:6: lv_operator_0= ruleValOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation1409);
            lv_operator_0=ruleValOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:654:2: (lv_subExpressions_1= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:657:6: lv_subExpressions_1= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation1447);
            lv_subExpressions_1=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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
    // $ANTLR end ruleValOperation


    // $ANTLR start entryRuleValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:682:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:682:57: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:683:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression1484);
            iv_ruleValueExpression=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression1494); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:690:1: ruleValueExpression returns [EObject current=null] : this_PlusOperation_0= rulePlusOperation ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOperation_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:695:6: (this_PlusOperation_0= rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:697:5: this_PlusOperation_0= rulePlusOperation
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getPlusOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValueExpression1540);
            this_PlusOperation_0=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PlusOperation_0; 
                      currentNode = currentNode.getParent();
                  
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
    // $ANTLR end ruleValueExpression


    // $ANTLR start entryRuleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:712:1: entryRuleParanthesedValueExpression returns [EObject current=null] : iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF ;
    public final EObject entryRuleParanthesedValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:712:68: (iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:713:2: iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression1571);
            iv_ruleParanthesedValueExpression=ruleParanthesedValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValueExpression1581); if (failed) return current;

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
    // $ANTLR end entryRuleParanthesedValueExpression


    // $ANTLR start ruleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:720:1: ruleParanthesedValueExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | ( '(' this_PlusOperation_5= rulePlusOperation ')' ) ) ;
    public final EObject ruleParanthesedValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValOperation_2 = null;

        EObject this_VariableReference_3 = null;

        EObject this_PlusOperation_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:725:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | ( '(' this_PlusOperation_5= rulePlusOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:726:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | ( '(' this_PlusOperation_5= rulePlusOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:726:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | ( '(' this_PlusOperation_5= rulePlusOperation ')' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            case 16:
                {
                alt10=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("726:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | ( '(' this_PlusOperation_5= rulePlusOperation ')' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:727:5: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression1628);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:737:5: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression1655);
                    this_FloatValue_1=ruleFloatValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:747:5: this_ValOperation_2= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression1682);
                    this_ValOperation_2=ruleValOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:757:5: this_VariableReference_3= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression1709);
                    this_VariableReference_3=ruleVariableReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_VariableReference_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:766:6: ( '(' this_PlusOperation_5= rulePlusOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:766:6: ( '(' this_PlusOperation_5= rulePlusOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:766:7: '(' this_PlusOperation_5= rulePlusOperation ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleParanthesedValueExpression1724); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression1746);
                    this_PlusOperation_5=rulePlusOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PlusOperation_5; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FOLLOW_17_in_ruleParanthesedValueExpression1754); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_4_2(), null); 
                          
                    }

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
    // $ANTLR end ruleParanthesedValueExpression


    // $ANTLR start entryRulePlusOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:790:1: entryRulePlusOperation returns [EObject current=null] : iv_rulePlusOperation= rulePlusOperation EOF ;
    public final EObject entryRulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:790:55: (iv_rulePlusOperation= rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:791:2: iv_rulePlusOperation= rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPlusOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation1788);
            iv_rulePlusOperation=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePlusOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation1798); if (failed) return current;

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
    // $ANTLR end entryRulePlusOperation


    // $ANTLR start rulePlusOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:798:1: rulePlusOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation ( () (lv_operator_2= rulePlusOperator ) (lv_subExpressions_3= ruleMultOperation ) )* ) ;
    public final EObject rulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOperation_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:803:6: ( (this_MultOperation_0= ruleMultOperation ( () (lv_operator_2= rulePlusOperator ) (lv_subExpressions_3= ruleMultOperation ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:804:1: (this_MultOperation_0= ruleMultOperation ( () (lv_operator_2= rulePlusOperator ) (lv_subExpressions_3= ruleMultOperation ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:804:1: (this_MultOperation_0= ruleMultOperation ( () (lv_operator_2= rulePlusOperator ) (lv_subExpressions_3= ruleMultOperation ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:805:5: this_MultOperation_0= ruleMultOperation ( () (lv_operator_2= rulePlusOperator ) (lv_subExpressions_3= ruleMultOperation ) )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getMultOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultOperation_in_rulePlusOperation1845);
            this_MultOperation_0=ruleMultOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:813:1: ( () (lv_operator_2= rulePlusOperator ) (lv_subExpressions_3= ruleMultOperation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=29 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:813:2: () (lv_operator_2= rulePlusOperator ) (lv_subExpressions_3= ruleMultOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:813:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:814:5: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:829:2: (lv_operator_2= rulePlusOperator )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:832:6: lv_operator_2= rulePlusOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOperator_in_rulePlusOperation1888);
            	    lv_operator_2=rulePlusOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPlusOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "operator", lv_operator_2, "PlusOperator", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:850:2: (lv_subExpressions_3= ruleMultOperation )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:853:6: lv_subExpressions_3= ruleMultOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperation_in_rulePlusOperation1926);
            	    lv_subExpressions_3=ruleMultOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPlusOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "subExpressions", lv_subExpressions_3, "MultOperation", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end rulePlusOperation


    // $ANTLR start entryRuleMultOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:878:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:878:55: (iv_ruleMultOperation= ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:879:2: iv_ruleMultOperation= ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation1965);
            iv_ruleMultOperation=ruleMultOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation1975); if (failed) return current;

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
    // $ANTLR end entryRuleMultOperation


    // $ANTLR start ruleMultOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:886:1: ruleMultOperation returns [EObject current=null] : (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () (lv_operator_2= ruleMultOperator ) (lv_subExpressions_3= rulePreOrNormalValueExpression ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValueExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:891:6: ( (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () (lv_operator_2= ruleMultOperator ) (lv_subExpressions_3= rulePreOrNormalValueExpression ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:892:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () (lv_operator_2= ruleMultOperator ) (lv_subExpressions_3= rulePreOrNormalValueExpression ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:892:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () (lv_operator_2= ruleMultOperator ) (lv_subExpressions_3= rulePreOrNormalValueExpression ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:893:5: this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () (lv_operator_2= ruleMultOperator ) (lv_subExpressions_3= rulePreOrNormalValueExpression ) )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation2022);
            this_PreOrNormalValueExpression_0=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:901:1: ( () (lv_operator_2= ruleMultOperator ) (lv_subExpressions_3= rulePreOrNormalValueExpression ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=31 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:901:2: () (lv_operator_2= ruleMultOperator ) (lv_subExpressions_3= rulePreOrNormalValueExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:901:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:902:5: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:917:2: (lv_operator_2= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:920:6: lv_operator_2= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultOperation2065);
            	    lv_operator_2=ruleMultOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "operator", lv_operator_2, "MultOperator", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:938:2: (lv_subExpressions_3= rulePreOrNormalValueExpression )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:941:6: lv_subExpressions_3= rulePreOrNormalValueExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation2103);
            	    lv_subExpressions_3=rulePreOrNormalValueExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "subExpressions", lv_subExpressions_3, "PreOrNormalValueExpression", currentNode);
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
    // $ANTLR end ruleMultOperation


    // $ANTLR start entryRulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:966:1: entryRulePreArithmOperation returns [EObject current=null] : iv_rulePreArithmOperation= rulePreArithmOperation EOF ;
    public final EObject entryRulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreArithmOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:966:60: (iv_rulePreArithmOperation= rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:967:2: iv_rulePreArithmOperation= rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreArithmOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation2142);
            iv_rulePreArithmOperation=rulePreArithmOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreArithmOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation2152); if (failed) return current;

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
    // $ANTLR end entryRulePreArithmOperation


    // $ANTLR start rulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:974:1: rulePreArithmOperation returns [EObject current=null] : ( (lv_operator_0= ruleOperatorPre ) (lv_subExpressions_1= ruleParanthesedValueExpression ) ) ;
    public final EObject rulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:979:6: ( ( (lv_operator_0= ruleOperatorPre ) (lv_subExpressions_1= ruleParanthesedValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:980:1: ( (lv_operator_0= ruleOperatorPre ) (lv_subExpressions_1= ruleParanthesedValueExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:980:1: ( (lv_operator_0= ruleOperatorPre ) (lv_subExpressions_1= ruleParanthesedValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:980:2: (lv_operator_0= ruleOperatorPre ) (lv_subExpressions_1= ruleParanthesedValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:980:2: (lv_operator_0= ruleOperatorPre )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:983:6: lv_operator_0= ruleOperatorPre
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getOperatorOperatorPreEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOperatorPre_in_rulePreArithmOperation2211);
            lv_operator_0=ruleOperatorPre();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreArithmOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "operator", lv_operator_0, "OperatorPre", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1001:2: (lv_subExpressions_1= ruleParanthesedValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1004:6: lv_subExpressions_1= ruleParanthesedValueExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getSubExpressionsParanthesedValueExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParanthesedValueExpression_in_rulePreArithmOperation2249);
            lv_subExpressions_1=ruleParanthesedValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreArithmOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "subExpressions", lv_subExpressions_1, "ParanthesedValueExpression", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // $ANTLR end rulePreArithmOperation


    // $ANTLR start entryRulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1029:1: entryRulePreOrNormalValueExpression returns [EObject current=null] : iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF ;
    public final EObject entryRulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreOrNormalValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1029:68: (iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1030:2: iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreOrNormalValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression2286);
            iv_rulePreOrNormalValueExpression=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreOrNormalValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValueExpression2296); if (failed) return current;

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
    // $ANTLR end entryRulePreOrNormalValueExpression


    // $ANTLR start rulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1037:1: rulePreOrNormalValueExpression returns [EObject current=null] : (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) ;
    public final EObject rulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PreArithmOperation_0 = null;

        EObject this_ParanthesedValueExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1042:6: ( (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1043:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1043:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_FLOAT)||LA13_0==16||LA13_0==19) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1043:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1044:5: this_PreArithmOperation_0= rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getPreArithmOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression2343);
                    this_PreArithmOperation_0=rulePreArithmOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PreArithmOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1054:5: this_ParanthesedValueExpression_1= ruleParanthesedValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getParanthesedValueExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression2370);
                    this_ParanthesedValueExpression_1=ruleParanthesedValueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParanthesedValueExpression_1; 
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
    // $ANTLR end rulePreOrNormalValueExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1069:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1069:58: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1070:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2402);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation2412); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1077:1: ruleCompareOperation returns [EObject current=null] : (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1082:6: ( (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1083:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1083:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1084:5: this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation2459);
            this_ValueExpression_0=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1092:1: ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1092:2: () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1092:2: ()
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1093:5: 
            {
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1108:2: (lv_operator_2= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1111:6: lv_operator_2= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation2502);
            lv_operator_2=ruleCompareOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1129:2: (lv_subExpressions_3= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1132:6: lv_subExpressions_3= ruleValueExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation2540);
            lv_subExpressions_3=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleNotOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1157:1: entryRuleNotOperation returns [EObject current=null] : iv_ruleNotOperation= ruleNotOperation EOF ;
    public final EObject entryRuleNotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1157:54: (iv_ruleNotOperation= ruleNotOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1158:2: iv_ruleNotOperation= ruleNotOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotOperation_in_entryRuleNotOperation2578);
            iv_ruleNotOperation=ruleNotOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperation2588); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1165:1: ruleNotOperation returns [EObject current=null] : ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) ) ;
    public final EObject ruleNotOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1170:6: ( ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1171:1: ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1171:1: ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1171:2: (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1171:2: (lv_operator_0= ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1174:6: lv_operator_0= ruleNotOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getOperatorNotOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNotOperation2647);
            lv_operator_0=ruleNotOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1192:2: (lv_subExpressions_1= ruleParanthesedBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1195:6: lv_subExpressions_1= ruleParanthesedBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOperation2685);
            lv_subExpressions_1=ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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
    // $ANTLR end ruleNotOperation


    // $ANTLR start entryRuleNotOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1220:1: entryRuleNotOrNormalExpression returns [EObject current=null] : iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF ;
    public final EObject entryRuleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1220:63: (iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1221:2: iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOrNormalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression2722);
            iv_ruleNotOrNormalExpression=ruleNotOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOrNormalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrNormalExpression2732); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1228:1: ruleNotOrNormalExpression returns [EObject current=null] : (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression ) ;
    public final EObject ruleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotOperation_0 = null;

        EObject this_ParanthesedBooleanExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1233:6: ( (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1234:1: (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1234:1: (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_BOOLEAN)||LA14_0==16||LA14_0==19||LA14_0==28) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1234:1: (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1235:5: this_NotOperation_0= ruleNotOperation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getNotOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression2779);
                    this_NotOperation_0=ruleNotOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1245:5: this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOrNormalExpression2806);
                    this_ParanthesedBooleanExpression_1=ruleParanthesedBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParanthesedBooleanExpression_1; 
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
    // $ANTLR end ruleNotOrNormalExpression


    // $ANTLR start entryRuleAndOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1260:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1260:54: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1261:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation2838);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation2848); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1268:1: ruleAndOperation returns [EObject current=null] : (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrNormalExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1273:6: ( (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1274:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1274:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1275:5: this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getNotOrNormalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2895);
            this_NotOrNormalExpression_0=ruleNotOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NotOrNormalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1283:1: ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1283:2: () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1283:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1284:5: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1299:2: (lv_operator_2= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1302:6: lv_operator_2= ruleOperatorAnd
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation2938);
            	    lv_operator_2=ruleOperatorAnd();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1320:2: (lv_subExpressions_3= ruleNotOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1323:6: lv_subExpressions_3= ruleNotOrNormalExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionsNotOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2976);
            	    lv_subExpressions_3=ruleNotOrNormalExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end ruleAndOperation


    // $ANTLR start entryRuleOrOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1348:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1348:53: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1349:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation3015);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation3025); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1356:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1361:6: ( (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1362:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1362:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1363:5: this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation3072);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1371:1: ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1371:2: () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1371:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1372:5: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1387:2: (lv_operator_2= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1390:6: lv_operator_2= ruleOperatorOr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation3115);
            	    lv_operator_2=ruleOperatorOr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1408:2: (lv_subExpressions_3= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1411:6: lv_subExpressions_3= ruleAndOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation3153);
            	    lv_subExpressions_3=ruleAndOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end ruleOrOperation


    // $ANTLR start entryRuleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1436:1: entryRuleParanthesedBooleanExpression returns [EObject current=null] : iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF ;
    public final EObject entryRuleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1436:70: (iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1437:2: iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression3192);
            iv_ruleParanthesedBooleanExpression=ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression3202); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1444:1: ruleParanthesedBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) ;
    public final EObject ruleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_SignalReference_1 = null;

        EObject this_CompareOperation_2 = null;

        EObject this_OrOperation_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1449:6: ( (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1450:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1450:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred23()) ) {
                    alt17=2;
                }
                else if ( (synpred24()) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1450:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 19:
            case 28:
                {
                alt17=3;
                }
                break;
            case 16:
                {
                int LA17_7 = input.LA(2);

                if ( (synpred24()) ) {
                    alt17=3;
                }
                else if ( (true) ) {
                    alt17=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1450:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 17, 7, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1450:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1451:5: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression3249);
                    this_BooleanValue_0=ruleBooleanValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1461:5: this_SignalReference_1= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression3276);
                    this_SignalReference_1=ruleSignalReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SignalReference_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1471:5: this_CompareOperation_2= ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression3303);
                    this_CompareOperation_2=ruleCompareOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompareOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1480:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1480:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1480:7: '(' this_OrOperation_4= ruleOrOperation ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleParanthesedBooleanExpression3318); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_3_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression3340);
                    this_OrOperation_4=ruleOrOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OrOperation_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FOLLOW_17_in_ruleParanthesedBooleanExpression3348); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

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
    // $ANTLR end ruleParanthesedBooleanExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1504:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1504:59: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1505:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3382);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression3392); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1512:1: ruleBooleanExpression returns [EObject current=null] : this_OrOperation_0= ruleOrOperation ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrOperation_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1517:6: (this_OrOperation_0= ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1519:5: this_OrOperation_0= ruleOrOperation
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression3438);
            this_OrOperation_0=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_OrOperation_0; 
                      currentNode = currentNode.getParent();
                  
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
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1534:1: entryRuleHostCode returns [EObject current=null] : iv_ruleHostCode= ruleHostCode EOF ;
    public final EObject entryRuleHostCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1534:50: (iv_ruleHostCode= ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1535:2: iv_ruleHostCode= ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHostCodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode3469);
            iv_ruleHostCode=ruleHostCode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHostCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode3479); if (failed) return current;

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1542:1: ruleHostCode returns [EObject current=null] : ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? ) ;
    public final EObject ruleHostCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_0=null;
        Token lv_type_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1547:6: ( ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1548:1: ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1548:1: ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1548:2: (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1548:2: (lv_code_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1550:6: lv_code_0= RULE_STRING
            {
            lv_code_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHostCode3526); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
              	
            }
            if ( backtracking==0 ) {

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

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1568:2: ( '(' (lv_type_2= RULE_ID ) ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1568:3: '(' (lv_type_2= RULE_ID ) ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleHostCode3544); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1572:1: (lv_type_2= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1574:6: lv_type_2= RULE_ID
                    {
                    lv_type_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHostCode3566); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      	
                    }
                    if ( backtracking==0 ) {

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

                    }

                    match(input,17,FOLLOW_17_in_ruleHostCode3583); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleHostCode


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1605:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1609:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1610:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1610:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1610:3: '?'
            {
            match(input,19,FOLLOW_19_in_ruleValOperator3633); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleValOperator


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1620:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1624:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1625:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1625:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 22:
                {
                alt19=3;
                }
                break;
            case 23:
                {
                alt19=4;
                }
                break;
            case 24:
                {
                alt19=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1625:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1625:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1625:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1625:4: '='
                    {
                    match(input,20,FOLLOW_20_in_ruleCompareOperator3675); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1631:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1631:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1631:8: '<'
                    {
                    match(input,21,FOLLOW_21_in_ruleCompareOperator3690); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1637:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1637:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1637:8: '<='
                    {
                    match(input,22,FOLLOW_22_in_ruleCompareOperator3705); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1643:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1643:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1643:8: '>'
                    {
                    match(input,23,FOLLOW_23_in_ruleCompareOperator3720); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1649:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1649:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1649:8: '>='
                    {
                    match(input,24,FOLLOW_24_in_ruleCompareOperator3735); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

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
    // $ANTLR end ruleCompareOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1659:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1663:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1664:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1664:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1664:3: 'not'
            {
            match(input,25,FOLLOW_25_in_ruleNotOperator3777); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleNotOperator


    // $ANTLR start ruleOperatorOr
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1674:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1678:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1679:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1679:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1679:3: 'or'
            {
            match(input,26,FOLLOW_26_in_ruleOperatorOr3818); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOperatorOr


    // $ANTLR start ruleOperatorAnd
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1689:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1693:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1694:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1694:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1694:3: 'and'
            {
            match(input,27,FOLLOW_27_in_ruleOperatorAnd3859); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOperatorAnd


    // $ANTLR start ruleOperatorPre
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1704:1: ruleOperatorPre returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator ruleOperatorPre() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1708:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1709:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1709:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1709:3: 'pre'
            {
            match(input,28,FOLLOW_28_in_ruleOperatorPre3900); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOperatorPreAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOperatorPreAccess().getPREEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOperatorPre


    // $ANTLR start rulePlusOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1719:1: rulePlusOperator returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator rulePlusOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1723:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1724:1: ( ( '+' ) | ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1724:1: ( ( '+' ) | ( '-' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            else if ( (LA20_0==30) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1724:1: ( ( '+' ) | ( '-' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1724:2: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1724:2: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1724:4: '+'
                    {
                    match(input,29,FOLLOW_29_in_rulePlusOperator3942); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1730:6: ( '-' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1730:6: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1730:8: '-'
                    {
                    match(input,30,FOLLOW_30_in_rulePlusOperator3957); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1(), null); 
                          
                    }

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
    // $ANTLR end rulePlusOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1740:1: ruleMultOperator returns [Enumerator current=null] : ( ( '*' ) | ( 'div' ) | ( 'mod' ) ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1744:6: ( ( ( '*' ) | ( 'div' ) | ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1745:1: ( ( '*' ) | ( 'div' ) | ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1745:1: ( ( '*' ) | ( 'div' ) | ( 'mod' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt21=1;
                }
                break;
            case 32:
                {
                alt21=2;
                }
                break;
            case 33:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1745:1: ( ( '*' ) | ( 'div' ) | ( 'mod' ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1745:2: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1745:2: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1745:4: '*'
                    {
                    match(input,31,FOLLOW_31_in_ruleMultOperator4000); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1751:6: ( 'div' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1751:6: ( 'div' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1751:8: 'div'
                    {
                    match(input,32,FOLLOW_32_in_ruleMultOperator4015); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getDIVEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1757:6: ( 'mod' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1757:6: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1757:8: 'mod'
                    {
                    match(input,33,FOLLOW_33_in_ruleMultOperator4030); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_2(), null); 
                          
                    }

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
    // $ANTLR end ruleMultOperator

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:3: ( ( '(' ( ruleValueExpression ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:3: ( '(' ( ruleValueExpression ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:3: ( '(' ( ruleValueExpression ) ')' )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:266:4: '(' ( ruleValueExpression ) ')'
        {
        match(input,16,FOLLOW_16_in_synpred9531); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:270:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:273:6: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred9565);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }

        match(input,17,FOLLOW_17_in_synpred9578); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:296:6: ( ( '(' ( ruleBooleanExpression ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:296:6: ( '(' ( ruleBooleanExpression ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:296:6: ( '(' ( ruleBooleanExpression ) ')' )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:296:7: '(' ( ruleBooleanExpression ) ')'
        {
        match(input,16,FOLLOW_16_in_synpred10595); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:300:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:303:6: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred10629);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }

        match(input,17,FOLLOW_17_in_synpred10642); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:366:2: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:366:2: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:366:2: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:369:6: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred11782);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1461:5: ( ruleSignalReference )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1461:5: ruleSignalReference
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
              
        }
        pushFollow(FOLLOW_ruleSignalReference_in_synpred233276);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1471:5: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1471:5: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           
                  currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_2(), currentNode); 
              
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred243303);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred24

    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAction135 = new BitSet(new long[]{0x00000000120940F2L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction171 = new BitSet(new long[]{0x00000000120940F2L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction214 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAction229 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction264 = new BitSet(new long[]{0x0000000000008122L});
    public static final BitSet FOLLOW_15_in_ruleAction278 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleEffect428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission517 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleEmission531 = new BitSet(new long[]{0x0000000010090070L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleEmission565 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEmission578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEmission595 = new BitSet(new long[]{0x00000000120900F0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission629 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEmission642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment735 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssignment747 = new BitSet(new long[]{0x00000000120900F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleAssignment782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReference920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation1409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValueExpression1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValueExpression1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParanthesedValueExpression1724 = new BitSet(new long[]{0x0000000010090070L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression1746 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParanthesedValueExpression1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_rulePlusOperation1845 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rulePlusOperation1888 = new BitSet(new long[]{0x0000000010090070L});
    public static final BitSet FOLLOW_ruleMultOperation_in_rulePlusOperation1926 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation2022 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultOperation2065 = new BitSet(new long[]{0x0000000010090070L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation2103 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation2142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorPre_in_rulePreArithmOperation2211 = new BitSet(new long[]{0x0000000000090070L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_rulePreArithmOperation2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValueExpression2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation2459 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation2502 = new BitSet(new long[]{0x0000000010090070L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_entryRuleNotOperation2578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperation2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotOperation2647 = new BitSet(new long[]{0x00000000100900F0L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOperation2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression2722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrNormalExpression2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOrNormalExpression2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation2838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2895 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation2938 = new BitSet(new long[]{0x00000000120900F0L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2976 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation3015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation3072 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation3115 = new BitSet(new long[]{0x00000000120900F0L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation3153 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParanthesedBooleanExpression3318 = new BitSet(new long[]{0x00000000120900F0L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression3340 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParanthesedBooleanExpression3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode3469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHostCode3526 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleHostCode3544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHostCode3566 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHostCode3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleValOperator3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompareOperator3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompareOperator3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCompareOperator3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompareOperator3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompareOperator3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNotOperator3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperatorOr3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperatorAnd3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperatorPre3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePlusOperator3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePlusOperator3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMultOperator4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMultOperator4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMultOperator4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred9531 = new BitSet(new long[]{0x0000000010090070L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred9565 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred10595 = new BitSet(new long[]{0x00000000120900F0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred10629 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred10642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred233276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred243303 = new BitSet(new long[]{0x0000000000000002L});

}