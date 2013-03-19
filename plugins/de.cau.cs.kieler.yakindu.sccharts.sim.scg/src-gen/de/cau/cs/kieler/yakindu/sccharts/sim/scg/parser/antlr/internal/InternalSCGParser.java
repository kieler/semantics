package de.cau.cs.kieler.yakindu.sccharts.sim.scg.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.services.SCGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'priority'", "'dependency'", "'if'", "'then'", "'end'", "'label:'", "'goto'", "'fork'", "'par'", "'join'", "'input'", "'output'", "'pause'"
    };
    public static final int RULE_ID=6;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSCGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSCGParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SCGGrammarAccess grammarAccess;
     	
        public InternalSCGParser(TokenStream input, SCGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Instruction";	
       	}
       	
       	@Override
       	protected SCGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInstruction"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:73:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:74:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:75:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction81);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:82:1: ruleInstruction returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )? otherlv_8= 'priority' ( (lv_priority_9_0= RULE_INT ) ) (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )* ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_priority_9_0=null;
        Token otherlv_10=null;
        EObject this_Assignment_0 = null;

        EObject this_Conditional_1 = null;

        EObject this_Label_2 = null;

        EObject this_Goto_3 = null;

        EObject this_Parallel_4 = null;

        EObject lv_secondInstructions_7_0 = null;

        EObject lv_dependencies_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:85:28: ( (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )? otherlv_8= 'priority' ( (lv_priority_9_0= RULE_INT ) ) (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )* ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:86:1: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )? otherlv_8= 'priority' ( (lv_priority_9_0= RULE_INT ) ) (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )* ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:86:1: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )? otherlv_8= 'priority' ( (lv_priority_9_0= RULE_INT ) ) (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )* ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:87:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstruction141);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:100:2: this_Conditional_1= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstruction171);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Conditional_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:113:2: this_Label_2= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getLabelParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleInstruction201);
                    this_Label_2=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Label_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:126:2: this_Goto_3= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getGotoParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstruction231);
                    this_Goto_3=ruleGoto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Goto_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:139:2: this_Parallel_4= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getParallelParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParallel_in_ruleInstruction261);
                    this_Parallel_4=ruleParallel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parallel_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:151:6: ( rulePause (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )? otherlv_8= 'priority' ( (lv_priority_9_0= RULE_INT ) ) (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )* )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:151:6: ( rulePause (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )? otherlv_8= 'priority' ( (lv_priority_9_0= RULE_INT ) ) (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )* )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:152:2: rulePause (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )? otherlv_8= 'priority' ( (lv_priority_9_0= RULE_INT ) ) (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePause_in_ruleInstruction286);
                    rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:162:1: (otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==11) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:162:3: otherlv_6= ';' ( (lv_secondInstructions_7_0= ruleInstruction ) )
                            {
                            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleInstruction298); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getInstructionAccess().getSemicolonKeyword_5_1_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:166:1: ( (lv_secondInstructions_7_0= ruleInstruction ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:167:1: (lv_secondInstructions_7_0= ruleInstruction )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:167:1: (lv_secondInstructions_7_0= ruleInstruction )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:168:3: lv_secondInstructions_7_0= ruleInstruction
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInstructionAccess().getSecondInstructionsInstructionParserRuleCall_5_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInstruction_in_ruleInstruction319);
                            lv_secondInstructions_7_0=ruleInstruction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"secondInstructions",
                                      		lv_secondInstructions_7_0, 
                                      		"Instruction");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleInstruction333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getInstructionAccess().getPriorityKeyword_5_2());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:188:1: ( (lv_priority_9_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:189:1: (lv_priority_9_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:189:1: (lv_priority_9_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:190:3: lv_priority_9_0= RULE_INT
                    {
                    lv_priority_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstruction350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_priority_9_0, grammarAccess.getInstructionAccess().getPriorityINTTerminalRuleCall_5_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInstructionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"priority",
                              		lv_priority_9_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:206:2: (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            int LA2_2 = input.LA(2);

                            if ( (synpred7_InternalSCG()) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:206:4: otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleInstruction368); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getInstructionAccess().getDependencyKeyword_5_4_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:210:1: ( (lv_dependencies_11_0= ruleInstruction ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:211:1: (lv_dependencies_11_0= ruleInstruction )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:211:1: (lv_dependencies_11_0= ruleInstruction )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:212:3: lv_dependencies_11_0= ruleInstruction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstructionAccess().getDependenciesInstructionParserRuleCall_5_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstruction_in_ruleInstruction389);
                    	    lv_dependencies_11_0=ruleInstruction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"dependencies",
                    	              		lv_dependencies_11_0, 
                    	              		"Instruction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:236:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:237:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:238:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment428);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment438); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:245:1: ruleAssignment returns [EObject current=null] : ( (lv_assignment_0_0= RULE_STRING ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_assignment_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:248:28: ( ( (lv_assignment_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:249:1: ( (lv_assignment_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:249:1: ( (lv_assignment_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:250:1: (lv_assignment_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:250:1: (lv_assignment_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:251:3: lv_assignment_0_0= RULE_STRING
            {
            lv_assignment_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_assignment_0_0, grammarAccess.getAssignmentAccess().getAssignmentSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"assignment",
                      		lv_assignment_0_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleConditional"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:275:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:276:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:277:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional519);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional529); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:284:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_instructions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:287:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:288:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:288:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:288:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleConditional566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:292:1: ( (lv_expression_1_0= ruleSCLExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:293:1: (lv_expression_1_0= ruleSCLExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:293:1: (lv_expression_1_0= ruleSCLExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:294:3: lv_expression_1_0= ruleSCLExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionSCLExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSCLExpression_in_ruleConditional587);
            lv_expression_1_0=ruleSCLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"SCLExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConditional599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:314:1: ( (lv_instructions_3_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:315:1: (lv_instructions_3_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:315:1: (lv_instructions_3_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:316:3: lv_instructions_3_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getInstructionsInstructionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleConditional620);
            lv_instructions_3_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"instructions",
                      		lv_instructions_3_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConditional632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getEndKeyword_4());
                  
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleLabel"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:344:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:345:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:346:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel668);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel678); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:353:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_instruction_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:356:28: ( (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:357:1: (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:357:1: (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:357:3: otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleLabel715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:361:1: ( (lv_instruction_1_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:362:1: (lv_instruction_1_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:362:1: (lv_instruction_1_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:363:3: lv_instruction_1_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelAccess().getInstructionInstructionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleLabel736);
            lv_instruction_1_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLabelRule());
              	        }
                     		set(
                     			current, 
                     			"instruction",
                      		lv_instruction_1_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleGoto"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:387:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:388:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:389:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto772);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:396:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:399:28: ( (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:400:1: (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:400:1: (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:400:3: otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleGoto819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:404:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:405:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:405:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:406:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoto836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGotoAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGotoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

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
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleParallel"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:430:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:431:2: (iv_ruleParallel= ruleParallel EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:432:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel877);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel887); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:439:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( (lv_firstInstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondInstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_firstInstruction_1_0 = null;

        EObject lv_secondInstruction_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:442:28: ( (otherlv_0= 'fork' ( (lv_firstInstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondInstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:443:1: (otherlv_0= 'fork' ( (lv_firstInstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondInstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:443:1: (otherlv_0= 'fork' ( (lv_firstInstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondInstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:443:3: otherlv_0= 'fork' ( (lv_firstInstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondInstruction_3_0= ruleInstruction ) ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleParallel924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:447:1: ( (lv_firstInstruction_1_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:448:1: (lv_firstInstruction_1_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:448:1: (lv_firstInstruction_1_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:449:3: lv_firstInstruction_1_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getFirstInstructionInstructionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleParallel945);
            lv_firstInstruction_1_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParallelRule());
              	        }
                     		set(
                     			current, 
                     			"firstInstruction",
                      		lv_firstInstruction_1_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleParallel957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:469:1: ( (lv_secondInstruction_3_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:470:1: (lv_secondInstruction_3_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:470:1: (lv_secondInstruction_3_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:471:3: lv_secondInstruction_3_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getSecondInstructionInstructionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleParallel978);
            lv_secondInstruction_3_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParallelRule());
              	        }
                     		set(
                     			current, 
                     			"secondInstruction",
                      		lv_secondInstruction_3_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleParallel990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParallelAccess().getJoinKeyword_4());
                  
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
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleVariable"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:501:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:502:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:503:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1028);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1038); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:510:1: ruleVariable returns [EObject current=null] : ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:513:28: ( ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:514:1: ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:514:1: ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:514:2: (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:514:2: (otherlv_0= 'input' | otherlv_1= 'output' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:514:4: otherlv_0= 'input'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleVariable1076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getInputKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:519:7: otherlv_1= 'output'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVariable1094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getOutputKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:523:2: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:524:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:524:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:525:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:539:2: ( (lv_name_3_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:540:1: (lv_name_3_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:540:1: (lv_name_3_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:541:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable1136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleVariable1153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSCLExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:569:1: entryRuleSCLExpression returns [EObject current=null] : iv_ruleSCLExpression= ruleSCLExpression EOF ;
    public final EObject entryRuleSCLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCLExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:570:2: (iv_ruleSCLExpression= ruleSCLExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:571:2: iv_ruleSCLExpression= ruleSCLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCLExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSCLExpression_in_entryRuleSCLExpression1189);
            iv_ruleSCLExpression=ruleSCLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCLExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCLExpression1199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSCLExpression"


    // $ANTLR start "ruleSCLExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:578:1: ruleSCLExpression returns [EObject current=null] : ( () this_STRING_1= RULE_STRING ) ;
    public final EObject ruleSCLExpression() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:581:28: ( ( () this_STRING_1= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:582:1: ( () this_STRING_1= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:582:1: ( () this_STRING_1= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:582:2: () this_STRING_1= RULE_STRING
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:582:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:583:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSCLExpressionAccess().getSCLExpressionAction_0(),
                          current);
                  
            }

            }

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCLExpression1247); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_1, grammarAccess.getSCLExpressionAccess().getSTRINGTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleSCLExpression"


    // $ANTLR start "entryRulePause"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:603:1: entryRulePause returns [String current=null] : iv_rulePause= rulePause EOF ;
    public final String entryRulePause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePause = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:604:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:605:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_rulePause_in_entryRulePause1283);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePause1294); if (state.failed) return current;

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
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:612:1: rulePause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'pause' ;
    public final AntlrDatatypeRuleToken rulePause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:615:28: (kw= 'pause' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:617:2: kw= 'pause'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_rulePause1331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPauseAccess().getPauseKeyword()); 
                  
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
    // $ANTLR end "rulePause"

    // $ANTLR start synpred7_InternalSCG
    public final void synpred7_InternalSCG_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_dependencies_11_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:206:4: (otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:206:4: otherlv_10= 'dependency' ( (lv_dependencies_11_0= ruleInstruction ) )
        {
        otherlv_10=(Token)match(input,13,FOLLOW_13_in_synpred7_InternalSCG368); if (state.failed) return ;
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:210:1: ( (lv_dependencies_11_0= ruleInstruction ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:211:1: (lv_dependencies_11_0= ruleInstruction )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:211:1: (lv_dependencies_11_0= ruleInstruction )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scg/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scg/parser/antlr/internal/InternalSCG.g:212:3: lv_dependencies_11_0= ruleInstruction
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionAccess().getDependenciesInstructionParserRuleCall_5_4_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstruction_in_synpred7_InternalSCG389);
        lv_dependencies_11_0=ruleInstruction();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSCG

    // Delegated rules

    public final boolean synpred7_InternalSCG() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSCG_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstruction141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstruction171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleInstruction201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstruction231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleInstruction261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstruction286 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleInstruction298 = new BitSet(new long[]{0x00000000010E4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstruction319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInstruction333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstruction350 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleInstruction368 = new BitSet(new long[]{0x00000000010E4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstruction389 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleConditional566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSCLExpression_in_ruleConditional587 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConditional599 = new BitSet(new long[]{0x00000000010E4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleConditional620 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConditional632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLabel715 = new BitSet(new long[]{0x00000000010E4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLabel736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGoto819 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoto836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleParallel924 = new BitSet(new long[]{0x00000000010E4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleParallel945 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParallel957 = new BitSet(new long[]{0x00000000010E4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleParallel978 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleParallel990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVariable1076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23_in_ruleVariable1094 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable1136 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVariable1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCLExpression_in_entryRuleSCLExpression1189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCLExpression1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCLExpression1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePause1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred7_InternalSCG368 = new BitSet(new long[]{0x00000000010E4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_synpred7_InternalSCG389 = new BitSet(new long[]{0x0000000000000002L});

}