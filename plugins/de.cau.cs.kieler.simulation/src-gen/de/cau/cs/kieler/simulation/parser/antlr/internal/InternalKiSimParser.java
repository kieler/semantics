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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_HOSTCODE", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configure'", "'{'", "'}'", "'initialization'", "'execution'", "'model'", "'compiler'", "'simulation'", "'process'", "'template'", "'wrapper'", "':'", "','", "'||'", "'&&'", "'|'", "'&'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", "'<'", "'()'", "'>'", "'!'", "'@'", "'.'", "'#'", "'write'", "'read'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'val'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
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
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=5;
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

                if ( (LA2_0==16) ) {
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

            if ( (LA3_0==19) ) {
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

            if ( (LA4_0==20) ) {
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
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_9); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInitializationAccess().getInitializationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return current;
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

                if ( ((LA7_0>=49 && LA7_0<=50)) ) {
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExecutionAccess().getExecutionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return current;
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

                if ( ((LA8_0>=49 && LA8_0<=50)) ) {
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:383:1: ruleAction returns [EObject current=null] : ( ( (lv_operation_0_0= ruleActionOperation ) ) ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_handler_1_0=null;
        Token lv_id_2_0=null;
        Enumerator lv_operation_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:386:28: ( ( ( (lv_operation_0_0= ruleActionOperation ) ) ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) ) ) )
            // InternalKiSim.g:387:1: ( ( (lv_operation_0_0= ruleActionOperation ) ) ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) ) )
            {
            // InternalKiSim.g:387:1: ( ( (lv_operation_0_0= ruleActionOperation ) ) ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) ) )
            // InternalKiSim.g:387:2: ( (lv_operation_0_0= ruleActionOperation ) ) ( (lv_handler_1_0= RULE_ID ) ) ( (lv_id_2_0= RULE_ID ) )
            {
            // InternalKiSim.g:387:2: ( (lv_operation_0_0= ruleActionOperation ) )
            // InternalKiSim.g:388:1: (lv_operation_0_0= ruleActionOperation )
            {
            // InternalKiSim.g:388:1: (lv_operation_0_0= ruleActionOperation )
            // InternalKiSim.g:389:3: lv_operation_0_0= ruleActionOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionAccess().getOperationActionOperationEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_operation_0_0=ruleActionOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActionRule());
              	        }
                     		set(
                     			current, 
                     			"operation",
                      		lv_operation_0_0, 
                      		"de.cau.cs.kieler.simulation.KiSim.ActionOperation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:405:2: ( (lv_handler_1_0= RULE_ID ) )
            // InternalKiSim.g:406:1: (lv_handler_1_0= RULE_ID )
            {
            // InternalKiSim.g:406:1: (lv_handler_1_0= RULE_ID )
            // InternalKiSim.g:407:3: lv_handler_1_0= RULE_ID
            {
            lv_handler_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
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

            // InternalKiSim.g:423:2: ( (lv_id_2_0= RULE_ID ) )
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
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelCompilerAccess().getModelKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelCompilerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiSim.g:494:1: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiSim.g:495:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiSim.g:495:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiSim.g:496:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelCompilerAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
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
            	    break loop9;
                }
            } while (true);

            // InternalKiSim.g:512:3: ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiSim.g:513:1: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    {
                    // InternalKiSim.g:513:1: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    // InternalKiSim.g:514:3: lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelCompilerAccess().getSimulationProcessorSimulationTemplateProcessorParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
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

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimulationCompilerAccess().getSimulationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimulationCompilerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiSim.g:585:1: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt12=1;
                    }
                    break;
                case 26:
                    {
                    alt12=3;
                    }
                    break;
                case 23:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
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
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNormalTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNormalTemplateProcessorAccess().getTemplateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimulationTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimulationTemplateProcessorAccess().getSimulationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSimulationTemplateProcessorAccess().getTemplateKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWrapperCodeTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWrapperCodeTemplateProcessorAccess().getWrapperKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWrapperCodeTemplateProcessorAccess().getTemplateKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:883:1: ruleAttributeMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) ) | (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ ) | ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' ) ) ) ;
    public final EObject ruleAttributeMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_value_2_0 = null;

        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;

        EObject lv_attributes_9_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:886:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) ) | (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ ) | ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' ) ) ) )
            // InternalKiSim.g:887:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) ) | (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ ) | ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' ) ) )
            {
            // InternalKiSim.g:887:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) ) | (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ ) | ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' ) ) )
            // InternalKiSim.g:887:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) ) | (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ ) | ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' ) )
            {
            // InternalKiSim.g:887:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKiSim.g:888:1: (lv_name_0_0= RULE_ID )
            {
            // InternalKiSim.g:888:1: (lv_name_0_0= RULE_ID )
            // InternalKiSim.g:889:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            // InternalKiSim.g:905:2: ( (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) ) | (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ ) | ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' ) )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalKiSim.g:905:3: (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) )
                    {
                    // InternalKiSim.g:905:3: (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) )
                    // InternalKiSim.g:905:5: otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) )
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAttributeMappingAccess().getColonKeyword_1_0_0());
                          
                    }
                    // InternalKiSim.g:909:1: ( (lv_value_2_0= ruleLiteral ) )
                    // InternalKiSim.g:910:1: (lv_value_2_0= ruleLiteral )
                    {
                    // InternalKiSim.g:910:1: (lv_value_2_0= ruleLiteral )
                    // InternalKiSim.g:911:3: lv_value_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getValueLiteralParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:928:6: (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ )
                    {
                    // InternalKiSim.g:928:6: (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ )
                    // InternalKiSim.g:928:8: otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAttributeMappingAccess().getColonKeyword_1_1_0());
                          
                    }
                    // InternalKiSim.g:932:1: ( (lv_values_4_0= ruleLiteral ) )
                    // InternalKiSim.g:933:1: (lv_values_4_0= ruleLiteral )
                    {
                    // InternalKiSim.g:933:1: (lv_values_4_0= ruleLiteral )
                    // InternalKiSim.g:934:3: lv_values_4_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getValuesLiteralParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_values_4_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_4_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiSim.g:950:2: (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==28) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalKiSim.g:950:4: otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getAttributeMappingAccess().getCommaKeyword_1_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:954:1: ( (lv_values_6_0= ruleLiteral ) )
                    	    // InternalKiSim.g:955:1: (lv_values_6_0= ruleLiteral )
                    	    {
                    	    // InternalKiSim.g:955:1: (lv_values_6_0= ruleLiteral )
                    	    // InternalKiSim.g:956:3: lv_values_6_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getValuesLiteralParserRuleCall_1_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_20);
                    	    lv_values_6_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_6_0, 
                    	              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalKiSim.g:973:6: ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' )
                    {
                    // InternalKiSim.g:973:6: ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' )
                    // InternalKiSim.g:973:7: (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}'
                    {
                    // InternalKiSim.g:973:7: (otherlv_7= ':' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalKiSim.g:973:9: otherlv_7= ':'
                            {
                            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getAttributeMappingAccess().getColonKeyword_1_2_0());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAttributeMappingAccess().getLeftCurlyBracketKeyword_1_2_1());
                          
                    }
                    // InternalKiSim.g:981:1: ( (lv_attributes_9_0= ruleAttributeMapping ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalKiSim.g:982:1: (lv_attributes_9_0= ruleAttributeMapping )
                    	    {
                    	    // InternalKiSim.g:982:1: (lv_attributes_9_0= ruleAttributeMapping )
                    	    // InternalKiSim.g:983:3: lv_attributes_9_0= ruleAttributeMapping
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getAttributesAttributeMappingParserRuleCall_1_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_9);
                    	    lv_attributes_9_0=ruleAttributeMapping();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_9_0, 
                    	              		"de.cau.cs.kieler.prom.KiBuild.AttributeMapping");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAttributeMappingAccess().getRightCurlyBracketKeyword_1_2_3());
                          
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
    // InternalKiSim.g:1011:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalKiSim.g:1012:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalKiSim.g:1013:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalKiSim.g:1020:1: ruleLiteral returns [EObject current=null] : ( ( (lv_value_0_0= ruleTextValue ) ) | ( (lv_value_1_0= ruleSignedInt ) ) | ( (lv_value_2_0= ruleSignedFloat ) ) | ( (lv_value_3_0= ruleAnyValue ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1023:28: ( ( ( (lv_value_0_0= ruleTextValue ) ) | ( (lv_value_1_0= ruleSignedInt ) ) | ( (lv_value_2_0= ruleSignedFloat ) ) | ( (lv_value_3_0= ruleAnyValue ) ) ) )
            // InternalKiSim.g:1024:1: ( ( (lv_value_0_0= ruleTextValue ) ) | ( (lv_value_1_0= ruleSignedInt ) ) | ( (lv_value_2_0= ruleSignedFloat ) ) | ( (lv_value_3_0= ruleAnyValue ) ) )
            {
            // InternalKiSim.g:1024:1: ( ( (lv_value_0_0= ruleTextValue ) ) | ( (lv_value_1_0= ruleSignedInt ) ) | ( (lv_value_2_0= ruleSignedFloat ) ) | ( (lv_value_3_0= ruleAnyValue ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==RULE_FLOAT) ) {
                    alt20=3;
                }
                else if ( (LA20_2==RULE_INT) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==RULE_INT) ) {
                    alt20=2;
                }
                else if ( (LA20_3==RULE_FLOAT) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA20_4 = input.LA(2);

                if ( (synpred23_InternalKiSim()) ) {
                    alt20=2;
                }
                else if ( (true) ) {
                    alt20=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA20_5 = input.LA(2);

                if ( (synpred24_InternalKiSim()) ) {
                    alt20=3;
                }
                else if ( (true) ) {
                    alt20=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case RULE_STRING:
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
                    // InternalKiSim.g:1024:2: ( (lv_value_0_0= ruleTextValue ) )
                    {
                    // InternalKiSim.g:1024:2: ( (lv_value_0_0= ruleTextValue ) )
                    // InternalKiSim.g:1025:1: (lv_value_0_0= ruleTextValue )
                    {
                    // InternalKiSim.g:1025:1: (lv_value_0_0= ruleTextValue )
                    // InternalKiSim.g:1026:3: lv_value_0_0= ruleTextValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueTextValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:1043:6: ( (lv_value_1_0= ruleSignedInt ) )
                    {
                    // InternalKiSim.g:1043:6: ( (lv_value_1_0= ruleSignedInt ) )
                    // InternalKiSim.g:1044:1: (lv_value_1_0= ruleSignedInt )
                    {
                    // InternalKiSim.g:1044:1: (lv_value_1_0= ruleSignedInt )
                    // InternalKiSim.g:1045:3: lv_value_1_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedIntParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_1_0=ruleSignedInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiSim.g:1062:6: ( (lv_value_2_0= ruleSignedFloat ) )
                    {
                    // InternalKiSim.g:1062:6: ( (lv_value_2_0= ruleSignedFloat ) )
                    // InternalKiSim.g:1063:1: (lv_value_2_0= ruleSignedFloat )
                    {
                    // InternalKiSim.g:1063:1: (lv_value_2_0= ruleSignedFloat )
                    // InternalKiSim.g:1064:3: lv_value_2_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedFloatParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_2_0=ruleSignedFloat();

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
                              		"de.cau.cs.kieler.prom.KiBuild.SignedFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKiSim.g:1081:6: ( (lv_value_3_0= ruleAnyValue ) )
                    {
                    // InternalKiSim.g:1081:6: ( (lv_value_3_0= ruleAnyValue ) )
                    // InternalKiSim.g:1082:1: (lv_value_3_0= ruleAnyValue )
                    {
                    // InternalKiSim.g:1082:1: (lv_value_3_0= ruleAnyValue )
                    // InternalKiSim.g:1083:3: lv_value_3_0= ruleAnyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueAnyValueParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleAnyValue();

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


    // $ANTLR start "entryRuleSignedFloat"
    // InternalKiSim.g:1107:1: entryRuleSignedFloat returns [EObject current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final EObject entryRuleSignedFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedFloat = null;


        try {
            // InternalKiSim.g:1108:2: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // InternalKiSim.g:1109:2: iv_ruleSignedFloat= ruleSignedFloat EOF
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
    // InternalKiSim.g:1116:1: ruleSignedFloat returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleSignedFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1119:28: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // InternalKiSim.g:1120:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // InternalKiSim.g:1120:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            // InternalKiSim.g:1120:2: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // InternalKiSim.g:1120:2: ( (lv_sign_0_0= ruleSign ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=33 && LA21_0<=34)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKiSim.g:1121:1: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiSim.g:1121:1: (lv_sign_0_0= ruleSign )
                    // InternalKiSim.g:1122:3: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignedFloatAccess().getSignSignEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKiSim.g:1138:3: ( (lv_value_1_0= RULE_FLOAT ) )
            // InternalKiSim.g:1139:1: (lv_value_1_0= RULE_FLOAT )
            {
            // InternalKiSim.g:1139:1: (lv_value_1_0= RULE_FLOAT )
            // InternalKiSim.g:1140:3: lv_value_1_0= RULE_FLOAT
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
    // InternalKiSim.g:1164:1: entryRuleSignedInt returns [EObject current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final EObject entryRuleSignedInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInt = null;


        try {
            // InternalKiSim.g:1165:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalKiSim.g:1166:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalKiSim.g:1173:1: ruleSignedInt returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSignedInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1176:28: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalKiSim.g:1177:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalKiSim.g:1177:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // InternalKiSim.g:1177:2: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalKiSim.g:1177:2: ( (lv_sign_0_0= ruleSign ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=34)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKiSim.g:1178:1: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiSim.g:1178:1: (lv_sign_0_0= ruleSign )
                    // InternalKiSim.g:1179:3: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignedIntAccess().getSignSignEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
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

            // InternalKiSim.g:1195:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalKiSim.g:1196:1: (lv_value_1_0= RULE_INT )
            {
            // InternalKiSim.g:1196:1: (lv_value_1_0= RULE_INT )
            // InternalKiSim.g:1197:3: lv_value_1_0= RULE_INT
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
    // InternalKiSim.g:1221:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalKiSim.g:1222:2: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalKiSim.g:1223:2: iv_ruleTextValue= ruleTextValue EOF
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
    // InternalKiSim.g:1230:1: ruleTextValue returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:1233:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalKiSim.g:1234:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalKiSim.g:1234:1: ( (lv_value_0_0= RULE_ID ) )
            // InternalKiSim.g:1235:1: (lv_value_0_0= RULE_ID )
            {
            // InternalKiSim.g:1235:1: (lv_value_0_0= RULE_ID )
            // InternalKiSim.g:1236:3: lv_value_0_0= RULE_ID
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
    // InternalKiSim.g:1262:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKiSim.g:1263:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalKiSim.g:1264:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKiSim.g:1271:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1274:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalKiSim.g:1275:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalKiSim.g:1275:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalKiSim.g:1276:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
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
                    // InternalKiSim.g:1289:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
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
    // InternalKiSim.g:1308:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKiSim.g:1309:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKiSim.g:1310:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalKiSim.g:1317:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1320:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKiSim.g:1322:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalKiSim.g:1341:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKiSim.g:1342:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKiSim.g:1343:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalKiSim.g:1350:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1353:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKiSim.g:1354:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKiSim.g:1354:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKiSim.g:1355:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_23);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1366:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKiSim.g:1366:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKiSim.g:1366:2: ()
                    // InternalKiSim.g:1367:2: 
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

                    // InternalKiSim.g:1375:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKiSim.g:1375:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKiSim.g:1375:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKiSim.g:1376:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKiSim.g:1376:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKiSim.g:1377:3: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKiSim.g:1393:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKiSim.g:1394:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKiSim.g:1394:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKiSim.g:1395:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
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

                    // InternalKiSim.g:1411:3: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==29) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalKiSim.g:1411:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1415:1: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKiSim.g:1416:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKiSim.g:1416:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKiSim.g:1417:3: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
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
                    	    break loop24;
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
    // InternalKiSim.g:1441:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKiSim.g:1442:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKiSim.g:1443:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalKiSim.g:1450:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1453:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKiSim.g:1454:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKiSim.g:1454:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKiSim.g:1455:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1466:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKiSim.g:1466:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKiSim.g:1466:2: ()
                    // InternalKiSim.g:1467:2: 
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

                    // InternalKiSim.g:1475:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKiSim.g:1475:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKiSim.g:1475:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKiSim.g:1476:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKiSim.g:1476:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKiSim.g:1477:3: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKiSim.g:1493:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKiSim.g:1494:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKiSim.g:1494:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKiSim.g:1495:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiSim.g:1511:3: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==30) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalKiSim.g:1511:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1515:1: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKiSim.g:1516:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKiSim.g:1516:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKiSim.g:1517:3: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
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
                    	    break loop26;
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
    // InternalKiSim.g:1541:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKiSim.g:1542:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKiSim.g:1543:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalKiSim.g:1550:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1553:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKiSim.g:1554:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKiSim.g:1554:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKiSim.g:1555:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1566:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKiSim.g:1566:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKiSim.g:1566:2: ()
                    // InternalKiSim.g:1567:2: 
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

                    // InternalKiSim.g:1575:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKiSim.g:1575:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKiSim.g:1575:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKiSim.g:1576:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKiSim.g:1576:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKiSim.g:1577:3: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKiSim.g:1593:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKiSim.g:1594:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKiSim.g:1594:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKiSim.g:1595:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_subExpressions_3_0=ruleBitwiseAndExpression();

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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiSim.g:1611:3: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==31) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalKiSim.g:1611:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1615:1: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKiSim.g:1616:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKiSim.g:1616:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKiSim.g:1617:3: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_subExpressions_5_0=ruleBitwiseAndExpression();

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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
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


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKiSim.g:1641:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKiSim.g:1642:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKiSim.g:1643:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalKiSim.g:1650:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1653:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKiSim.g:1654:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKiSim.g:1654:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKiSim.g:1655:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1666:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKiSim.g:1666:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKiSim.g:1666:2: ()
                    // InternalKiSim.g:1667:2: 
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

                    // InternalKiSim.g:1675:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKiSim.g:1675:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKiSim.g:1675:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKiSim.g:1676:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKiSim.g:1676:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKiSim.g:1677:3: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKiSim.g:1693:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKiSim.g:1694:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKiSim.g:1694:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKiSim.g:1695:3: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

                    // InternalKiSim.g:1711:3: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==32) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalKiSim.g:1711:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:1715:1: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKiSim.g:1716:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKiSim.g:1716:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKiSim.g:1717:3: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
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
                    	    break loop30;
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
    // InternalKiSim.g:1741:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKiSim.g:1742:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKiSim.g:1743:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalKiSim.g:1750:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1753:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKiSim.g:1754:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKiSim.g:1754:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKiSim.g:1755:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:1766:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42||LA32_0==44||(LA32_0>=51 && LA32_0<=54)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKiSim.g:1766:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKiSim.g:1766:2: ()
                    // InternalKiSim.g:1767:2: 
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

                    // InternalKiSim.g:1775:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKiSim.g:1776:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKiSim.g:1776:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKiSim.g:1777:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKiSim.g:1793:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKiSim.g:1794:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKiSim.g:1794:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKiSim.g:1795:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
    // InternalKiSim.g:1819:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKiSim.g:1820:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKiSim.g:1821:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalKiSim.g:1828:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1831:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKiSim.g:1832:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKiSim.g:1832:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalKiSim.g:1833:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalKiSim.g:1846:2: this_NotExpression_1= ruleNotExpression
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


    // $ANTLR start "entryRuleNotExpression"
    // InternalKiSim.g:1865:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKiSim.g:1866:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKiSim.g:1867:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalKiSim.g:1874:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1877:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKiSim.g:1878:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKiSim.g:1878:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID||(LA34_0>=RULE_HOSTCODE && LA34_0<=RULE_BOOLEAN)||LA34_0==38||LA34_0==42||(LA34_0>=55 && LA34_0<=56)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalKiSim.g:1878:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKiSim.g:1878:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKiSim.g:1878:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKiSim.g:1878:3: ()
                    // InternalKiSim.g:1879:2: 
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

                    // InternalKiSim.g:1887:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKiSim.g:1888:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKiSim.g:1888:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalKiSim.g:1889:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKiSim.g:1905:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKiSim.g:1906:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKiSim.g:1906:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKiSim.g:1907:3: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalKiSim.g:1925:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalKiSim.g:1944:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKiSim.g:1945:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKiSim.g:1946:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalKiSim.g:1953:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1956:28: (this_AddExpression_0= ruleAddExpression )
            // InternalKiSim.g:1958:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
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


    // $ANTLR start "entryRuleAddExpression"
    // InternalKiSim.g:1977:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKiSim.g:1978:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKiSim.g:1979:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalKiSim.g:1986:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:1989:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) )
            // InternalKiSim.g:1990:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            {
            // InternalKiSim.g:1990:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            // InternalKiSim.g:1991:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2002:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKiSim.g:2002:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalKiSim.g:2002:2: ()
                    // InternalKiSim.g:2003:2: 
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

                    // InternalKiSim.g:2011:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalKiSim.g:2011:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalKiSim.g:2011:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKiSim.g:2012:1: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKiSim.g:2012:1: (lv_operator_2_0= ruleAddOperator )
                    // InternalKiSim.g:2013:3: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalKiSim.g:2029:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalKiSim.g:2030:1: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalKiSim.g:2030:1: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalKiSim.g:2031:3: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

                    // InternalKiSim.g:2047:3: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalKiSim.g:2047:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2051:1: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalKiSim.g:2052:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalKiSim.g:2052:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalKiSim.g:2053:3: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKiSim.g:2077:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKiSim.g:2078:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKiSim.g:2079:2: iv_ruleSubExpression= ruleSubExpression EOF
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
    // InternalKiSim.g:2086:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2089:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) )
            // InternalKiSim.g:2090:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            {
            // InternalKiSim.g:2090:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            // InternalKiSim.g:2091:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_31);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2102:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKiSim.g:2102:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    {
                    // InternalKiSim.g:2102:2: ()
                    // InternalKiSim.g:2103:2: 
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

                    // InternalKiSim.g:2111:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )
                    // InternalKiSim.g:2111:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    {
                    // InternalKiSim.g:2111:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalKiSim.g:2112:1: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalKiSim.g:2112:1: (lv_operator_2_0= ruleSubOperator )
                    // InternalKiSim.g:2113:3: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalKiSim.g:2129:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    // InternalKiSim.g:2130:1: (lv_subExpressions_3_0= ruleMultExpression )
                    {
                    // InternalKiSim.g:2130:1: (lv_subExpressions_3_0= ruleMultExpression )
                    // InternalKiSim.g:2131:3: lv_subExpressions_3_0= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
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

                    // InternalKiSim.g:2147:3: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==34) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalKiSim.g:2147:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2151:1: ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    // InternalKiSim.g:2152:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    {
                    	    // InternalKiSim.g:2152:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    // InternalKiSim.g:2153:3: lv_subExpressions_5_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_31);
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalKiSim.g:2177:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalKiSim.g:2178:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalKiSim.g:2179:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalKiSim.g:2186:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2189:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) )
            // InternalKiSim.g:2190:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            {
            // InternalKiSim.g:2190:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            // InternalKiSim.g:2191:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_32);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2202:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKiSim.g:2202:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    {
                    // InternalKiSim.g:2202:2: ()
                    // InternalKiSim.g:2203:2: 
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

                    // InternalKiSim.g:2211:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )
                    // InternalKiSim.g:2211:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    {
                    // InternalKiSim.g:2211:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKiSim.g:2212:1: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKiSim.g:2212:1: (lv_operator_2_0= ruleMultOperator )
                    // InternalKiSim.g:2213:3: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalKiSim.g:2229:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    // InternalKiSim.g:2230:1: (lv_subExpressions_3_0= ruleDivExpression )
                    {
                    // InternalKiSim.g:2230:1: (lv_subExpressions_3_0= ruleDivExpression )
                    // InternalKiSim.g:2231:3: lv_subExpressions_3_0= ruleDivExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiSim.g:2247:3: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==35) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalKiSim.g:2247:5: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2251:1: ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    // InternalKiSim.g:2252:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    {
                    	    // InternalKiSim.g:2252:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    // InternalKiSim.g:2253:3: lv_subExpressions_5_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_32);
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalKiSim.g:2277:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalKiSim.g:2278:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalKiSim.g:2279:2: iv_ruleDivExpression= ruleDivExpression EOF
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
    // InternalKiSim.g:2286:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2289:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) )
            // InternalKiSim.g:2290:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            {
            // InternalKiSim.g:2290:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            // InternalKiSim.g:2291:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_33);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2302:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKiSim.g:2302:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    {
                    // InternalKiSim.g:2302:2: ()
                    // InternalKiSim.g:2303:2: 
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

                    // InternalKiSim.g:2311:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
                    // InternalKiSim.g:2311:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // InternalKiSim.g:2311:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalKiSim.g:2312:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalKiSim.g:2312:1: (lv_operator_2_0= ruleDivOperator )
                    // InternalKiSim.g:2313:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalKiSim.g:2329:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // InternalKiSim.g:2330:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // InternalKiSim.g:2330:1: (lv_subExpressions_3_0= ruleModExpression )
                    // InternalKiSim.g:2331:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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

                    // InternalKiSim.g:2347:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==36) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalKiSim.g:2347:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2351:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    // InternalKiSim.g:2352:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    {
                    	    // InternalKiSim.g:2352:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    // InternalKiSim.g:2353:3: lv_subExpressions_5_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_33);
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
                    	    break loop41;
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
    // InternalKiSim.g:2377:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalKiSim.g:2378:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalKiSim.g:2379:2: iv_ruleModExpression= ruleModExpression EOF
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
    // InternalKiSim.g:2386:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2389:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKiSim.g:2390:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKiSim.g:2390:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKiSim.g:2391:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_34);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiSim.g:2402:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKiSim.g:2402:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKiSim.g:2402:2: ()
                    // InternalKiSim.g:2403:2: 
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

                    // InternalKiSim.g:2411:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiSim.g:2411:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiSim.g:2411:3: ( (lv_operator_2_0= ruleModOperator ) )
                    // InternalKiSim.g:2412:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // InternalKiSim.g:2412:1: (lv_operator_2_0= ruleModOperator )
                    // InternalKiSim.g:2413:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalKiSim.g:2429:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiSim.g:2430:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiSim.g:2430:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiSim.g:2431:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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

                    // InternalKiSim.g:2447:3: (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==37) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalKiSim.g:2447:5: otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2451:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKiSim.g:2452:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKiSim.g:2452:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKiSim.g:2453:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
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
                    	    break loop43;
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
    // InternalKiSim.g:2477:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKiSim.g:2478:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKiSim.g:2479:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalKiSim.g:2486:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2489:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalKiSim.g:2490:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalKiSim.g:2490:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||LA45_0==38||LA45_0==42||(LA45_0>=55 && LA45_0<=56)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalKiSim.g:2490:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKiSim.g:2490:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKiSim.g:2490:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKiSim.g:2490:3: ()
                    // InternalKiSim.g:2491:2: 
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

                    // InternalKiSim.g:2499:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKiSim.g:2500:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKiSim.g:2500:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalKiSim.g:2501:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalKiSim.g:2517:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKiSim.g:2518:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKiSim.g:2518:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKiSim.g:2519:3: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalKiSim.g:2537:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_3=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_3; 
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


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKiSim.g:2556:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKiSim.g:2557:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKiSim.g:2558:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKiSim.g:2565:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_TextExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2568:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // InternalKiSim.g:2569:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // InternalKiSim.g:2569:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt46=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt46=1;
                }
                break;
            case RULE_ID:
            case 55:
            case 56:
                {
                alt46=2;
                }
                break;
            case 38:
                {
                alt46=3;
                }
                break;
            case 42:
                {
                alt46=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalKiSim.g:2570:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalKiSim.g:2583:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalKiSim.g:2595:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKiSim.g:2595:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKiSim.g:2595:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiSim.g:2617:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCall_5=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKiSim.g:2630:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_6=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_6; 
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
    // InternalKiSim.g:2649:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKiSim.g:2650:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKiSim.g:2651:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalKiSim.g:2658:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2661:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalKiSim.g:2662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalKiSim.g:2662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt47=5;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalKiSim.g:2663:2: this_IntValue_0= ruleIntValue
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
                    // InternalKiSim.g:2676:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalKiSim.g:2689:2: this_StringValue_2= ruleStringValue
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
                    // InternalKiSim.g:2701:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalKiSim.g:2701:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalKiSim.g:2701:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKiSim.g:2723:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_6=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_6; 
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
    // InternalKiSim.g:2742:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKiSim.g:2743:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKiSim.g:2744:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalKiSim.g:2751:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalKiSim.g:2754:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalKiSim.g:2755:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalKiSim.g:2755:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=55 && LA49_0<=56)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_ID) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalKiSim.g:2755:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalKiSim.g:2755:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalKiSim.g:2755:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalKiSim.g:2755:3: ()
                    // InternalKiSim.g:2756:2: 
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

                    // InternalKiSim.g:2764:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKiSim.g:2765:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKiSim.g:2765:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKiSim.g:2766:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKiSim.g:2766:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==55) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==56) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalKiSim.g:2767:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
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
                            // InternalKiSim.g:2782:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
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

                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalKiSim.g:2804:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKiSim.g:2805:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKiSim.g:2805:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKiSim.g:2806:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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

                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:2828:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalKiSim.g:2847:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKiSim.g:2848:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKiSim.g:2849:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalKiSim.g:2856:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2859:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // InternalKiSim.g:2860:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // InternalKiSim.g:2860:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // InternalKiSim.g:2860:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // InternalKiSim.g:2860:2: ( (otherlv_0= RULE_ID ) )
            // InternalKiSim.g:2861:1: (otherlv_0= RULE_ID )
            {
            // InternalKiSim.g:2861:1: (otherlv_0= RULE_ID )
            // InternalKiSim.g:2862:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalKiSim.g:2876:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==40) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalKiSim.g:2876:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalKiSim.g:2880:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKiSim.g:2881:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKiSim.g:2881:1: (lv_indices_2_0= ruleExpression )
            	    // InternalKiSim.g:2882:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
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

            	    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKiSim.g:2910:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKiSim.g:2911:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKiSim.g:2912:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKiSim.g:2919:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_functionName_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:2922:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // InternalKiSim.g:2923:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // InternalKiSim.g:2923:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // InternalKiSim.g:2923:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // InternalKiSim.g:2927:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // InternalKiSim.g:2928:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:2928:1: (lv_functionName_1_0= ruleExtendedID )
            // InternalKiSim.g:2929:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_functionName_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:2945:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            else if ( (LA52_0==43) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // InternalKiSim.g:2945:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKiSim.g:2945:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKiSim.g:2945:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalKiSim.g:2949:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKiSim.g:2950:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKiSim.g:2950:1: (lv_parameters_3_0= ruleParameter )
                    // InternalKiSim.g:2951:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiSim.g:2967:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==28) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKiSim.g:2967:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKiSim.g:2971:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKiSim.g:2972:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKiSim.g:2972:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKiSim.g:2973:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_42);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:2994:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,43,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3());
                  
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
    // InternalKiSim.g:3010:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKiSim.g:3011:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalKiSim.g:3012:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKiSim.g:3019:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3022:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKiSim.g:3023:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKiSim.g:3023:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKiSim.g:3023:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKiSim.g:3023:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==32) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==32) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKiSim.g:3023:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKiSim.g:3023:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==45) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalKiSim.g:3024:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKiSim.g:3024:1: (lv_pureOutput_0_0= '!' )
                            // InternalKiSim.g:3025:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,45,FollowSets000.FOLLOW_44); if (state.failed) return current;
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

                    // InternalKiSim.g:3038:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKiSim.g:3039:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKiSim.g:3039:1: (lv_callByReference_1_0= '&' )
                    // InternalKiSim.g:3040:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,32,FollowSets000.FOLLOW_24); if (state.failed) return current;
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

            // InternalKiSim.g:3053:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKiSim.g:3054:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKiSim.g:3054:1: (lv_expression_2_0= ruleExpression )
            // InternalKiSim.g:3055:3: lv_expression_2_0= ruleExpression
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
    // InternalKiSim.g:3079:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKiSim.g:3080:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKiSim.g:3081:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalKiSim.g:3088:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3091:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalKiSim.g:3092:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalKiSim.g:3092:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalKiSim.g:3093:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalKiSim.g:3093:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalKiSim.g:3094:3: lv_text_0_0= RULE_HOSTCODE
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
    // InternalKiSim.g:3118:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKiSim.g:3119:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKiSim.g:3120:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalKiSim.g:3127:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3130:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKiSim.g:3131:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKiSim.g:3131:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalKiSim.g:3132:1: (lv_value_0_0= RULE_INT )
            {
            // InternalKiSim.g:3132:1: (lv_value_0_0= RULE_INT )
            // InternalKiSim.g:3133:3: lv_value_0_0= RULE_INT
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
    // InternalKiSim.g:3157:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKiSim.g:3158:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKiSim.g:3159:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalKiSim.g:3166:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3169:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKiSim.g:3170:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKiSim.g:3170:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKiSim.g:3171:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKiSim.g:3171:1: (lv_value_0_0= RULE_FLOAT )
            // InternalKiSim.g:3172:3: lv_value_0_0= RULE_FLOAT
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
    // InternalKiSim.g:3196:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKiSim.g:3197:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKiSim.g:3198:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalKiSim.g:3205:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3208:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKiSim.g:3209:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKiSim.g:3209:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKiSim.g:3210:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKiSim.g:3210:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKiSim.g:3211:3: lv_value_0_0= RULE_BOOLEAN
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
    // InternalKiSim.g:3235:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKiSim.g:3236:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKiSim.g:3237:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalKiSim.g:3244:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3247:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKiSim.g:3248:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKiSim.g:3248:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKiSim.g:3249:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalKiSim.g:3249:1: (lv_value_0_0= RULE_STRING )
            // InternalKiSim.g:3250:3: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleAnyValue"
    // InternalKiSim.g:3276:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKiSim.g:3277:2: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKiSim.g:3278:2: iv_ruleAnyValue= ruleAnyValue EOF
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
    // InternalKiSim.g:3285:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3288:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKiSim.g:3289:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKiSim.g:3289:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt55=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt55=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt55=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt55=3;
                }
                break;
            case RULE_STRING:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalKiSim.g:3290:2: this_IntValue_0= ruleIntValue
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
                    // InternalKiSim.g:3303:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalKiSim.g:3316:2: this_BoolValue_2= ruleBoolValue
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
                    // InternalKiSim.g:3329:2: this_StringValue_3= ruleStringValue
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
    // InternalKiSim.g:3354:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKiSim.g:3355:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKiSim.g:3356:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKiSim.g:3363:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:3366:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKiSim.g:3367:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKiSim.g:3367:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKiSim.g:3368:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKiSim.g:3368:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKiSim.g:3369:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalKiSim.g:3393:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKiSim.g:3394:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKiSim.g:3395:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKiSim.g:3402:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3405:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiSim.g:3406:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiSim.g:3406:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiSim.g:3406:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3410:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3411:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3411:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3412:3: lv_name_1_0= ruleExtendedID
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


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKiSim.g:3436:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:3437:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKiSim.g:3438:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKiSim.g:3445:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3448:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // InternalKiSim.g:3449:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // InternalKiSim.g:3449:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // InternalKiSim.g:3449:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3453:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3454:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3454:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3455:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_45);
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

            // InternalKiSim.g:3471:2: ( (lv_values_2_0= ruleEString ) )
            // InternalKiSim.g:3472:1: (lv_values_2_0= ruleEString )
            {
            // InternalKiSim.g:3472:1: (lv_values_2_0= ruleEString )
            // InternalKiSim.g:3473:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_values_2_0=ruleEString();

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
                      		"de.cau.cs.kieler.annotations.Annotations.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:3489:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==28) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalKiSim.g:3489:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiSim.g:3493:1: ( (lv_values_4_0= ruleEString ) )
            	    // InternalKiSim.g:3494:1: (lv_values_4_0= ruleEString )
            	    {
            	    // InternalKiSim.g:3494:1: (lv_values_4_0= ruleEString )
            	    // InternalKiSim.g:3495:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_values_4_0=ruleEString();

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
            	              		"de.cau.cs.kieler.annotations.Annotations.EString");
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKiSim.g:3519:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:3520:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:3521:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiSim.g:3528:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKiSim.g:3531:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiSim.g:3532:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiSim.g:3532:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKiSim.g:3532:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3536:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3537:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3537:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3538:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_46);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiSim.g:3558:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiSim.g:3559:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiSim.g:3559:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiSim.g:3560:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_39);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiSim.g:3580:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKiSim.g:3581:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKiSim.g:3581:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKiSim.g:3582:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_values_5_0=ruleEStringBoolean();

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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiSim.g:3598:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==28) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalKiSim.g:3598:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiSim.g:3602:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKiSim.g:3603:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKiSim.g:3603:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKiSim.g:3604:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_values_7_0=ruleEStringBoolean();

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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKiSim.g:3628:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:3629:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:3630:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiSim.g:3637:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3640:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKiSim.g:3641:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKiSim.g:3641:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKiSim.g:3641:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3645:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3646:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3646:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3647:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_48);
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

            // InternalKiSim.g:3663:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKiSim.g:3664:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKiSim.g:3664:1: (lv_values_2_0= RULE_STRING )
            // InternalKiSim.g:3665:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
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

            // InternalKiSim.g:3681:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==28) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalKiSim.g:3681:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiSim.g:3685:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKiSim.g:3686:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKiSim.g:3686:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKiSim.g:3687:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKiSim.g:3711:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiSim.g:3712:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiSim.g:3713:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiSim.g:3720:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKiSim.g:3723:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKiSim.g:3724:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKiSim.g:3724:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKiSim.g:3724:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3728:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3729:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3729:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3730:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_46);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiSim.g:3750:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiSim.g:3751:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiSim.g:3751:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiSim.g:3752:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_39);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiSim.g:3772:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKiSim.g:3773:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKiSim.g:3773:1: (lv_values_5_0= RULE_STRING )
            // InternalKiSim.g:3774:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
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

            // InternalKiSim.g:3790:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==28) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalKiSim.g:3790:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiSim.g:3794:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKiSim.g:3795:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKiSim.g:3795:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKiSim.g:3796:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // InternalKiSim.g:3820:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // InternalKiSim.g:3821:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // InternalKiSim.g:3822:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
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
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // InternalKiSim.g:3829:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3832:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalKiSim.g:3833:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalKiSim.g:3833:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalKiSim.g:3833:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3837:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3838:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3838:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3839:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
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

            // InternalKiSim.g:3855:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalKiSim.g:3856:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalKiSim.g:3856:1: (lv_value_2_0= RULE_BOOLEAN )
            // InternalKiSim.g:3857:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.BOOLEAN");
              	    
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
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // InternalKiSim.g:3881:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // InternalKiSim.g:3882:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // InternalKiSim.g:3883:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
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
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // InternalKiSim.g:3890:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3893:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalKiSim.g:3894:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalKiSim.g:3894:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // InternalKiSim.g:3894:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3898:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3899:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3899:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3900:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_50);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
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

            // InternalKiSim.g:3916:2: ( (lv_value_2_0= ruleInteger ) )
            // InternalKiSim.g:3917:1: (lv_value_2_0= ruleInteger )
            {
            // InternalKiSim.g:3917:1: (lv_value_2_0= ruleInteger )
            // InternalKiSim.g:3918:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.Integer");
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
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // InternalKiSim.g:3942:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // InternalKiSim.g:3943:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // InternalKiSim.g:3944:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
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
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // InternalKiSim.g:3951:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:3954:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // InternalKiSim.g:3955:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // InternalKiSim.g:3955:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // InternalKiSim.g:3955:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiSim.g:3959:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiSim.g:3960:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiSim.g:3960:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiSim.g:3961:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_51);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
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

            // InternalKiSim.g:3977:2: ( (lv_value_2_0= ruleFloateger ) )
            // InternalKiSim.g:3978:1: (lv_value_2_0= ruleFloateger )
            {
            // InternalKiSim.g:3978:1: (lv_value_2_0= ruleFloateger )
            // InternalKiSim.g:3979:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.Floateger");
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
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // InternalKiSim.g:4003:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKiSim.g:4004:2: (iv_ruleEString= ruleEString EOF )
            // InternalKiSim.g:4005:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKiSim.g:4012:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4015:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // InternalKiSim.g:4016:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // InternalKiSim.g:4016:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
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
                    // InternalKiSim.g:4016:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiSim.g:4025:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKiSim.g:4043:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKiSim.g:4044:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKiSim.g:4045:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKiSim.g:4052:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiSim.g:4055:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKiSim.g:4056:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKiSim.g:4056:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt61=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt61=1;
                }
                break;
            case RULE_ID:
                {
                alt61=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt61=3;
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
                    // InternalKiSim.g:4056:6: this_STRING_0= RULE_STRING
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
                    // InternalKiSim.g:4065:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiSim.g:4076:10: this_BOOLEAN_2= RULE_BOOLEAN
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


    // $ANTLR start "entryRuleExtendedID"
    // InternalKiSim.g:4091:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKiSim.g:4092:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKiSim.g:4093:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKiSim.g:4100:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4103:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalKiSim.g:4104:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalKiSim.g:4104:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalKiSim.g:4104:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiSim.g:4111:1: (kw= '.' this_ID_2= RULE_ID )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==47) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalKiSim.g:4112:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalKiSim.g:4124:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKiSim.g:4125:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_4, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // InternalKiSim.g:4145:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKiSim.g:4146:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKiSim.g:4147:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKiSim.g:4154:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4157:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKiSim.g:4158:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKiSim.g:4158:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKiSim.g:4158:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKiSim.g:4158:2: (kw= '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==34) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalKiSim.g:4159:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_22); if (state.failed) return current;
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
    // InternalKiSim.g:4179:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKiSim.g:4180:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKiSim.g:4181:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKiSim.g:4188:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKiSim.g:4191:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKiSim.g:4192:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKiSim.g:4192:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKiSim.g:4192:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKiSim.g:4192:2: (kw= '-' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==34) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKiSim.g:4193:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_21); if (state.failed) return current;
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


    // $ANTLR start "ruleActionOperation"
    // InternalKiSim.g:4213:1: ruleActionOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'write' ) | (enumLiteral_1= 'read' ) ) ;
    public final Enumerator ruleActionOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4215:28: ( ( (enumLiteral_0= 'write' ) | (enumLiteral_1= 'read' ) ) )
            // InternalKiSim.g:4216:1: ( (enumLiteral_0= 'write' ) | (enumLiteral_1= 'read' ) )
            {
            // InternalKiSim.g:4216:1: ( (enumLiteral_0= 'write' ) | (enumLiteral_1= 'read' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==49) ) {
                alt66=1;
            }
            else if ( (LA66_0==50) ) {
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
                    // InternalKiSim.g:4216:2: (enumLiteral_0= 'write' )
                    {
                    // InternalKiSim.g:4216:2: (enumLiteral_0= 'write' )
                    // InternalKiSim.g:4216:4: enumLiteral_0= 'write'
                    {
                    enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getActionOperationAccess().getWRITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getActionOperationAccess().getWRITEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:4222:6: (enumLiteral_1= 'read' )
                    {
                    // InternalKiSim.g:4222:6: (enumLiteral_1= 'read' )
                    // InternalKiSim.g:4222:8: enumLiteral_1= 'read'
                    {
                    enumLiteral_1=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getActionOperationAccess().getREADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getActionOperationAccess().getREADEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleActionOperation"


    // $ANTLR start "ruleSign"
    // InternalKiSim.g:4232:1: ruleSign returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4234:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalKiSim.g:4235:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalKiSim.g:4235:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==33) ) {
                alt67=1;
            }
            else if ( (LA67_0==34) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalKiSim.g:4235:2: (enumLiteral_0= '+' )
                    {
                    // InternalKiSim.g:4235:2: (enumLiteral_0= '+' )
                    // InternalKiSim.g:4235:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:4241:6: (enumLiteral_1= '-' )
                    {
                    // InternalKiSim.g:4241:6: (enumLiteral_1= '-' )
                    // InternalKiSim.g:4241:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4251:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKiSim.g:4253:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKiSim.g:4254:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKiSim.g:4254:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt68=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt68=1;
                }
                break;
            case 42:
                {
                alt68=2;
                }
                break;
            case 52:
                {
                alt68=3;
                }
                break;
            case 44:
                {
                alt68=4;
                }
                break;
            case 53:
                {
                alt68=5;
                }
                break;
            case 54:
                {
                alt68=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalKiSim.g:4254:2: (enumLiteral_0= '==' )
                    {
                    // InternalKiSim.g:4254:2: (enumLiteral_0= '==' )
                    // InternalKiSim.g:4254:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiSim.g:4260:6: (enumLiteral_1= '<' )
                    {
                    // InternalKiSim.g:4260:6: (enumLiteral_1= '<' )
                    // InternalKiSim.g:4260:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiSim.g:4266:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKiSim.g:4266:6: (enumLiteral_2= '<=' )
                    // InternalKiSim.g:4266:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiSim.g:4272:6: (enumLiteral_3= '>' )
                    {
                    // InternalKiSim.g:4272:6: (enumLiteral_3= '>' )
                    // InternalKiSim.g:4272:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKiSim.g:4278:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKiSim.g:4278:6: (enumLiteral_4= '>=' )
                    // InternalKiSim.g:4278:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKiSim.g:4284:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKiSim.g:4284:6: (enumLiteral_5= '!=' )
                    // InternalKiSim.g:4284:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4294:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4296:28: ( (enumLiteral_0= 'pre' ) )
            // InternalKiSim.g:4297:1: (enumLiteral_0= 'pre' )
            {
            // InternalKiSim.g:4297:1: (enumLiteral_0= 'pre' )
            // InternalKiSim.g:4297:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKiSim.g:4307:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4309:28: ( (enumLiteral_0= '|' ) )
            // InternalKiSim.g:4310:1: (enumLiteral_0= '|' )
            {
            // InternalKiSim.g:4310:1: (enumLiteral_0= '|' )
            // InternalKiSim.g:4310:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4320:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4322:28: ( (enumLiteral_0= '&' ) )
            // InternalKiSim.g:4323:1: (enumLiteral_0= '&' )
            {
            // InternalKiSim.g:4323:1: (enumLiteral_0= '&' )
            // InternalKiSim.g:4323:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4333:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4335:28: ( (enumLiteral_0= '!' ) )
            // InternalKiSim.g:4336:1: (enumLiteral_0= '!' )
            {
            // InternalKiSim.g:4336:1: (enumLiteral_0= '!' )
            // InternalKiSim.g:4336:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4346:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4348:28: ( (enumLiteral_0= '+' ) )
            // InternalKiSim.g:4349:1: (enumLiteral_0= '+' )
            {
            // InternalKiSim.g:4349:1: (enumLiteral_0= '+' )
            // InternalKiSim.g:4349:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4359:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4361:28: ( (enumLiteral_0= '-' ) )
            // InternalKiSim.g:4362:1: (enumLiteral_0= '-' )
            {
            // InternalKiSim.g:4362:1: (enumLiteral_0= '-' )
            // InternalKiSim.g:4362:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4372:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4374:28: ( (enumLiteral_0= '*' ) )
            // InternalKiSim.g:4375:1: (enumLiteral_0= '*' )
            {
            // InternalKiSim.g:4375:1: (enumLiteral_0= '*' )
            // InternalKiSim.g:4375:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4385:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4387:28: ( (enumLiteral_0= '%' ) )
            // InternalKiSim.g:4388:1: (enumLiteral_0= '%' )
            {
            // InternalKiSim.g:4388:1: (enumLiteral_0= '%' )
            // InternalKiSim.g:4388:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4398:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4400:28: ( (enumLiteral_0= '/' ) )
            // InternalKiSim.g:4401:1: (enumLiteral_0= '/' )
            {
            // InternalKiSim.g:4401:1: (enumLiteral_0= '/' )
            // InternalKiSim.g:4401:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4411:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4413:28: ( (enumLiteral_0= 'val' ) )
            // InternalKiSim.g:4414:1: (enumLiteral_0= 'val' )
            {
            // InternalKiSim.g:4414:1: (enumLiteral_0= 'val' )
            // InternalKiSim.g:4414:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4424:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4426:28: ( (enumLiteral_0= '||' ) )
            // InternalKiSim.g:4427:1: (enumLiteral_0= '||' )
            {
            // InternalKiSim.g:4427:1: (enumLiteral_0= '||' )
            // InternalKiSim.g:4427:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiSim.g:4437:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiSim.g:4439:28: ( (enumLiteral_0= '&&' ) )
            // InternalKiSim.g:4440:1: (enumLiteral_0= '&&' )
            {
            // InternalKiSim.g:4440:1: (enumLiteral_0= '&&' )
            // InternalKiSim.g:4440:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred23_InternalKiSim
    public final void synpred23_InternalKiSim_fragment() throws RecognitionException {   
        EObject lv_value_1_0 = null;


        // InternalKiSim.g:1043:6: ( ( (lv_value_1_0= ruleSignedInt ) ) )
        // InternalKiSim.g:1043:6: ( (lv_value_1_0= ruleSignedInt ) )
        {
        // InternalKiSim.g:1043:6: ( (lv_value_1_0= ruleSignedInt ) )
        // InternalKiSim.g:1044:1: (lv_value_1_0= ruleSignedInt )
        {
        // InternalKiSim.g:1044:1: (lv_value_1_0= ruleSignedInt )
        // InternalKiSim.g:1045:3: lv_value_1_0= ruleSignedInt
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedIntParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_value_1_0=ruleSignedInt();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalKiSim

    // $ANTLR start synpred24_InternalKiSim
    public final void synpred24_InternalKiSim_fragment() throws RecognitionException {   
        EObject lv_value_2_0 = null;


        // InternalKiSim.g:1062:6: ( ( (lv_value_2_0= ruleSignedFloat ) ) )
        // InternalKiSim.g:1062:6: ( (lv_value_2_0= ruleSignedFloat ) )
        {
        // InternalKiSim.g:1062:6: ( (lv_value_2_0= ruleSignedFloat ) )
        // InternalKiSim.g:1063:1: (lv_value_2_0= ruleSignedFloat )
        {
        // InternalKiSim.g:1063:1: (lv_value_2_0= ruleSignedFloat )
        // InternalKiSim.g:1064:3: lv_value_2_0= ruleSignedFloat
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedFloatParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_value_2_0=ruleSignedFloat();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalKiSim

    // $ANTLR start synpred27_InternalKiSim
    public final void synpred27_InternalKiSim_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKiSim.g:1276:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKiSim.g:1276:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred27_InternalKiSim

    // $ANTLR start synpred37_InternalKiSim
    public final void synpred37_InternalKiSim_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKiSim.g:1833:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKiSim.g:1833:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred37_InternalKiSim

    // $ANTLR start synpred57_InternalKiSim
    public final void synpred57_InternalKiSim_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalKiSim.g:2701:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalKiSim.g:2701:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalKiSim.g:2701:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalKiSim.g:2701:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_30); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_35);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred57_InternalKiSim

    // Delegated rules

    public final boolean synpred24_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalKiSim_fragment(); // can never throw exception
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
    public final boolean synpred23_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalKiSim() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalKiSim_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\3\uffff\1\12\2\uffff\4\12\2\uffff\2\12";
    static final String dfa_3s = "\1\21\1\4\1\uffff\1\4\2\5\4\4\2\uffff\2\4";
    static final String dfa_4s = "\1\33\1\42\1\uffff\1\34\2\6\4\34\2\uffff\2\34";
    static final String dfa_5s = "\2\uffff\1\3\7\uffff\1\1\1\2\2\uffff";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\11\uffff\1\1",
            "\1\3\1\7\1\6\1\uffff\1\10\1\11\7\uffff\1\2\17\uffff\1\4\1\5",
            "",
            "\1\12\13\uffff\1\12\1\uffff\3\12\3\uffff\1\12\3\uffff\1\13",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\12\13\uffff\1\12\1\uffff\3\12\3\uffff\1\12\3\uffff\1\13",
            "\1\12\13\uffff\1\12\1\uffff\3\12\3\uffff\1\12\3\uffff\1\13",
            "\1\12\13\uffff\1\12\1\uffff\3\12\3\uffff\1\12\3\uffff\1\13",
            "\1\12\13\uffff\1\12\1\uffff\3\12\3\uffff\1\12\3\uffff\1\13",
            "",
            "",
            "\1\12\13\uffff\1\12\1\uffff\3\12\3\uffff\1\12\3\uffff\1\13",
            "\1\12\13\uffff\1\12\1\uffff\3\12\3\uffff\1\12\3\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "905:2: ( (otherlv_1= ':' ( (lv_value_2_0= ruleLiteral ) ) ) | (otherlv_3= ':' ( (lv_values_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLiteral ) ) )+ ) | ( (otherlv_7= ':' )? otherlv_8= '{' ( (lv_attributes_9_0= ruleAttributeMapping ) )+ otherlv_10= '}' ) )";
        }
    }
    static final String dfa_8s = "\1\4\13\0\2\uffff";
    static final String dfa_9s = "\1\70\13\0\2\uffff";
    static final String dfa_10s = "\14\uffff\1\1\1\2";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\1\3\1\2\1\13\1\6\1\4\30\uffff\1\1\3\uffff\1\5\3\uffff\1\12\2\uffff\1\14\11\uffff\1\7\1\10",
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
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1275:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_7 = input.LA(1);

                         
                        int index23_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_8 = input.LA(1);

                         
                        int index23_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKiSim()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_15s = "\1\70\4\uffff\7\0\1\uffff";
    static final String dfa_16s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_17s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_18s = {
            "\1\11\2\1\1\13\1\6\1\1\30\uffff\1\1\3\uffff\1\5\3\uffff\1\12\2\uffff\1\14\11\uffff\1\7\1\10",
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
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1832:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_10 = input.LA(1);

                         
                        int index33_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_11 = input.LA(1);

                         
                        int index33_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKiSim()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\14\uffff";
    static final String dfa_20s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_21s = "\1\70\3\uffff\1\0\7\uffff";
    static final String dfa_22s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_23s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_24s = {
            "\1\5\1\2\1\1\2\5\1\3\34\uffff\1\4\3\uffff\1\5\14\uffff\2\5",
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
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_4 = input.LA(1);

                         
                        int index47_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalKiSim()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index47_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000190012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000190002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001D0010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0006000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000011D0010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600000370L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x01802446000003F0L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0078140000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x01800446000003F0L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0180000000000010L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000184000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x01802447000003F0L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008010000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000400000020L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001800000000002L});
    }


}