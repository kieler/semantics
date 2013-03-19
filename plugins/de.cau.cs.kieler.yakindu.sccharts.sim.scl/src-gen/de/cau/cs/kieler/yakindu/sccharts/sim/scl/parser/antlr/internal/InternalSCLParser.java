package de.cau.cs.kieler.yakindu.sccharts.sim.scl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.services.SCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "'input'", "'output'", "';'", "'if'", "'then'", "'end'", "'label:'", "'goto'", "'fork'", "'par'", "'join'", "'pause'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
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
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSCLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SCLGrammarAccess grammarAccess;
     	
        public InternalSCLParser(TokenStream input, SCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:73:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:74:2: (iv_ruleProgram= ruleProgram EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:75:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram81);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:82:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )? otherlv_3= '{' ( (lv_instruction_4_0= ruleInstruction ) ) otherlv_5= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variables_2_0 = null;

        EObject lv_instruction_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:85:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )? otherlv_3= '{' ( (lv_instruction_4_0= ruleInstruction ) ) otherlv_5= '}' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:86:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )? otherlv_3= '{' ( (lv_instruction_4_0= ruleInstruction ) ) otherlv_5= '}' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:86:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )? otherlv_3= '{' ( (lv_instruction_4_0= ruleInstruction ) ) otherlv_5= '}' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:86:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )? otherlv_3= '{' ( (lv_instruction_4_0= ruleInstruction ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getModuleKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:90:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:91:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:91:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:92:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProgramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:108:2: ( (lv_variables_2_0= ruleVariable ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:109:1: (lv_variables_2_0= ruleVariable )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:109:1: (lv_variables_2_0= ruleVariable )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:110:3: lv_variables_2_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getVariablesVariableParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleProgram171);
                    lv_variables_2_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"variables",
                              		lv_variables_2_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleProgram184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:130:1: ( (lv_instruction_4_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:131:1: (lv_instruction_4_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:131:1: (lv_instruction_4_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:132:3: lv_instruction_4_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleProgram205);
            lv_instruction_4_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProgramRule());
              	        }
                     		set(
                     			current, 
                     			"instruction",
                      		lv_instruction_4_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleProgram217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleVariable"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:160:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:161:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:162:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable253);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable263); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:169:1: ruleVariable returns [EObject current=null] : ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:172:28: ( ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:173:1: ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:173:1: ( (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:173:2: (otherlv_0= 'input' | otherlv_1= 'output' ) ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:173:2: (otherlv_0= 'input' | otherlv_1= 'output' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:173:4: otherlv_0= 'input'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleVariable301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getInputKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:178:7: otherlv_1= 'output'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleVariable319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getOutputKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:182:2: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:183:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:183:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:184:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:198:2: ( (lv_name_3_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:199:1: (lv_name_3_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:199:1: (lv_name_3_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:200:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable361); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:224:1: entryRuleSCLExpression returns [EObject current=null] : iv_ruleSCLExpression= ruleSCLExpression EOF ;
    public final EObject entryRuleSCLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCLExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:225:2: (iv_ruleSCLExpression= ruleSCLExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:226:2: iv_ruleSCLExpression= ruleSCLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCLExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSCLExpression_in_entryRuleSCLExpression402);
            iv_ruleSCLExpression=ruleSCLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCLExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCLExpression412); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:233:1: ruleSCLExpression returns [EObject current=null] : ( () this_STRING_1= RULE_STRING ) ;
    public final EObject ruleSCLExpression() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:236:28: ( ( () this_STRING_1= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:237:1: ( () this_STRING_1= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:237:1: ( () this_STRING_1= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:237:2: () this_STRING_1= RULE_STRING
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:237:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:238:2: 
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

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCLExpression460); if (state.failed) return current;
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


    // $ANTLR start "entryRuleInstruction"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:258:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:259:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:260:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction495);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction505); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:267:1: ruleInstruction returns [EObject current=null] : ( ( (lv_instruction_0_0= ruleAssignment ) ) | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )? ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        EObject lv_instruction_0_0 = null;

        EObject this_Conditional_1 = null;

        EObject this_Label_2 = null;

        EObject this_Goto_3 = null;

        EObject this_Parallel_4 = null;

        EObject lv_secondinstructions_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:270:28: ( ( ( (lv_instruction_0_0= ruleAssignment ) ) | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )? ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:271:1: ( ( (lv_instruction_0_0= ruleAssignment ) ) | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )? ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:271:1: ( ( (lv_instruction_0_0= ruleAssignment ) ) | this_Conditional_1= ruleConditional | this_Label_2= ruleLabel | this_Goto_3= ruleGoto | this_Parallel_4= ruleParallel | ( rulePause (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )? ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:271:2: ( (lv_instruction_0_0= ruleAssignment ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:271:2: ( (lv_instruction_0_0= ruleAssignment ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:272:1: (lv_instruction_0_0= ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:272:1: (lv_instruction_0_0= ruleAssignment )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:273:3: lv_instruction_0_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionAccess().getInstructionAssignmentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstruction551);
                    lv_instruction_0_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                      	        }
                             		set(
                             			current, 
                             			"instruction",
                              		lv_instruction_0_0, 
                              		"Assignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:291:2: this_Conditional_1= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstruction582);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:304:2: this_Label_2= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getLabelParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleInstruction612);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:317:2: this_Goto_3= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getGotoParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstruction642);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:330:2: this_Parallel_4= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getParallelParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParallel_in_ruleInstruction672);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:342:6: ( rulePause (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )? )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:342:6: ( rulePause (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )? )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:343:2: rulePause (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePause_in_ruleInstruction697);
                    rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:353:1: (otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==16) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:353:3: otherlv_6= ';' ( (lv_secondinstructions_7_0= ruleInstruction ) )
                            {
                            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleInstruction709); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getInstructionAccess().getSemicolonKeyword_5_1_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:357:1: ( (lv_secondinstructions_7_0= ruleInstruction ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:358:1: (lv_secondinstructions_7_0= ruleInstruction )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:358:1: (lv_secondinstructions_7_0= ruleInstruction )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:359:3: lv_secondinstructions_7_0= ruleInstruction
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInstructionAccess().getSecondinstructionsInstructionParserRuleCall_5_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInstruction_in_ruleInstruction730);
                            lv_secondinstructions_7_0=ruleInstruction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInstructionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"secondinstructions",
                                      		lv_secondinstructions_7_0, 
                                      		"Instruction");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:383:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:384:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:385:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment769);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment779); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:392:1: ruleAssignment returns [EObject current=null] : ( (lv_assignment_0_0= RULE_STRING ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_assignment_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:395:28: ( ( (lv_assignment_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:396:1: ( (lv_assignment_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:396:1: ( (lv_assignment_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:397:1: (lv_assignment_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:397:1: (lv_assignment_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:398:3: lv_assignment_0_0= RULE_STRING
            {
            lv_assignment_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment820); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:422:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:423:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:424:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional860);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional870); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:431:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_instructions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:434:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:435:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:435:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:435:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_instructions_3_0= ruleInstruction ) ) otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleConditional907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:439:1: ( (lv_expression_1_0= ruleSCLExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:440:1: (lv_expression_1_0= ruleSCLExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:440:1: (lv_expression_1_0= ruleSCLExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:441:3: lv_expression_1_0= ruleSCLExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionSCLExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSCLExpression_in_ruleConditional928);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleConditional940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:461:1: ( (lv_instructions_3_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:462:1: (lv_instructions_3_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:462:1: (lv_instructions_3_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:463:3: lv_instructions_3_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getInstructionsInstructionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleConditional961);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleConditional973); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:491:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:492:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:493:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1009);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1019); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:500:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_instruction_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:503:28: ( (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:504:1: (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:504:1: (otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:504:3: otherlv_0= 'label:' ( (lv_instruction_1_0= ruleInstruction ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleLabel1056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:508:1: ( (lv_instruction_1_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:509:1: (lv_instruction_1_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:509:1: (lv_instruction_1_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:510:3: lv_instruction_1_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabelAccess().getInstructionInstructionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleLabel1077);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:534:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:535:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:536:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto1113);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto1123); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:543:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:546:28: ( (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:547:1: (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:547:1: (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:547:3: otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleGoto1160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:551:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:552:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:552:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:553:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoto1177); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:577:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:578:2: (iv_ruleParallel= ruleParallel EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:579:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel1218);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel1228); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:586:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( (lv_firstinstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondinstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_firstinstruction_1_0 = null;

        EObject lv_secondinstruction_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:589:28: ( (otherlv_0= 'fork' ( (lv_firstinstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondinstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:590:1: (otherlv_0= 'fork' ( (lv_firstinstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondinstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:590:1: (otherlv_0= 'fork' ( (lv_firstinstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondinstruction_3_0= ruleInstruction ) ) otherlv_4= 'join' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:590:3: otherlv_0= 'fork' ( (lv_firstinstruction_1_0= ruleInstruction ) ) otherlv_2= 'par' ( (lv_secondinstruction_3_0= ruleInstruction ) ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleParallel1265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:594:1: ( (lv_firstinstruction_1_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:595:1: (lv_firstinstruction_1_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:595:1: (lv_firstinstruction_1_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:596:3: lv_firstinstruction_1_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getFirstinstructionInstructionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleParallel1286);
            lv_firstinstruction_1_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParallelRule());
              	        }
                     		set(
                     			current, 
                     			"firstinstruction",
                      		lv_firstinstruction_1_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleParallel1298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:616:1: ( (lv_secondinstruction_3_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:617:1: (lv_secondinstruction_3_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:617:1: (lv_secondinstruction_3_0= ruleInstruction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:618:3: lv_secondinstruction_3_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getSecondinstructionInstructionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleParallel1319);
            lv_secondinstruction_3_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParallelRule());
              	        }
                     		set(
                     			current, 
                     			"secondinstruction",
                      		lv_secondinstruction_3_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleParallel1331); if (state.failed) return current;
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


    // $ANTLR start "entryRulePause"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:646:1: entryRulePause returns [String current=null] : iv_rulePause= rulePause EOF ;
    public final String entryRulePause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePause = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:647:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:648:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_rulePause_in_entryRulePause1368);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePause1379); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:655:1: rulePause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'pause' ;
    public final AntlrDatatypeRuleToken rulePause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:658:28: (kw= 'pause' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:660:2: kw= 'pause'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_rulePause1416); if (state.failed) return current;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram145 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleProgram171 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram184 = new BitSet(new long[]{0x0000000002720020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleProgram205 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVariable301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_ruleVariable319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCLExpression_in_entryRuleSCLExpression402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCLExpression412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCLExpression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstruction551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstruction582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleInstruction612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstruction642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleInstruction672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstruction697 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleInstruction709 = new BitSet(new long[]{0x0000000002720020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstruction730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleConditional907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSCLExpression_in_ruleConditional928 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConditional940 = new BitSet(new long[]{0x0000000002720020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleConditional961 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConditional973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLabel1056 = new BitSet(new long[]{0x0000000002720020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLabel1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGoto1160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoto1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleParallel1265 = new BitSet(new long[]{0x0000000002720020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleParallel1286 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParallel1298 = new BitSet(new long[]{0x0000000002720020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleParallel1319 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParallel1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePause1416 = new BitSet(new long[]{0x0000000000000002L});

}