package de.cau.cs.kieler.simulation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.simulation.services.KiSimGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKiSimParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'configure'", "'{'", "'}'", "'initialization'", "'execution'", "'model'", "'compiler'", "'simulation'", "'process'", "'template'", "'wrapper'", "':'", "','", "'['", "']'", "'schedule'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'\\''", "'.'", "'()'", "'random'", "'randomize'", "'extern'", "'!'", "'_'", "'@'", "'#'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'val'", "'?'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKiSimParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKiSimParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKiSimParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKiSim.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KiSimGrammarAccess grammarAccess;
     	
        public InternalKiSimParser(TokenStream input, KiSimGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SimulationConfiguration";	
       	}
       	
       	@Override
       	protected KiSimGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSimulationConfiguration"
    // InternalKiSim.g:74:1: entryRuleSimulationConfiguration returns [EObject current=null] : iv_ruleSimulationConfiguration= ruleSimulationConfiguration EOF ;
    public final EObject entryRuleSimulationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationConfiguration = null;


        try {
            // InternalKiSim.g:75:2: (iv_ruleSimulationConfiguration= ruleSimulationConfiguration EOF )
            // InternalKiSim.g:76:2: iv_ruleSimulationConfiguration= ruleSimulationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimulationConfigurationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimulationConfiguration=ruleSimulationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimulationConfiguration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulationConfiguration"


    // $ANTLR start "ruleSimulationConfiguration"
    // InternalKiSim.g:83:1: ruleSimulationConfiguration returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_handlers_1_0= ruleDataHandlerConfiguration ) )* ( (lv_initialization_2_0= ruleInitialization ) )? ( (lv_execution_3_0= ruleExecution ) )? ) ;
    public final EObject ruleSimulationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_handlers_1_0 = null;

        EObject lv_initialization_2_0 = null;

        EObject lv_execution_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:86:28: ( ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_handlers_1_0= ruleDataHandlerConfiguration ) )* ( (lv_initialization_2_0= ruleInitialization ) )? ( (lv_execution_3_0= ruleExecution ) )? ) )
            // InternalKiSim.g:87:1: ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_handlers_1_0= ruleDataHandlerConfiguration ) )* ( (lv_initialization_2_0= ruleInitialization ) )? ( (lv_execution_3_0= ruleExecution ) )? )
            {
            // InternalKiSim.g:87:1: ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_handlers_1_0= ruleDataHandlerConfiguration ) )* ( (lv_initialization_2_0= ruleInitialization ) )? ( (lv_execution_3_0= ruleExecution ) )? )
            // InternalKiSim.g:87:2: ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_handlers_1_0= ruleDataHandlerConfiguration ) )* ( (lv_initialization_2_0= ruleInitialization ) )? ( (lv_execution_3_0= ruleExecution ) )?
            {
            // InternalKiSim.g:87:2: ( (lv_attributes_0_0= ruleAttributeMapping ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKiSim.g:88:1: (lv_attributes_0_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:88:1: (lv_attributes_0_0= ruleAttributeMapping )
            	    // InternalKiSim.g:89:3: lv_attributes_0_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimulationConfigurationAccess().getAttributesAttributeMappingParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_attributes_0_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimulationConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_0_0, 
            	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKiSim.g:105:3: ( (lv_handlers_1_0= ruleDataHandlerConfiguration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKiSim.g:106:1: (lv_handlers_1_0= ruleDataHandlerConfiguration )
            	    {
            	    // InternalKiSim.g:106:1: (lv_handlers_1_0= ruleDataHandlerConfiguration )
            	    // InternalKiSim.g:107:3: lv_handlers_1_0= ruleDataHandlerConfiguration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimulationConfigurationAccess().getHandlersDataHandlerConfigurationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_handlers_1_0=ruleDataHandlerConfiguration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimulationConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"handlers",
            	              		lv_handlers_1_0, 
            	              		"de.cau.cs.kieler.simulation.KiSim.DataHandlerConfiguration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalKiSim.g:123:3: ( (lv_initialization_2_0= ruleInitialization ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKiSim.g:124:1: (lv_initialization_2_0= ruleInitialization )
                    {
                    // InternalKiSim.g:124:1: (lv_initialization_2_0= ruleInitialization )
                    // InternalKiSim.g:125:3: lv_initialization_2_0= ruleInitialization
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimulationConfigurationAccess().getInitializationInitializationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_initialization_2_0=ruleInitialization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimulationConfigurationRule());
                      	        }
                             		set(
                             			current, 
                             			"initialization",
                              		lv_initialization_2_0, 
                              		"de.cau.cs.kieler.simulation.KiSim.Initialization");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiSim.g:141:3: ( (lv_execution_3_0= ruleExecution ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKiSim.g:142:1: (lv_execution_3_0= ruleExecution )
                    {
                    // InternalKiSim.g:142:1: (lv_execution_3_0= ruleExecution )
                    // InternalKiSim.g:143:3: lv_execution_3_0= ruleExecution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSimulationConfigurationAccess().getExecutionExecutionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_execution_3_0=ruleExecution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSimulationConfigurationRule());
                      	        }
                             		set(
                             			current, 
                             			"execution",
                              		lv_execution_3_0, 
                              		"de.cau.cs.kieler.simulation.KiSim.Execution");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleSimulationConfiguration"


    // $ANTLR start "entryRuleDataHandlerConfiguration"
    // InternalKiSim.g:167:1: entryRuleDataHandlerConfiguration returns [EObject current=null] : iv_ruleDataHandlerConfiguration= ruleDataHandlerConfiguration EOF ;
    public final EObject entryRuleDataHandlerConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataHandlerConfiguration = null;


        try {
            // InternalKiSim.g:168:2: (iv_ruleDataHandlerConfiguration= ruleDataHandlerConfiguration EOF )
            // InternalKiSim.g:169:2: iv_ruleDataHandlerConfiguration= ruleDataHandlerConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataHandlerConfigurationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataHandlerConfiguration=ruleDataHandlerConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataHandlerConfiguration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataHandlerConfiguration"


    // $ANTLR start "ruleDataHandlerConfiguration"
    // InternalKiSim.g:176:1: ruleDataHandlerConfiguration returns [EObject current=null] : (otherlv_0= 'configure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) ;
    public final EObject ruleDataHandlerConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:179:28: ( (otherlv_0= 'configure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) )
            // InternalKiSim.g:180:1: (otherlv_0= 'configure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            {
            // InternalKiSim.g:180:1: (otherlv_0= 'configure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            // InternalKiSim.g:180:3: otherlv_0= 'configure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataHandlerConfigurationAccess().getConfigureKeyword_0());
                  
            }
            // InternalKiSim.g:184:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalKiSim.g:185:1: (lv_name_1_0= RULE_ID )
            {
            // InternalKiSim.g:185:1: (lv_name_1_0= RULE_ID )
            // InternalKiSim.g:186:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDataHandlerConfigurationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataHandlerConfigurationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiSim.g:202:2: ( (lv_id_2_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKiSim.g:203:1: (lv_id_2_0= RULE_ID )
                    {
                    // InternalKiSim.g:203:1: (lv_id_2_0= RULE_ID )
                    // InternalKiSim.g:204:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_0, grammarAccess.getDataHandlerConfigurationAccess().getIdIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataHandlerConfigurationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataHandlerConfigurationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiSim.g:224:1: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKiSim.g:225:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:225:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiSim.g:226:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataHandlerConfigurationAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataHandlerConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataHandlerConfigurationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleDataHandlerConfiguration"


    // $ANTLR start "entryRuleInitialization"
    // InternalKiSim.g:254:1: entryRuleInitialization returns [EObject current=null] : iv_ruleInitialization= ruleInitialization EOF ;
    public final EObject entryRuleInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialization = null;


        try {
            // InternalKiSim.g:255:2: (iv_ruleInitialization= ruleInitialization EOF )
            // InternalKiSim.g:256:2: iv_ruleInitialization= ruleInitialization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitialization=ruleInitialization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitialization; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialization"


    // $ANTLR start "ruleInitialization"
    // InternalKiSim.g:263:1: ruleInitialization returns [EObject current=null] : (otherlv_0= 'initialization' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' ) ;
    public final EObject ruleInitialization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:266:28: ( (otherlv_0= 'initialization' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' ) )
            // InternalKiSim.g:267:1: (otherlv_0= 'initialization' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' )
            {
            // InternalKiSim.g:267:1: (otherlv_0= 'initialization' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' )
            // InternalKiSim.g:267:3: otherlv_0= 'initialization' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInitializationAccess().getInitializationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInitializationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalKiSim.g:275:1: ()
            // InternalKiSim.g:276:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInitializationAccess().getInitializationAction_2(),
                          current);
                  
            }

            }

            // InternalKiSim.g:284:2: ( (lv_actions_3_0= ruleAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKiSim.g:285:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalKiSim.g:285:1: (lv_actions_3_0= ruleAction )
            	    // InternalKiSim.g:286:3: lv_actions_3_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInitializationAccess().getActionsActionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInitializationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actions",
            	              		lv_actions_3_0, 
            	              		"de.cau.cs.kieler.simulation.KiSim.Action");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInitializationAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleInitialization"


    // $ANTLR start "entryRuleExecution"
    // InternalKiSim.g:314:1: entryRuleExecution returns [EObject current=null] : iv_ruleExecution= ruleExecution EOF ;
    public final EObject entryRuleExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecution = null;


        try {
            // InternalKiSim.g:315:2: (iv_ruleExecution= ruleExecution EOF )
            // InternalKiSim.g:316:2: iv_ruleExecution= ruleExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExecutionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExecution=ruleExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExecution; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecution"


    // $ANTLR start "ruleExecution"
    // InternalKiSim.g:323:1: ruleExecution returns [EObject current=null] : (otherlv_0= 'execution' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' ) ;
    public final EObject ruleExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:326:28: ( (otherlv_0= 'execution' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' ) )
            // InternalKiSim.g:327:1: (otherlv_0= 'execution' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' )
            {
            // InternalKiSim.g:327:1: (otherlv_0= 'execution' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}' )
            // InternalKiSim.g:327:3: otherlv_0= 'execution' otherlv_1= '{' () ( (lv_actions_3_0= ruleAction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExecutionAccess().getExecutionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExecutionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalKiSim.g:335:1: ()
            // InternalKiSim.g:336:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExecutionAccess().getExecutionAction_2(),
                          current);
                  
            }

            }

            // InternalKiSim.g:344:2: ( (lv_actions_3_0= ruleAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKiSim.g:345:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalKiSim.g:345:1: (lv_actions_3_0= ruleAction )
            	    // InternalKiSim.g:346:3: lv_actions_3_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExecutionAccess().getActionsActionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExecutionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actions",
            	              		lv_actions_3_0, 
            	              		"de.cau.cs.kieler.simulation.KiSim.Action");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExecutionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleExecution"


    // $ANTLR start "entryRuleAction"
    // InternalKiSim.g:374:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalKiSim.g:375:2: (iv_ruleAction= ruleAction EOF )
            // InternalKiSim.g:376:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalKiSim.g:383:1: ruleAction returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_ID ) )? ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token lv_handler_1_0=null;
        Token lv_id_2_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:386:28: ( ( ( (lv_operation_0_0= RULE_ID ) )? ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? ) )
            // InternalKiSim.g:387:1: ( ( (lv_operation_0_0= RULE_ID ) )? ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? )
            {
            // InternalKiSim.g:387:1: ( ( (lv_operation_0_0= RULE_ID ) )? ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )? )
            // InternalKiSim.g:387:2: ( (lv_operation_0_0= RULE_ID ) )? ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )?
            {
            // InternalKiSim.g:387:2: ( (lv_operation_0_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred9_InternalKiSim()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalKiSim.g:388:1: (lv_operation_0_0= RULE_ID )
                    {
                    // InternalKiSim.g:388:1: (lv_operation_0_0= RULE_ID )
                    // InternalKiSim.g:389:3: lv_operation_0_0= RULE_ID
                    {
                    lv_operation_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_operation_0_0, grammarAccess.getActionAccess().getOperationIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"operation",
                              		lv_operation_0_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiSim.g:405:3: ( (lv_handler_1_0= RULE_ID ) )
            // InternalKiSim.g:406:1: (lv_handler_1_0= RULE_ID )
            {
            // InternalKiSim.g:406:1: (lv_handler_1_0= RULE_ID )
            // InternalKiSim.g:407:3: lv_handler_1_0= RULE_ID
            {
            lv_handler_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_handler_1_0, grammarAccess.getActionAccess().getHandlerIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"handler",
                      		lv_handler_1_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiSim.g:423:2: ( (lv_id_2_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred10_InternalKiSim()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalKiSim.g:424:1: (lv_id_2_0= RULE_ID )
                    {
                    // InternalKiSim.g:424:1: (lv_id_2_0= RULE_ID )
                    // InternalKiSim.g:425:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_0, grammarAccess.getActionAccess().getIdIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.ID");
                      	    
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleModelCompiler"
    // InternalKiSim.g:451:1: entryRuleModelCompiler returns [EObject current=null] : iv_ruleModelCompiler= ruleModelCompiler EOF ;
    public final EObject entryRuleModelCompiler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelCompiler = null;


        try {
            // InternalKiSim.g:452:2: (iv_ruleModelCompiler= ruleModelCompiler EOF )
            // InternalKiSim.g:453:2: iv_ruleModelCompiler= ruleModelCompiler EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelCompilerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModelCompiler=ruleModelCompiler();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelCompiler; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelCompiler"


    // $ANTLR start "ruleModelCompiler"
    // InternalKiSim.g:460:1: ruleModelCompiler returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' ) ;
    public final EObject ruleModelCompiler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_simulationProcessor_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:463:28: ( (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' ) )
            // InternalKiSim.g:464:1: (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' )
            {
            // InternalKiSim.g:464:1: (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' )
            // InternalKiSim.g:464:3: otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelCompilerAccess().getModelKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelCompilerAccess().getCompilerKeyword_1());
                  
            }
            // InternalKiSim.g:472:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalKiSim.g:473:1: (lv_name_2_0= RULE_ID )
            {
            // InternalKiSim.g:473:1: (lv_name_2_0= RULE_ID )
            // InternalKiSim.g:474:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getModelCompilerAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModelCompilerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelCompilerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiSim.g:494:1: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKiSim.g:495:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:495:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiSim.g:496:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelCompilerAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_attributes_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelCompilerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalKiSim.g:512:3: ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiSim.g:513:1: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    {
                    // InternalKiSim.g:513:1: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    // InternalKiSim.g:514:3: lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelCompilerAccess().getSimulationProcessorSimulationTemplateProcessorParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_simulationProcessor_5_0=ruleSimulationTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelCompilerRule());
                      	        }
                             		set(
                             			current, 
                             			"simulationProcessor",
                              		lv_simulationProcessor_5_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SimulationTemplateProcessor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getModelCompilerAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleModelCompiler"


    // $ANTLR start "entryRuleSimulationCompiler"
    // InternalKiSim.g:542:1: entryRuleSimulationCompiler returns [EObject current=null] : iv_ruleSimulationCompiler= ruleSimulationCompiler EOF ;
    public final EObject entryRuleSimulationCompiler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationCompiler = null;


        try {
            // InternalKiSim.g:543:2: (iv_ruleSimulationCompiler= ruleSimulationCompiler EOF )
            // InternalKiSim.g:544:2: iv_ruleSimulationCompiler= ruleSimulationCompiler EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimulationCompilerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimulationCompiler=ruleSimulationCompiler();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimulationCompiler; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulationCompiler"


    // $ANTLR start "ruleSimulationCompiler"
    // InternalKiSim.g:551:1: ruleSimulationCompiler returns [EObject current=null] : (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) ;
    public final EObject ruleSimulationCompiler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:554:28: ( (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) )
            // InternalKiSim.g:555:1: (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            {
            // InternalKiSim.g:555:1: (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            // InternalKiSim.g:555:3: otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimulationCompilerAccess().getSimulationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimulationCompilerAccess().getCompilerKeyword_1());
                  
            }
            // InternalKiSim.g:563:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalKiSim.g:564:1: (lv_name_2_0= RULE_ID )
            {
            // InternalKiSim.g:564:1: (lv_name_2_0= RULE_ID )
            // InternalKiSim.g:565:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSimulationCompilerAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSimulationCompilerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimulationCompilerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiSim.g:585:1: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiSim.g:586:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:586:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiSim.g:587:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimulationCompilerAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimulationCompilerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSimulationCompilerAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleSimulationCompiler"


    // $ANTLR start "entryRuleTemplateProcessor"
    // InternalKiSim.g:615:1: entryRuleTemplateProcessor returns [EObject current=null] : iv_ruleTemplateProcessor= ruleTemplateProcessor EOF ;
    public final EObject entryRuleTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateProcessor = null;


        try {
            // InternalKiSim.g:616:2: (iv_ruleTemplateProcessor= ruleTemplateProcessor EOF )
            // InternalKiSim.g:617:2: iv_ruleTemplateProcessor= ruleTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateProcessor=ruleTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateProcessor"


    // $ANTLR start "ruleTemplateProcessor"
    // InternalKiSim.g:624:1: ruleTemplateProcessor returns [EObject current=null] : (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor ) ;
    public final EObject ruleTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject this_NormalTemplateProcessor_0 = null;

        EObject this_SimulationTemplateProcessor_1 = null;

        EObject this_WrapperCodeTemplateProcessor_2 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:627:28: ( (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor ) )
            // InternalKiSim.g:628:1: (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor )
            {
            // InternalKiSim.g:628:1: (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt14=1;
                    }
                    break;
                case 27:
                    {
                    alt14=3;
                    }
                    break;
                case 24:
                    {
                    alt14=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiSim.g:629:2: this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateProcessorAccess().getNormalTemplateProcessorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NormalTemplateProcessor_0=ruleNormalTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NormalTemplateProcessor_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:642:2: this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateProcessorAccess().getSimulationTemplateProcessorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimulationTemplateProcessor_1=ruleSimulationTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimulationTemplateProcessor_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiSim.g:655:2: this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateProcessorAccess().getWrapperCodeTemplateProcessorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WrapperCodeTemplateProcessor_2=ruleWrapperCodeTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WrapperCodeTemplateProcessor_2; 
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
    // $ANTLR end "ruleTemplateProcessor"


    // $ANTLR start "entryRuleNormalTemplateProcessor"
    // InternalKiSim.g:674:1: entryRuleNormalTemplateProcessor returns [EObject current=null] : iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF ;
    public final EObject entryRuleNormalTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalTemplateProcessor = null;


        try {
            // InternalKiSim.g:675:2: (iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF )
            // InternalKiSim.g:676:2: iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNormalTemplateProcessor=ruleNormalTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormalTemplateProcessor"


    // $ANTLR start "ruleNormalTemplateProcessor"
    // InternalKiSim.g:683:1: ruleNormalTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) ;
    public final EObject ruleNormalTemplateProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:686:28: ( (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) )
            // InternalKiSim.g:687:1: (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            {
            // InternalKiSim.g:687:1: (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            // InternalKiSim.g:687:3: otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNormalTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNormalTemplateProcessorAccess().getTemplateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNormalTemplateProcessorAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKiSim.g:699:1: ()
            // InternalKiSim.g:700:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNormalTemplateProcessorAccess().getNormalTemplateProcessorAction_3(),
                          current);
                  
            }

            }

            // InternalKiSim.g:708:2: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKiSim.g:709:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:709:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiSim.g:710:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNormalTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNormalTemplateProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNormalTemplateProcessorAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleNormalTemplateProcessor"


    // $ANTLR start "entryRuleSimulationTemplateProcessor"
    // InternalKiSim.g:738:1: entryRuleSimulationTemplateProcessor returns [EObject current=null] : iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF ;
    public final EObject entryRuleSimulationTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationTemplateProcessor = null;


        try {
            // InternalKiSim.g:739:2: (iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF )
            // InternalKiSim.g:740:2: iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimulationTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimulationTemplateProcessor=ruleSimulationTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimulationTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulationTemplateProcessor"


    // $ANTLR start "ruleSimulationTemplateProcessor"
    // InternalKiSim.g:747:1: ruleSimulationTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) ;
    public final EObject ruleSimulationTemplateProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:750:28: ( (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) )
            // InternalKiSim.g:751:1: (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            {
            // InternalKiSim.g:751:1: (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            // InternalKiSim.g:751:3: otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimulationTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimulationTemplateProcessorAccess().getSimulationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSimulationTemplateProcessorAccess().getTemplateKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimulationTemplateProcessorAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiSim.g:767:1: ()
            // InternalKiSim.g:768:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSimulationTemplateProcessorAccess().getSimulationTemplateProcessorAction_4(),
                          current);
                  
            }

            }

            // InternalKiSim.g:776:2: ( (lv_attributes_5_0= ruleAttributeMapping ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKiSim.g:777:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:777:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    // InternalKiSim.g:778:3: lv_attributes_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimulationTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attributes_5_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimulationTemplateProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_5_0, 
            	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSimulationTemplateProcessorAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleSimulationTemplateProcessor"


    // $ANTLR start "entryRuleWrapperCodeTemplateProcessor"
    // InternalKiSim.g:806:1: entryRuleWrapperCodeTemplateProcessor returns [EObject current=null] : iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF ;
    public final EObject entryRuleWrapperCodeTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrapperCodeTemplateProcessor = null;


        try {
            // InternalKiSim.g:807:2: (iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF )
            // InternalKiSim.g:808:2: iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWrapperCodeTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWrapperCodeTemplateProcessor=ruleWrapperCodeTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrapperCodeTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrapperCodeTemplateProcessor"


    // $ANTLR start "ruleWrapperCodeTemplateProcessor"
    // InternalKiSim.g:815:1: ruleWrapperCodeTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) ;
    public final EObject ruleWrapperCodeTemplateProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:818:28: ( (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) )
            // InternalKiSim.g:819:1: (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            {
            // InternalKiSim.g:819:1: (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            // InternalKiSim.g:819:3: otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWrapperCodeTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWrapperCodeTemplateProcessorAccess().getWrapperKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWrapperCodeTemplateProcessorAccess().getTemplateKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWrapperCodeTemplateProcessorAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiSim.g:835:1: ()
            // InternalKiSim.g:836:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWrapperCodeTemplateProcessorAccess().getWrapperCodeTemplateProcessorAction_4(),
                          current);
                  
            }

            }

            // InternalKiSim.g:844:2: ( (lv_attributes_5_0= ruleAttributeMapping ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKiSim.g:845:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:845:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    // InternalKiSim.g:846:3: lv_attributes_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getWrapperCodeTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attributes_5_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getWrapperCodeTemplateProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_5_0, 
            	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getWrapperCodeTemplateProcessorAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleWrapperCodeTemplateProcessor"


    // $ANTLR start "entryRuleAttributeMapping"
    // InternalKiSim.g:874:1: entryRuleAttributeMapping returns [EObject current=null] : iv_ruleAttributeMapping= ruleAttributeMapping EOF ;
    public final EObject entryRuleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMapping = null;


        try {
            // InternalKiSim.g:875:2: (iv_ruleAttributeMapping= ruleAttributeMapping EOF )
            // InternalKiSim.g:876:2: iv_ruleAttributeMapping= ruleAttributeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeMapping=ruleAttributeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeMapping; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeMapping"


    // $ANTLR start "ruleAttributeMapping"
    // InternalKiSim.g:883:1: ruleAttributeMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) ) ;
    public final EObject ruleAttributeMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_arrayIndex_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_values_5_0 = null;

        EObject lv_values_7_0 = null;

        EObject lv_attributes_10_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:886:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) ) )
            // InternalKiSim.g:887:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) )
            {
            // InternalKiSim.g:887:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) )
            // InternalKiSim.g:887:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) )
            {
            // InternalKiSim.g:887:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKiSim.g:888:1: (lv_name_0_0= RULE_ID )
            {
            // InternalKiSim.g:888:1: (lv_name_0_0= RULE_ID )
            // InternalKiSim.g:889:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAttributeMappingAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiSim.g:905:2: ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKiSim.g:906:1: (lv_arrayIndex_1_0= ruleArrayIndex )
                    {
                    // InternalKiSim.g:906:1: (lv_arrayIndex_1_0= ruleArrayIndex )
                    // InternalKiSim.g:907:3: lv_arrayIndex_1_0= ruleArrayIndex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getArrayIndexArrayIndexParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_arrayIndex_1_0=ruleArrayIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"arrayIndex",
                              		lv_arrayIndex_1_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.ArrayIndex");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiSim.g:923:3: ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalKiSim.g:923:4: (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) )
                    {
                    // InternalKiSim.g:923:4: (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) )
                    // InternalKiSim.g:923:6: otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAttributeMappingAccess().getColonKeyword_2_0_0());
                          
                    }
                    // InternalKiSim.g:927:1: ( (lv_value_3_0= ruleLiteral ) )
                    // InternalKiSim.g:928:1: (lv_value_3_0= ruleLiteral )
                    {
                    // InternalKiSim.g:928:1: (lv_value_3_0= ruleLiteral )
                    // InternalKiSim.g:929:3: lv_value_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getValueLiteralParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:946:6: (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ )
                    {
                    // InternalKiSim.g:946:6: (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ )
                    // InternalKiSim.g:946:8: otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeMappingAccess().getColonKeyword_2_1_0());
                          
                    }
                    // InternalKiSim.g:950:1: ( (lv_values_5_0= ruleLiteral ) )
                    // InternalKiSim.g:951:1: (lv_values_5_0= ruleLiteral )
                    {
                    // InternalKiSim.g:951:1: (lv_values_5_0= ruleLiteral )
                    // InternalKiSim.g:952:3: lv_values_5_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getValuesLiteralParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_values_5_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_5_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:968:2: (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==29) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalKiSim.g:968:4: otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) )
                    	    {
                    	    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:972:1: ( (lv_values_7_0= ruleLiteral ) )
                    	    // InternalKiSim.g:973:1: (lv_values_7_0= ruleLiteral )
                    	    {
                    	    // InternalKiSim.g:973:1: (lv_values_7_0= ruleLiteral )
                    	    // InternalKiSim.g:974:3: lv_values_7_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getValuesLiteralParserRuleCall_2_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_values_7_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_7_0, 
                    	              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalKiSim.g:991:6: ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' )
                    {
                    // InternalKiSim.g:991:6: ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' )
                    // InternalKiSim.g:991:7: (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}'
                    {
                    // InternalKiSim.g:991:7: (otherlv_8= ':' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==28) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalKiSim.g:991:9: otherlv_8= ':'
                            {
                            otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getAttributeMappingAccess().getColonKeyword_2_2_0());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAttributeMappingAccess().getLeftCurlyBracketKeyword_2_2_1());
                          
                    }
                    // InternalKiSim.g:999:1: ( (lv_attributes_10_0= ruleAttributeMapping ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalKiSim.g:1000:1: (lv_attributes_10_0= ruleAttributeMapping )
                    	    {
                    	    // InternalKiSim.g:1000:1: (lv_attributes_10_0= ruleAttributeMapping )
                    	    // InternalKiSim.g:1001:3: lv_attributes_10_0= ruleAttributeMapping
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getAttributesAttributeMappingParserRuleCall_2_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_9);
                    	    lv_attributes_10_0=ruleAttributeMapping();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_10_0, 
                    	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAttributeMappingAccess().getRightCurlyBracketKeyword_2_2_3());
                          
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
    // $ANTLR end "ruleAttributeMapping"


    // $ANTLR start "entryRuleLiteral"
    // InternalKiSim.g:1029:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalKiSim.g:1030:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalKiSim.g:1031:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:1038:1: ruleLiteral returns [EObject current=null] : ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_arrayIndex_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1041:28: ( ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) ) )
            // InternalKiSim.g:1042:1: ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) )
            {
            // InternalKiSim.g:1042:1: ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt24=1;
                }
                break;
            case 41:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==RULE_FLOAT) ) {
                    alt24=3;
                }
                else if ( (LA24_2==RULE_INT) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==RULE_INT) ) {
                    alt24=2;
                }
                else if ( (LA24_3==RULE_FLOAT) ) {
                    alt24=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA24_4 = input.LA(2);

                if ( (synpred27_InternalKiSim()) ) {
                    alt24=2;
                }
                else if ( (true) ) {
                    alt24=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA24_5 = input.LA(2);

                if ( (synpred28_InternalKiSim()) ) {
                    alt24=3;
                }
                else if ( (true) ) {
                    alt24=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalKiSim.g:1042:2: ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? )
                    {
                    // InternalKiSim.g:1042:2: ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? )
                    // InternalKiSim.g:1042:3: ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
                    {
                    // InternalKiSim.g:1042:3: ( (lv_value_0_0= ruleTextValue ) )
                    // InternalKiSim.g:1043:1: (lv_value_0_0= ruleTextValue )
                    {
                    // InternalKiSim.g:1043:1: (lv_value_0_0= ruleTextValue )
                    // InternalKiSim.g:1044:3: lv_value_0_0= ruleTextValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueTextValueParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_value_0_0=ruleTextValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_0_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.TextValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:1060:2: ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==30) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalKiSim.g:1061:1: (lv_arrayIndex_1_0= ruleArrayIndex )
                            {
                            // InternalKiSim.g:1061:1: (lv_arrayIndex_1_0= ruleArrayIndex )
                            // InternalKiSim.g:1062:3: lv_arrayIndex_1_0= ruleArrayIndex
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralAccess().getArrayIndexArrayIndexParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_arrayIndex_1_0=ruleArrayIndex();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"arrayIndex",
                                      		lv_arrayIndex_1_0, 
                                      		"de.cau.cs.kieler.prom.KiBuild.ArrayIndex");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:1079:6: ( (lv_value_2_0= ruleSignedInt ) )
                    {
                    // InternalKiSim.g:1079:6: ( (lv_value_2_0= ruleSignedInt ) )
                    // InternalKiSim.g:1080:1: (lv_value_2_0= ruleSignedInt )
                    {
                    // InternalKiSim.g:1080:1: (lv_value_2_0= ruleSignedInt )
                    // InternalKiSim.g:1081:3: lv_value_2_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedIntParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_2_0=ruleSignedInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiSim.g:1098:6: ( (lv_value_3_0= ruleSignedFloat ) )
                    {
                    // InternalKiSim.g:1098:6: ( (lv_value_3_0= ruleSignedFloat ) )
                    // InternalKiSim.g:1099:1: (lv_value_3_0= ruleSignedFloat )
                    {
                    // InternalKiSim.g:1099:1: (lv_value_3_0= ruleSignedFloat )
                    // InternalKiSim.g:1100:3: lv_value_3_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedFloatParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleSignedFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKiSim.g:1117:6: ( (lv_value_4_0= ruleAnyValue ) )
                    {
                    // InternalKiSim.g:1117:6: ( (lv_value_4_0= ruleAnyValue ) )
                    // InternalKiSim.g:1118:1: (lv_value_4_0= ruleAnyValue )
                    {
                    // InternalKiSim.g:1118:1: (lv_value_4_0= ruleAnyValue )
                    // InternalKiSim.g:1119:3: lv_value_4_0= ruleAnyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueAnyValueParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_4_0=ruleAnyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AnyValue");
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayIndex"
    // InternalKiSim.g:1143:1: entryRuleArrayIndex returns [EObject current=null] : iv_ruleArrayIndex= ruleArrayIndex EOF ;
    public final EObject entryRuleArrayIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndex = null;


        try {
            // InternalKiSim.g:1144:2: (iv_ruleArrayIndex= ruleArrayIndex EOF )
            // InternalKiSim.g:1145:2: iv_ruleArrayIndex= ruleArrayIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayIndexRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayIndex=ruleArrayIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayIndex; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayIndex"


    // $ANTLR start "ruleArrayIndex"
    // InternalKiSim.g:1152:1: ruleArrayIndex returns [EObject current=null] : (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+ ;
    public final EObject ruleArrayIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_indices_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:1155:28: ( (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+ )
            // InternalKiSim.g:1156:1: (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+
            {
            // InternalKiSim.g:1156:1: (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKiSim.g:1156:3: otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']'
            	    {
            	    otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getArrayIndexAccess().getLeftSquareBracketKeyword_0());
            	          
            	    }
            	    // InternalKiSim.g:1160:1: ( (lv_indices_1_0= RULE_INT ) )
            	    // InternalKiSim.g:1161:1: (lv_indices_1_0= RULE_INT )
            	    {
            	    // InternalKiSim.g:1161:1: (lv_indices_1_0= RULE_INT )
            	    // InternalKiSim.g:1162:3: lv_indices_1_0= RULE_INT
            	    {
            	    lv_indices_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_indices_1_0, grammarAccess.getArrayIndexAccess().getIndicesINTTerminalRuleCall_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getArrayIndexRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"indices",
            	              		lv_indices_1_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayIndexAccess().getRightSquareBracketKeyword_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


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
    // $ANTLR end "ruleArrayIndex"


    // $ANTLR start "entryRuleSignedFloat"
    // InternalKiSim.g:1190:1: entryRuleSignedFloat returns [EObject current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final EObject entryRuleSignedFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedFloat = null;


        try {
            // InternalKiSim.g:1191:2: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // InternalKiSim.g:1192:2: iv_ruleSignedFloat= ruleSignedFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedFloatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedFloat=ruleSignedFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedFloat; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedFloat"


    // $ANTLR start "ruleSignedFloat"
    // InternalKiSim.g:1199:1: ruleSignedFloat returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleSignedFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1202:28: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // InternalKiSim.g:1203:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // InternalKiSim.g:1203:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            // InternalKiSim.g:1203:2: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // InternalKiSim.g:1203:2: ( (lv_sign_0_0= ruleSign ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=41 && LA26_0<=42)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKiSim.g:1204:1: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiSim.g:1204:1: (lv_sign_0_0= ruleSign )
                    // InternalKiSim.g:1205:3: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignedFloatAccess().getSignSignEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignedFloatRule());
                      	        }
                             		set(
                             			current, 
                             			"sign",
                              		lv_sign_0_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Sign");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiSim.g:1221:3: ( (lv_value_1_0= RULE_FLOAT ) )
            // InternalKiSim.g:1222:1: (lv_value_1_0= RULE_FLOAT )
            {
            // InternalKiSim.g:1222:1: (lv_value_1_0= RULE_FLOAT )
            // InternalKiSim.g:1223:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getSignedFloatAccess().getValueFLOATTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignedFloatRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.FLOAT");
              	    
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
    // $ANTLR end "ruleSignedFloat"


    // $ANTLR start "entryRuleSignedInt"
    // InternalKiSim.g:1247:1: entryRuleSignedInt returns [EObject current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final EObject entryRuleSignedInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInt = null;


        try {
            // InternalKiSim.g:1248:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalKiSim.g:1249:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalKiSim.g:1256:1: ruleSignedInt returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSignedInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1259:28: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalKiSim.g:1260:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalKiSim.g:1260:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // InternalKiSim.g:1260:2: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalKiSim.g:1260:2: ( (lv_sign_0_0= ruleSign ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=41 && LA27_0<=42)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKiSim.g:1261:1: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiSim.g:1261:1: (lv_sign_0_0= ruleSign )
                    // InternalKiSim.g:1262:3: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignedIntAccess().getSignSignEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignedIntRule());
                      	        }
                             		set(
                             			current, 
                             			"sign",
                              		lv_sign_0_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Sign");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiSim.g:1278:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalKiSim.g:1279:1: (lv_value_1_0= RULE_INT )
            {
            // InternalKiSim.g:1279:1: (lv_value_1_0= RULE_INT )
            // InternalKiSim.g:1280:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignedIntRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleTextValue"
    // InternalKiSim.g:1304:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalKiSim.g:1305:2: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalKiSim.g:1306:2: iv_ruleTextValue= ruleTextValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextValue=ruleTextValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextValue"


    // $ANTLR start "ruleTextValue"
    // InternalKiSim.g:1313:1: ruleTextValue returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:1316:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalKiSim.g:1317:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalKiSim.g:1317:1: ( (lv_value_0_0= RULE_ID ) )
            // InternalKiSim.g:1318:1: (lv_value_0_0= RULE_ID )
            {
            // InternalKiSim.g:1318:1: (lv_value_0_0= RULE_ID )
            // InternalKiSim.g:1319:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getTextValueAccess().getValueIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
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
    // $ANTLR end "ruleTextValue"


    // $ANTLR start "entryRuleExpression"
    // InternalKiSim.g:1345:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKiSim.g:1346:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalKiSim.g:1347:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:1354:1: ruleExpression returns [EObject current=null] : ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject lv_schedule_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1357:28: ( ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKiSim.g:1358:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKiSim.g:1358:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKiSim.g:1358:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKiSim.g:1358:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalKiSim.g:1359:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:1372:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // InternalKiSim.g:1383:2: (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKiSim.g:1383:4: otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getScheduleKeyword_1_0());
                          
                    }
                    // InternalKiSim.g:1387:1: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalKiSim.g:1388:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKiSim.g:1388:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    // InternalKiSim.g:1389:3: lv_schedule_3_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionAccess().getScheduleScheduleObjectReferenceParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_schedule_3_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalKiSim.g:1413:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKiSim.g:1414:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKiSim.g:1415:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalKiSim.g:1422:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1425:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKiSim.g:1427:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalKiSim.g:1446:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKiSim.g:1447:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKiSim.g:1448:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:1455:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1458:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKiSim.g:1459:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKiSim.g:1459:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKiSim.g:1460:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1471:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKiSim.g:1471:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKiSim.g:1471:2: ()
                    // InternalKiSim.g:1472:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:1480:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKiSim.g:1480:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKiSim.g:1480:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKiSim.g:1481:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKiSim.g:1481:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKiSim.g:1482:3: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleLogicalOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:1498:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKiSim.g:1499:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKiSim.g:1499:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKiSim.g:1500:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_subExpressions_3_0=ruleLogicalAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:1516:3: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==33) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalKiSim.g:1516:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1520:1: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKiSim.g:1521:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKiSim.g:1521:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKiSim.g:1522:3: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_subExpressions_5_0=ruleLogicalAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalKiSim.g:1546:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKiSim.g:1547:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKiSim.g:1548:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:1555:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1558:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKiSim.g:1559:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKiSim.g:1559:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKiSim.g:1560:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1571:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKiSim.g:1571:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKiSim.g:1571:2: ()
                    // InternalKiSim.g:1572:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:1580:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKiSim.g:1580:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKiSim.g:1580:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKiSim.g:1581:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKiSim.g:1581:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKiSim.g:1582:3: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleLogicalAndOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:1598:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKiSim.g:1599:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKiSim.g:1599:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKiSim.g:1600:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_subExpressions_3_0=ruleBitwiseOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:1616:3: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==34) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalKiSim.g:1616:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1620:1: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKiSim.g:1621:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKiSim.g:1621:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKiSim.g:1622:3: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
                    	    lv_subExpressions_5_0=ruleBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalKiSim.g:1646:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKiSim.g:1647:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKiSim.g:1648:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:1655:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseXOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1658:28: ( (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) )
            // InternalKiSim.g:1659:1: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            {
            // InternalKiSim.g:1659:1: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            // InternalKiSim.g:1660:2: this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_31);
            this_BitwiseXOrExpression_0=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseXOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1671:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKiSim.g:1671:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    {
                    // InternalKiSim.g:1671:2: ()
                    // InternalKiSim.g:1672:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:1680:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) )
                    // InternalKiSim.g:1680:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    {
                    // InternalKiSim.g:1680:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKiSim.g:1681:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKiSim.g:1681:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKiSim.g:1682:3: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleBitwiseOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:1698:2: ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    // InternalKiSim.g:1699:1: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    {
                    // InternalKiSim.g:1699:1: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    // InternalKiSim.g:1700:3: lv_subExpressions_3_0= ruleBitwiseXOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_subExpressions_3_0=ruleBitwiseXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:1716:3: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==35) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalKiSim.g:1716:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1720:1: ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    // InternalKiSim.g:1721:1: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    {
                    	    // InternalKiSim.g:1721:1: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    // InternalKiSim.g:1722:3: lv_subExpressions_5_0= ruleBitwiseXOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_subExpressions_5_0=ruleBitwiseXOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseXOrExpression"
    // InternalKiSim.g:1746:1: entryRuleBitwiseXOrExpression returns [EObject current=null] : iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF ;
    public final EObject entryRuleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXOrExpression = null;


        try {
            // InternalKiSim.g:1747:2: (iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF )
            // InternalKiSim.g:1748:2: iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseXOrExpression=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseXOrExpression"


    // $ANTLR start "ruleBitwiseXOrExpression"
    // InternalKiSim.g:1755:1: ruleBitwiseXOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1758:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKiSim.g:1759:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKiSim.g:1759:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKiSim.g:1760:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_32);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1771:1: ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKiSim.g:1771:2: () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKiSim.g:1771:2: ()
                    // InternalKiSim.g:1772:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseXOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:1780:2: ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKiSim.g:1780:3: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKiSim.g:1780:3: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) )
                    // InternalKiSim.g:1781:1: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    {
                    // InternalKiSim.g:1781:1: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    // InternalKiSim.g:1782:3: lv_operator_2_0= ruleBitwiseXOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getOperatorBitwiseXOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleBitwiseXOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:1798:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKiSim.g:1799:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKiSim.g:1799:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKiSim.g:1800:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_subExpressions_3_0=ruleBitwiseAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:1816:3: (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==36) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalKiSim.g:1816:5: otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseXOrExpressionAccess().getCircumflexAccentKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1820:1: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKiSim.g:1821:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKiSim.g:1821:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKiSim.g:1822:3: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_32);
                    	    lv_subExpressions_5_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
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
    // $ANTLR end "ruleBitwiseXOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKiSim.g:1846:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKiSim.g:1847:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKiSim.g:1848:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:1855:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1858:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKiSim.g:1859:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKiSim.g:1859:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKiSim.g:1860:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_33);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1871:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKiSim.g:1871:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKiSim.g:1871:2: ()
                    // InternalKiSim.g:1872:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:1880:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKiSim.g:1880:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKiSim.g:1880:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKiSim.g:1881:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKiSim.g:1881:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKiSim.g:1882:3: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleBitwiseAndOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:1898:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKiSim.g:1899:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKiSim.g:1899:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKiSim.g:1900:3: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_subExpressions_3_0=ruleCompareOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:1916:3: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==37) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalKiSim.g:1916:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1920:1: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKiSim.g:1921:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKiSim.g:1921:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKiSim.g:1922:3: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_subExpressions_5_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKiSim.g:1946:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKiSim.g:1947:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKiSim.g:1948:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalKiSim.g:1955:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1958:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKiSim.g:1959:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKiSim.g:1959:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKiSim.g:1960:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_34);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1971:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=58 && LA41_0<=63)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKiSim.g:1971:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKiSim.g:1971:2: ()
                    // InternalKiSim.g:1972:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:1980:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKiSim.g:1981:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKiSim.g:1981:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKiSim.g:1982:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleCompareOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:1998:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKiSim.g:1999:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKiSim.g:1999:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKiSim.g:2000:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_3_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOrValuedExpression");
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalKiSim.g:2024:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKiSim.g:2025:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKiSim.g:2026:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalKiSim.g:2033:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2036:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKiSim.g:2037:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKiSim.g:2037:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalKiSim.g:2038:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_0=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:2051:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_1; 
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
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleBitwiseNotExpression"
    // InternalKiSim.g:2070:1: entryRuleBitwiseNotExpression returns [EObject current=null] : iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF ;
    public final EObject entryRuleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseNotExpression = null;


        try {
            // InternalKiSim.g:2071:2: (iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF )
            // InternalKiSim.g:2072:2: iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseNotExpression=ruleBitwiseNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseNotExpression"


    // $ANTLR start "ruleBitwiseNotExpression"
    // InternalKiSim.g:2079:1: ruleBitwiseNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2082:28: ( ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKiSim.g:2083:1: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKiSim.g:2083:1: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID||(LA43_0>=RULE_HOSTCODE && LA43_0<=RULE_BOOLEAN)||LA43_0==46||(LA43_0>=51 && LA43_0<=53)||LA43_0==64||LA43_0==66) ) {
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
                    // InternalKiSim.g:2083:2: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    {
                    // InternalKiSim.g:2083:2: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    // InternalKiSim.g:2083:3: () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    {
                    // InternalKiSim.g:2083:3: ()
                    // InternalKiSim.g:2084:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBitwiseNotExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2092:2: ( (lv_operator_1_0= ruleBitwiseNotOperator ) )
                    // InternalKiSim.g:2093:1: (lv_operator_1_0= ruleBitwiseNotOperator )
                    {
                    // InternalKiSim.g:2093:1: (lv_operator_1_0= ruleBitwiseNotOperator )
                    // InternalKiSim.g:2094:3: lv_operator_1_0= ruleBitwiseNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getOperatorBitwiseNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_1_0=ruleBitwiseNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2110:2: ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    // InternalKiSim.g:2111:1: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    {
                    // InternalKiSim.g:2111:1: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    // InternalKiSim.g:2112:3: lv_subExpressions_2_0= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getSubExpressionsBitwiseNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:2130:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_3=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_3; 
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
    // $ANTLR end "ruleBitwiseNotExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalKiSim.g:2149:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKiSim.g:2150:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKiSim.g:2151:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalKiSim.g:2158:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_BitwiseNotExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2161:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) )
            // InternalKiSim.g:2162:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            {
            // InternalKiSim.g:2162:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID||(LA44_0>=RULE_HOSTCODE && LA44_0<=RULE_BOOLEAN)||LA44_0==46||(LA44_0>=51 && LA44_0<=53)||(LA44_0>=64 && LA44_0<=66)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalKiSim.g:2162:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKiSim.g:2162:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKiSim.g:2162:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKiSim.g:2162:3: ()
                    // InternalKiSim.g:2163:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2171:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKiSim.g:2172:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKiSim.g:2172:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalKiSim.g:2173:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_1_0=ruleNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2189:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKiSim.g:2190:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKiSim.g:2190:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKiSim.g:2191:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:2209:2: this_BitwiseNotExpression_3= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getBitwiseNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BitwiseNotExpression_3=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitwiseNotExpression_3; 
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalKiSim.g:2228:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKiSim.g:2229:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKiSim.g:2230:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalKiSim.g:2237:1: ruleValuedExpression returns [EObject current=null] : this_ShiftLeftExpression_0= ruleShiftLeftExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftLeftExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2240:28: (this_ShiftLeftExpression_0= ruleShiftLeftExpression )
            // InternalKiSim.g:2242:2: this_ShiftLeftExpression_0= ruleShiftLeftExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getShiftLeftExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ShiftLeftExpression_0=ruleShiftLeftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftLeftExpression_0; 
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
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleShiftLeftExpression"
    // InternalKiSim.g:2261:1: entryRuleShiftLeftExpression returns [EObject current=null] : iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF ;
    public final EObject entryRuleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftLeftExpression = null;


        try {
            // InternalKiSim.g:2262:2: (iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF )
            // InternalKiSim.g:2263:2: iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftLeftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftLeftExpression=ruleShiftLeftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftLeftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftLeftExpression"


    // $ANTLR start "ruleShiftLeftExpression"
    // InternalKiSim.g:2270:1: ruleShiftLeftExpression returns [EObject current=null] : (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) ;
    public final EObject ruleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2273:28: ( (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) )
            // InternalKiSim.g:2274:1: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            {
            // InternalKiSim.g:2274:1: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            // InternalKiSim.g:2275:2: this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getShiftRightExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_35);
            this_ShiftRightExpression_0=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftRightExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2286:1: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKiSim.g:2286:2: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    {
                    // InternalKiSim.g:2286:2: ()
                    // InternalKiSim.g:2287:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getShiftLeftExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2295:2: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) )
                    // InternalKiSim.g:2295:3: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    {
                    // InternalKiSim.g:2295:3: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
                    // InternalKiSim.g:2296:1: (lv_operator_2_0= ruleShiftLeftOperator )
                    {
                    // InternalKiSim.g:2296:1: (lv_operator_2_0= ruleShiftLeftOperator )
                    // InternalKiSim.g:2297:3: lv_operator_2_0= ruleShiftLeftOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleShiftLeftOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2313:2: ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    // InternalKiSim.g:2314:1: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    {
                    // InternalKiSim.g:2314:1: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    // InternalKiSim.g:2315:3: lv_subExpressions_3_0= ruleShiftRightExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_subExpressions_3_0=ruleShiftRightExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:2331:3: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==38) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalKiSim.g:2331:5: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftLeftExpressionAccess().getLessThanSignLessThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2335:1: ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    // InternalKiSim.g:2336:1: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    {
                    	    // InternalKiSim.g:2336:1: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    // InternalKiSim.g:2337:3: lv_subExpressions_5_0= ruleShiftRightExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_subExpressions_5_0=ruleShiftRightExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
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
    // $ANTLR end "ruleShiftLeftExpression"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKiSim.g:2361:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKiSim.g:2362:2: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKiSim.g:2363:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightExpression=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftRightExpression"


    // $ANTLR start "ruleShiftRightExpression"
    // InternalKiSim.g:2370:1: ruleShiftRightExpression returns [EObject current=null] : (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightUnsignedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2373:28: ( (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKiSim.g:2374:1: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKiSim.g:2374:1: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKiSim.g:2375:2: this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getShiftRightUnsignedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_37);
            this_ShiftRightUnsignedExpression_0=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftRightUnsignedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2386:1: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKiSim.g:2386:2: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKiSim.g:2386:2: ()
                    // InternalKiSim.g:2387:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getShiftRightExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2395:2: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKiSim.g:2395:3: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKiSim.g:2395:3: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKiSim.g:2396:1: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKiSim.g:2396:1: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKiSim.g:2397:3: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleShiftRightOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2413:2: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKiSim.g:2414:1: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKiSim.g:2414:1: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKiSim.g:2415:3: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_subExpressions_3_0=ruleShiftRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:2431:3: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==39) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalKiSim.g:2431:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2435:1: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKiSim.g:2436:1: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKiSim.g:2436:1: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKiSim.g:2437:3: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_subExpressions_5_0=ruleShiftRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
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
    // $ANTLR end "ruleShiftRightExpression"


    // $ANTLR start "entryRuleShiftRightUnsignedExpression"
    // InternalKiSim.g:2461:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKiSim.g:2462:2: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKiSim.g:2463:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightUnsignedExpression=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightUnsignedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftRightUnsignedExpression"


    // $ANTLR start "ruleShiftRightUnsignedExpression"
    // InternalKiSim.g:2470:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2473:28: ( (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) )
            // InternalKiSim.g:2474:1: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            {
            // InternalKiSim.g:2474:1: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            // InternalKiSim.g:2475:2: this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getAddExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2486:1: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKiSim.g:2486:2: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    {
                    // InternalKiSim.g:2486:2: ()
                    // InternalKiSim.g:2487:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2495:2: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) )
                    // InternalKiSim.g:2495:3: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    {
                    // InternalKiSim.g:2495:3: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKiSim.g:2496:1: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKiSim.g:2496:1: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKiSim.g:2497:3: lv_operator_2_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleShiftRightUnsignedOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2513:2: ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    // InternalKiSim.g:2514:1: (lv_subExpressions_3_0= ruleAddExpression )
                    {
                    // InternalKiSim.g:2514:1: (lv_subExpressions_3_0= ruleAddExpression )
                    // InternalKiSim.g:2515:3: lv_subExpressions_3_0= ruleAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_subExpressions_3_0=ruleAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:2531:3: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==40) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalKiSim.g:2531:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2535:1: ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    // InternalKiSim.g:2536:1: (lv_subExpressions_5_0= ruleAddExpression )
                    	    {
                    	    // InternalKiSim.g:2536:1: (lv_subExpressions_5_0= ruleAddExpression )
                    	    // InternalKiSim.g:2537:3: lv_subExpressions_5_0= ruleAddExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
                    	    lv_subExpressions_5_0=ruleAddExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
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
    // $ANTLR end "ruleShiftRightUnsignedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalKiSim.g:2561:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKiSim.g:2562:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKiSim.g:2563:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalKiSim.g:2570:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2573:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) )
            // InternalKiSim.g:2574:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            {
            // InternalKiSim.g:2574:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            // InternalKiSim.g:2575:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2586:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKiSim.g:2586:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalKiSim.g:2586:2: ()
                    // InternalKiSim.g:2587:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2595:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalKiSim.g:2595:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalKiSim.g:2595:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKiSim.g:2596:1: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKiSim.g:2596:1: (lv_operator_2_0= ruleAddOperator )
                    // InternalKiSim.g:2597:3: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleAddOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AddOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2613:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalKiSim.g:2614:1: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalKiSim.g:2614:1: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalKiSim.g:2615:3: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_subExpressions_3_0=ruleSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:2631:3: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==41) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKiSim.g:2631:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2635:1: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalKiSim.g:2636:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalKiSim.g:2636:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalKiSim.g:2637:3: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
                    	    lv_subExpressions_5_0=ruleSubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKiSim.g:2661:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKiSim.g:2662:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKiSim.g:2663:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalKiSim.g:2670:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2673:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) )
            // InternalKiSim.g:2674:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            {
            // InternalKiSim.g:2674:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            // InternalKiSim.g:2675:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2686:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKiSim.g:2686:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    {
                    // InternalKiSim.g:2686:2: ()
                    // InternalKiSim.g:2687:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2695:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )
                    // InternalKiSim.g:2695:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    {
                    // InternalKiSim.g:2695:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalKiSim.g:2696:1: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalKiSim.g:2696:1: (lv_operator_2_0= ruleSubOperator )
                    // InternalKiSim.g:2697:3: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2713:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    // InternalKiSim.g:2714:1: (lv_subExpressions_3_0= ruleMultExpression )
                    {
                    // InternalKiSim.g:2714:1: (lv_subExpressions_3_0= ruleMultExpression )
                    // InternalKiSim.g:2715:3: lv_subExpressions_3_0= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_subExpressions_3_0=ruleMultExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:2731:3: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==42) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalKiSim.g:2731:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2735:1: ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    // InternalKiSim.g:2736:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    {
                    	    // InternalKiSim.g:2736:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    // InternalKiSim.g:2737:3: lv_subExpressions_5_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_subExpressions_5_0=ruleMultExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalKiSim.g:2761:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalKiSim.g:2762:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalKiSim.g:2763:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalKiSim.g:2770:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2773:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) )
            // InternalKiSim.g:2774:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            {
            // InternalKiSim.g:2774:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            // InternalKiSim.g:2775:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_41);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2786:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalKiSim.g:2786:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    {
                    // InternalKiSim.g:2786:2: ()
                    // InternalKiSim.g:2787:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2795:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )
                    // InternalKiSim.g:2795:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    {
                    // InternalKiSim.g:2795:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKiSim.g:2796:1: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKiSim.g:2796:1: (lv_operator_2_0= ruleMultOperator )
                    // InternalKiSim.g:2797:3: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleMultOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.MultOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2813:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    // InternalKiSim.g:2814:1: (lv_subExpressions_3_0= ruleDivExpression )
                    {
                    // InternalKiSim.g:2814:1: (lv_subExpressions_3_0= ruleDivExpression )
                    // InternalKiSim.g:2815:3: lv_subExpressions_3_0= ruleDivExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_subExpressions_3_0=ruleDivExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:2831:3: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==43) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalKiSim.g:2831:5: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2835:1: ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    // InternalKiSim.g:2836:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    {
                    	    // InternalKiSim.g:2836:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    // InternalKiSim.g:2837:3: lv_subExpressions_5_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_subExpressions_5_0=ruleDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalKiSim.g:2861:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalKiSim.g:2862:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalKiSim.g:2863:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalKiSim.g:2870:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2873:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) )
            // InternalKiSim.g:2874:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            {
            // InternalKiSim.g:2874:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            // InternalKiSim.g:2875:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_42);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2886:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalKiSim.g:2886:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    {
                    // InternalKiSim.g:2886:2: ()
                    // InternalKiSim.g:2887:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2895:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
                    // InternalKiSim.g:2895:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // InternalKiSim.g:2895:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalKiSim.g:2896:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalKiSim.g:2896:1: (lv_operator_2_0= ruleDivOperator )
                    // InternalKiSim.g:2897:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleDivOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:2913:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // InternalKiSim.g:2914:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // InternalKiSim.g:2914:1: (lv_subExpressions_3_0= ruleModExpression )
                    // InternalKiSim.g:2915:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_subExpressions_3_0=ruleModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:2931:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==44) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalKiSim.g:2931:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2935:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    // InternalKiSim.g:2936:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    {
                    	    // InternalKiSim.g:2936:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    // InternalKiSim.g:2937:3: lv_subExpressions_5_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_42);
                    	    lv_subExpressions_5_0=ruleModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalKiSim.g:2961:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalKiSim.g:2962:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalKiSim.g:2963:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalKiSim.g:2970:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2973:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKiSim.g:2974:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKiSim.g:2974:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKiSim.g:2975:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_43);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2986:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==45) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalKiSim.g:2986:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKiSim.g:2986:2: ()
                    // InternalKiSim.g:2987:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:2995:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiSim.g:2995:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiSim.g:2995:3: ( (lv_operator_2_0= ruleModOperator ) )
                    // InternalKiSim.g:2996:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // InternalKiSim.g:2996:1: (lv_operator_2_0= ruleModOperator )
                    // InternalKiSim.g:2997:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleModOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:3013:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiSim.g:3014:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiSim.g:3014:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiSim.g:3015:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:3031:3: (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==45) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalKiSim.g:3031:5: otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:3035:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKiSim.g:3036:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKiSim.g:3036:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKiSim.g:3037:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_43);
                    	    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKiSim.g:3061:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKiSim.g:3062:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKiSim.g:3063:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalKiSim.g:3070:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3073:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKiSim.g:3074:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKiSim.g:3074:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==42) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==18||LA61_0==46||(LA61_0>=51 && LA61_0<=53)||LA61_0==64||LA61_0==66) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalKiSim.g:3074:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKiSim.g:3074:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKiSim.g:3074:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKiSim.g:3074:3: ()
                    // InternalKiSim.g:3075:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:3083:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKiSim.g:3084:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKiSim.g:3084:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalKiSim.g:3085:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_1_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:3101:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKiSim.g:3102:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKiSim.g:3102:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKiSim.g:3103:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNegExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:3121:2: this_TernaryOperation_3= ruleTernaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getTernaryOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TernaryOperation_3=ruleTernaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TernaryOperation_3; 
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
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleTernaryOperation"
    // InternalKiSim.g:3140:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKiSim.g:3141:2: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKiSim.g:3142:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTernaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTernaryOperation=ruleTernaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTernaryOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTernaryOperation"


    // $ANTLR start "ruleTernaryOperation"
    // InternalKiSim.g:3149:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression ) ;
    public final EObject ruleTernaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_AtomicValuedExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3152:28: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression ) )
            // InternalKiSim.g:3153:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )
            {
            // InternalKiSim.g:3153:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // InternalKiSim.g:3153:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKiSim.g:3153:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiSim.g:3153:3: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiSim.g:3153:3: ()
                    // InternalKiSim.g:3154:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTernaryOperationAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:3162:2: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKiSim.g:3163:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiSim.g:3163:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKiSim.g:3164:3: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_subExpressions_1_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:3180:2: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKiSim.g:3181:1: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKiSim.g:3181:1: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKiSim.g:3182:3: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_operator_2_0=ruleConditionalOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ConditionalOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:3198:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiSim.g:3199:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiSim.g:3199:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiSim.g:3200:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4());
                          
                    }
                    // InternalKiSim.g:3220:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    // InternalKiSim.g:3221:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiSim.g:3221:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    // InternalKiSim.g:3222:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:3240:2: this_AtomicValuedExpression_6= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTernaryOperationAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_6=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_6; 
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
    // $ANTLR end "ruleTernaryOperation"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKiSim.g:3259:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKiSim.g:3260:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKiSim.g:3261:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalKiSim.g:3268:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_RandomCall_7 = null;

        EObject this_RandomizeCall_8 = null;

        EObject this_TextExpression_9 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3271:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) )
            // InternalKiSim.g:3272:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            {
            // InternalKiSim.g:3272:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            int alt63=8;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalKiSim.g:3273:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_0=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:3286:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectTestExpression_1=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectTestExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiSim.g:3298:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKiSim.g:3298:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKiSim.g:3298:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiSim.g:3320:2: this_ReferenceCall_5= ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCall_5=ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKiSim.g:3333:2: this_FunctionCall_6= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCall_6=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalKiSim.g:3346:2: this_RandomCall_7= ruleRandomCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomCallParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomCall_7=ruleRandomCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RandomCall_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalKiSim.g:3359:2: this_RandomizeCall_8= ruleRandomizeCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomizeCallParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCall_8=ruleRandomizeCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RandomizeCall_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalKiSim.g:3372:2: this_TextExpression_9= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_9=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_9; 
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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalKiSim.g:3391:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKiSim.g:3392:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKiSim.g:3393:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalKiSim.g:3400:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_VectorValue_3 = null;

        EObject this_ValuedExpression_5 = null;

        EObject this_AtomicExpression_7 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3403:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKiSim.g:3404:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKiSim.g:3404:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt64=6;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalKiSim.g:3405:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:3418:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiSim.g:3431:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKiSim.g:3444:2: this_VectorValue_3= ruleVectorValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getVectorValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VectorValue_3=ruleVectorValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VectorValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKiSim.g:3456:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKiSim.g:3456:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKiSim.g:3456:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKiSim.g:3478:2: this_AtomicExpression_7= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_7=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_7; 
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
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalKiSim.g:3497:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKiSim.g:3498:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKiSim.g:3499:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalKiSim.g:3506:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_ValuedObjectReference_5 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3509:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalKiSim.g:3510:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalKiSim.g:3510:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==64||LA66_0==66) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalKiSim.g:3510:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalKiSim.g:3510:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalKiSim.g:3510:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalKiSim.g:3510:3: ()
                    // InternalKiSim.g:3511:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiSim.g:3519:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKiSim.g:3520:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKiSim.g:3520:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKiSim.g:3521:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKiSim.g:3521:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==64) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==66) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalKiSim.g:3522:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_47);
                            lv_operator_1_1=rulePreOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_1, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalKiSim.g:3537:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_47);
                            lv_operator_1_2=ruleValOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_2, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalKiSim.g:3559:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKiSim.g:3560:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKiSim.g:3560:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKiSim.g:3561:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    lv_subExpressions_3_0=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:3583:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectReference_5=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectReference_5; 
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
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRulePrimeID"
    // InternalKiSim.g:3602:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKiSim.g:3603:2: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKiSim.g:3604:2: iv_rulePrimeID= rulePrimeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimeIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimeID=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimeID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimeID"


    // $ANTLR start "rulePrimeID"
    // InternalKiSim.g:3611:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3614:28: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKiSim.g:3615:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKiSim.g:3615:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKiSim.g:3615:6: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiSim.g:3622:1: (kw= '\\'' )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==48) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalKiSim.g:3623:2: kw= '\\''
            	    {
            	    kw=(Token)match(input,48,FollowSets000.FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end "rulePrimeID"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalKiSim.g:3636:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKiSim.g:3637:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKiSim.g:3638:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalKiSim.g:3645:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3648:28: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKiSim.g:3649:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKiSim.g:3649:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKiSim.g:3649:2: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKiSim.g:3649:2: ( ( rulePrimeID ) )
            // InternalKiSim.g:3650:1: ( rulePrimeID )
            {
            // InternalKiSim.g:3650:1: ( rulePrimeID )
            // InternalKiSim.g:3651:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_50);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:3667:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==30) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalKiSim.g:3667:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalKiSim.g:3671:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKiSim.g:3672:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKiSim.g:3672:1: (lv_indices_2_0= ruleExpression )
            	    // InternalKiSim.g:3673:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_2_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // InternalKiSim.g:3693:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==49) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalKiSim.g:3693:5: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                          
                    }
                    // InternalKiSim.g:3697:1: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKiSim.g:3698:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKiSim.g:3698:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKiSim.g:3699:3: lv_subReference_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subReference_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"subReference",
                              		lv_subReference_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleScheduleObjectReference"
    // InternalKiSim.g:3723:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalKiSim.g:3724:2: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalKiSim.g:3725:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleObjectReference=ruleScheduleObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScheduleObjectReference"


    // $ANTLR start "ruleScheduleObjectReference"
    // InternalKiSim.g:3732:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3735:28: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalKiSim.g:3736:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalKiSim.g:3736:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalKiSim.g:3736:2: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalKiSim.g:3736:2: ( ( rulePrimeID ) )
            // InternalKiSim.g:3737:1: ( rulePrimeID )
            {
            // InternalKiSim.g:3737:1: ( rulePrimeID )
            // InternalKiSim.g:3738:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:3754:2: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKiSim.g:3755:1: (lv_priority_1_0= RULE_INT )
            {
            // InternalKiSim.g:3755:1: (lv_priority_1_0= RULE_INT )
            // InternalKiSim.g:3756:3: lv_priority_1_0= RULE_INT
            {
            lv_priority_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_1_0, grammarAccess.getScheduleObjectReferenceAccess().getPriorityINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleScheduleObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKiSim.g:3780:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKiSim.g:3781:2: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKiSim.g:3782:2: iv_ruleReferenceCall= ruleReferenceCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceCall=ruleReferenceCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCall"


    // $ANTLR start "ruleReferenceCall"
    // InternalKiSim.g:3789:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3792:28: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKiSim.g:3793:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKiSim.g:3793:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKiSim.g:3793:2: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKiSim.g:3793:2: ( ( rulePrimeID ) )
            // InternalKiSim.g:3794:1: ( rulePrimeID )
            {
            // InternalKiSim.g:3794:1: ( rulePrimeID )
            // InternalKiSim.g:3795:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_51);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:3811:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==46) ) {
                alt71=1;
            }
            else if ( (LA71_0==50) ) {
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
                    // InternalKiSim.g:3811:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKiSim.g:3811:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKiSim.g:3811:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalKiSim.g:3815:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKiSim.g:3816:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKiSim.g:3816:1: (lv_parameters_2_0= ruleParameter )
                    // InternalKiSim.g:3817:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:3833:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==29) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalKiSim.g:3833:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:3837:1: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKiSim.g:3838:1: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKiSim.g:3838:1: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKiSim.g:3839:3: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
                    	    lv_parameters_4_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_4_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:3860:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                          
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
    // $ANTLR end "ruleReferenceCall"


    // $ANTLR start "entryRuleRandomCall"
    // InternalKiSim.g:3872:1: entryRuleRandomCall returns [EObject current=null] : iv_ruleRandomCall= ruleRandomCall EOF ;
    public final EObject entryRuleRandomCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomCall = null;


        try {
            // InternalKiSim.g:3873:2: (iv_ruleRandomCall= ruleRandomCall EOF )
            // InternalKiSim.g:3874:2: iv_ruleRandomCall= ruleRandomCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomCall=ruleRandomCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandomCall"


    // $ANTLR start "ruleRandomCall"
    // InternalKiSim.g:3881:1: ruleRandomCall returns [EObject current=null] : ( () otherlv_1= 'random' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3884:28: ( ( () otherlv_1= 'random' (otherlv_2= '()' )? ) )
            // InternalKiSim.g:3885:1: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            {
            // InternalKiSim.g:3885:1: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            // InternalKiSim.g:3885:2: () otherlv_1= 'random' (otherlv_2= '()' )?
            {
            // InternalKiSim.g:3885:2: ()
            // InternalKiSim.g:3886:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRandomCallAccess().getRandomCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRandomCallAccess().getRandomKeyword_1());
                  
            }
            // InternalKiSim.g:3898:1: (otherlv_2= '()' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==50) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalKiSim.g:3898:3: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRandomCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                          
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
    // $ANTLR end "ruleRandomCall"


    // $ANTLR start "entryRuleRandomizeCall"
    // InternalKiSim.g:3910:1: entryRuleRandomizeCall returns [EObject current=null] : iv_ruleRandomizeCall= ruleRandomizeCall EOF ;
    public final EObject entryRuleRandomizeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCall = null;


        try {
            // InternalKiSim.g:3911:2: (iv_ruleRandomizeCall= ruleRandomizeCall EOF )
            // InternalKiSim.g:3912:2: iv_ruleRandomizeCall= ruleRandomizeCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomizeCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomizeCall=ruleRandomizeCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomizeCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandomizeCall"


    // $ANTLR start "ruleRandomizeCall"
    // InternalKiSim.g:3919:1: ruleRandomizeCall returns [EObject current=null] : ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomizeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3922:28: ( ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) )
            // InternalKiSim.g:3923:1: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            {
            // InternalKiSim.g:3923:1: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            // InternalKiSim.g:3923:2: () otherlv_1= 'randomize' (otherlv_2= '()' )?
            {
            // InternalKiSim.g:3923:2: ()
            // InternalKiSim.g:3924:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRandomizeCallAccess().getRandomizeCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRandomizeCallAccess().getRandomizeKeyword_1());
                  
            }
            // InternalKiSim.g:3936:1: (otherlv_2= '()' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==50) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalKiSim.g:3936:3: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRandomizeCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                          
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
    // $ANTLR end "ruleRandomizeCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKiSim.g:3948:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKiSim.g:3949:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKiSim.g:3950:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalKiSim.g:3957:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_functionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3960:28: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKiSim.g:3961:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKiSim.g:3961:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKiSim.g:3961:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
                  
            }
            // InternalKiSim.g:3965:1: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKiSim.g:3966:1: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKiSim.g:3966:1: (lv_functionName_1_0= RULE_ID )
            // InternalKiSim.g:3967:3: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_1_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiSim.g:3983:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==46) ) {
                alt75=1;
            }
            else if ( (LA75_0==50) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalKiSim.g:3983:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKiSim.g:3983:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKiSim.g:3983:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalKiSim.g:3987:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKiSim.g:3988:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKiSim.g:3988:1: (lv_parameters_3_0= ruleParameter )
                    // InternalKiSim.g:3989:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:4005:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==29) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalKiSim.g:4005:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:4009:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKiSim.g:4010:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKiSim.g:4010:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKiSim.g:4011:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:4032:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalKiSim.g:4044:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKiSim.g:4045:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalKiSim.g:4046:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:4053:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4056:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKiSim.g:4057:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKiSim.g:4057:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKiSim.g:4057:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKiSim.g:4057:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==54) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==37) ) {
                    alt77=1;
                }
            }
            else if ( (LA77_0==37) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalKiSim.g:4057:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKiSim.g:4057:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==54) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalKiSim.g:4058:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKiSim.g:4058:1: (lv_pureOutput_0_0= '!' )
                            // InternalKiSim.g:4059:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,54,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pureOutput_0_0, grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getParameterRule());
                              	        }
                                     		setWithLastConsumed(current, "pureOutput", true, "!");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalKiSim.g:4072:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKiSim.g:4073:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKiSim.g:4073:1: (lv_callByReference_1_0= '&' )
                    // InternalKiSim.g:4074:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,37,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_1_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKiSim.g:4087:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKiSim.g:4088:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKiSim.g:4088:1: (lv_expression_2_0= ruleExpression )
            // InternalKiSim.g:4089:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
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


    // $ANTLR start "entryRuleTextExpression"
    // InternalKiSim.g:4113:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKiSim.g:4114:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKiSim.g:4115:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalKiSim.g:4122:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4125:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalKiSim.g:4126:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalKiSim.g:4126:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalKiSim.g:4127:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalKiSim.g:4127:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalKiSim.g:4128:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKiSim.g:4152:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKiSim.g:4153:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKiSim.g:4154:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalKiSim.g:4161:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4164:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKiSim.g:4165:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKiSim.g:4165:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalKiSim.g:4166:1: (lv_value_0_0= RULE_INT )
            {
            // InternalKiSim.g:4166:1: (lv_value_0_0= RULE_INT )
            // InternalKiSim.g:4167:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalKiSim.g:4191:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKiSim.g:4192:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKiSim.g:4193:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalKiSim.g:4200:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4203:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKiSim.g:4204:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKiSim.g:4204:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKiSim.g:4205:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKiSim.g:4205:1: (lv_value_0_0= RULE_FLOAT )
            // InternalKiSim.g:4206:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.FLOAT");
              	    
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalKiSim.g:4230:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKiSim.g:4231:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKiSim.g:4232:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalKiSim.g:4239:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4242:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKiSim.g:4243:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKiSim.g:4243:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKiSim.g:4244:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKiSim.g:4244:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKiSim.g:4245:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.BOOLEAN");
              	    
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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalKiSim.g:4269:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKiSim.g:4270:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKiSim.g:4271:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalKiSim.g:4278:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4281:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKiSim.g:4282:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKiSim.g:4282:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKiSim.g:4283:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalKiSim.g:4283:1: (lv_value_0_0= RULE_STRING )
            // InternalKiSim.g:4284:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVectorValue"
    // InternalKiSim.g:4308:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKiSim.g:4309:2: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKiSim.g:4310:2: iv_ruleVectorValue= ruleVectorValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValue=ruleVectorValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorValue"


    // $ANTLR start "ruleVectorValue"
    // InternalKiSim.g:4317:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4320:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) )
            // InternalKiSim.g:4321:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            {
            // InternalKiSim.g:4321:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            // InternalKiSim.g:4321:3: otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // InternalKiSim.g:4325:1: ( (lv_values_1_0= ruleVectorValueMember ) )
            // InternalKiSim.g:4326:1: (lv_values_1_0= ruleVectorValueMember )
            {
            // InternalKiSim.g:4326:1: (lv_values_1_0= ruleVectorValueMember )
            // InternalKiSim.g:4327:3: lv_values_1_0= ruleVectorValueMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_57);
            lv_values_1_0=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorValueRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:4343:2: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==29) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalKiSim.g:4343:4: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalKiSim.g:4347:1: ( (lv_values_3_0= ruleVectorValueMember ) )
            	    // InternalKiSim.g:4348:1: (lv_values_3_0= ruleVectorValueMember )
            	    {
            	    // InternalKiSim.g:4348:1: (lv_values_3_0= ruleVectorValueMember )
            	    // InternalKiSim.g:4349:3: lv_values_3_0= ruleVectorValueMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    lv_values_3_0=ruleVectorValueMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVectorValueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVectorValueAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleVectorValue"


    // $ANTLR start "entryRuleVectorValueMember"
    // InternalKiSim.g:4377:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKiSim.g:4378:2: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKiSim.g:4379:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValueMember=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValueMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorValueMember"


    // $ANTLR start "ruleVectorValueMember"
    // InternalKiSim.g:4386:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4389:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKiSim.g:4390:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKiSim.g:4390:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalKiSim.g:4391:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:4404:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiSim.g:4417:2: this_IgnoreValue_2= ruleIgnoreValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getIgnoreValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IgnoreValue_2=ruleIgnoreValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IgnoreValue_2; 
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
    // $ANTLR end "ruleVectorValueMember"


    // $ANTLR start "entryRuleIgnoreValue"
    // InternalKiSim.g:4436:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKiSim.g:4437:2: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKiSim.g:4438:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIgnoreValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIgnoreValue=ruleIgnoreValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIgnoreValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIgnoreValue"


    // $ANTLR start "ruleIgnoreValue"
    // InternalKiSim.g:4445:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4448:28: ( ( () otherlv_1= '_' ) )
            // InternalKiSim.g:4449:1: ( () otherlv_1= '_' )
            {
            // InternalKiSim.g:4449:1: ( () otherlv_1= '_' )
            // InternalKiSim.g:4449:2: () otherlv_1= '_'
            {
            // InternalKiSim.g:4449:2: ()
            // InternalKiSim.g:4450:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIgnoreValueAccess().getIgnoreValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIgnoreValueAccess().get_Keyword_1());
                  
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
    // $ANTLR end "ruleIgnoreValue"


    // $ANTLR start "entryRuleAnyValue"
    // InternalKiSim.g:4472:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKiSim.g:4473:2: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKiSim.g:4474:2: iv_ruleAnyValue= ruleAnyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnyValue=ruleAnyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyValue"


    // $ANTLR start "ruleAnyValue"
    // InternalKiSim.g:4481:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4484:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKiSim.g:4485:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKiSim.g:4485:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt80=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt80=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt80=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt80=3;
                }
                break;
            case RULE_STRING:
                {
                alt80=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalKiSim.g:4486:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:4499:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiSim.g:4512:2: this_BoolValue_2= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getBoolValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_2=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKiSim.g:4525:2: this_StringValue_3= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getStringValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_3; 
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
    // $ANTLR end "ruleAnyValue"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKiSim.g:4554:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKiSim.g:4555:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKiSim.g:4556:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:4563:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4566:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKiSim.g:4567:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKiSim.g:4567:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKiSim.g:4568:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKiSim.g:4568:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKiSim.g:4569:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKiSim.g:4595:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKiSim.g:4596:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKiSim.g:4597:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:4604:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4607:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiSim.g:4608:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiSim.g:4608:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiSim.g:4608:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:4612:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:4613:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:4613:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:4614:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRulePragmaTag"
    // InternalKiSim.g:4638:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKiSim.g:4639:2: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKiSim.g:4640:2: iv_rulePragmaTag= rulePragmaTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePragmaTag=rulePragmaTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePragmaTag; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalKiSim.g:4647:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4650:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiSim.g:4651:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiSim.g:4651:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiSim.g:4651:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiSim.g:4655:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:4656:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:4656:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:4657:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPragmaTagRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
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
    // $ANTLR end "rulePragmaTag"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKiSim.g:4681:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:4682:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKiSim.g:4683:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:4690:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4693:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiSim.g:4694:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiSim.g:4694:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiSim.g:4694:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:4698:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:4699:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:4699:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:4700:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:4716:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiSim.g:4717:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiSim.g:4717:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiSim.g:4718:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:4734:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==29) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalKiSim.g:4734:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiSim.g:4738:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiSim.g:4739:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiSim.g:4739:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiSim.g:4740:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalKiSim.g:4764:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:4765:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:4766:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedKeyStringValueAnnotation=ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:4773:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4776:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiSim.g:4777:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiSim.g:4777:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKiSim.g:4777:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:4781:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:4782:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:4782:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:4783:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:4799:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKiSim.g:4800:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKiSim.g:4800:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalKiSim.g:4801:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_values_2_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:4817:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==29) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalKiSim.g:4817:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiSim.g:4821:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKiSim.g:4822:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKiSim.g:4822:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKiSim.g:4823:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_values_4_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
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
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleStringPragma"
    // InternalKiSim.g:4847:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKiSim.g:4848:2: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKiSim.g:4849:2: iv_ruleStringPragma= ruleStringPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringPragma=ruleStringPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringPragma; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalKiSim.g:4856:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4859:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiSim.g:4860:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiSim.g:4860:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiSim.g:4860:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiSim.g:4864:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:4865:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:4865:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:4866:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:4882:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiSim.g:4883:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiSim.g:4883:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiSim.g:4884:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:4900:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==29) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalKiSim.g:4900:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiSim.g:4904:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiSim.g:4905:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiSim.g:4905:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiSim.g:4906:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
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
    // $ANTLR end "ruleStringPragma"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKiSim.g:4930:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:4931:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:4932:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:4939:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKiSim.g:4942:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiSim.g:4943:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiSim.g:4943:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKiSim.g:4943:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:4947:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:4948:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:4948:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:4949:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiSim.g:4969:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiSim.g:4970:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiSim.g:4970:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiSim.g:4971:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiSim.g:4991:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKiSim.g:4992:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKiSim.g:4992:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKiSim.g:4993:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_values_5_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:5009:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==29) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalKiSim.g:5009:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiSim.g:5013:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKiSim.g:5014:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiSim.g:5014:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKiSim.g:5015:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_values_7_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalKiSim.g:5039:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:5040:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:5041:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedTypedKeyStringValueAnnotation=ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5048:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKiSim.g:5051:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiSim.g:5052:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiSim.g:5052:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKiSim.g:5052:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:5056:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:5057:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:5057:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:5058:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiSim.g:5078:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiSim.g:5079:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiSim.g:5079:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiSim.g:5080:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiSim.g:5100:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKiSim.g:5101:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKiSim.g:5101:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKiSim.g:5102:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:5118:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==29) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalKiSim.g:5118:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiSim.g:5122:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKiSim.g:5123:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKiSim.g:5123:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKiSim.g:5124:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKiSim.g:5148:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:5149:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:5150:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5157:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:5160:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKiSim.g:5161:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKiSim.g:5161:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKiSim.g:5161:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:5165:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:5166:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:5166:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:5167:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:5183:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKiSim.g:5184:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKiSim.g:5184:1: (lv_values_2_0= RULE_STRING )
            // InternalKiSim.g:5185:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_2_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKiSim.g:5201:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==29) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalKiSim.g:5201:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiSim.g:5205:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKiSim.g:5206:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKiSim.g:5206:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKiSim.g:5207:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_4_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKiSim.g:5231:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:5232:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:5233:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5240:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKiSim.g:5243:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKiSim.g:5244:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKiSim.g:5244:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKiSim.g:5244:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:5248:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:5249:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:5249:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:5250:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiSim.g:5270:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiSim.g:5271:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiSim.g:5271:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiSim.g:5272:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiSim.g:5292:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKiSim.g:5293:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKiSim.g:5293:1: (lv_values_5_0= RULE_STRING )
            // InternalKiSim.g:5294:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_5_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKiSim.g:5310:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==29) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalKiSim.g:5310:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiSim.g:5314:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKiSim.g:5315:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKiSim.g:5315:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKiSim.g:5316:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_7_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKiSim.g:5342:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKiSim.g:5343:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKiSim.g:5344:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5351:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:5354:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKiSim.g:5355:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKiSim.g:5355:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt88=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt88=1;
                }
                break;
            case RULE_ID:
                {
                alt88=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalKiSim.g:5355:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:5364:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiSim.g:5375:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                          
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
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalKiSim.g:5390:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKiSim.g:5391:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKiSim.g:5392:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringAllTypes=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringAllTypes.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5399:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:5402:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKiSim.g:5403:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKiSim.g:5403:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt89=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt89=1;
                }
                break;
            case RULE_ID:
                {
                alt89=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt89=3;
                }
                break;
            case 42:
                {
                int LA89_4 = input.LA(2);

                if ( (LA89_4==RULE_FLOAT) ) {
                    alt89=5;
                }
                else if ( (LA89_4==RULE_INT) ) {
                    alt89=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt89=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt89=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalKiSim.g:5403:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:5412:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiSim.g:5423:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKiSim.g:5432:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Integer_3=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Integer_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKiSim.g:5444:5: this_Floateger_4= ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Floateger_4=ruleFloateger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Floateger_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalKiSim.g:5462:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKiSim.g:5463:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKiSim.g:5464:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5471:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:5474:28: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKiSim.g:5475:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKiSim.g:5475:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKiSim.g:5475:6: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiSim.g:5482:1: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==42) ) {
                    int LA91_2 = input.LA(2);

                    if ( (LA91_2==RULE_ID) ) {
                        alt91=1;
                    }


                }
                else if ( (LA91_0==49) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalKiSim.g:5482:2: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKiSim.g:5482:2: (kw= '.' | kw= '-' )
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==49) ) {
            	        alt90=1;
            	    }
            	    else if ( (LA90_0==42) ) {
            	        alt90=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 90, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // InternalKiSim.g:5483:2: kw= '.'
            	            {
            	            kw=(Token)match(input,49,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKiSim.g:5490:2: kw= '-'
            	            {
            	            kw=(Token)match(input,42,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            // InternalKiSim.g:5502:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==57) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalKiSim.g:5503:2: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKiSim.g:5525:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKiSim.g:5526:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKiSim.g:5527:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5534:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:5537:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKiSim.g:5538:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKiSim.g:5538:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKiSim.g:5538:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKiSim.g:5538:2: (kw= '-' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==42) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalKiSim.g:5539:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalKiSim.g:5559:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKiSim.g:5560:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKiSim.g:5561:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiSim.g:5568:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:5571:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKiSim.g:5572:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKiSim.g:5572:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKiSim.g:5572:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKiSim.g:5572:2: (kw= '-' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==42) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalKiSim.g:5573:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FLOAT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FLOAT_1, grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleSign"
    // InternalKiSim.g:5593:1: ruleSign returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5595:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalKiSim.g:5596:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalKiSim.g:5596:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==41) ) {
                alt95=1;
            }
            else if ( (LA95_0==42) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalKiSim.g:5596:2: (enumLiteral_0= '+' )
                    {
                    // InternalKiSim.g:5596:2: (enumLiteral_0= '+' )
                    // InternalKiSim.g:5596:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:5602:6: (enumLiteral_1= '-' )
                    {
                    // InternalKiSim.g:5602:6: (enumLiteral_1= '-' )
                    // InternalKiSim.g:5602:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSignAccess().getNEGATIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSignAccess().getNEGATIVEEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleSign"


    // $ANTLR start "ruleCompareOperator"
    // InternalKiSim.g:5612:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5614:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKiSim.g:5615:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKiSim.g:5615:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt96=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt96=1;
                }
                break;
            case 59:
                {
                alt96=2;
                }
                break;
            case 60:
                {
                alt96=3;
                }
                break;
            case 61:
                {
                alt96=4;
                }
                break;
            case 62:
                {
                alt96=5;
                }
                break;
            case 63:
                {
                alt96=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalKiSim.g:5615:2: (enumLiteral_0= '==' )
                    {
                    // InternalKiSim.g:5615:2: (enumLiteral_0= '==' )
                    // InternalKiSim.g:5615:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:5621:6: (enumLiteral_1= '<' )
                    {
                    // InternalKiSim.g:5621:6: (enumLiteral_1= '<' )
                    // InternalKiSim.g:5621:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiSim.g:5627:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKiSim.g:5627:6: (enumLiteral_2= '<=' )
                    // InternalKiSim.g:5627:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiSim.g:5633:6: (enumLiteral_3= '>' )
                    {
                    // InternalKiSim.g:5633:6: (enumLiteral_3= '>' )
                    // InternalKiSim.g:5633:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKiSim.g:5639:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKiSim.g:5639:6: (enumLiteral_4= '>=' )
                    // InternalKiSim.g:5639:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKiSim.g:5645:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKiSim.g:5645:6: (enumLiteral_5= '!=' )
                    // InternalKiSim.g:5645:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalKiSim.g:5655:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5657:28: ( (enumLiteral_0= 'pre' ) )
            // InternalKiSim.g:5658:1: (enumLiteral_0= 'pre' )
            {
            // InternalKiSim.g:5658:1: (enumLiteral_0= 'pre' )
            // InternalKiSim.g:5658:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseNotOperator"
    // InternalKiSim.g:5668:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5670:28: ( (enumLiteral_0= '~' ) )
            // InternalKiSim.g:5671:1: (enumLiteral_0= '~' )
            {
            // InternalKiSim.g:5671:1: (enumLiteral_0= '~' )
            // InternalKiSim.g:5671:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseNotOperator"


    // $ANTLR start "ruleBitwiseXOrOperator"
    // InternalKiSim.g:5681:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5683:28: ( (enumLiteral_0= '^' ) )
            // InternalKiSim.g:5684:1: (enumLiteral_0= '^' )
            {
            // InternalKiSim.g:5684:1: (enumLiteral_0= '^' )
            // InternalKiSim.g:5684:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseXOrOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKiSim.g:5694:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5696:28: ( (enumLiteral_0= '|' ) )
            // InternalKiSim.g:5697:1: (enumLiteral_0= '|' )
            {
            // InternalKiSim.g:5697:1: (enumLiteral_0= '|' )
            // InternalKiSim.g:5697:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalKiSim.g:5707:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5709:28: ( (enumLiteral_0= '&' ) )
            // InternalKiSim.g:5710:1: (enumLiteral_0= '&' )
            {
            // InternalKiSim.g:5710:1: (enumLiteral_0= '&' )
            // InternalKiSim.g:5710:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalKiSim.g:5720:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5722:28: ( (enumLiteral_0= '!' ) )
            // InternalKiSim.g:5723:1: (enumLiteral_0= '!' )
            {
            // InternalKiSim.g:5723:1: (enumLiteral_0= '!' )
            // InternalKiSim.g:5723:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalKiSim.g:5733:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5735:28: ( (enumLiteral_0= '+' ) )
            // InternalKiSim.g:5736:1: (enumLiteral_0= '+' )
            {
            // InternalKiSim.g:5736:1: (enumLiteral_0= '+' )
            // InternalKiSim.g:5736:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalKiSim.g:5746:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5748:28: ( (enumLiteral_0= '-' ) )
            // InternalKiSim.g:5749:1: (enumLiteral_0= '-' )
            {
            // InternalKiSim.g:5749:1: (enumLiteral_0= '-' )
            // InternalKiSim.g:5749:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalKiSim.g:5759:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5761:28: ( (enumLiteral_0= '*' ) )
            // InternalKiSim.g:5762:1: (enumLiteral_0= '*' )
            {
            // InternalKiSim.g:5762:1: (enumLiteral_0= '*' )
            // InternalKiSim.g:5762:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalKiSim.g:5772:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5774:28: ( (enumLiteral_0= '%' ) )
            // InternalKiSim.g:5775:1: (enumLiteral_0= '%' )
            {
            // InternalKiSim.g:5775:1: (enumLiteral_0= '%' )
            // InternalKiSim.g:5775:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // InternalKiSim.g:5785:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5787:28: ( (enumLiteral_0= '/' ) )
            // InternalKiSim.g:5788:1: (enumLiteral_0= '/' )
            {
            // InternalKiSim.g:5788:1: (enumLiteral_0= '/' )
            // InternalKiSim.g:5788:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // InternalKiSim.g:5798:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5800:28: ( (enumLiteral_0= 'val' ) )
            // InternalKiSim.g:5801:1: (enumLiteral_0= 'val' )
            {
            // InternalKiSim.g:5801:1: (enumLiteral_0= 'val' )
            // InternalKiSim.g:5801:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalKiSim.g:5811:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5813:28: ( (enumLiteral_0= '||' ) )
            // InternalKiSim.g:5814:1: (enumLiteral_0= '||' )
            {
            // InternalKiSim.g:5814:1: (enumLiteral_0= '||' )
            // InternalKiSim.g:5814:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalKiSim.g:5824:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5826:28: ( (enumLiteral_0= '&&' ) )
            // InternalKiSim.g:5827:1: (enumLiteral_0= '&&' )
            {
            // InternalKiSim.g:5827:1: (enumLiteral_0= '&&' )
            // InternalKiSim.g:5827:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleShiftLeftOperator"
    // InternalKiSim.g:5837:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5839:28: ( (enumLiteral_0= '<<' ) )
            // InternalKiSim.g:5840:1: (enumLiteral_0= '<<' )
            {
            // InternalKiSim.g:5840:1: (enumLiteral_0= '<<' )
            // InternalKiSim.g:5840:3: enumLiteral_0= '<<'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleShiftLeftOperator"


    // $ANTLR start "ruleShiftRightOperator"
    // InternalKiSim.g:5850:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5852:28: ( (enumLiteral_0= '>>' ) )
            // InternalKiSim.g:5853:1: (enumLiteral_0= '>>' )
            {
            // InternalKiSim.g:5853:1: (enumLiteral_0= '>>' )
            // InternalKiSim.g:5853:3: enumLiteral_0= '>>'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleShiftRightOperator"


    // $ANTLR start "ruleShiftRightUnsignedOperator"
    // InternalKiSim.g:5863:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5865:28: ( (enumLiteral_0= '>>>' ) )
            // InternalKiSim.g:5866:1: (enumLiteral_0= '>>>' )
            {
            // InternalKiSim.g:5866:1: (enumLiteral_0= '>>>' )
            // InternalKiSim.g:5866:3: enumLiteral_0= '>>>'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleShiftRightUnsignedOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalKiSim.g:5880:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:5882:28: ( (enumLiteral_0= '?' ) )
            // InternalKiSim.g:5883:1: (enumLiteral_0= '?' )
            {
            // InternalKiSim.g:5883:1: (enumLiteral_0= '?' )
            // InternalKiSim.g:5883:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleConditionalOperator"

    // $ANTLR start synpred9_InternalKiSim
    public final void synpred9_InternalKiSim_fragment() throws RecognitionException {   
        Token lv_operation_0_0=null;

        // InternalKiSim.g:388:1: ( (lv_operation_0_0= RULE_ID ) )
        // InternalKiSim.g:388:1: (lv_operation_0_0= RULE_ID )
        {
        // InternalKiSim.g:388:1: (lv_operation_0_0= RULE_ID )
        // InternalKiSim.g:389:3: lv_operation_0_0= RULE_ID
        {
        lv_operation_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalKiSim

    // $ANTLR start synpred10_InternalKiSim
    public final void synpred10_InternalKiSim_fragment() throws RecognitionException {   
        Token lv_id_2_0=null;

        // InternalKiSim.g:424:1: ( (lv_id_2_0= RULE_ID ) )
        // InternalKiSim.g:424:1: (lv_id_2_0= RULE_ID )
        {
        // InternalKiSim.g:424:1: (lv_id_2_0= RULE_ID )
        // InternalKiSim.g:425:3: lv_id_2_0= RULE_ID
        {
        lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalKiSim

    // $ANTLR start synpred27_InternalKiSim
    public final void synpred27_InternalKiSim_fragment() throws RecognitionException {   
        EObject lv_value_2_0 = null;


        // InternalKiSim.g:1079:6: ( ( (lv_value_2_0= ruleSignedInt ) ) )
        // InternalKiSim.g:1079:6: ( (lv_value_2_0= ruleSignedInt ) )
        {
        // InternalKiSim.g:1079:6: ( (lv_value_2_0= ruleSignedInt ) )
        // InternalKiSim.g:1080:1: (lv_value_2_0= ruleSignedInt )
        {
        // InternalKiSim.g:1080:1: (lv_value_2_0= ruleSignedInt )
        // InternalKiSim.g:1081:3: lv_value_2_0= ruleSignedInt
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedIntParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_value_2_0=ruleSignedInt();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalKiSim

    // $ANTLR start synpred28_InternalKiSim
    public final void synpred28_InternalKiSim_fragment() throws RecognitionException {   
        EObject lv_value_3_0 = null;


        // InternalKiSim.g:1098:6: ( ( (lv_value_3_0= ruleSignedFloat ) ) )
        // InternalKiSim.g:1098:6: ( (lv_value_3_0= ruleSignedFloat ) )
        {
        // InternalKiSim.g:1098:6: ( (lv_value_3_0= ruleSignedFloat ) )
        // InternalKiSim.g:1099:1: (lv_value_3_0= ruleSignedFloat )
        {
        // InternalKiSim.g:1099:1: (lv_value_3_0= ruleSignedFloat )
        // InternalKiSim.g:1100:3: lv_value_3_0= ruleSignedFloat
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedFloatParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_value_3_0=ruleSignedFloat();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalKiSim

    // $ANTLR start synpred32_InternalKiSim
    public final void synpred32_InternalKiSim_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKiSim.g:1359:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKiSim.g:1359:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalKiSim

    // $ANTLR start synpred46_InternalKiSim
    public final void synpred46_InternalKiSim_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKiSim.g:2038:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKiSim.g:2038:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalKiSim

    // $ANTLR start synpred66_InternalKiSim
    public final void synpred66_InternalKiSim_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKiSim.g:3153:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKiSim.g:3153:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKiSim.g:3153:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        // InternalKiSim.g:3153:3: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        {
        // InternalKiSim.g:3153:3: ()
        // InternalKiSim.g:3154:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalKiSim.g:3162:2: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKiSim.g:3163:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKiSim.g:3163:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKiSim.g:3164:3: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_44);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiSim.g:3180:2: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKiSim.g:3181:1: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKiSim.g:3181:1: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKiSim.g:3182:3: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_36);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiSim.g:3198:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKiSim.g:3199:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKiSim.g:3199:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKiSim.g:3200:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_45);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_36); if (state.failed) return ;
        // InternalKiSim.g:3220:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        // InternalKiSim.g:3221:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        {
        // InternalKiSim.g:3221:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        // InternalKiSim.g:3222:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalKiSim

    // $ANTLR start synpred78_InternalKiSim
    public final void synpred78_InternalKiSim_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKiSim.g:3456:6: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKiSim.g:3456:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKiSim.g:3456:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKiSim.g:3456:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_36); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_46);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred78_InternalKiSim

    // $ANTLR start synpred93_InternalKiSim
    public final void synpred93_InternalKiSim_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKiSim.g:4391:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKiSim.g:4391:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_InternalKiSim

    // $ANTLR start synpred94_InternalKiSim
    public final void synpred94_InternalKiSim_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKiSim.g:4404:2: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKiSim.g:4404:2: this_ValuedExpression_1= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_1=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_InternalKiSim

    // Delegated rules

    public final boolean synpred32_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\3\uffff\1\13\2\uffff\4\13\3\uffff\2\13\1\uffff\1\13";
    static final String dfa_3s = "\1\22\1\4\1\uffff\1\4\2\5\4\4\1\5\2\uffff\2\4\1\37\1\4";
    static final String dfa_4s = "\1\34\1\52\1\uffff\1\36\2\6\4\35\1\5\2\uffff\2\35\1\37\1\36";
    static final String dfa_5s = "\2\uffff\1\3\10\uffff\1\1\1\2\4\uffff";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\11\uffff\1\1",
            "\1\3\1\6\1\7\1\uffff\1\10\1\11\10\uffff\1\2\26\uffff\1\4\1\5",
            "",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14\1\12",
            "\1\16\1\15",
            "\1\16\1\15",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14",
            "\1\17",
            "",
            "",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14",
            "\1\20",
            "\1\13\14\uffff\1\13\1\uffff\3\13\3\uffff\1\13\3\uffff\1\14\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "923:3: ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\4\16\0\3\uffff";
    static final String dfa_10s = "\1\102\16\0\3\uffff";
    static final String dfa_11s = "\17\uffff\1\1\1\uffff\1\2";
    static final String dfa_12s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\3\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\1\2\1\3\1\16\1\7\1\4\10\uffff\1\5\27\uffff\1\1\3\uffff\1\6\4\uffff\1\14\1\15\1\13\1\17\11\uffff\1\10\1\17\1\11",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1358:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_9 = input.LA(1);

                         
                        int index28_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_10 = input.LA(1);

                         
                        int index28_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA28_11 = input.LA(1);

                         
                        int index28_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA28_12 = input.LA(1);

                         
                        int index28_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA28_13 = input.LA(1);

                         
                        int index28_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA28_14 = input.LA(1);

                         
                        int index28_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKiSim()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index28_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\4\5\uffff\11\0\2\uffff";
    static final String dfa_15s = "\1\102\5\uffff\11\0\2\uffff";
    static final String dfa_16s = "\1\uffff\1\1\15\uffff\1\2\1\uffff";
    static final String dfa_17s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_18s = {
            "\1\12\2\1\1\16\1\7\1\1\10\uffff\1\1\27\uffff\1\1\3\uffff\1\6\4\uffff\1\14\1\15\1\13\1\17\11\uffff\1\10\1\17\1\11",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2037:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_11 = input.LA(1);

                         
                        int index42_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_12 = input.LA(1);

                         
                        int index42_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_13 = input.LA(1);

                         
                        int index42_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_14 = input.LA(1);

                         
                        int index42_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index42_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\20\uffff";
    static final String dfa_20s = "\1\4\15\0\2\uffff";
    static final String dfa_21s = "\1\102\15\0\2\uffff";
    static final String dfa_22s = "\16\uffff\1\1\1\2";
    static final String dfa_23s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff}>";
    static final String[] dfa_24s = {
            "\1\11\1\1\1\2\1\15\1\6\1\3\10\uffff\1\4\33\uffff\1\5\4\uffff\1\13\1\14\1\12\12\uffff\1\7\1\uffff\1\10",
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
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "3153:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_13 = input.LA(1);

                         
                        int index62_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index62_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\13\uffff";
    static final String dfa_26s = "\3\uffff\1\2\5\uffff\1\2\1\uffff";
    static final String dfa_27s = "\1\4\2\uffff\1\23\5\uffff\1\23\1\uffff";
    static final String dfa_28s = "\1\102\2\uffff\1\103\5\uffff\1\103\1\uffff";
    static final String dfa_29s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\7\1\10\1\uffff\1\4";
    static final String dfa_30s = "\13\uffff}>";
    static final String[] dfa_31s = {
            "\1\3\2\uffff\1\10\1\1\45\uffff\1\4\4\uffff\1\6\1\7\1\5\12\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "\1\2\10\uffff\22\2\1\12\1\2\1\11\1\2\1\12\7\uffff\6\2\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\2\10\uffff\22\2\1\12\1\2\1\11\1\2\1\12\7\uffff\6\2\3\uffff\1\2",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3272:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )";
        }
    }
    static final String dfa_32s = "\17\uffff";
    static final String dfa_33s = "\1\4\4\uffff\1\0\11\uffff";
    static final String dfa_34s = "\1\102\4\uffff\1\0\11\uffff";
    static final String dfa_35s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\7\uffff\1\5";
    static final String dfa_36s = "\5\uffff\1\0\11\uffff}>";
    static final String[] dfa_37s = {
            "\1\6\1\1\1\2\2\6\1\3\10\uffff\1\4\33\uffff\1\5\4\uffff\3\6\12\uffff\1\6\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "\1\uffff",
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

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "3404:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_5 = input.LA(1);

                         
                        int index64_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiSim()) ) {s = 14;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index64_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_38s = "\23\uffff";
    static final String dfa_39s = "\1\4\16\0\4\uffff";
    static final String dfa_40s = "\1\102\16\0\4\uffff";
    static final String dfa_41s = "\17\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_42s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\4\uffff}>";
    static final String[] dfa_43s = {
            "\1\12\1\2\1\3\1\16\1\7\1\4\10\uffff\1\5\27\uffff\1\1\3\uffff\1\6\4\uffff\1\14\1\15\1\13\1\17\1\21\10\uffff\1\10\1\17\1\11",
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
            ""
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "4390:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
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
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_3 = input.LA(1);

                         
                        int index79_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalKiSim()) ) {s = 15;}

                        else if ( (synpred94_InternalKiSim()) ) {s = 18;}

                         
                        input.seek(index79_14);
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
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000320012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000320002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003A0010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000023A0010L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000050040000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010040000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000060000000370L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00784600000403F0L,0x0000000000000007L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFC00000000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00384600000403F0L,0x0000000000000005L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000005L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000040000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004400000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00784620000403F0L,0x0000000000000007L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800020000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00F84600000403F0L,0x0000000000000007L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000020080000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000040000000370L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0202040000000002L});
    }


}