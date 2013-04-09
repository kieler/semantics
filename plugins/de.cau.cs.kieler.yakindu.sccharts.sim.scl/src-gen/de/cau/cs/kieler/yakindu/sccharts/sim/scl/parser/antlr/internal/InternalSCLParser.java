package de.cau.cs.kieler.yakindu.sccharts.sim.scl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "'input'", "'output'", "'signal'", "':'", "';'", "'label:'", "'if'", "'then'", "'end'", "'goto'", "'fork'", "'par'", "'join'", "'pause'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'var'", "'readonly'", "'external'", "'='", "'operation'", "'('", "','", "')'", "'local'", "'in'", "'out'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'/'", "'#'", "'['", "']'", "'>'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=10;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_BOOL=8;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=9;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:75:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:76:2: (iv_ruleProgram= ruleProgram EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:77:2: iv_ruleProgram= ruleProgram EOF
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:84:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_interface_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( (lv_program_4_0= ruleInstructionList ) ) otherlv_5= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_interface_2_0 = null;

        EObject lv_program_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:87:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_interface_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( (lv_program_4_0= ruleInstructionList ) ) otherlv_5= '}' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:88:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_interface_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( (lv_program_4_0= ruleInstructionList ) ) otherlv_5= '}' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:88:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_interface_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( (lv_program_4_0= ruleInstructionList ) ) otherlv_5= '}' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:88:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ( (lv_interface_2_0= ruleVariableDeclaration ) )* otherlv_3= '{' ( (lv_program_4_0= ruleInstructionList ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProgram128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getModuleKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:92:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:93:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:93:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:94:3: lv_name_1_0= RULE_ID
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

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:110:2: ( (lv_interface_2_0= ruleVariableDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_interface_2_0= ruleVariableDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:111:1: (lv_interface_2_0= ruleVariableDeclaration )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:112:3: lv_interface_2_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getInterfaceVariableDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleProgram171);
            	    lv_interface_2_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interface",
            	              		lv_interface_2_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleProgram184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:132:1: ( (lv_program_4_0= ruleInstructionList ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:133:1: (lv_program_4_0= ruleInstructionList )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:133:1: (lv_program_4_0= ruleInstructionList )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:134:3: lv_program_4_0= ruleInstructionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProgramAccess().getProgramInstructionListParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstructionList_in_ruleProgram205);
            lv_program_4_0=ruleInstructionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProgramRule());
              	        }
                     		set(
                     			current, 
                     			"program",
                      		lv_program_4_0, 
                      		"InstructionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleProgram217); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:162:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:163:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:164:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration253);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration263); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:171:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_Input_0_0= 'input' ) )? ( (lv_Output_1_0= 'output' ) )? otherlv_2= 'signal' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_Input_0_0=null;
        Token lv_Output_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:174:28: ( ( ( (lv_Input_0_0= 'input' ) )? ( (lv_Output_1_0= 'output' ) )? otherlv_2= 'signal' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:175:1: ( ( (lv_Input_0_0= 'input' ) )? ( (lv_Output_1_0= 'output' ) )? otherlv_2= 'signal' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:175:1: ( ( (lv_Input_0_0= 'input' ) )? ( (lv_Output_1_0= 'output' ) )? otherlv_2= 'signal' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:175:2: ( (lv_Input_0_0= 'input' ) )? ( (lv_Output_1_0= 'output' ) )? otherlv_2= 'signal' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:175:2: ( (lv_Input_0_0= 'input' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:176:1: (lv_Input_0_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:176:1: (lv_Input_0_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:177:3: lv_Input_0_0= 'input'
                    {
                    lv_Input_0_0=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Input_0_0, grammarAccess.getVariableDeclarationAccess().getInputInputKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "Input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:190:3: ( (lv_Output_1_0= 'output' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:191:1: (lv_Output_1_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:191:1: (lv_Output_1_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:192:3: lv_Output_1_0= 'output'
                    {
                    lv_Output_1_0=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Output_1_0, grammarAccess.getVariableDeclarationAccess().getOutputOutputKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "Output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVariableDeclaration364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getSignalKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:209:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:210:1: (lv_name_3_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:210:1: (lv_name_3_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:211:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableDeclaration381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getVariableDeclarationAccess().getNameSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:227:2: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:227:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleVariableDeclaration399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getColonKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:231:1: ( (otherlv_5= RULE_ID ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:232:1: (otherlv_5= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:232:1: (otherlv_5= RULE_ID )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:233:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getTypeTypeCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleVariableDeclaration437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleSCLExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:259:1: entryRuleSCLExpression returns [String current=null] : iv_ruleSCLExpression= ruleSCLExpression EOF ;
    public final String entryRuleSCLExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCLExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:260:2: (iv_ruleSCLExpression= ruleSCLExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:261:2: iv_ruleSCLExpression= ruleSCLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCLExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSCLExpression_in_entryRuleSCLExpression474);
            iv_ruleSCLExpression=ruleSCLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCLExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCLExpression485); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:268:1: ruleSCLExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSCLExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:271:28: (this_STRING_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:272:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCLExpression524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getSCLExpressionAccess().getSTRINGTerminalRuleCall()); 
                  
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:287:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:288:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:289:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction568);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction578); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:296:1: ruleInstruction returns [EObject current=null] : ( (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_Label_5= ruleLabel ) ( (lv_priority_6_0= RULE_INT ) )? ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_priority_6_0=null;
        EObject this_Assignment_0 = null;

        EObject this_Conditional_1 = null;

        EObject this_Goto_2 = null;

        EObject this_Parallel_3 = null;

        EObject this_Pause_4 = null;

        EObject this_Label_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:299:28: ( ( (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_Label_5= ruleLabel ) ( (lv_priority_6_0= RULE_INT ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:300:1: ( (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_Label_5= ruleLabel ) ( (lv_priority_6_0= RULE_INT ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:300:1: ( (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_Label_5= ruleLabel ) ( (lv_priority_6_0= RULE_INT ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:300:2: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_Label_5= ruleLabel ) ( (lv_priority_6_0= RULE_INT ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:300:2: (this_Assignment_0= ruleAssignment | this_Conditional_1= ruleConditional | this_Goto_2= ruleGoto | this_Parallel_3= ruleParallel | this_Pause_4= rulePause | this_Label_5= ruleLabel )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case 43:
            case 56:
            case 57:
            case 67:
            case 85:
            case 86:
            case 89:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:301:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstruction629);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:314:2: this_Conditional_1= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstruction659);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:327:2: this_Goto_2= ruleGoto
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getGotoParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstruction689);
                    this_Goto_2=ruleGoto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Goto_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:340:2: this_Parallel_3= ruleParallel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getParallelParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParallel_in_ruleInstruction719);
                    this_Parallel_3=ruleParallel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parallel_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:353:2: this_Pause_4= rulePause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_rulePause_in_ruleInstruction749);
                    this_Pause_4=rulePause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Pause_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:366:2: this_Label_5= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getLabelParserRuleCall_0_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleInstruction779);
                    this_Label_5=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Label_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:377:2: ( (lv_priority_6_0= RULE_INT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:378:1: (lv_priority_6_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:378:1: (lv_priority_6_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:379:3: lv_priority_6_0= RULE_INT
                    {
                    lv_priority_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstruction796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_priority_6_0, grammarAccess.getInstructionAccess().getPriorityINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInstructionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"priority",
                              		lv_priority_6_0, 
                              		"INT");
                      	    
                    }

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:403:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:404:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:405:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment838);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment848); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:412:1: ruleAssignment returns [EObject current=null] : ( (lv_assignment_0_0= ruleExpression ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:415:28: ( ( (lv_assignment_0_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:416:1: ( (lv_assignment_0_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:416:1: ( (lv_assignment_0_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:417:1: (lv_assignment_0_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:417:1: (lv_assignment_0_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:418:3: lv_assignment_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignmentExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment893);
            lv_assignment_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"assignment",
                      		lv_assignment_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
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


    // $ANTLR start "entryRuleInstructionList"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:442:1: entryRuleInstructionList returns [EObject current=null] : iv_ruleInstructionList= ruleInstructionList EOF ;
    public final EObject entryRuleInstructionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionList = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:443:2: (iv_ruleInstructionList= ruleInstructionList EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:444:2: iv_ruleInstructionList= ruleInstructionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionListRule()); 
            }
            pushFollow(FOLLOW_ruleInstructionList_in_entryRuleInstructionList928);
            iv_ruleInstructionList=ruleInstructionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstructionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstructionList938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstructionList"


    // $ANTLR start "ruleInstructionList"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:451:1: ruleInstructionList returns [EObject current=null] : ( ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) ) | ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) ) | ( (lv_instructions_9_0= ruleAnnotation ) ) | ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) ) | ( (lv_instructions_13_0= ruleInstruction ) ) ) ;
    public final EObject ruleInstructionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_instructions_1_0 = null;

        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_4_0 = null;

        EObject lv_instructions_5_0 = null;

        EObject lv_instructions_7_0 = null;

        EObject lv_instructions_8_0 = null;

        EObject lv_instructions_9_0 = null;

        EObject lv_instructions_11_0 = null;

        EObject lv_instructions_12_0 = null;

        EObject lv_instructions_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:454:28: ( ( ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) ) | ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) ) | ( (lv_instructions_9_0= ruleAnnotation ) ) | ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) ) | ( (lv_instructions_13_0= ruleInstruction ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:1: ( ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) ) | ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) ) | ( (lv_instructions_9_0= ruleAnnotation ) ) | ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) ) | ( (lv_instructions_13_0= ruleInstruction ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:1: ( ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) ) | ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) ) | ( (lv_instructions_9_0= ruleAnnotation ) ) | ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) ) | ( (lv_instructions_13_0= ruleInstruction ) ) )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:2: ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:2: ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:3: () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:3: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:456:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInstructionListAccess().getInstructionListAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:2: ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:3: ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )?
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:3: ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=3;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:4: ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:4: ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:5: ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';'
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:5: ( (lv_instructions_1_0= ruleInstruction ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:465:1: (lv_instructions_1_0= ruleInstruction )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:465:1: (lv_instructions_1_0= ruleInstruction )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:466:3: lv_instructions_1_0= ruleInstruction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_0_1_0_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstruction_in_ruleInstructionList1000);
                    	    lv_instructions_1_0=ruleInstruction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"instructions",
                    	              		lv_instructions_1_0, 
                    	              		"Instruction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleInstructionList1012); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getInstructionListAccess().getSemicolonKeyword_0_1_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:487:6: ( (lv_instructions_3_0= ruleAnnotation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:487:6: ( (lv_instructions_3_0= ruleAnnotation ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:488:1: (lv_instructions_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:488:1: (lv_instructions_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:489:3: lv_instructions_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_0_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionList1040);
                    	    lv_instructions_3_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"instructions",
                    	              		lv_instructions_3_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:505:4: ( (lv_instructions_4_0= ruleInstruction ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:506:1: (lv_instructions_4_0= ruleInstruction )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:506:1: (lv_instructions_4_0= ruleInstruction )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:507:3: lv_instructions_4_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_ruleInstructionList1063);
                    lv_instructions_4_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                      	        }
                             		add(
                             			current, 
                             			"instructions",
                              		lv_instructions_4_0, 
                              		"Instruction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:523:2: ( (lv_instructions_5_0= ruleAnnotation ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_SL_COMMENT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:524:1: (lv_instructions_5_0= ruleAnnotation )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:524:1: (lv_instructions_5_0= ruleAnnotation )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:525:3: lv_instructions_5_0= ruleAnnotation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionList1084);
                            lv_instructions_5_0=ruleAnnotation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"instructions",
                                      		lv_instructions_5_0, 
                                      		"Annotation");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:6: ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:6: ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:7: () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:543:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInstructionListAccess().getInstructionListAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:551:2: ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:551:3: ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:551:3: ( (lv_instructions_7_0= ruleAnnotation ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:552:1: (lv_instructions_7_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:552:1: (lv_instructions_7_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:553:3: lv_instructions_7_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionList1128);
                    lv_instructions_7_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                      	        }
                             		add(
                             			current, 
                             			"instructions",
                              		lv_instructions_7_0, 
                              		"Annotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:569:2: ( (lv_instructions_8_0= ruleInstruction ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:570:1: (lv_instructions_8_0= ruleInstruction )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:570:1: (lv_instructions_8_0= ruleInstruction )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:571:3: lv_instructions_8_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_ruleInstructionList1149);
                    lv_instructions_8_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                      	        }
                             		add(
                             			current, 
                             			"instructions",
                              		lv_instructions_8_0, 
                              		"Instruction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:588:6: ( (lv_instructions_9_0= ruleAnnotation ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:588:6: ( (lv_instructions_9_0= ruleAnnotation ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:589:1: (lv_instructions_9_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:589:1: (lv_instructions_9_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:590:3: lv_instructions_9_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionList1178);
                    lv_instructions_9_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                      	        }
                             		add(
                             			current, 
                             			"instructions",
                              		lv_instructions_9_0, 
                              		"Annotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:6: ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:6: ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:7: () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:608:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getInstructionListAccess().getInstructionListAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:616:2: ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:616:3: ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:616:3: ( (lv_instructions_11_0= ruleInstruction ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:617:1: (lv_instructions_11_0= ruleInstruction )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:617:1: (lv_instructions_11_0= ruleInstruction )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:618:3: lv_instructions_11_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_ruleInstructionList1219);
                    lv_instructions_11_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                      	        }
                             		add(
                             			current, 
                             			"instructions",
                              		lv_instructions_11_0, 
                              		"Instruction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:634:2: ( (lv_instructions_12_0= ruleAnnotation ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:635:1: (lv_instructions_12_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:635:1: (lv_instructions_12_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:636:3: lv_instructions_12_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleInstructionList1240);
                    lv_instructions_12_0=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                      	        }
                             		add(
                             			current, 
                             			"instructions",
                              		lv_instructions_12_0, 
                              		"Annotation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:653:6: ( (lv_instructions_13_0= ruleInstruction ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:653:6: ( (lv_instructions_13_0= ruleInstruction ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:654:1: (lv_instructions_13_0= ruleInstruction )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:654:1: (lv_instructions_13_0= ruleInstruction )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:655:3: lv_instructions_13_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_ruleInstructionList1269);
                    lv_instructions_13_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstructionListRule());
                      	        }
                             		add(
                             			current, 
                             			"instructions",
                              		lv_instructions_13_0, 
                              		"Instruction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleInstructionList"


    // $ANTLR start "entryRuleLabel"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:679:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:680:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:681:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1305);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1315); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:688:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:691:28: ( (otherlv_0= 'label:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:692:1: (otherlv_0= 'label:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:692:1: (otherlv_0= 'label:' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:692:3: otherlv_0= 'label:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLabel1352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:696:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:697:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:697:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:698:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel1369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelRule());
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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleConditional"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:722:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:723:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:724:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional1410);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional1420); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:731:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_conditional_3_0= ruleInstructionList ) ) otherlv_4= 'end' ( (otherlv_5= RULE_ID ) )* ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expression_1_0 = null;

        EObject lv_conditional_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:734:28: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_conditional_3_0= ruleInstructionList ) ) otherlv_4= 'end' ( (otherlv_5= RULE_ID ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:735:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_conditional_3_0= ruleInstructionList ) ) otherlv_4= 'end' ( (otherlv_5= RULE_ID ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:735:1: (otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_conditional_3_0= ruleInstructionList ) ) otherlv_4= 'end' ( (otherlv_5= RULE_ID ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:735:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleSCLExpression ) ) otherlv_2= 'then' ( (lv_conditional_3_0= ruleInstructionList ) ) otherlv_4= 'end' ( (otherlv_5= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleConditional1457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:739:1: ( (lv_expression_1_0= ruleSCLExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:740:1: (lv_expression_1_0= ruleSCLExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:740:1: (lv_expression_1_0= ruleSCLExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:741:3: lv_expression_1_0= ruleSCLExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getExpressionSCLExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSCLExpression_in_ruleConditional1478);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConditional1490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getThenKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:761:1: ( (lv_conditional_3_0= ruleInstructionList ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:762:1: (lv_conditional_3_0= ruleInstructionList )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:762:1: (lv_conditional_3_0= ruleInstructionList )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:763:3: lv_conditional_3_0= ruleInstructionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionalInstructionListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstructionList_in_ruleConditional1511);
            lv_conditional_3_0=ruleInstructionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"conditional",
                      		lv_conditional_3_0, 
                      		"InstructionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConditional1523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getEndKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:783:1: ( (otherlv_5= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:784:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:784:1: (otherlv_5= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:785:3: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getConditionalRule());
            	      	        }
            	              
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditional1547); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getDependenciesInstructionCrossReference_5_0()); 
            	      	
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleGoto"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:807:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:808:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:809:2: iv_ruleGoto= ruleGoto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoRule()); 
            }
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto1584);
            iv_ruleGoto=ruleGoto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoto; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto1594); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:816:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:819:28: ( (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:820:1: (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:820:1: (otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:820:3: otherlv_0= 'goto' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleGoto1631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGotoKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:824:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:825:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:825:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:826:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoto1648); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:850:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:851:2: (iv_ruleParallel= ruleParallel EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:852:2: iv_ruleParallel= ruleParallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParallelRule()); 
            }
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel1689);
            iv_ruleParallel=ruleParallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParallel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel1699); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:859:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleInstructionList ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+ ) otherlv_4= 'join' ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_threads_1_0 = null;

        EObject lv_threads_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:862:28: ( (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleInstructionList ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+ ) otherlv_4= 'join' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:863:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleInstructionList ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+ ) otherlv_4= 'join' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:863:1: (otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleInstructionList ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+ ) otherlv_4= 'join' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:863:3: otherlv_0= 'fork' ( ( (lv_threads_1_0= ruleInstructionList ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+ ) otherlv_4= 'join'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleParallel1736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getForkKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:867:1: ( ( (lv_threads_1_0= ruleInstructionList ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+ )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:867:2: ( (lv_threads_1_0= ruleInstructionList ) ) (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:867:2: ( (lv_threads_1_0= ruleInstructionList ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:868:1: (lv_threads_1_0= ruleInstructionList )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:868:1: (lv_threads_1_0= ruleInstructionList )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:869:3: lv_threads_1_0= ruleInstructionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsInstructionListParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstructionList_in_ruleParallel1758);
            lv_threads_1_0=ruleInstructionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParallelRule());
              	        }
                     		add(
                     			current, 
                     			"threads",
                      		lv_threads_1_0, 
                      		"InstructionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:885:2: (otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:885:4: otherlv_2= 'par' ( (lv_threads_3_0= ruleInstructionList ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleParallel1771); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getParKeyword_1_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:889:1: ( (lv_threads_3_0= ruleInstructionList ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:890:1: (lv_threads_3_0= ruleInstructionList )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:890:1: (lv_threads_3_0= ruleInstructionList )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:891:3: lv_threads_3_0= ruleInstructionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParallelAccess().getThreadsInstructionListParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstructionList_in_ruleParallel1792);
            	    lv_threads_3_0=ruleInstructionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"threads",
            	              		lv_threads_3_0, 
            	              		"InstructionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleParallel1807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParallelAccess().getJoinKeyword_2());
                  
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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:919:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:920:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:921:2: iv_rulePause= rulePause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPauseRule()); 
            }
            pushFollow(FOLLOW_rulePause_in_entryRulePause1843);
            iv_rulePause=rulePause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePause1853); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:928:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:931:28: ( (otherlv_0= 'pause' () ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:932:1: (otherlv_0= 'pause' () )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:932:1: (otherlv_0= 'pause' () )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:932:3: otherlv_0= 'pause' ()
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_rulePause1890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:936:1: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:937:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPauseAccess().getPauseAction_1(),
                          current);
                  
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
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:953:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:954:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:955:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1938);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1948); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:962:1: ruleAnnotation returns [EObject current=null] : ( (lv_comment_0_0= RULE_SL_COMMENT ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:965:28: ( ( (lv_comment_0_0= RULE_SL_COMMENT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:966:1: ( (lv_comment_0_0= RULE_SL_COMMENT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:966:1: ( (lv_comment_0_0= RULE_SL_COMMENT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:967:1: (lv_comment_0_0= RULE_SL_COMMENT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:967:1: (lv_comment_0_0= RULE_SL_COMMENT )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:968:3: lv_comment_0_0= RULE_SL_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAnnotation1989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_comment_0_0, grammarAccess.getAnnotationAccess().getCommentSL_COMMENTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"comment",
                      		lv_comment_0_0, 
                      		"SL_COMMENT");
              	    
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:994:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:995:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:996:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2031);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2041); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefRoot"


    // $ANTLR start "ruleDefRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1003:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1006:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1007:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1007:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1008:2: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2091);
                    this_StatechartRoot_0=ruleStatechartRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatechartRoot_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1021:2: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2121);
                    this_StateRoot_1=ruleStateRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateRoot_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1034:2: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2151);
                    this_TransitionRoot_2=ruleTransitionRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransitionRoot_2; 
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
    // $ANTLR end "ruleDefRoot"


    // $ANTLR start "entryRuleStatechartRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1053:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1054:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1055:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2186);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2196); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatechartRoot"


    // $ANTLR start "ruleStatechartRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1062:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1065:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1066:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1066:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1066:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleStatechartRoot2233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1070:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1071:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1071:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1072:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2254);
            lv_def_1_0=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatechartRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"StatechartSpecification");
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
    // $ANTLR end "ruleStatechartRoot"


    // $ANTLR start "entryRuleStateRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1096:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1097:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1098:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2290);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2300); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateRoot"


    // $ANTLR start "ruleStateRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1105:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1108:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1109:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1109:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1109:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStateRoot2337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1113:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1114:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1114:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1115:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2358);
            lv_def_1_0=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"StateSpecification");
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
    // $ANTLR end "ruleStateRoot"


    // $ANTLR start "entryRuleTransitionRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1139:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1140:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1141:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2394);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2404); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionRoot"


    // $ANTLR start "ruleTransitionRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1148:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1151:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1152:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1152:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1152:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTransitionRoot2441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1156:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1157:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1157:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1158:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2462);
            lv_def_1_0=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRootRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"TransitionSpecification");
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
    // $ANTLR end "ruleTransitionRoot"


    // $ANTLR start "entryRuleStatechartSpecification"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1184:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1185:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1186:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2500);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2510); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatechartSpecification"


    // $ANTLR start "ruleStatechartSpecification"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1193:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1196:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1197:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1197:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1197:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1197:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1198:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1206:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1206:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleStatechartSpecification2560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1210:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1211:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1211:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1212:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2581);
                    lv_namespace_2_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatechartSpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"namespace",
                              		lv_namespace_2_0, 
                              		"FQN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1228:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1229:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1229:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1230:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2604);
            	    lv_scopes_3_0=ruleStatechartScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatechartSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_3_0, 
            	              		"StatechartScope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleStateSpecification"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1254:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1255:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1256:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2641);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification2651); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateSpecification"


    // $ANTLR start "ruleStateSpecification"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1263:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1266:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1267:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1267:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1268:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1268:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1269:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification2696);
            lv_scope_0_0=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"scope",
                      		lv_scope_0_0, 
                      		"StateScope");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleStateSpecification"


    // $ANTLR start "entryRuleTransitionSpecification"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1293:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1294:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1295:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2731);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2741); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionSpecification"


    // $ANTLR start "ruleTransitionSpecification"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1302:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1305:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1306:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1306:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1307:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1307:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1308:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2786);
            lv_reaction_0_0=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"reaction",
                      		lv_reaction_0_0, 
                      		"TransitionReaction");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTransitionSpecification"


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1334:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1335:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1336:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope2823);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope2833); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateScope"


    // $ANTLR start "ruleStateScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1343:1: ruleStateScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1346:28: ( ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1347:1: ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1347:1: ( () ( (lv_declarations_1_0= ruleLocalReaction ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1347:2: () ( (lv_declarations_1_0= ruleLocalReaction ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1347:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1348:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1356:2: ( (lv_declarations_1_0= ruleLocalReaction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=51 && LA15_0<=54)||LA15_0==61||(LA15_0>=71 && LA15_0<=72)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1357:1: (lv_declarations_1_0= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1357:1: (lv_declarations_1_0= ruleLocalReaction )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1358:3: lv_declarations_1_0= ruleLocalReaction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope2891);
            	    lv_declarations_1_0=ruleLocalReaction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_1_0, 
            	              		"LocalReaction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleStateScope"


    // $ANTLR start "entryRuleStatechartScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1382:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1383:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1384:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2928);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatechartScope"


    // $ANTLR start "ruleStatechartScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1391:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1394:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1395:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1395:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            else if ( (LA16_0==36) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1396:2: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2988);
                    this_InterfaceScope_0=ruleInterfaceScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceScope_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1409:2: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3018);
                    this_InternalScope_1=ruleInternalScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InternalScope_1; 
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
    // $ANTLR end "ruleStatechartScope"


    // $ANTLR start "entryRuleInterfaceScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1430:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1431:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1432:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3055);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceScope"


    // $ANTLR start "ruleInterfaceScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1439:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_declarations_4_1 = null;

        EObject lv_declarations_4_2 = null;

        EObject lv_declarations_4_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1442:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1443:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1443:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1443:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1443:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1444:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleInterfaceScope3114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1456:1: ( (lv_name_2_0= ruleXID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=34 && LA17_0<=40)||LA17_0==42||(LA17_0>=46 && LA17_0<=57)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1457:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1457:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1458:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3135);
                    lv_name_2_0=ruleXID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"XID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInterfaceScope3148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1478:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=17 && LA19_0<=19)||LA19_0==37||LA19_0==42||(LA19_0>=46 && LA19_0<=48)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1479:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1479:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1480:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1480:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 46:
            	    case 47:
            	    case 48:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 17:
            	    case 18:
            	    case 19:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1481:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3171);
            	            lv_declarations_4_1=ruleEventDeclarartion();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_1, 
            	                      		"EventDeclarartion");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1496:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3190);
            	            lv_declarations_4_2=ruleVariableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_2, 
            	                      		"VariableDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1511:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3209);
            	            lv_declarations_4_3=ruleOperationDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_3, 
            	                      		"OperationDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1537:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1538:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1539:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3249);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInternalScope"


    // $ANTLR start "ruleInternalScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1546:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleInternalScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_declarations_3_1 = null;

        EObject lv_declarations_3_2 = null;

        EObject lv_declarations_3_3 = null;

        EObject lv_declarations_3_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1549:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1550:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1550:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1550:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1550:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1551:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInternalScope3308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleInternalScope3320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1567:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=17 && LA21_0<=19)||LA21_0==37||LA21_0==42||(LA21_0>=46 && LA21_0<=48)||(LA21_0>=51 && LA21_0<=54)||LA21_0==61||(LA21_0>=71 && LA21_0<=72)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1568:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1568:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1569:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1569:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 46:
            	    case 47:
            	    case 48:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 17:
            	    case 18:
            	    case 19:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 61:
            	    case 71:
            	    case 72:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1570:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3343);
            	            lv_declarations_3_1=ruleEventDeclarartion();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_1, 
            	                      		"EventDeclarartion");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1585:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3362);
            	            lv_declarations_3_2=ruleVariableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_2, 
            	                      		"VariableDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1600:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3381);
            	            lv_declarations_3_3=ruleOperationDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_3, 
            	                      		"OperationDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1615:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3400);
            	            lv_declarations_3_4=ruleLocalReaction();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInternalScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_3_4, 
            	                      		"LocalReaction");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1643:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1644:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1645:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3442);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3452); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventDeclarartion"


    // $ANTLR start "ruleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1652:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1655:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1657:2: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3501);
            this_EventDefinition_0=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EventDefinition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleEventDeclarartion"


    // $ANTLR start "entryRuleEventDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1678:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1679:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1680:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3537);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventDefinition"


    // $ANTLR start "ruleEventDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1687:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1690:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1691:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1691:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1691:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1691:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=46 && LA22_0<=48)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1692:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1692:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1693:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3593);
                    lv_direction_0_0=ruleDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"direction",
                              		lv_direction_0_0, 
                              		"Direction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleEventDefinition3606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1713:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1714:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1714:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1715:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition3627);
            lv_name_2_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1731:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1731:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventDefinition3640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1735:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1736:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1736:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1737:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3667);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleEventDefinition"


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1763:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2()
        		);
        	
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1769:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1770:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition3713);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition3723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1780:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_readonly_3_0=null;
        Token lv_external_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_initialValue_9_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2()
        		);
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1786:28: ( ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1787:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1787:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1787:2: () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= ruleXID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1787:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1788:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleVariableDefinition3776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1800:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1802:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1802:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1803:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1806:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1807:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1807:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            loop24:
            do {
                int alt24=3;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1809:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1809:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1810:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1810:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1811:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1814:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1814:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1814:16: ( (lv_readonly_3_0= 'readonly' ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1815:1: (lv_readonly_3_0= 'readonly' )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1815:1: (lv_readonly_3_0= 'readonly' )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1816:3: lv_readonly_3_0= 'readonly'
            	    {
            	    lv_readonly_3_0=(Token)match(input,39,FOLLOW_39_in_ruleVariableDefinition3839); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_readonly_3_0, grammarAccess.getVariableDefinitionAccess().getReadonlyReadonlyKeyword_2_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "readonly", true, "readonly");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1836:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1836:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1837:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1837:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1838:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1841:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1841:7: {...}? => ( (lv_external_4_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1841:16: ( (lv_external_4_0= 'external' ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1842:1: (lv_external_4_0= 'external' )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1842:1: (lv_external_4_0= 'external' )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1843:3: lv_external_4_0= 'external'
            	    {
            	    lv_external_4_0=(Token)match(input,40,FOLLOW_40_in_ruleVariableDefinition3924); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_external_4_0, grammarAccess.getVariableDefinitionAccess().getExternalExternalKeyword_2_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "external", true, "external");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1870:2: ( (lv_name_5_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1871:1: (lv_name_5_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1871:1: (lv_name_5_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1872:3: lv_name_5_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleVariableDefinition3998);
            lv_name_5_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition4010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1892:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1893:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1893:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1894:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition4037);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1910:2: (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1910:4: otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleVariableDefinition4050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1914:1: ( (lv_initialValue_9_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1915:1: (lv_initialValue_9_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1915:1: (lv_initialValue_9_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1916:3: lv_initialValue_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition4071);
                    lv_initialValue_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleOperationDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1943:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1944:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1945:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4113);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4123); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationDeclaration"


    // $ANTLR start "ruleOperationDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1952:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1955:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1957:2: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4172);
            this_OperationDefinition_0=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OperationDefinition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleOperationDeclaration"


    // $ANTLR start "entryRuleOperationDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1978:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1979:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1980:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4208);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition4218); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationDefinition"


    // $ANTLR start "ruleOperationDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1987:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1990:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1991:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1991:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1991:2: () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1991:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1992:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOperationDefinition4267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2004:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2005:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2005:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2006:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition4288);
            lv_name_2_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleOperationDefinition4300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2026:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=34 && LA27_0<=40)||LA27_0==42||(LA27_0>=46 && LA27_0<=57)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2026:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2026:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2027:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2027:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2028:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4322);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2044:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==44) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2044:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleOperationDefinition4335); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2048:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2049:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2049:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2050:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4356);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleOperationDefinition4372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2070:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2070:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition4385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2074:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2075:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2075:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2076:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4412);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleOperationDefinition"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2100:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2101:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2102:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4450);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2109:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2112:28: ( ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2113:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2113:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2113:2: ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2113:2: ( (lv_name_0_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2114:1: (lv_name_0_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2114:1: (lv_name_0_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2115:3: lv_name_0_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameXIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleParameter4506);
            lv_name_0_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParameter4518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2135:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2136:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2136:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2137:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter4545);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleXID"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2161:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2162:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2163:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4582);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4593); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXID"


    // $ANTLR start "ruleXID"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2170:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2173:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2174:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2174:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt29=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 34:
                {
                alt29=2;
                }
                break;
            case 35:
                {
                alt29=3;
                }
                break;
            case 36:
                {
                alt29=4;
                }
                break;
            case 37:
                {
                alt29=5;
                }
                break;
            case 46:
                {
                alt29=6;
                }
                break;
            case 47:
                {
                alt29=7;
                }
                break;
            case 48:
                {
                alt29=8;
                }
                break;
            case 38:
                {
                alt29=9;
                }
                break;
            case 39:
                {
                alt29=10;
                }
                break;
            case 40:
                {
                alt29=11;
                }
                break;
            case 42:
                {
                alt29=12;
                }
                break;
            case 49:
                {
                alt29=13;
                }
                break;
            case 50:
                {
                alt29=14;
                }
                break;
            case 51:
                {
                alt29=15;
                }
                break;
            case 52:
                {
                alt29=16;
                }
                break;
            case 53:
                {
                alt29=17;
                }
                break;
            case 54:
                {
                alt29=18;
                }
                break;
            case 55:
                {
                alt29=19;
                }
                break;
            case 56:
                {
                alt29=20;
                }
                break;
            case 57:
                {
                alt29=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2174:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2183:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleXID4657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2190:2: kw= 'interface'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleXID4676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2197:2: kw= 'internal'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleXID4695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2204:2: kw= 'event'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleXID4714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2211:2: kw= 'local'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2218:2: kw= 'in'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2225:2: kw= 'out'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2232:2: kw= 'var'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2239:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2246:2: kw= 'external'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2253:2: kw= 'operation'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2260:2: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2267:2: kw= 'else'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2274:2: kw= 'entry'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2281:2: kw= 'exit'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2288:2: kw= 'always'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2295:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2302:2: kw= 'raise'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID4980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2309:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleXID4999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2316:2: kw= 'active'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleXID5018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getActiveKeyword_20()); 
                          
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
    // $ANTLR end "ruleXID"


    // $ANTLR start "entryRuleFQN"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2329:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2330:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2331:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5059);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2338:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2341:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2342:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2342:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2343:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN5117);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2353:1: (kw= '.' this_XID_2= ruleXID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==58) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2354:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleFQN5136); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN5158);
            	    this_XID_2=ruleXID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_XID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2380:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2381:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2382:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5207);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction5217); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalReaction"


    // $ANTLR start "ruleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2389:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2392:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2393:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2393:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2393:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2393:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2394:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2394:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2395:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5263);
            lv_trigger_0_0=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
              	        }
                     		set(
                     			current, 
                     			"trigger",
                      		lv_trigger_0_0, 
                      		"ReactionTrigger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2411:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2411:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2416:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2416:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleLocalReaction5295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2420:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2421:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2421:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2422:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction5316);
            lv_effect_2_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_2_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


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
    // $ANTLR end "ruleLocalReaction"


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2446:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2447:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2448:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5354);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5364); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionReaction"


    // $ANTLR start "ruleTransitionReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2455:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2458:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2459:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2459:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2459:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2459:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2460:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2468:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||(LA31_0>=49 && LA31_0<=54)||LA31_0==61||(LA31_0>=71 && LA31_0<=72)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2469:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2469:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2470:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5422);
                    lv_trigger_1_0=ruleStextTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_1_0, 
                              		"StextTrigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2486:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2486:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleTransitionReaction5436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2490:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2491:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2491:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2492:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5457);
                    lv_effect_3_0=ruleReactionEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_3_0, 
                              		"ReactionEffect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2508:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2508:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleTransitionReaction5472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2512:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID||LA33_0==63) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2513:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2513:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2514:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5493);
                    	    lv_properties_5_0=ruleTransitionProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_5_0, 
                    	              		"TransitionProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTransitionReaction"


    // $ANTLR start "entryRuleStextTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2538:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2539:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2540:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5532);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5542); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStextTrigger"


    // $ANTLR start "ruleStextTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2547:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2550:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2551:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2551:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||(LA35_0>=51 && LA35_0<=54)||LA35_0==61||(LA35_0>=71 && LA35_0<=72)) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=49 && LA35_0<=50)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2552:2: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5592);
                    this_ReactionTrigger_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReactionTrigger_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2565:2: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5622);
                    this_DefaultTrigger_1=ruleDefaultTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefaultTrigger_1; 
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
    // $ANTLR end "ruleStextTrigger"


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2584:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2585:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2586:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger5657);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger5667); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReactionTrigger"


    // $ANTLR start "ruleReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2593:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_triggers_1_0 = null;

        EObject lv_triggers_3_0 = null;

        EObject lv_guardExpression_5_0 = null;

        EObject lv_guardExpression_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2596:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2597:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2597:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2597:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2597:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2598:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2606:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||(LA38_0>=51 && LA38_0<=54)||(LA38_0>=71 && LA38_0<=72)) ) {
                alt38=1;
            }
            else if ( (LA38_0==61) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2606:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2606:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2606:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2606:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2607:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2607:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2608:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger5727);
                    lv_triggers_1_0=ruleEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		add(
                             			current, 
                             			"triggers",
                              		lv_triggers_1_0, 
                              		"EventSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2624:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==44) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2624:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleReactionTrigger5740); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2628:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2629:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2629:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2630:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger5761);
                    	    lv_triggers_3_0=ruleEventSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"triggers",
                    	              		lv_triggers_3_0, 
                    	              		"EventSpec");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2646:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==61) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2646:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2646:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2646:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleReactionTrigger5784); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2651:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2652:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2652:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2653:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger5806);
                            lv_guardExpression_5_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"guardExpression",
                                      		lv_guardExpression_5_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,62,FOLLOW_62_in_ruleReactionTrigger5818); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2674:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2674:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2674:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleReactionTrigger5840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2678:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2679:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2679:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2680:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger5861);
                    lv_guardExpression_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"guardExpression",
                              		lv_guardExpression_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,62,FOLLOW_62_in_ruleReactionTrigger5873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_1_2());
                          
                    }

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
    // $ANTLR end "ruleReactionTrigger"


    // $ANTLR start "entryRuleDefaultTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2708:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2709:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2710:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5911);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5921); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaultTrigger"


    // $ANTLR start "ruleDefaultTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2717:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2720:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2721:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2721:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2721:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2721:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2722:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2730:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            else if ( (LA39_0==50) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2730:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleDefaultTrigger5971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2735:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleDefaultTrigger5989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDefaultTriggerAccess().getElseKeyword_1_1());
                          
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
    // $ANTLR end "ruleDefaultTrigger"


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2747:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2748:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2749:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect6026);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect6036); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReactionEffect"


    // $ANTLR start "ruleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2756:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2759:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2760:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2760:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2760:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2760:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2761:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2769:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2770:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2770:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2771:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2771:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_INT)||(LA40_0>=RULE_BOOL && LA40_0<=RULE_HEX)||LA40_0==43||(LA40_0>=56 && LA40_0<=57)||LA40_0==67||(LA40_0>=85 && LA40_0<=86)||LA40_0==89) ) {
                alt40=1;
            }
            else if ( (LA40_0==55) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2772:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect6096);
                    lv_actions_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"actions",
                              		lv_actions_1_1, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2787:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6115);
                    lv_actions_1_2=ruleEventRaisingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"actions",
                              		lv_actions_1_2, 
                              		"EventRaisingExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2805:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==21) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2805:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2805:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2805:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleReactionEffect6139); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2810:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2811:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2811:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2812:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2812:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||(LA41_0>=RULE_BOOL && LA41_0<=RULE_HEX)||LA41_0==43||(LA41_0>=56 && LA41_0<=57)||LA41_0==67||(LA41_0>=85 && LA41_0<=86)||LA41_0==89) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==55) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2813:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect6163);
            	            lv_actions_3_1=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"actions",
            	                      		lv_actions_3_1, 
            	                      		"Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2828:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6182);
            	            lv_actions_3_2=ruleEventRaisingExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"actions",
            	                      		lv_actions_3_2, 
            	                      		"EventRaisingExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleTransitionProperty"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2854:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2855:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2856:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty6223);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty6233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionProperty"


    // $ANTLR start "ruleTransitionProperty"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2863:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2866:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2867:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2867:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==63) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2868:2: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty6283);
                    this_EntryPointSpec_0=ruleEntryPointSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryPointSpec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2881:2: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty6313);
                    this_ExitPointSpec_1=ruleExitPointSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitPointSpec_1; 
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
    // $ANTLR end "ruleTransitionProperty"


    // $ANTLR start "entryRuleEntryPointSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2900:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2901:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2902:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6348);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec6358); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntryPointSpec"


    // $ANTLR start "ruleEntryPointSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2909:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2912:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2913:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2913:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2913:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleEntryPointSpec6395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2917:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2918:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2918:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2919:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec6412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_entrypoint_1_0, grammarAccess.getEntryPointSpecAccess().getEntrypointIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"entrypoint",
                      		lv_entrypoint_1_0, 
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
    // $ANTLR end "ruleEntryPointSpec"


    // $ANTLR start "entryRuleExitPointSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2943:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2944:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2945:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6453);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec6463); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExitPointSpec"


    // $ANTLR start "ruleExitPointSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2952:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2955:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2956:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2956:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2956:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2956:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2957:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2957:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2958:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec6505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_exitpoint_0_0, grammarAccess.getExitPointSpecAccess().getExitpointIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"exitpoint",
                      		lv_exitpoint_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleExitPointSpec6522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitPointSpecAccess().getGreaterThanSignKeyword_1());
                  
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
    // $ANTLR end "ruleExitPointSpec"


    // $ANTLR start "entryRuleEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2986:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2987:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2988:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec6558);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec6568); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventSpec"


    // $ANTLR start "ruleEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2995:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2998:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2999:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:2999:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt44=1;
                }
                break;
            case 71:
            case 72:
                {
                alt44=2;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3000:2: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec6618);
                    this_RegularEventSpec_0=ruleRegularEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegularEventSpec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3013:2: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec6648);
                    this_TimeEventSpec_1=ruleTimeEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TimeEventSpec_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3026:2: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec6678);
                    this_BuiltinEventSpec_2=ruleBuiltinEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltinEventSpec_2; 
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
    // $ANTLR end "ruleEventSpec"


    // $ANTLR start "entryRuleRegularEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3045:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3046:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3047:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6713);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec6723); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegularEventSpec"


    // $ANTLR start "ruleRegularEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3054:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3057:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3058:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3058:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3059:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3059:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3060:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6768);
            lv_event_0_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRegularEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleRegularEventSpec"


    // $ANTLR start "entryRuleTimeEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3084:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3085:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3086:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6803);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec6813); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeEventSpec"


    // $ANTLR start "ruleTimeEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3093:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3096:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3097:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3097:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3097:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3097:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3098:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3098:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3099:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6859);
            lv_type_0_0=ruleTimeEventType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"TimeEventType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3115:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3116:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3116:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3117:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6880);
            lv_value_1_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"ConditionalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3133:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3134:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3134:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3135:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6901);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeEventSpecRule());
              	        }
                     		set(
                     			current, 
                     			"unit",
                      		lv_unit_2_0, 
                      		"TimeUnit");
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
    // $ANTLR end "ruleTimeEventSpec"


    // $ANTLR start "entryRuleBuiltinEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3159:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3160:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3161:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6937);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec6947); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuiltinEventSpec"


    // $ANTLR start "ruleBuiltinEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3168:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3171:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3172:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3172:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt45=1;
                }
                break;
            case 52:
                {
                alt45=2;
                }
                break;
            case 53:
            case 54:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3173:2: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6997);
                    this_EntryEvent_0=ruleEntryEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryEvent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3186:2: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec7027);
                    this_ExitEvent_1=ruleExitEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitEvent_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3199:2: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec7057);
                    this_AlwaysEvent_2=ruleAlwaysEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlwaysEvent_2; 
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
    // $ANTLR end "ruleBuiltinEventSpec"


    // $ANTLR start "entryRuleEntryEvent"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3218:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3219:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3220:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent7092);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent7102); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntryEvent"


    // $ANTLR start "ruleEntryEvent"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3227:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3230:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3231:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3231:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3231:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3231:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3232:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleEntryEvent7151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryEventAccess().getEntryKeyword_1());
                  
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
    // $ANTLR end "ruleEntryEvent"


    // $ANTLR start "entryRuleExitEvent"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3252:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3253:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3254:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent7187);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent7197); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExitEvent"


    // $ANTLR start "ruleExitEvent"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3261:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3264:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3265:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3265:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3265:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3265:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3266:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExitEvent7246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitEventAccess().getExitKeyword_1());
                  
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
    // $ANTLR end "ruleExitEvent"


    // $ANTLR start "entryRuleAlwaysEvent"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3286:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3287:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3288:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7282);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent7292); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlwaysEvent"


    // $ANTLR start "ruleAlwaysEvent"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3295:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3298:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3299:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3299:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3299:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3299:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3300:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3308:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            else if ( (LA46_0==54) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3308:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleAlwaysEvent7342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3313:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleAlwaysEvent7360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAlwaysEventAccess().getOncycleKeyword_1_1());
                          
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
    // $ANTLR end "ruleAlwaysEvent"


    // $ANTLR start "entryRuleEventRaisingExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3325:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3326:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3327:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression7397);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression7407); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventRaisingExpression"


    // $ANTLR start "ruleEventRaisingExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3334:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3337:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3338:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3338:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3338:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3338:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3339:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleEventRaisingExpression7456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3351:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3352:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3352:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3353:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression7477);
            lv_event_2_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventRaisingExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_2_0, 
                      		"FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3369:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3369:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventRaisingExpression7490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3373:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3374:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3374:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3375:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression7511);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventRaisingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleEventRaisingExpression"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3401:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3402:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3403:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7551);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7561); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3410:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3413:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3415:2: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression7610);
            this_AssignmentExpression_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssignmentExpression_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3434:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3435:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3436:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7644);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression7654); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3443:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3446:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3447:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3447:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3448:2: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7704);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3459:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==41||(LA48_0>=73 && LA48_0<=82)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3459:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3459:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3460:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3468:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3469:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3469:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3470:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression7737);
            	    lv_operator_2_0=ruleAssignmentOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AssignmentOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3486:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3487:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3487:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3488:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7758);
            	    lv_expression_3_0=ruleConditionalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"expression",
            	              		lv_expression_3_0, 
            	              		"ConditionalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3512:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3513:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3514:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression7796);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression7806); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3521:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3524:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3525:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3525:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3526:2: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7856);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3537:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==64) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3537:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3537:2: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3538:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleConditionalExpression7880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3550:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3551:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3551:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3552:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7901);
                    lv_trueCase_3_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"trueCase",
                              		lv_trueCase_3_0, 
                              		"LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConditionalExpression7913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3572:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3573:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3573:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3574:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7934);
                    lv_falseCase_5_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"falseCase",
                              		lv_falseCase_5_0, 
                              		"LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3598:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3599:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3600:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7972);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression7982); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3607:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3610:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3611:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3611:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3612:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8032);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3623:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==65) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3623:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3623:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3624:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleLogicalOrExpression8056); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3636:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3637:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3637:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3638:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8077);
            	    lv_rightOperand_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"LogicalAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3662:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3663:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3664:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression8115);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression8125); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3671:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3674:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3675:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3675:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3676:2: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8175);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3687:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==66) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3687:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3687:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3688:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleLogicalAndExpression8199); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3700:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3701:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3701:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3702:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8220);
            	    lv_rightOperand_3_0=ruleLogicalNotExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"LogicalNotExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3726:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3727:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3728:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression8258);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression8268); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalNotExpression"


    // $ANTLR start "ruleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3735:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3738:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3739:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3739:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||(LA52_0>=RULE_BOOL && LA52_0<=RULE_HEX)||LA52_0==43||(LA52_0>=56 && LA52_0<=57)||(LA52_0>=85 && LA52_0<=86)||LA52_0==89) ) {
                alt52=1;
            }
            else if ( (LA52_0==67) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3740:2: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8318);
                    this_BitwiseXorExpression_0=ruleBitwiseXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitwiseXorExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3752:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3752:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3752:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3752:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3753:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleLogicalNotExpression8348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3765:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3766:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3766:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3767:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8369);
                    lv_operand_3_0=ruleBitwiseXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"BitwiseXorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleLogicalNotExpression"


    // $ANTLR start "entryRuleBitwiseXorExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3791:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3792:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3793:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8406);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression8416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseXorExpression"


    // $ANTLR start "ruleBitwiseXorExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3800:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3803:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3804:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3804:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3805:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8466);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3816:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==68) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3816:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3816:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3817:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleBitwiseXorExpression8490); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3829:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3830:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3830:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3831:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8511);
            	    lv_rightOperand_3_0=ruleBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"BitwiseOrExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3855:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3856:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3857:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8549);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression8559); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3864:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3867:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3868:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3868:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3869:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8609);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3880:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==69) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3880:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3880:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3881:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleBitwiseOrExpression8633); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3893:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3894:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3894:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3895:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8654);
            	    lv_rightOperand_3_0=ruleBitwiseAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"BitwiseAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3919:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3920:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3921:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression8692);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression8702); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3928:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3931:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3932:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3932:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3933:2: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8752);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3944:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==70) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3944:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3944:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3945:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleBitwiseAndExpression8776); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3957:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3958:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3958:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3959:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8797);
            	    lv_rightOperand_3_0=ruleLogicalRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"LogicalRelationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3983:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3984:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3985:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8835);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression8845); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalRelationExpression"


    // $ANTLR start "ruleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3992:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3995:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3996:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3996:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:3997:2: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8895);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4008:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==63||(LA56_0>=90 && LA56_0<=94)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4008:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4008:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4009:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4017:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4018:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4018:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4019:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8928);
            	    lv_operator_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"RelationalOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4035:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4036:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4036:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4037:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8949);
            	    lv_rightOperand_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ShiftExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4061:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4062:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4063:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression8987);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression8997); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4070:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4073:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4074:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4074:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4075:2: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9047);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4086:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=83 && LA57_0<=84)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4086:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4086:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4087:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4095:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4096:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4096:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4097:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression9080);
            	    lv_operator_2_0=ruleShiftOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"ShiftOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4113:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4114:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4114:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4115:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9101);
            	    lv_rightOperand_3_0=ruleNumericalAddSubtractExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"NumericalAddSubtractExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4139:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4140:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4141:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression9139);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression9149); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericalAddSubtractExpression"


    // $ANTLR start "ruleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4148:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4151:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4152:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4152:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4153:2: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9199);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4164:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=85 && LA58_0<=86)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4164:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4164:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4165:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4173:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4174:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4174:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4175:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression9232);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalAddSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AdditiveOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4191:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4192:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4192:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4193:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9253);
            	    lv_rightOperand_3_0=ruleNumericalMultiplyDivideExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalAddSubtractExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"NumericalMultiplyDivideExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4217:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4218:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4219:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression9291);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression9301); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericalMultiplyDivideExpression"


    // $ANTLR start "ruleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4226:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4229:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4230:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4230:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4231:2: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9351);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4242:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==59||(LA59_0>=87 && LA59_0<=88)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4242:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4242:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4243:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4251:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4252:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4252:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4253:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression9384);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalMultiplyDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"MultiplicativeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4269:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4270:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4270:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4271:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9405);
            	    lv_rightOperand_3_0=ruleNumericalUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNumericalMultiplyDivideExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"NumericalUnaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4295:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4296:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4297:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression9443);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression9453); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericalUnaryExpression"


    // $ANTLR start "ruleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4304:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4307:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4308:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4308:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_INT)||(LA60_0>=RULE_BOOL && LA60_0<=RULE_HEX)||LA60_0==43||(LA60_0>=56 && LA60_0<=57)) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=85 && LA60_0<=86)||LA60_0==89) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4309:2: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9503);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4321:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4321:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4321:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4321:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4322:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4330:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4331:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4331:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4332:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression9542);
                    lv_operator_2_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericalUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"UnaryOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4348:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4349:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4349:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4350:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9563);
                    lv_operand_3_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericalUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleNumericalUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4374:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4375:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4376:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression9600);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression9610); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4383:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_ActiveStateReferenceExpression_2 = null;

        EObject this_EventValueReferenceExpression_3 = null;

        EObject this_ParenthesizedExpression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4386:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4387:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4387:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
                {
                alt61=1;
                }
                break;
            case RULE_ID:
                {
                alt61=2;
                }
                break;
            case 57:
                {
                alt61=3;
                }
                break;
            case 56:
                {
                alt61=4;
                }
                break;
            case 43:
                {
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4388:2: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression9660);
                    this_PrimitiveValueExpression_0=rulePrimitiveValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveValueExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4401:2: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression9690);
                    this_FeatureCall_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FeatureCall_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4414:2: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression9720);
                    this_ActiveStateReferenceExpression_2=ruleActiveStateReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActiveStateReferenceExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4427:2: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression9750);
                    this_EventValueReferenceExpression_3=ruleEventValueReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventValueReferenceExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4440:2: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression9780);
                    this_ParenthesizedExpression_4=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_4; 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRulePrimitiveValueExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4459:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4460:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4461:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression9815);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression9825); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveValueExpression"


    // $ANTLR start "rulePrimitiveValueExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4468:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4471:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4472:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4472:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4472:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4472:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4473:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4481:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4482:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4482:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4483:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression9883);
            lv_value_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Literal");
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
    // $ANTLR end "rulePrimitiveValueExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4507:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4508:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4509:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9919);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall9929); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4516:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_operationCall_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_ElementReferenceExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4519:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4520:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4520:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4521:2: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall9979);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4532:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==58) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4532:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4532:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4533:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleFeatureCall10003); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4545:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4546:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4546:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4547:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall10027); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4561:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==43) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4561:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4561:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4561:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4568:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4569:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,43,FOLLOW_43_in_ruleFeatureCall10061); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operationCall_4_0, grammarAccess.getFeatureCallAccess().getOperationCallLeftParenthesisKeyword_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4582:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt63=2;
            	            int LA63_0 = input.LA(1);

            	            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_INT)||(LA63_0>=RULE_BOOL && LA63_0<=RULE_HEX)||LA63_0==43||(LA63_0>=56 && LA63_0<=57)||LA63_0==67||(LA63_0>=85 && LA63_0<=86)||LA63_0==89) ) {
            	                alt63=1;
            	            }
            	            switch (alt63) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4582:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4582:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4583:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4583:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4584:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10096);
            	                    lv_args_5_0=ruleExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"args",
            	                              		lv_args_5_0, 
            	                              		"Expression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4600:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop62:
            	                    do {
            	                        int alt62=2;
            	                        int LA62_0 = input.LA(1);

            	                        if ( (LA62_0==44) ) {
            	                            alt62=1;
            	                        }


            	                        switch (alt62) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4600:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleFeatureCall10109); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4604:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4605:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4605:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4606:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10130);
            	                    	    lv_args_7_0=ruleExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"args",
            	                    	              		lv_args_7_0, 
            	                    	              		"Expression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop62;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleFeatureCall10146); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4634:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4635:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4636:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression10186);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression10196); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElementReferenceExpression"


    // $ANTLR start "ruleElementReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4643:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operationCall_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4646:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4647:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4647:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4647:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4647:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4648:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4656:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4657:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4657:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4658:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression10257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4672:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==43) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4672:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4672:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4672:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4679:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4680:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,43,FOLLOW_43_in_ruleElementReferenceExpression10291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_operationCall_2_0, grammarAccess.getElementReferenceExpressionAccess().getOperationCallLeftParenthesisKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "operationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4693:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_INT)||(LA67_0>=RULE_BOOL && LA67_0<=RULE_HEX)||LA67_0==43||(LA67_0>=56 && LA67_0<=57)||LA67_0==67||(LA67_0>=85 && LA67_0<=86)||LA67_0==89) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4693:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4693:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4694:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4694:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4695:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression10326);
                            lv_args_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4711:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==44) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4711:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleElementReferenceExpression10339); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4715:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4716:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4716:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4717:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression10360);
                            	    lv_args_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getElementReferenceExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_5_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleElementReferenceExpression10376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getElementReferenceExpressionAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleElementReferenceExpression"


    // $ANTLR start "entryRuleEventValueReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4745:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4746:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4747:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression10414);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression10424); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventValueReferenceExpression"


    // $ANTLR start "ruleEventValueReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4754:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4757:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4758:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4758:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4758:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4758:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4759:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEventValueReferenceExpression10473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleEventValueReferenceExpression10485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4775:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4776:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4776:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4777:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression10506);
            lv_value_3_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventValueReferenceExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"FeatureCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleEventValueReferenceExpression10518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEventValueReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleEventValueReferenceExpression"


    // $ANTLR start "entryRuleActiveStateReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4805:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4806:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4807:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression10554);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression10564); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActiveStateReferenceExpression"


    // $ANTLR start "ruleActiveStateReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4814:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4817:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4818:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4818:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4818:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4818:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4819:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleActiveStateReferenceExpression10613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleActiveStateReferenceExpression10625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4835:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4836:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4836:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4837:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression10652);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleActiveStateReferenceExpression10664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getActiveStateReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleActiveStateReferenceExpression"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4865:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4866:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4867:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression10700);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression10710); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4874:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4877:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4878:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4878:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4878:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4878:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4879:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleParenthesizedExpression10759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4891:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4892:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4892:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4893:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression10780);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleParenthesizedExpression10792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4921:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4922:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4923:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral10828);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral10838); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4930:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4933:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4934:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4934:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt69=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt69=1;
                }
                break;
            case RULE_INT:
                {
                alt69=2;
                }
                break;
            case RULE_HEX:
                {
                alt69=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt69=4;
                }
                break;
            case RULE_STRING:
                {
                alt69=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4935:2: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral10888);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4948:2: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral10918);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4961:2: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral10948);
                    this_HexLiteral_2=ruleHexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HexLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4974:2: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral10978);
                    this_RealLiteral_3=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:4987:2: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral11008);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_4; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5006:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5007:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5008:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11043);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral11053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5015:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5018:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5019:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5019:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5019:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5019:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5020:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5028:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5029:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5029:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5030:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral11107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"BOOL");
              	    
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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5054:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5055:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5056:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11148);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral11158); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5063:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5066:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5067:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5067:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5067:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5067:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5068:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5076:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5077:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5077:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5078:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral11212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5102:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5103:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5104:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral11253);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral11263); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5111:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5114:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5115:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5115:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5115:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5115:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5116:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5124:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5125:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5125:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5126:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral11317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getRealLiteralAccess().getValueFLOATTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRealLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"FLOAT");
              	    
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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleHexLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5150:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5151:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5152:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral11358);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral11368); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHexLiteral"


    // $ANTLR start "ruleHexLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5159:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5162:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5163:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5163:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5163:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5163:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5164:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5172:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5173:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5173:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5174:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral11422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getHexLiteralAccess().getValueHEXTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHexLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"HEX");
              	    
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
    // $ANTLR end "ruleHexLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5198:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5199:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5200:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11463);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11473); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5207:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5210:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5211:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5211:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5211:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5211:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5212:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5220:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5221:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5221:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5222:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "ruleDirection"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5246:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5248:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5249:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5249:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt70=1;
                }
                break;
            case 47:
                {
                alt70=2;
                }
                break;
            case 48:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5249:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5249:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5249:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleDirection11582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5255:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5255:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5255:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleDirection11599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5261:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5261:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5261:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleDirection11616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleTimeEventType"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5271:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5273:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5274:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5274:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==71) ) {
                alt71=1;
            }
            else if ( (LA71_0==72) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5274:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5274:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5274:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_71_in_ruleTimeEventType11661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5280:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5280:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5280:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleTimeEventType11678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getEveryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeEventTypeAccess().getEveryEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleTimeEventType"


    // $ANTLR start "ruleAssignmentOperator"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5290:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
    public final Enumerator ruleAssignmentOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5292:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5293:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5293:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt72=11;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt72=1;
                }
                break;
            case 73:
                {
                alt72=2;
                }
                break;
            case 74:
                {
                alt72=3;
                }
                break;
            case 75:
                {
                alt72=4;
                }
                break;
            case 76:
                {
                alt72=5;
                }
                break;
            case 77:
                {
                alt72=6;
                }
                break;
            case 78:
                {
                alt72=7;
                }
                break;
            case 79:
                {
                alt72=8;
                }
                break;
            case 80:
                {
                alt72=9;
                }
                break;
            case 81:
                {
                alt72=10;
                }
                break;
            case 82:
                {
                alt72=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5293:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5293:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5293:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleAssignmentOperator11723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5299:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5299:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5299:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator11740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5305:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5305:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5305:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator11757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5311:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5311:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5311:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator11774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5317:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5317:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5317:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator11791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5323:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5323:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5323:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator11808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5329:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5329:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5329:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator11825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5335:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5335:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5335:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator11842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5341:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5341:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5341:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator11859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5347:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5347:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5347:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator11876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5353:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5353:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5353:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator11893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getOrAssignEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOperatorAccess().getOrAssignEnumLiteralDeclaration_10()); 
                          
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
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "ruleShiftOperator"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5363:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5365:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5366:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5366:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==83) ) {
                alt73=1;
            }
            else if ( (LA73_0==84) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5366:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5366:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5366:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleShiftOperator11938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5372:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5372:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5372:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleShiftOperator11955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getShiftOperatorAccess().getRightEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleShiftOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5382:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5384:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5385:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5385:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==85) ) {
                alt74=1;
            }
            else if ( (LA74_0==86) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5385:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5385:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5385:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleAdditiveOperator12000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5391:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5391:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5391:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleAdditiveOperator12017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5401:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5403:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5404:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5404:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt75=1;
                }
                break;
            case 59:
                {
                alt75=2;
                }
                break;
            case 88:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5404:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5404:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5404:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleMultiplicativeOperator12062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5410:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5410:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5410:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleMultiplicativeOperator12079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5416:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5416:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5416:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_88_in_ruleMultiplicativeOperator12096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getModEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getModEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5426:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5428:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5429:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5429:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt76=1;
                }
                break;
            case 86:
                {
                alt76=2;
                }
                break;
            case 89:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5429:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5429:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5429:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleUnaryOperator12141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5435:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5435:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5435:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleUnaryOperator12158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5441:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5441:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5441:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_89_in_ruleUnaryOperator12175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getComplementEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getComplementEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5451:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5453:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5454:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5454:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt77=1;
                }
                break;
            case 91:
                {
                alt77=2;
                }
                break;
            case 63:
                {
                alt77=3;
                }
                break;
            case 92:
                {
                alt77=4;
                }
                break;
            case 93:
                {
                alt77=5;
                }
                break;
            case 94:
                {
                alt77=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5454:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5454:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5454:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator12220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5460:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5460:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5460:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator12237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5466:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5466:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5466:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_63_in_ruleRelationalOperator12254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5472:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5472:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5472:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator12271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5478:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5478:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5478:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator12288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5484:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5484:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5484:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator12305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getNotEqualsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getRelationalOperatorAccess().getNotEqualsEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleTimeUnit"
    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5494:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5496:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5497:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5497:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt78=1;
                }
                break;
            case 96:
                {
                alt78=2;
                }
                break;
            case 97:
                {
                alt78=3;
                }
                break;
            case 98:
                {
                alt78=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5497:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5497:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5497:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_95_in_ruleTimeUnit12350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5503:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5503:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5503:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_96_in_ruleTimeUnit12367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5509:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5509:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5509:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_97_in_ruleTimeUnit12384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5515:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5515:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:5515:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit12401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getNanosecondEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getNanosecondEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleTimeUnit"

    // $ANTLR start synpred11_InternalSCL
    public final void synpred11_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_instructions_1_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:4: ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:4: ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:4: ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:5: ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';'
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:5: ( (lv_instructions_1_0= ruleInstruction ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:465:1: (lv_instructions_1_0= ruleInstruction )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:465:1: (lv_instructions_1_0= ruleInstruction )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:466:3: lv_instructions_1_0= ruleInstruction
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_0_1_0_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstruction_in_synpred11_InternalSCL1000);
        lv_instructions_1_0=ruleInstruction();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,21,FOLLOW_21_in_synpred11_InternalSCL1012); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSCL

    // $ANTLR start synpred14_InternalSCL
    public final void synpred14_InternalSCL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_instructions_1_0 = null;

        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_4_0 = null;

        EObject lv_instructions_5_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:2: ( ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:2: ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:2: ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:3: () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:455:3: ()
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:456:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:2: ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:3: ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )?
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:3: ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+
        int cnt79=0;
        loop79:
        do {
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
        	case 1 :
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:4: ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' )
        	    {
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:4: ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' )
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:5: ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';'
        	    {
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:464:5: ( (lv_instructions_1_0= ruleInstruction ) )
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:465:1: (lv_instructions_1_0= ruleInstruction )
        	    {
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:465:1: (lv_instructions_1_0= ruleInstruction )
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:466:3: lv_instructions_1_0= ruleInstruction
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_0_1_0_0_0_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleInstruction_in_synpred14_InternalSCL1000);
        	    lv_instructions_1_0=ruleInstruction();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_synpred14_InternalSCL1012); if (state.failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:487:6: ( (lv_instructions_3_0= ruleAnnotation ) )
        	    {
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:487:6: ( (lv_instructions_3_0= ruleAnnotation ) )
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:488:1: (lv_instructions_3_0= ruleAnnotation )
        	    {
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:488:1: (lv_instructions_3_0= ruleAnnotation )
        	    // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:489:3: lv_instructions_3_0= ruleAnnotation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_0_1_0_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleAnnotation_in_synpred14_InternalSCL1040);
        	    lv_instructions_3_0=ruleAnnotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt79 >= 1 ) break loop79;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(79, input);
                    throw eee;
            }
            cnt79++;
        } while (true);

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:505:4: ( (lv_instructions_4_0= ruleInstruction ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:506:1: (lv_instructions_4_0= ruleInstruction )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:506:1: (lv_instructions_4_0= ruleInstruction )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:507:3: lv_instructions_4_0= ruleInstruction
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstruction_in_synpred14_InternalSCL1063);
        lv_instructions_4_0=ruleInstruction();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:523:2: ( (lv_instructions_5_0= ruleAnnotation ) )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==RULE_SL_COMMENT) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:524:1: (lv_instructions_5_0= ruleAnnotation )
                {
                // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:524:1: (lv_instructions_5_0= ruleAnnotation )
                // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:525:3: lv_instructions_5_0= ruleAnnotation
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_0_1_2_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleAnnotation_in_synpred14_InternalSCL1084);
                lv_instructions_5_0=ruleAnnotation();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSCL

    // $ANTLR start synpred15_InternalSCL
    public final void synpred15_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_instructions_7_0 = null;

        EObject lv_instructions_8_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:6: ( ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:6: ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:6: ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:7: () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:542:7: ()
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:543:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:551:2: ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:551:3: ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:551:3: ( (lv_instructions_7_0= ruleAnnotation ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:552:1: (lv_instructions_7_0= ruleAnnotation )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:552:1: (lv_instructions_7_0= ruleAnnotation )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:553:3: lv_instructions_7_0= ruleAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAnnotation_in_synpred15_InternalSCL1128);
        lv_instructions_7_0=ruleAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:569:2: ( (lv_instructions_8_0= ruleInstruction ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:570:1: (lv_instructions_8_0= ruleInstruction )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:570:1: (lv_instructions_8_0= ruleInstruction )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:571:3: lv_instructions_8_0= ruleInstruction
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstruction_in_synpred15_InternalSCL1149);
        lv_instructions_8_0=ruleInstruction();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalSCL

    // $ANTLR start synpred16_InternalSCL
    public final void synpred16_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_instructions_9_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:588:6: ( ( (lv_instructions_9_0= ruleAnnotation ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:588:6: ( (lv_instructions_9_0= ruleAnnotation ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:588:6: ( (lv_instructions_9_0= ruleAnnotation ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:589:1: (lv_instructions_9_0= ruleAnnotation )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:589:1: (lv_instructions_9_0= ruleAnnotation )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:590:3: lv_instructions_9_0= ruleAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAnnotation_in_synpred16_InternalSCL1178);
        lv_instructions_9_0=ruleAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSCL

    // $ANTLR start synpred17_InternalSCL
    public final void synpred17_InternalSCL_fragment() throws RecognitionException {   
        EObject lv_instructions_11_0 = null;

        EObject lv_instructions_12_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:6: ( ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:6: ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:6: ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:7: () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:607:7: ()
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:608:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:616:2: ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:616:3: ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:616:3: ( (lv_instructions_11_0= ruleInstruction ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:617:1: (lv_instructions_11_0= ruleInstruction )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:617:1: (lv_instructions_11_0= ruleInstruction )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:618:3: lv_instructions_11_0= ruleInstruction
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsInstructionParserRuleCall_3_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInstruction_in_synpred17_InternalSCL1219);
        lv_instructions_11_0=ruleInstruction();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:634:2: ( (lv_instructions_12_0= ruleAnnotation ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:635:1: (lv_instructions_12_0= ruleAnnotation )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:635:1: (lv_instructions_12_0= ruleAnnotation )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:636:3: lv_instructions_12_0= ruleAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInstructionListAccess().getInstructionsAnnotationParserRuleCall_3_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAnnotation_in_synpred17_InternalSCL1240);
        lv_instructions_12_0=ruleAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalSCL

    // $ANTLR start synpred36_InternalSCL
    public final void synpred36_InternalSCL_fragment() throws RecognitionException {   
        Token lv_readonly_3_0=null;

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1809:4: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1809:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1809:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1810:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred36_InternalSCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
        }
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1810:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1811:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1814:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1814:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred36_InternalSCL", "true");
        }
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1814:16: ( (lv_readonly_3_0= 'readonly' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1815:1: (lv_readonly_3_0= 'readonly' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1815:1: (lv_readonly_3_0= 'readonly' )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1816:3: lv_readonly_3_0= 'readonly'
        {
        lv_readonly_3_0=(Token)match(input,39,FOLLOW_39_in_synpred36_InternalSCL3839); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred36_InternalSCL

    // $ANTLR start synpred37_InternalSCL
    public final void synpred37_InternalSCL_fragment() throws RecognitionException {   
        Token lv_external_4_0=null;

        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1836:4: ( ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1836:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1836:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1837:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred37_InternalSCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
        }
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1837:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1838:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1841:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1841:7: {...}? => ( (lv_external_4_0= 'external' ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred37_InternalSCL", "true");
        }
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1841:16: ( (lv_external_4_0= 'external' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1842:1: (lv_external_4_0= 'external' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1842:1: (lv_external_4_0= 'external' )
        // ../de.cau.cs.kieler.yakindu.sccharts.sim.scl/src-gen/de/cau/cs/kieler/yakindu/sccharts/sim/scl/parser/antlr/internal/InternalSCL.g:1843:3: lv_external_4_0= 'external'
        {
        lv_external_4_0=(Token)match(input,40,FOLLOW_40_in_synpred37_InternalSCL3924); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred37_InternalSCL

    // Delegated rules

    public final boolean synpred15_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA9_eotS =
        "\31\uffff";
    static final String DFA9_eofS =
        "\31\uffff";
    static final String DFA9_minS =
        "\1\4\23\0\5\uffff";
    static final String DFA9_maxS =
        "\1\131\23\0\5\uffff";
    static final String DFA9_acceptS =
        "\24\uffff\1\1\1\4\1\5\1\2\1\3";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\6\1\5\1\2\1\23\1\1\1\4\1\3\13\uffff\1\22\1\16\2\uffff\1"+
            "\17\1\20\2\uffff\1\21\14\uffff\1\11\14\uffff\1\10\1\7\11\uffff"+
            "\1\15\21\uffff\1\12\1\13\2\uffff\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "455:1: ( ( () ( ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+ ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleAnnotation ) )? ) ) | ( () ( ( (lv_instructions_7_0= ruleAnnotation ) ) ( (lv_instructions_8_0= ruleInstruction ) ) ) ) | ( (lv_instructions_9_0= ruleAnnotation ) ) | ( () ( ( (lv_instructions_11_0= ruleInstruction ) ) ( (lv_instructions_12_0= ruleAnnotation ) ) ) ) | ( (lv_instructions_13_0= ruleInstruction ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_12 = input.LA(1);

                         
                        int index9_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA9_17 = input.LA(1);

                         
                        int index9_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA9_18 = input.LA(1);

                         
                        int index9_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred17_InternalSCL()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index9_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA9_19 = input.LA(1);

                         
                        int index9_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSCL()) ) {s = 20;}

                        else if ( (synpred15_InternalSCL()) ) {s = 23;}

                        else if ( (synpred16_InternalSCL()) ) {s = 24;}

                         
                        input.seek(index9_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\26\uffff";
    static final String DFA7_eofS =
        "\26\uffff";
    static final String DFA7_minS =
        "\1\4\22\0\3\uffff";
    static final String DFA7_maxS =
        "\1\131\22\0\3\uffff";
    static final String DFA7_acceptS =
        "\23\uffff\1\2\1\1\1\3";
    static final String DFA7_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\1\5\1\2\1\23\1\1\1\4\1\3\13\uffff\1\22\1\16\2\uffff\1"+
            "\17\1\20\2\uffff\1\21\14\uffff\1\11\14\uffff\1\10\1\7\11\uffff"+
            "\1\15\21\uffff\1\12\1\13\2\uffff\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()+ loopback of 464:3: ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_12 = input.LA(1);

                         
                        int index7_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA7_14 = input.LA(1);

                         
                        int index7_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA7_15 = input.LA(1);

                         
                        int index7_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA7_16 = input.LA(1);

                         
                        int index7_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA7_17 = input.LA(1);

                         
                        int index7_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA7_18 = input.LA(1);

                         
                        int index7_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index7_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\56\uffff";
    static final String DFA24_eofS =
        "\56\uffff";
    static final String DFA24_minS =
        "\1\4\1\uffff\2\4\52\uffff";
    static final String DFA24_maxS =
        "\1\71\1\uffff\2\71\52\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\3\2\uffff\25\1\25\2";
    static final String DFA24_specialS =
        "\2\uffff\1\1\1\0\52\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\35\uffff\5\1\1\2\1\3\1\uffff\1\1\3\uffff\14\1",
            "",
            "\1\4\17\uffff\1\1\15\uffff\1\5\1\6\1\7\1\10\1\14\1\15\1\16"+
            "\1\uffff\1\17\3\uffff\1\11\1\12\1\13\1\20\1\21\1\22\1\23\1\24"+
            "\1\25\1\26\1\27\1\30",
            "\1\31\17\uffff\1\1\15\uffff\1\32\1\33\1\34\1\35\1\41\1\42"+
            "\1\43\1\uffff\1\44\3\uffff\1\36\1\37\1\40\1\45\1\46\1\47\1\50"+
            "\1\51\1\52\1\53\1\54\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 1807:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_3==20) ) {s = 1;}

                        else if ( LA24_3 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 25;}

                        else if ( LA24_3 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 26;}

                        else if ( LA24_3 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 27;}

                        else if ( LA24_3 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 28;}

                        else if ( LA24_3 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 29;}

                        else if ( LA24_3 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 30;}

                        else if ( LA24_3 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 31;}

                        else if ( LA24_3 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 32;}

                        else if ( LA24_3 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 33;}

                        else if ( LA24_3 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 34;}

                        else if ( LA24_3 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 35;}

                        else if ( LA24_3 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 36;}

                        else if ( LA24_3 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 37;}

                        else if ( LA24_3 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 38;}

                        else if ( LA24_3 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 39;}

                        else if ( LA24_3 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 40;}

                        else if ( LA24_3 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 41;}

                        else if ( LA24_3 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 42;}

                        else if ( LA24_3 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 43;}

                        else if ( LA24_3 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 44;}

                        else if ( LA24_3 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {s = 45;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_2 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 4;}

                        else if ( LA24_2 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 5;}

                        else if ( LA24_2 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 6;}

                        else if ( LA24_2 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 7;}

                        else if ( LA24_2 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 8;}

                        else if ( LA24_2 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 9;}

                        else if ( LA24_2 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 10;}

                        else if ( LA24_2 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 11;}

                        else if ( LA24_2 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 12;}

                        else if ( LA24_2 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 13;}

                        else if ( LA24_2 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( LA24_2 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 15;}

                        else if ( LA24_2 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 16;}

                        else if ( LA24_2 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 17;}

                        else if ( LA24_2 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 18;}

                        else if ( LA24_2 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 19;}

                        else if ( LA24_2 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 20;}

                        else if ( LA24_2 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 21;}

                        else if ( LA24_2 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 22;}

                        else if ( LA24_2 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 23;}

                        else if ( LA24_2 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {s = 24;}

                        else if ( (LA24_2==20) ) {s = 1;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\26\uffff";
    static final String DFA79_eofS =
        "\26\uffff";
    static final String DFA79_minS =
        "\1\4\22\0\3\uffff";
    static final String DFA79_maxS =
        "\1\131\22\0\3\uffff";
    static final String DFA79_acceptS =
        "\23\uffff\1\2\1\1\1\3";
    static final String DFA79_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\3\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\6\1\5\1\2\1\23\1\1\1\4\1\3\13\uffff\1\22\1\16\2\uffff\1"+
            "\17\1\20\2\uffff\1\21\14\uffff\1\11\14\uffff\1\10\1\7\11\uffff"+
            "\1\15\21\uffff\1\12\1\13\2\uffff\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "()+ loopback of 464:3: ( ( ( (lv_instructions_1_0= ruleInstruction ) ) otherlv_2= ';' ) | ( (lv_instructions_3_0= ruleAnnotation ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_3 = input.LA(1);

                         
                        int index79_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA79_15 = input.LA(1);

                         
                        int index79_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA79_16 = input.LA(1);

                         
                        int index79_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA79_17 = input.LA(1);

                         
                        int index79_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA79_18 = input.LA(1);

                         
                        int index79_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSCL()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index79_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProgram128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram145 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleProgram171 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_15_in_ruleProgram184 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstructionList_in_ruleProgram205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProgram217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration306 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration338 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariableDeclaration364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableDeclaration381 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDeclaration399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration423 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariableDeclaration437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCLExpression_in_entryRuleSCLExpression474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCLExpression485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCLExpression524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstruction629 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstruction659 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstruction689 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleInstruction719 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstruction749 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleInstruction779 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstruction796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstructionList_in_entryRuleInstructionList928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstructionList938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstructionList1000 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInstructionList1012 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionList1040 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstructionList1063 = new BitSet(new long[]{0x030008004CC007F2L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionList1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionList1128 = new BitSet(new long[]{0x030008004CC00770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstructionList1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionList1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstructionList1219 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInstructionList1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInstructionList1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLabel1352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConditional1457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSCLExpression_in_ruleConditional1478 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConditional1490 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstructionList_in_ruleConditional1511 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConditional1523 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditional1547 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleGoto1631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoto1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleParallel1736 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstructionList_in_ruleParallel1758 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleParallel1771 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstructionList_in_ruleParallel1792 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleParallel1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePause1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAnnotation1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStatechartRoot2233 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStateRoot2337 = new BitSet(new long[]{0x2078000000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTransitionRoot2441 = new BitSet(new long[]{0x387E000000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStatechartSpecification2560 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2581 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2604 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope2823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope2891 = new BitSet(new long[]{0x2078000000000012L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInterfaceScope3114 = new BitSet(new long[]{0x03FFC5FC00100010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3135 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceScope3148 = new BitSet(new long[]{0x0001C420000E0002L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3171 = new BitSet(new long[]{0x0001C420000E0002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3190 = new BitSet(new long[]{0x0001C420000E0002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3209 = new BitSet(new long[]{0x0001C420000E0002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInternalScope3308 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInternalScope3320 = new BitSet(new long[]{0x2079C420000E0012L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3343 = new BitSet(new long[]{0x2079C420000E0012L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3362 = new BitSet(new long[]{0x2079C420000E0012L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3381 = new BitSet(new long[]{0x2079C420000E0012L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3400 = new BitSet(new long[]{0x2079C420000E0012L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3593 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEventDefinition3606 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition3627 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventDefinition3640 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition3713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariableDefinition3776 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_39_in_ruleVariableDefinition3839 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_40_in_ruleVariableDefinition3924 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleVariableDefinition3998 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition4010 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition4037 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleVariableDefinition4050 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperationDefinition4267 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition4288 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleOperationDefinition4300 = new BitSet(new long[]{0x03FFE5FC00000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4322 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_ruleOperationDefinition4335 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4356 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_45_in_ruleOperationDefinition4372 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition4385 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleParameter4506 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParameter4518 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleXID4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleXID4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXID4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXID4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXID4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXID5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5117 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFQN5136 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5158 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5263 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleLocalReaction5295 = new BitSet(new long[]{0x0380080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5422 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTransitionReaction5436 = new BitSet(new long[]{0x0380080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5457 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTransitionReaction5472 = new BitSet(new long[]{0x8000000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5493 = new BitSet(new long[]{0x8000000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger5657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger5727 = new BitSet(new long[]{0x2000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleReactionTrigger5740 = new BitSet(new long[]{0x0078000000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger5761 = new BitSet(new long[]{0x2000100000000002L});
    public static final BitSet FOLLOW_61_in_ruleReactionTrigger5784 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger5806 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleReactionTrigger5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleReactionTrigger5840 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger5861 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleReactionTrigger5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDefaultTrigger5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDefaultTrigger5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect6096 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6115 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleReactionEffect6139 = new BitSet(new long[]{0x0380080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect6163 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6182 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty6223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEntryPointSpec6395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec6505 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleExitPointSpec6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec6558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6859 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6880 = new BitSet(new long[]{0x0000000000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent7092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEntryEvent7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent7187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExitEvent7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAlwaysEvent7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlwaysEvent7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression7397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEventRaisingExpression7456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression7477 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventRaisingExpression7490 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7704 = new BitSet(new long[]{0x0000020000000002L,0x000000000007FE00L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression7737 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7758 = new BitSet(new long[]{0x0000020000000002L,0x000000000007FE00L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression7796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleConditionalExpression7880 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7901 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConditionalExpression7913 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8032 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLogicalOrExpression8056 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression8115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleLogicalAndExpression8199 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8220 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression8258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression8268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleLogicalNotExpression8348 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleBitwiseXorExpression8490 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleBitwiseOrExpression8633 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression8692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleBitwiseAndExpression8776 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8895 = new BitSet(new long[]{0x8000000000000002L,0x000000007C000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8928 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8949 = new BitSet(new long[]{0x8000000000000002L,0x000000007C000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression8987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression9080 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression9139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression9232 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9253 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression9291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9351 = new BitSet(new long[]{0x0800000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression9384 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9405 = new BitSet(new long[]{0x0800000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression9443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression9542 = new BitSet(new long[]{0x0300080000000770L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression9600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression9690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression9720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression9780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression9815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression9825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall9979 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFeatureCall10003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall10027 = new BitSet(new long[]{0x0400080000000002L});
    public static final BitSet FOLLOW_43_in_ruleFeatureCall10061 = new BitSet(new long[]{0x0300280000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10096 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_ruleFeatureCall10109 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10130 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_45_in_ruleFeatureCall10146 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression10186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression10257 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleElementReferenceExpression10291 = new BitSet(new long[]{0x0300280000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression10326 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_ruleElementReferenceExpression10339 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression10360 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_45_in_ruleElementReferenceExpression10376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression10414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEventValueReferenceExpression10473 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEventValueReferenceExpression10485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression10506 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEventValueReferenceExpression10518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression10554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression10564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleActiveStateReferenceExpression10613 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleActiveStateReferenceExpression10625 = new BitSet(new long[]{0x03FFC5FC00000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression10652 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleActiveStateReferenceExpression10664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression10700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression10710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleParenthesizedExpression10759 = new BitSet(new long[]{0x0300080000000770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression10780 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleParenthesizedExpression10792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral10828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral10888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral10918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral10948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral10978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral11212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral11253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral11358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral11422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDirection11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDirection11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDirection11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTimeEventType11661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTimeEventType11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAssignmentOperator11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator11740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator11893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleShiftOperator11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleShiftOperator11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAdditiveOperator12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAdditiveOperator12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleMultiplicativeOperator12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMultiplicativeOperator12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleMultiplicativeOperator12096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleUnaryOperator12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnaryOperator12158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleUnaryOperator12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRelationalOperator12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTimeUnit12350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTimeUnit12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTimeUnit12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit12401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_synpred11_InternalSCL1000 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred11_InternalSCL1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_synpred14_InternalSCL1000 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred14_InternalSCL1012 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleAnnotation_in_synpred14_InternalSCL1040 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstruction_in_synpred14_InternalSCL1063 = new BitSet(new long[]{0x030008004CC007F2L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleAnnotation_in_synpred14_InternalSCL1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_synpred15_InternalSCL1128 = new BitSet(new long[]{0x030008004CC00770L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleInstruction_in_synpred15_InternalSCL1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_synpred16_InternalSCL1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_synpred17_InternalSCL1219 = new BitSet(new long[]{0x030008004CC007F0L,0x0000000002600008L});
    public static final BitSet FOLLOW_ruleAnnotation_in_synpred17_InternalSCL1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred36_InternalSCL3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred37_InternalSCL3924 = new BitSet(new long[]{0x0000000000000002L});

}
