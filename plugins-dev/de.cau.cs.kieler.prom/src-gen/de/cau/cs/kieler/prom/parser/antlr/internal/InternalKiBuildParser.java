package de.cau.cs.kieler.prom.parser.antlr.internal;

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
import de.cau.cs.kieler.prom.services.KiBuildGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKiBuildParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'compiler'", "'{'", "'}'", "'simulation'", "'process'", "'template'", "'wrapper'", "':'", "','", "'['", "']'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'\\''", "'.'", "'()'", "'random'", "'randomize'", "'extern'", "'!'", "'_'", "'null'", "'@'", "'#'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'val'", "'?'", "'->'"
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
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
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


        public InternalKiBuildParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKiBuildParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKiBuildParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKiBuild.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private KiBuildGrammarAccess grammarAccess;

        public InternalKiBuildParser(TokenStream input, KiBuildGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BuildConfiguration";
       	}

       	@Override
       	protected KiBuildGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBuildConfiguration"
    // InternalKiBuild.g:71:1: entryRuleBuildConfiguration returns [EObject current=null] : iv_ruleBuildConfiguration= ruleBuildConfiguration EOF ;
    public final EObject entryRuleBuildConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildConfiguration = null;


        try {
            // InternalKiBuild.g:71:59: (iv_ruleBuildConfiguration= ruleBuildConfiguration EOF )
            // InternalKiBuild.g:72:2: iv_ruleBuildConfiguration= ruleBuildConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuildConfigurationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBuildConfiguration=ruleBuildConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuildConfiguration; 
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
    // $ANTLR end "entryRuleBuildConfiguration"


    // $ANTLR start "ruleBuildConfiguration"
    // InternalKiBuild.g:78:1: ruleBuildConfiguration returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_modelCompilers_1_0= ruleModelCompiler ) )* ( (lv_simulationCompilers_2_0= ruleSimulationCompiler ) )* ( (lv_templateProcessors_3_0= ruleTemplateProcessor ) )* ) ;
    public final EObject ruleBuildConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_modelCompilers_1_0 = null;

        EObject lv_simulationCompilers_2_0 = null;

        EObject lv_templateProcessors_3_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:84:2: ( ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_modelCompilers_1_0= ruleModelCompiler ) )* ( (lv_simulationCompilers_2_0= ruleSimulationCompiler ) )* ( (lv_templateProcessors_3_0= ruleTemplateProcessor ) )* ) )
            // InternalKiBuild.g:85:2: ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_modelCompilers_1_0= ruleModelCompiler ) )* ( (lv_simulationCompilers_2_0= ruleSimulationCompiler ) )* ( (lv_templateProcessors_3_0= ruleTemplateProcessor ) )* )
            {
            // InternalKiBuild.g:85:2: ( ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_modelCompilers_1_0= ruleModelCompiler ) )* ( (lv_simulationCompilers_2_0= ruleSimulationCompiler ) )* ( (lv_templateProcessors_3_0= ruleTemplateProcessor ) )* )
            // InternalKiBuild.g:86:3: ( (lv_attributes_0_0= ruleAttributeMapping ) )* ( (lv_modelCompilers_1_0= ruleModelCompiler ) )* ( (lv_simulationCompilers_2_0= ruleSimulationCompiler ) )* ( (lv_templateProcessors_3_0= ruleTemplateProcessor ) )*
            {
            // InternalKiBuild.g:86:3: ( (lv_attributes_0_0= ruleAttributeMapping ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKiBuild.g:87:4: (lv_attributes_0_0= ruleAttributeMapping )
            	    {
            	    // InternalKiBuild.g:87:4: (lv_attributes_0_0= ruleAttributeMapping )
            	    // InternalKiBuild.g:88:5: lv_attributes_0_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBuildConfigurationAccess().getAttributesAttributeMappingParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_attributes_0_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBuildConfigurationRule());
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

            // InternalKiBuild.g:105:3: ( (lv_modelCompilers_1_0= ruleModelCompiler ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKiBuild.g:106:4: (lv_modelCompilers_1_0= ruleModelCompiler )
            	    {
            	    // InternalKiBuild.g:106:4: (lv_modelCompilers_1_0= ruleModelCompiler )
            	    // InternalKiBuild.g:107:5: lv_modelCompilers_1_0= ruleModelCompiler
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBuildConfigurationAccess().getModelCompilersModelCompilerParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_modelCompilers_1_0=ruleModelCompiler();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBuildConfigurationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"modelCompilers",
            	      						lv_modelCompilers_1_0,
            	      						"de.cau.cs.kieler.prom.KiBuild.ModelCompiler");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalKiBuild.g:124:3: ( (lv_simulationCompilers_2_0= ruleSimulationCompiler ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKiBuild.g:125:4: (lv_simulationCompilers_2_0= ruleSimulationCompiler )
            	    {
            	    // InternalKiBuild.g:125:4: (lv_simulationCompilers_2_0= ruleSimulationCompiler )
            	    // InternalKiBuild.g:126:5: lv_simulationCompilers_2_0= ruleSimulationCompiler
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBuildConfigurationAccess().getSimulationCompilersSimulationCompilerParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_simulationCompilers_2_0=ruleSimulationCompiler();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBuildConfigurationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"simulationCompilers",
            	      						lv_simulationCompilers_2_0,
            	      						"de.cau.cs.kieler.prom.KiBuild.SimulationCompiler");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalKiBuild.g:143:3: ( (lv_templateProcessors_3_0= ruleTemplateProcessor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKiBuild.g:144:4: (lv_templateProcessors_3_0= ruleTemplateProcessor )
            	    {
            	    // InternalKiBuild.g:144:4: (lv_templateProcessors_3_0= ruleTemplateProcessor )
            	    // InternalKiBuild.g:145:5: lv_templateProcessors_3_0= ruleTemplateProcessor
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBuildConfigurationAccess().getTemplateProcessorsTemplateProcessorParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_templateProcessors_3_0=ruleTemplateProcessor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBuildConfigurationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"templateProcessors",
            	      						lv_templateProcessors_3_0,
            	      						"de.cau.cs.kieler.prom.KiBuild.TemplateProcessor");
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildConfiguration"


    // $ANTLR start "entryRuleModelCompiler"
    // InternalKiBuild.g:166:1: entryRuleModelCompiler returns [EObject current=null] : iv_ruleModelCompiler= ruleModelCompiler EOF ;
    public final EObject entryRuleModelCompiler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelCompiler = null;


        try {
            // InternalKiBuild.g:166:54: (iv_ruleModelCompiler= ruleModelCompiler EOF )
            // InternalKiBuild.g:167:2: iv_ruleModelCompiler= ruleModelCompiler EOF
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
    // InternalKiBuild.g:173:1: ruleModelCompiler returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' ) ;
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
            // InternalKiBuild.g:179:2: ( (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' ) )
            // InternalKiBuild.g:180:2: (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' )
            {
            // InternalKiBuild.g:180:2: (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' )
            // InternalKiBuild.g:181:3: otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelCompilerAccess().getModelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelCompilerAccess().getCompilerKeyword_1());
              		
            }
            // InternalKiBuild.g:189:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKiBuild.g:190:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKiBuild.g:190:4: (lv_name_2_0= RULE_ID )
            // InternalKiBuild.g:191:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModelCompilerAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalKiBuild.g:211:3: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKiBuild.g:212:4: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiBuild.g:212:4: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiBuild.g:213:5: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelCompilerAccess().getAttributesAttributeMappingParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	    break loop5;
                }
            } while (true);

            // InternalKiBuild.g:230:3: ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiBuild.g:231:4: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    {
                    // InternalKiBuild.g:231:4: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    // InternalKiBuild.g:232:5: lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelCompilerAccess().getSimulationProcessorSimulationTemplateProcessorParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
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

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:257:1: entryRuleSimulationCompiler returns [EObject current=null] : iv_ruleSimulationCompiler= ruleSimulationCompiler EOF ;
    public final EObject entryRuleSimulationCompiler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationCompiler = null;


        try {
            // InternalKiBuild.g:257:59: (iv_ruleSimulationCompiler= ruleSimulationCompiler EOF )
            // InternalKiBuild.g:258:2: iv_ruleSimulationCompiler= ruleSimulationCompiler EOF
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
    // InternalKiBuild.g:264:1: ruleSimulationCompiler returns [EObject current=null] : (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) ;
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
            // InternalKiBuild.g:270:2: ( (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) )
            // InternalKiBuild.g:271:2: (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            {
            // InternalKiBuild.g:271:2: (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            // InternalKiBuild.g:272:3: otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSimulationCompilerAccess().getSimulationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimulationCompilerAccess().getCompilerKeyword_1());
              		
            }
            // InternalKiBuild.g:280:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKiBuild.g:281:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKiBuild.g:281:4: (lv_name_2_0= RULE_ID )
            // InternalKiBuild.g:282:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSimulationCompilerAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalKiBuild.g:302:3: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKiBuild.g:303:4: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiBuild.g:303:4: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiBuild.g:304:5: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSimulationCompilerAccess().getAttributesAttributeMappingParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:329:1: entryRuleTemplateProcessor returns [EObject current=null] : iv_ruleTemplateProcessor= ruleTemplateProcessor EOF ;
    public final EObject entryRuleTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateProcessor = null;


        try {
            // InternalKiBuild.g:329:58: (iv_ruleTemplateProcessor= ruleTemplateProcessor EOF )
            // InternalKiBuild.g:330:2: iv_ruleTemplateProcessor= ruleTemplateProcessor EOF
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
    // InternalKiBuild.g:336:1: ruleTemplateProcessor returns [EObject current=null] : (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor ) ;
    public final EObject ruleTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject this_NormalTemplateProcessor_0 = null;

        EObject this_SimulationTemplateProcessor_1 = null;

        EObject this_WrapperCodeTemplateProcessor_2 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:342:2: ( (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor ) )
            // InternalKiBuild.g:343:2: (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor )
            {
            // InternalKiBuild.g:343:2: (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt8=3;
                    }
                    break;
                case 21:
                    {
                    alt8=2;
                    }
                    break;
                case 23:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiBuild.g:344:3: this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor
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
                    // InternalKiBuild.g:356:3: this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor
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
                    // InternalKiBuild.g:368:3: this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor
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
    // InternalKiBuild.g:383:1: entryRuleNormalTemplateProcessor returns [EObject current=null] : iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF ;
    public final EObject entryRuleNormalTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalTemplateProcessor = null;


        try {
            // InternalKiBuild.g:383:64: (iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF )
            // InternalKiBuild.g:384:2: iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF
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
    // InternalKiBuild.g:390:1: ruleNormalTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) ;
    public final EObject ruleNormalTemplateProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:396:2: ( (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) )
            // InternalKiBuild.g:397:2: (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            {
            // InternalKiBuild.g:397:2: (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            // InternalKiBuild.g:398:3: otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalTemplateProcessorAccess().getProcessKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalTemplateProcessorAccess().getTemplateKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNormalTemplateProcessorAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalKiBuild.g:410:3: ()
            // InternalKiBuild.g:411:4: 
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

            // InternalKiBuild.g:420:3: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiBuild.g:421:4: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiBuild.g:421:4: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiBuild.g:422:5: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNormalTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:447:1: entryRuleSimulationTemplateProcessor returns [EObject current=null] : iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF ;
    public final EObject entryRuleSimulationTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationTemplateProcessor = null;


        try {
            // InternalKiBuild.g:447:68: (iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF )
            // InternalKiBuild.g:448:2: iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF
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
    // InternalKiBuild.g:454:1: ruleSimulationTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) ;
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
            // InternalKiBuild.g:460:2: ( (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) )
            // InternalKiBuild.g:461:2: (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            {
            // InternalKiBuild.g:461:2: (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            // InternalKiBuild.g:462:3: otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSimulationTemplateProcessorAccess().getProcessKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimulationTemplateProcessorAccess().getSimulationKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSimulationTemplateProcessorAccess().getTemplateKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSimulationTemplateProcessorAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalKiBuild.g:478:3: ()
            // InternalKiBuild.g:479:4: 
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

            // InternalKiBuild.g:488:3: ( (lv_attributes_5_0= ruleAttributeMapping ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKiBuild.g:489:4: (lv_attributes_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKiBuild.g:489:4: (lv_attributes_5_0= ruleAttributeMapping )
            	    // InternalKiBuild.g:490:5: lv_attributes_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSimulationTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:515:1: entryRuleWrapperCodeTemplateProcessor returns [EObject current=null] : iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF ;
    public final EObject entryRuleWrapperCodeTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrapperCodeTemplateProcessor = null;


        try {
            // InternalKiBuild.g:515:69: (iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF )
            // InternalKiBuild.g:516:2: iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF
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
    // InternalKiBuild.g:522:1: ruleWrapperCodeTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) ;
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
            // InternalKiBuild.g:528:2: ( (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) )
            // InternalKiBuild.g:529:2: (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            {
            // InternalKiBuild.g:529:2: (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            // InternalKiBuild.g:530:3: otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWrapperCodeTemplateProcessorAccess().getProcessKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWrapperCodeTemplateProcessorAccess().getWrapperKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWrapperCodeTemplateProcessorAccess().getTemplateKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWrapperCodeTemplateProcessorAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalKiBuild.g:546:3: ()
            // InternalKiBuild.g:547:4: 
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

            // InternalKiBuild.g:556:3: ( (lv_attributes_5_0= ruleAttributeMapping ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKiBuild.g:557:4: (lv_attributes_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKiBuild.g:557:4: (lv_attributes_5_0= ruleAttributeMapping )
            	    // InternalKiBuild.g:558:5: lv_attributes_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWrapperCodeTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:583:1: entryRuleAttributeMapping returns [EObject current=null] : iv_ruleAttributeMapping= ruleAttributeMapping EOF ;
    public final EObject entryRuleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMapping = null;


        try {
            // InternalKiBuild.g:583:57: (iv_ruleAttributeMapping= ruleAttributeMapping EOF )
            // InternalKiBuild.g:584:2: iv_ruleAttributeMapping= ruleAttributeMapping EOF
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
    // InternalKiBuild.g:590:1: ruleAttributeMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) ) ;
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
            // InternalKiBuild.g:596:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) ) )
            // InternalKiBuild.g:597:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) )
            {
            // InternalKiBuild.g:597:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) ) )
            // InternalKiBuild.g:598:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) )
            {
            // InternalKiBuild.g:598:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKiBuild.g:599:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKiBuild.g:599:4: (lv_name_0_0= RULE_ID )
            // InternalKiBuild.g:600:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalKiBuild.g:616:3: ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiBuild.g:617:4: (lv_arrayIndex_1_0= ruleArrayIndex )
                    {
                    // InternalKiBuild.g:617:4: (lv_arrayIndex_1_0= ruleArrayIndex )
                    // InternalKiBuild.g:618:5: lv_arrayIndex_1_0= ruleArrayIndex
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeMappingAccess().getArrayIndexArrayIndexParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
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

            // InternalKiBuild.g:635:3: ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalKiBuild.g:636:4: (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) )
                    {
                    // InternalKiBuild.g:636:4: (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) )
                    // InternalKiBuild.g:637:5: otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) )
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getAttributeMappingAccess().getColonKeyword_2_0_0());
                      				
                    }
                    // InternalKiBuild.g:641:5: ( (lv_value_3_0= ruleLiteral ) )
                    // InternalKiBuild.g:642:6: (lv_value_3_0= ruleLiteral )
                    {
                    // InternalKiBuild.g:642:6: (lv_value_3_0= ruleLiteral )
                    // InternalKiBuild.g:643:7: lv_value_3_0= ruleLiteral
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
                    // InternalKiBuild.g:662:4: (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ )
                    {
                    // InternalKiBuild.g:662:4: (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ )
                    // InternalKiBuild.g:663:5: otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getAttributeMappingAccess().getColonKeyword_2_1_0());
                      				
                    }
                    // InternalKiBuild.g:667:5: ( (lv_values_5_0= ruleLiteral ) )
                    // InternalKiBuild.g:668:6: (lv_values_5_0= ruleLiteral )
                    {
                    // InternalKiBuild.g:668:6: (lv_values_5_0= ruleLiteral )
                    // InternalKiBuild.g:669:7: lv_values_5_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAttributeMappingAccess().getValuesLiteralParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
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

                    // InternalKiBuild.g:686:5: (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==26) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalKiBuild.g:687:6: otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_6, grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_2_0());
                    	      					
                    	    }
                    	    // InternalKiBuild.g:691:6: ( (lv_values_7_0= ruleLiteral ) )
                    	    // InternalKiBuild.g:692:7: (lv_values_7_0= ruleLiteral )
                    	    {
                    	    // InternalKiBuild.g:692:7: (lv_values_7_0= ruleLiteral )
                    	    // InternalKiBuild.g:693:8: lv_values_7_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getAttributeMappingAccess().getValuesLiteralParserRuleCall_2_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
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
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalKiBuild.g:713:4: ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' )
                    {
                    // InternalKiBuild.g:713:4: ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' )
                    // InternalKiBuild.g:714:5: (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}'
                    {
                    // InternalKiBuild.g:714:5: (otherlv_8= ':' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalKiBuild.g:715:6: otherlv_8= ':'
                            {
                            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getAttributeMappingAccess().getColonKeyword_2_2_0());
                              					
                            }

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getAttributeMappingAccess().getLeftCurlyBracketKeyword_2_2_1());
                      				
                    }
                    // InternalKiBuild.g:724:5: ( (lv_attributes_10_0= ruleAttributeMapping ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalKiBuild.g:725:6: (lv_attributes_10_0= ruleAttributeMapping )
                    	    {
                    	    // InternalKiBuild.g:725:6: (lv_attributes_10_0= ruleAttributeMapping )
                    	    // InternalKiBuild.g:726:7: lv_attributes_10_0= ruleAttributeMapping
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAttributeMappingAccess().getAttributesAttributeMappingParserRuleCall_2_2_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_10);
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
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:753:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalKiBuild.g:753:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalKiBuild.g:754:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalKiBuild.g:760:1: ruleLiteral returns [EObject current=null] : ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_arrayIndex_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:766:2: ( ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) ) )
            // InternalKiBuild.g:767:2: ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) )
            {
            // InternalKiBuild.g:767:2: ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==RULE_FLOAT) ) {
                    alt18=3;
                }
                else if ( (LA18_2==RULE_INT) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==RULE_INT) ) {
                    alt18=2;
                }
                else if ( (LA18_3==RULE_FLOAT) ) {
                    alt18=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA18_4 = input.LA(2);

                if ( (synpred21_InternalKiBuild()) ) {
                    alt18=2;
                }
                else if ( (true) ) {
                    alt18=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA18_5 = input.LA(2);

                if ( (synpred22_InternalKiBuild()) ) {
                    alt18=3;
                }
                else if ( (true) ) {
                    alt18=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt18=4;
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
                    // InternalKiBuild.g:768:3: ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? )
                    {
                    // InternalKiBuild.g:768:3: ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? )
                    // InternalKiBuild.g:769:4: ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
                    {
                    // InternalKiBuild.g:769:4: ( (lv_value_0_0= ruleTextValue ) )
                    // InternalKiBuild.g:770:5: (lv_value_0_0= ruleTextValue )
                    {
                    // InternalKiBuild.g:770:5: (lv_value_0_0= ruleTextValue )
                    // InternalKiBuild.g:771:6: lv_value_0_0= ruleTextValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValueTextValueParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
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

                    // InternalKiBuild.g:788:4: ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalKiBuild.g:789:5: (lv_arrayIndex_1_0= ruleArrayIndex )
                            {
                            // InternalKiBuild.g:789:5: (lv_arrayIndex_1_0= ruleArrayIndex )
                            // InternalKiBuild.g:790:6: lv_arrayIndex_1_0= ruleArrayIndex
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
                    // InternalKiBuild.g:809:3: ( (lv_value_2_0= ruleSignedInt ) )
                    {
                    // InternalKiBuild.g:809:3: ( (lv_value_2_0= ruleSignedInt ) )
                    // InternalKiBuild.g:810:4: (lv_value_2_0= ruleSignedInt )
                    {
                    // InternalKiBuild.g:810:4: (lv_value_2_0= ruleSignedInt )
                    // InternalKiBuild.g:811:5: lv_value_2_0= ruleSignedInt
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
                    // InternalKiBuild.g:829:3: ( (lv_value_3_0= ruleSignedFloat ) )
                    {
                    // InternalKiBuild.g:829:3: ( (lv_value_3_0= ruleSignedFloat ) )
                    // InternalKiBuild.g:830:4: (lv_value_3_0= ruleSignedFloat )
                    {
                    // InternalKiBuild.g:830:4: (lv_value_3_0= ruleSignedFloat )
                    // InternalKiBuild.g:831:5: lv_value_3_0= ruleSignedFloat
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
                    // InternalKiBuild.g:849:3: ( (lv_value_4_0= ruleAnyValue ) )
                    {
                    // InternalKiBuild.g:849:3: ( (lv_value_4_0= ruleAnyValue ) )
                    // InternalKiBuild.g:850:4: (lv_value_4_0= ruleAnyValue )
                    {
                    // InternalKiBuild.g:850:4: (lv_value_4_0= ruleAnyValue )
                    // InternalKiBuild.g:851:5: lv_value_4_0= ruleAnyValue
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
    // InternalKiBuild.g:872:1: entryRuleArrayIndex returns [EObject current=null] : iv_ruleArrayIndex= ruleArrayIndex EOF ;
    public final EObject entryRuleArrayIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndex = null;


        try {
            // InternalKiBuild.g:872:51: (iv_ruleArrayIndex= ruleArrayIndex EOF )
            // InternalKiBuild.g:873:2: iv_ruleArrayIndex= ruleArrayIndex EOF
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
    // InternalKiBuild.g:879:1: ruleArrayIndex returns [EObject current=null] : (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+ ;
    public final EObject ruleArrayIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_indices_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKiBuild.g:885:2: ( (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+ )
            // InternalKiBuild.g:886:2: (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+
            {
            // InternalKiBuild.g:886:2: (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKiBuild.g:887:3: otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']'
            	    {
            	    otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_0, grammarAccess.getArrayIndexAccess().getLeftSquareBracketKeyword_0());
            	      		
            	    }
            	    // InternalKiBuild.g:891:3: ( (lv_indices_1_0= RULE_INT ) )
            	    // InternalKiBuild.g:892:4: (lv_indices_1_0= RULE_INT )
            	    {
            	    // InternalKiBuild.g:892:4: (lv_indices_1_0= RULE_INT )
            	    // InternalKiBuild.g:893:5: lv_indices_1_0= RULE_INT
            	    {
            	    lv_indices_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_22); if (state.failed) return current;
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

            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_2, grammarAccess.getArrayIndexAccess().getRightSquareBracketKeyword_2());
            	      		
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalKiBuild.g:917:1: entryRuleSignedFloat returns [EObject current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final EObject entryRuleSignedFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedFloat = null;


        try {
            // InternalKiBuild.g:917:52: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // InternalKiBuild.g:918:2: iv_ruleSignedFloat= ruleSignedFloat EOF
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
    // InternalKiBuild.g:924:1: ruleSignedFloat returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleSignedFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:930:2: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // InternalKiBuild.g:931:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // InternalKiBuild.g:931:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            // InternalKiBuild.g:932:3: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // InternalKiBuild.g:932:3: ( (lv_sign_0_0= ruleSign ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKiBuild.g:933:4: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiBuild.g:933:4: (lv_sign_0_0= ruleSign )
                    // InternalKiBuild.g:934:5: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignedFloatAccess().getSignSignEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiBuild.g:951:3: ( (lv_value_1_0= RULE_FLOAT ) )
            // InternalKiBuild.g:952:4: (lv_value_1_0= RULE_FLOAT )
            {
            // InternalKiBuild.g:952:4: (lv_value_1_0= RULE_FLOAT )
            // InternalKiBuild.g:953:5: lv_value_1_0= RULE_FLOAT
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
    // InternalKiBuild.g:973:1: entryRuleSignedInt returns [EObject current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final EObject entryRuleSignedInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInt = null;


        try {
            // InternalKiBuild.g:973:50: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalKiBuild.g:974:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalKiBuild.g:980:1: ruleSignedInt returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSignedInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:986:2: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalKiBuild.g:987:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalKiBuild.g:987:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // InternalKiBuild.g:988:3: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalKiBuild.g:988:3: ( (lv_sign_0_0= ruleSign ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=37 && LA21_0<=38)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKiBuild.g:989:4: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiBuild.g:989:4: (lv_sign_0_0= ruleSign )
                    // InternalKiBuild.g:990:5: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignedIntAccess().getSignSignEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKiBuild.g:1007:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalKiBuild.g:1008:4: (lv_value_1_0= RULE_INT )
            {
            // InternalKiBuild.g:1008:4: (lv_value_1_0= RULE_INT )
            // InternalKiBuild.g:1009:5: lv_value_1_0= RULE_INT
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
    // InternalKiBuild.g:1029:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalKiBuild.g:1029:50: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalKiBuild.g:1030:2: iv_ruleTextValue= ruleTextValue EOF
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
    // InternalKiBuild.g:1036:1: ruleTextValue returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:1042:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalKiBuild.g:1043:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalKiBuild.g:1043:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalKiBuild.g:1044:3: (lv_value_0_0= RULE_ID )
            {
            // InternalKiBuild.g:1044:3: (lv_value_0_0= RULE_ID )
            // InternalKiBuild.g:1045:4: lv_value_0_0= RULE_ID
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
    // InternalKiBuild.g:1064:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKiBuild.g:1064:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKiBuild.g:1065:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKiBuild.g:1071:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1077:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalKiBuild.g:1078:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalKiBuild.g:1078:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalKiBuild.g:1079:3: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalKiBuild.g:1091:3: this_ValuedExpression_1= ruleValuedExpression
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
    // InternalKiBuild.g:1106:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKiBuild.g:1106:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKiBuild.g:1107:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalKiBuild.g:1113:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1119:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKiBuild.g:1120:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalKiBuild.g:1134:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKiBuild.g:1134:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKiBuild.g:1135:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalKiBuild.g:1141:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1147:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKiBuild.g:1148:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKiBuild.g:1148:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKiBuild.g:1149:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:1160:3: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKiBuild.g:1161:4: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKiBuild.g:1161:4: ()
                    // InternalKiBuild.g:1162:5: 
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

                    // InternalKiBuild.g:1171:4: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKiBuild.g:1172:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKiBuild.g:1172:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKiBuild.g:1173:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKiBuild.g:1173:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKiBuild.g:1174:7: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1191:5: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKiBuild.g:1192:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKiBuild.g:1192:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKiBuild.g:1193:7: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKiBuild.g:1211:4: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==29) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalKiBuild.g:1212:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:1216:5: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKiBuild.g:1217:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKiBuild.g:1217:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKiBuild.g:1218:7: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	    break loop23;
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
    // InternalKiBuild.g:1241:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKiBuild.g:1241:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKiBuild.g:1242:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalKiBuild.g:1248:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1254:2: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKiBuild.g:1255:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKiBuild.g:1255:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKiBuild.g:1256:3: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:1267:3: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKiBuild.g:1268:4: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKiBuild.g:1268:4: ()
                    // InternalKiBuild.g:1269:5: 
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

                    // InternalKiBuild.g:1278:4: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKiBuild.g:1279:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKiBuild.g:1279:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKiBuild.g:1280:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKiBuild.g:1280:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKiBuild.g:1281:7: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1298:5: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKiBuild.g:1299:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKiBuild.g:1299:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKiBuild.g:1300:7: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
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

                    // InternalKiBuild.g:1318:4: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==30) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalKiBuild.g:1319:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:1323:5: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKiBuild.g:1324:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKiBuild.g:1324:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKiBuild.g:1325:7: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_26);
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
                    	    break loop25;
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
    // InternalKiBuild.g:1348:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKiBuild.g:1348:60: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKiBuild.g:1349:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalKiBuild.g:1355:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseXOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1361:2: ( (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) )
            // InternalKiBuild.g:1362:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            {
            // InternalKiBuild.g:1362:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            // InternalKiBuild.g:1363:3: this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_BitwiseXOrExpression_0=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseXOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:1374:3: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKiBuild.g:1375:4: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    {
                    // InternalKiBuild.g:1375:4: ()
                    // InternalKiBuild.g:1376:5: 
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

                    // InternalKiBuild.g:1385:4: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) )
                    // InternalKiBuild.g:1386:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    {
                    // InternalKiBuild.g:1386:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKiBuild.g:1387:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKiBuild.g:1387:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKiBuild.g:1388:7: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1405:5: ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    // InternalKiBuild.g:1406:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    {
                    // InternalKiBuild.g:1406:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    // InternalKiBuild.g:1407:7: lv_subExpressions_3_0= ruleBitwiseXOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

                    // InternalKiBuild.g:1425:4: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==31) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalKiBuild.g:1426:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:1430:5: ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    // InternalKiBuild.g:1431:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    {
                    	    // InternalKiBuild.g:1431:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    // InternalKiBuild.g:1432:7: lv_subExpressions_5_0= ruleBitwiseXOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
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
                    	    break loop27;
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
    // InternalKiBuild.g:1455:1: entryRuleBitwiseXOrExpression returns [EObject current=null] : iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF ;
    public final EObject entryRuleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXOrExpression = null;


        try {
            // InternalKiBuild.g:1455:61: (iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF )
            // InternalKiBuild.g:1456:2: iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF
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
    // InternalKiBuild.g:1462:1: ruleBitwiseXOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1468:2: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKiBuild.g:1469:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKiBuild.g:1469:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKiBuild.g:1470:3: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:1481:3: ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKiBuild.g:1482:4: () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKiBuild.g:1482:4: ()
                    // InternalKiBuild.g:1483:5: 
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

                    // InternalKiBuild.g:1492:4: ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKiBuild.g:1493:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKiBuild.g:1493:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) )
                    // InternalKiBuild.g:1494:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    {
                    // InternalKiBuild.g:1494:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    // InternalKiBuild.g:1495:7: lv_operator_2_0= ruleBitwiseXOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getOperatorBitwiseXOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1512:5: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKiBuild.g:1513:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKiBuild.g:1513:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKiBuild.g:1514:7: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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

                    // InternalKiBuild.g:1532:4: (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==32) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalKiBuild.g:1533:5: otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseXOrExpressionAccess().getCircumflexAccentKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:1537:5: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKiBuild.g:1538:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKiBuild.g:1538:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKiBuild.g:1539:7: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_28);
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
                    	    break loop29;
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
    // InternalKiBuild.g:1562:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKiBuild.g:1562:61: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKiBuild.g:1563:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalKiBuild.g:1569:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1575:2: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKiBuild.g:1576:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKiBuild.g:1576:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKiBuild.g:1577:3: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:1588:3: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKiBuild.g:1589:4: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKiBuild.g:1589:4: ()
                    // InternalKiBuild.g:1590:5: 
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

                    // InternalKiBuild.g:1599:4: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKiBuild.g:1600:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKiBuild.g:1600:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKiBuild.g:1601:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKiBuild.g:1601:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKiBuild.g:1602:7: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1619:5: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKiBuild.g:1620:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKiBuild.g:1620:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKiBuild.g:1621:7: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

                    // InternalKiBuild.g:1639:4: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==33) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalKiBuild.g:1640:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:1644:5: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKiBuild.g:1645:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKiBuild.g:1645:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKiBuild.g:1646:7: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKiBuild.g:1669:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKiBuild.g:1669:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKiBuild.g:1670:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalKiBuild.g:1676:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1682:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKiBuild.g:1683:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKiBuild.g:1683:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKiBuild.g:1684:3: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NotOrValuedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:1695:3: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=55 && LA33_0<=60)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKiBuild.g:1696:4: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKiBuild.g:1696:4: ()
                    // InternalKiBuild.g:1697:5: 
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

                    // InternalKiBuild.g:1706:4: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKiBuild.g:1707:5: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKiBuild.g:1707:5: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKiBuild.g:1708:6: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1725:4: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKiBuild.g:1726:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKiBuild.g:1726:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKiBuild.g:1727:6: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
    // InternalKiBuild.g:1749:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKiBuild.g:1749:62: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKiBuild.g:1750:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalKiBuild.g:1756:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1762:2: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKiBuild.g:1763:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKiBuild.g:1763:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalKiBuild.g:1764:3: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalKiBuild.g:1776:3: this_NotExpression_1= ruleNotExpression
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
    // InternalKiBuild.g:1791:1: entryRuleBitwiseNotExpression returns [EObject current=null] : iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF ;
    public final EObject entryRuleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseNotExpression = null;


        try {
            // InternalKiBuild.g:1791:61: (iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF )
            // InternalKiBuild.g:1792:2: iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF
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
    // InternalKiBuild.g:1798:1: ruleBitwiseNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1804:2: ( ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKiBuild.g:1805:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKiBuild.g:1805:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==62) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID||(LA35_0>=RULE_HOSTCODE && LA35_0<=RULE_BOOLEAN)||LA35_0==RULE_COMMENT_ANNOTATION||LA35_0==42||(LA35_0>=47 && LA35_0<=49)||LA35_0==53||LA35_0==61||LA35_0==63) ) {
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
                    // InternalKiBuild.g:1806:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    {
                    // InternalKiBuild.g:1806:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    // InternalKiBuild.g:1807:4: () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    {
                    // InternalKiBuild.g:1807:4: ()
                    // InternalKiBuild.g:1808:5: 
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

                    // InternalKiBuild.g:1817:4: ( (lv_operator_1_0= ruleBitwiseNotOperator ) )
                    // InternalKiBuild.g:1818:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    {
                    // InternalKiBuild.g:1818:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    // InternalKiBuild.g:1819:6: lv_operator_1_0= ruleBitwiseNotOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getOperatorBitwiseNotOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1836:4: ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    // InternalKiBuild.g:1837:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    {
                    // InternalKiBuild.g:1837:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    // InternalKiBuild.g:1838:6: lv_subExpressions_2_0= ruleBitwiseNotExpression
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
                    // InternalKiBuild.g:1857:3: this_AtomicExpression_3= ruleAtomicExpression
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
    // InternalKiBuild.g:1872:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKiBuild.g:1872:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKiBuild.g:1873:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalKiBuild.g:1879:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_BitwiseNotExpression_3 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1885:2: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) )
            // InternalKiBuild.g:1886:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            {
            // InternalKiBuild.g:1886:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID||(LA36_0>=RULE_HOSTCODE && LA36_0<=RULE_BOOLEAN)||LA36_0==RULE_COMMENT_ANNOTATION||LA36_0==42||(LA36_0>=47 && LA36_0<=49)||LA36_0==53||(LA36_0>=61 && LA36_0<=63)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalKiBuild.g:1887:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKiBuild.g:1887:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKiBuild.g:1888:4: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKiBuild.g:1888:4: ()
                    // InternalKiBuild.g:1889:5: 
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

                    // InternalKiBuild.g:1898:4: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKiBuild.g:1899:5: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKiBuild.g:1899:5: (lv_operator_1_0= ruleNotOperator )
                    // InternalKiBuild.g:1900:6: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiBuild.g:1917:4: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKiBuild.g:1918:5: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKiBuild.g:1918:5: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKiBuild.g:1919:6: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalKiBuild.g:1938:3: this_BitwiseNotExpression_3= ruleBitwiseNotExpression
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
    // InternalKiBuild.g:1953:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKiBuild.g:1953:57: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKiBuild.g:1954:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalKiBuild.g:1960:1: ruleValuedExpression returns [EObject current=null] : this_ShiftLeftExpression_0= ruleShiftLeftExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftLeftExpression_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1966:2: (this_ShiftLeftExpression_0= ruleShiftLeftExpression )
            // InternalKiBuild.g:1967:2: this_ShiftLeftExpression_0= ruleShiftLeftExpression
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
    // InternalKiBuild.g:1981:1: entryRuleShiftLeftExpression returns [EObject current=null] : iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF ;
    public final EObject entryRuleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftLeftExpression = null;


        try {
            // InternalKiBuild.g:1981:60: (iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF )
            // InternalKiBuild.g:1982:2: iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF
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
    // InternalKiBuild.g:1988:1: ruleShiftLeftExpression returns [EObject current=null] : (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) ;
    public final EObject ruleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:1994:2: ( (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) )
            // InternalKiBuild.g:1995:2: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            {
            // InternalKiBuild.g:1995:2: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            // InternalKiBuild.g:1996:3: this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getShiftRightExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_31);
            this_ShiftRightExpression_0=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShiftRightExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2007:3: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKiBuild.g:2008:4: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    {
                    // InternalKiBuild.g:2008:4: ()
                    // InternalKiBuild.g:2009:5: 
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

                    // InternalKiBuild.g:2018:4: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) )
                    // InternalKiBuild.g:2019:5: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    {
                    // InternalKiBuild.g:2019:5: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
                    // InternalKiBuild.g:2020:6: (lv_operator_2_0= ruleShiftLeftOperator )
                    {
                    // InternalKiBuild.g:2020:6: (lv_operator_2_0= ruleShiftLeftOperator )
                    // InternalKiBuild.g:2021:7: lv_operator_2_0= ruleShiftLeftOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2038:5: ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    // InternalKiBuild.g:2039:6: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    {
                    // InternalKiBuild.g:2039:6: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    // InternalKiBuild.g:2040:7: lv_subExpressions_3_0= ruleShiftRightExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
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

                    // InternalKiBuild.g:2058:4: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==34) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalKiBuild.g:2059:5: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftLeftExpressionAccess().getLessThanSignLessThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2063:5: ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    // InternalKiBuild.g:2064:6: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    {
                    	    // InternalKiBuild.g:2064:6: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    // InternalKiBuild.g:2065:7: lv_subExpressions_5_0= ruleShiftRightExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_31);
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
    // $ANTLR end "ruleShiftLeftExpression"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKiBuild.g:2088:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKiBuild.g:2088:61: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKiBuild.g:2089:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
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
    // InternalKiBuild.g:2095:1: ruleShiftRightExpression returns [EObject current=null] : (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightUnsignedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2101:2: ( (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKiBuild.g:2102:2: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKiBuild.g:2102:2: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKiBuild.g:2103:3: this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getShiftRightUnsignedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_33);
            this_ShiftRightUnsignedExpression_0=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShiftRightUnsignedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2114:3: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKiBuild.g:2115:4: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKiBuild.g:2115:4: ()
                    // InternalKiBuild.g:2116:5: 
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

                    // InternalKiBuild.g:2125:4: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKiBuild.g:2126:5: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKiBuild.g:2126:5: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKiBuild.g:2127:6: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKiBuild.g:2127:6: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKiBuild.g:2128:7: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2145:5: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKiBuild.g:2146:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKiBuild.g:2146:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKiBuild.g:2147:7: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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

                    // InternalKiBuild.g:2165:4: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==35) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalKiBuild.g:2166:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2170:5: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKiBuild.g:2171:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKiBuild.g:2171:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKiBuild.g:2172:7: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_33);
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
    // $ANTLR end "ruleShiftRightExpression"


    // $ANTLR start "entryRuleShiftRightUnsignedExpression"
    // InternalKiBuild.g:2195:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKiBuild.g:2195:69: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKiBuild.g:2196:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
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
    // InternalKiBuild.g:2202:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2208:2: ( (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) )
            // InternalKiBuild.g:2209:2: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            {
            // InternalKiBuild.g:2209:2: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            // InternalKiBuild.g:2210:3: this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getAddExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_34);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2221:3: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKiBuild.g:2222:4: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    {
                    // InternalKiBuild.g:2222:4: ()
                    // InternalKiBuild.g:2223:5: 
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

                    // InternalKiBuild.g:2232:4: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) )
                    // InternalKiBuild.g:2233:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    {
                    // InternalKiBuild.g:2233:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKiBuild.g:2234:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKiBuild.g:2234:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKiBuild.g:2235:7: lv_operator_2_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2252:5: ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    // InternalKiBuild.g:2253:6: (lv_subExpressions_3_0= ruleAddExpression )
                    {
                    // InternalKiBuild.g:2253:6: (lv_subExpressions_3_0= ruleAddExpression )
                    // InternalKiBuild.g:2254:7: lv_subExpressions_3_0= ruleAddExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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

                    // InternalKiBuild.g:2272:4: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==36) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalKiBuild.g:2273:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2277:5: ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    // InternalKiBuild.g:2278:6: (lv_subExpressions_5_0= ruleAddExpression )
                    	    {
                    	    // InternalKiBuild.g:2278:6: (lv_subExpressions_5_0= ruleAddExpression )
                    	    // InternalKiBuild.g:2279:7: lv_subExpressions_5_0= ruleAddExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
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
    // $ANTLR end "ruleShiftRightUnsignedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalKiBuild.g:2302:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKiBuild.g:2302:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKiBuild.g:2303:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalKiBuild.g:2309:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2315:2: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) )
            // InternalKiBuild.g:2316:2: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            {
            // InternalKiBuild.g:2316:2: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            // InternalKiBuild.g:2317:3: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_35);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2328:3: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKiBuild.g:2329:4: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalKiBuild.g:2329:4: ()
                    // InternalKiBuild.g:2330:5: 
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

                    // InternalKiBuild.g:2339:4: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalKiBuild.g:2340:5: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalKiBuild.g:2340:5: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKiBuild.g:2341:6: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKiBuild.g:2341:6: (lv_operator_2_0= ruleAddOperator )
                    // InternalKiBuild.g:2342:7: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2359:5: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalKiBuild.g:2360:6: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalKiBuild.g:2360:6: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalKiBuild.g:2361:7: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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

                    // InternalKiBuild.g:2379:4: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==37) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalKiBuild.g:2380:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2384:5: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalKiBuild.g:2385:6: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalKiBuild.g:2385:6: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalKiBuild.g:2386:7: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKiBuild.g:2409:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKiBuild.g:2409:54: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKiBuild.g:2410:2: iv_ruleSubExpression= ruleSubExpression EOF
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
    // InternalKiBuild.g:2416:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2422:2: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) )
            // InternalKiBuild.g:2423:2: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            {
            // InternalKiBuild.g:2423:2: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            // InternalKiBuild.g:2424:3: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_36);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2435:3: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKiBuild.g:2436:4: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    {
                    // InternalKiBuild.g:2436:4: ()
                    // InternalKiBuild.g:2437:5: 
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

                    // InternalKiBuild.g:2446:4: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )
                    // InternalKiBuild.g:2447:5: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    {
                    // InternalKiBuild.g:2447:5: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalKiBuild.g:2448:6: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalKiBuild.g:2448:6: (lv_operator_2_0= ruleSubOperator )
                    // InternalKiBuild.g:2449:7: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2466:5: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    // InternalKiBuild.g:2467:6: (lv_subExpressions_3_0= ruleMultExpression )
                    {
                    // InternalKiBuild.g:2467:6: (lv_subExpressions_3_0= ruleMultExpression )
                    // InternalKiBuild.g:2468:7: lv_subExpressions_3_0= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
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

                    // InternalKiBuild.g:2486:4: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==38) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalKiBuild.g:2487:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2491:5: ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    // InternalKiBuild.g:2492:6: (lv_subExpressions_5_0= ruleMultExpression )
                    	    {
                    	    // InternalKiBuild.g:2492:6: (lv_subExpressions_5_0= ruleMultExpression )
                    	    // InternalKiBuild.g:2493:7: lv_subExpressions_5_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalKiBuild.g:2516:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalKiBuild.g:2516:55: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalKiBuild.g:2517:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalKiBuild.g:2523:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2529:2: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) )
            // InternalKiBuild.g:2530:2: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            {
            // InternalKiBuild.g:2530:2: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            // InternalKiBuild.g:2531:3: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_37);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DivExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2542:3: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKiBuild.g:2543:4: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    {
                    // InternalKiBuild.g:2543:4: ()
                    // InternalKiBuild.g:2544:5: 
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

                    // InternalKiBuild.g:2553:4: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )
                    // InternalKiBuild.g:2554:5: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    {
                    // InternalKiBuild.g:2554:5: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKiBuild.g:2555:6: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKiBuild.g:2555:6: (lv_operator_2_0= ruleMultOperator )
                    // InternalKiBuild.g:2556:7: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2573:5: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    // InternalKiBuild.g:2574:6: (lv_subExpressions_3_0= ruleDivExpression )
                    {
                    // InternalKiBuild.g:2574:6: (lv_subExpressions_3_0= ruleDivExpression )
                    // InternalKiBuild.g:2575:7: lv_subExpressions_3_0= ruleDivExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
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

                    // InternalKiBuild.g:2593:4: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==39) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalKiBuild.g:2594:5: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2598:5: ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    // InternalKiBuild.g:2599:6: (lv_subExpressions_5_0= ruleDivExpression )
                    	    {
                    	    // InternalKiBuild.g:2599:6: (lv_subExpressions_5_0= ruleDivExpression )
                    	    // InternalKiBuild.g:2600:7: lv_subExpressions_5_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalKiBuild.g:2623:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalKiBuild.g:2623:54: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalKiBuild.g:2624:2: iv_ruleDivExpression= ruleDivExpression EOF
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
    // InternalKiBuild.g:2630:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2636:2: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) )
            // InternalKiBuild.g:2637:2: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            {
            // InternalKiBuild.g:2637:2: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            // InternalKiBuild.g:2638:3: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ModExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2649:3: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKiBuild.g:2650:4: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    {
                    // InternalKiBuild.g:2650:4: ()
                    // InternalKiBuild.g:2651:5: 
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

                    // InternalKiBuild.g:2660:4: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
                    // InternalKiBuild.g:2661:5: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // InternalKiBuild.g:2661:5: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalKiBuild.g:2662:6: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalKiBuild.g:2662:6: (lv_operator_2_0= ruleDivOperator )
                    // InternalKiBuild.g:2663:7: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2680:5: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // InternalKiBuild.g:2681:6: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // InternalKiBuild.g:2681:6: (lv_subExpressions_3_0= ruleModExpression )
                    // InternalKiBuild.g:2682:7: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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

                    // InternalKiBuild.g:2700:4: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==40) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalKiBuild.g:2701:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2705:5: ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    // InternalKiBuild.g:2706:6: (lv_subExpressions_5_0= ruleModExpression )
                    	    {
                    	    // InternalKiBuild.g:2706:6: (lv_subExpressions_5_0= ruleModExpression )
                    	    // InternalKiBuild.g:2707:7: lv_subExpressions_5_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalKiBuild.g:2730:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalKiBuild.g:2730:54: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalKiBuild.g:2731:2: iv_ruleModExpression= ruleModExpression EOF
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
    // InternalKiBuild.g:2737:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2743:2: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKiBuild.g:2744:2: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKiBuild.g:2744:2: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKiBuild.g:2745:3: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKiBuild.g:2756:3: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKiBuild.g:2757:4: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKiBuild.g:2757:4: ()
                    // InternalKiBuild.g:2758:5: 
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

                    // InternalKiBuild.g:2767:4: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiBuild.g:2768:5: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiBuild.g:2768:5: ( (lv_operator_2_0= ruleModOperator ) )
                    // InternalKiBuild.g:2769:6: (lv_operator_2_0= ruleModOperator )
                    {
                    // InternalKiBuild.g:2769:6: (lv_operator_2_0= ruleModOperator )
                    // InternalKiBuild.g:2770:7: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2787:5: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiBuild.g:2788:6: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiBuild.g:2788:6: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiBuild.g:2789:7: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
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

                    // InternalKiBuild.g:2807:4: (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==41) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKiBuild.g:2808:5: otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:2812:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKiBuild.g:2813:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKiBuild.g:2813:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKiBuild.g:2814:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKiBuild.g:2837:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKiBuild.g:2837:54: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKiBuild.g:2838:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalKiBuild.g:2844:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2850:2: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKiBuild.g:2851:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKiBuild.g:2851:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==38) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_COMMENT_ANNOTATION)||LA53_0==19||LA53_0==42||(LA53_0>=47 && LA53_0<=49)||LA53_0==53||LA53_0==61||LA53_0==63) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalKiBuild.g:2852:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKiBuild.g:2852:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKiBuild.g:2853:4: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKiBuild.g:2853:4: ()
                    // InternalKiBuild.g:2854:5: 
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

                    // InternalKiBuild.g:2863:4: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKiBuild.g:2864:5: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKiBuild.g:2864:5: (lv_operator_1_0= ruleSubOperator )
                    // InternalKiBuild.g:2865:6: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2882:4: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKiBuild.g:2883:5: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKiBuild.g:2883:5: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKiBuild.g:2884:6: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalKiBuild.g:2903:3: this_TernaryOperation_3= ruleTernaryOperation
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
    // InternalKiBuild.g:2918:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKiBuild.g:2918:57: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKiBuild.g:2919:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
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
    // InternalKiBuild.g:2925:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression ) ;
    public final EObject ruleTernaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_FBYExpression_6 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:2931:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression ) )
            // InternalKiBuild.g:2932:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression )
            {
            // InternalKiBuild.g:2932:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression )
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalKiBuild.g:2933:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKiBuild.g:2933:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiBuild.g:2934:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiBuild.g:2934:4: ()
                    // InternalKiBuild.g:2935:5: 
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

                    // InternalKiBuild.g:2944:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKiBuild.g:2945:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiBuild.g:2945:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKiBuild.g:2946:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

                    // InternalKiBuild.g:2963:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKiBuild.g:2964:5: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKiBuild.g:2964:5: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKiBuild.g:2965:6: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalKiBuild.g:2982:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiBuild.g:2983:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiBuild.g:2983:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiBuild.g:2984:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
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

                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4());
                      			
                    }
                    // InternalKiBuild.g:3005:4: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    // InternalKiBuild.g:3006:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiBuild.g:3006:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    // InternalKiBuild.g:3007:6: lv_subExpressions_5_0= ruleAtomicValuedExpression
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
                    // InternalKiBuild.g:3026:3: this_FBYExpression_6= ruleFBYExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTernaryOperationAccess().getFBYExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FBYExpression_6=ruleFBYExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FBYExpression_6;
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


    // $ANTLR start "entryRuleFBYExpression"
    // InternalKiBuild.g:3041:1: entryRuleFBYExpression returns [EObject current=null] : iv_ruleFBYExpression= ruleFBYExpression EOF ;
    public final EObject entryRuleFBYExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFBYExpression = null;


        try {
            // InternalKiBuild.g:3041:54: (iv_ruleFBYExpression= ruleFBYExpression EOF )
            // InternalKiBuild.g:3042:2: iv_ruleFBYExpression= ruleFBYExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFBYExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFBYExpression=ruleFBYExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFBYExpression; 
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
    // $ANTLR end "entryRuleFBYExpression"


    // $ANTLR start "ruleFBYExpression"
    // InternalKiBuild.g:3048:1: ruleFBYExpression returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression ) ;
    public final EObject ruleFBYExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_AtomicValuedExpression_4 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:3054:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression ) )
            // InternalKiBuild.g:3055:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )
            {
            // InternalKiBuild.g:3055:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalKiBuild.g:3056:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKiBuild.g:3056:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiBuild.g:3057:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiBuild.g:3057:4: ()
                    // InternalKiBuild.g:3058:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFBYExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKiBuild.g:3067:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKiBuild.g:3068:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiBuild.g:3068:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKiBuild.g:3069:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_subExpressions_1_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFBYExpressionRule());
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

                    // InternalKiBuild.g:3086:4: ( (lv_operator_2_0= ruleFBYOperator ) )
                    // InternalKiBuild.g:3087:5: (lv_operator_2_0= ruleFBYOperator )
                    {
                    // InternalKiBuild.g:3087:5: (lv_operator_2_0= ruleFBYOperator )
                    // InternalKiBuild.g:3088:6: lv_operator_2_0= ruleFBYOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFBYExpressionAccess().getOperatorFBYOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_operator_2_0=ruleFBYOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFBYExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.FBYOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKiBuild.g:3105:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiBuild.g:3106:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiBuild.g:3106:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiBuild.g:3107:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFBYExpressionRule());
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


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:3126:3: this_AtomicValuedExpression_4= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFBYExpressionAccess().getAtomicValuedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_4=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicValuedExpression_4;
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
    // $ANTLR end "ruleFBYExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKiBuild.g:3141:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKiBuild.g:3141:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKiBuild.g:3142:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKiBuild.g:3148:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) ;
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
            // InternalKiBuild.g:3154:2: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) )
            // InternalKiBuild.g:3155:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            {
            // InternalKiBuild.g:3155:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            int alt56=8;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalKiBuild.g:3156:3: this_BoolValue_0= ruleBoolValue
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
                    // InternalKiBuild.g:3168:3: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalKiBuild.g:3180:3: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKiBuild.g:3180:3: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKiBuild.g:3181:4: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BoolExpression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiBuild.g:3202:3: this_ReferenceCall_5= ruleReferenceCall
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
                    // InternalKiBuild.g:3214:3: this_FunctionCall_6= ruleFunctionCall
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
                    // InternalKiBuild.g:3226:3: this_RandomCall_7= ruleRandomCall
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
                    // InternalKiBuild.g:3238:3: this_RandomizeCall_8= ruleRandomizeCall
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
                    // InternalKiBuild.g:3250:3: this_TextExpression_9= ruleTextExpression
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
    // InternalKiBuild.g:3265:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKiBuild.g:3265:63: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKiBuild.g:3266:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalKiBuild.g:3272:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
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
            // InternalKiBuild.g:3278:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKiBuild.g:3279:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKiBuild.g:3279:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt57=6;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalKiBuild.g:3280:3: this_IntValue_0= ruleIntValue
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
                    // InternalKiBuild.g:3292:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalKiBuild.g:3304:3: this_StringValue_2= ruleStringValue
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
                    // InternalKiBuild.g:3316:3: this_VectorValue_3= ruleVectorValue
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
                    // InternalKiBuild.g:3328:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKiBuild.g:3328:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKiBuild.g:3329:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ValuedExpression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKiBuild.g:3350:3: this_AtomicExpression_7= ruleAtomicExpression
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
    // InternalKiBuild.g:3365:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKiBuild.g:3365:67: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKiBuild.g:3366:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalKiBuild.g:3372:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalKiBuild.g:3378:2: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalKiBuild.g:3379:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalKiBuild.g:3379:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==61||LA59_0==63) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalKiBuild.g:3380:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalKiBuild.g:3380:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalKiBuild.g:3381:4: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalKiBuild.g:3381:4: ()
                    // InternalKiBuild.g:3382:5: 
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

                    // InternalKiBuild.g:3391:4: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKiBuild.g:3392:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKiBuild.g:3392:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKiBuild.g:3393:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKiBuild.g:3393:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==61) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==63) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalKiBuild.g:3394:7: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_44);
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
                            // InternalKiBuild.g:3410:7: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_44);
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

                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                      			
                    }
                    // InternalKiBuild.g:3432:4: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKiBuild.g:3433:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKiBuild.g:3433:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKiBuild.g:3434:6: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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

                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:3457:3: this_ValuedObjectReference_5= ruleValuedObjectReference
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
    // InternalKiBuild.g:3472:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKiBuild.g:3472:47: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKiBuild.g:3473:2: iv_rulePrimeID= rulePrimeID EOF
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
    // InternalKiBuild.g:3479:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalKiBuild.g:3485:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKiBuild.g:3486:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKiBuild.g:3486:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKiBuild.g:3487:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKiBuild.g:3494:3: (kw= '\\'' )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==44) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalKiBuild.g:3495:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,44,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalKiBuild.g:3505:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKiBuild.g:3505:62: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKiBuild.g:3506:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalKiBuild.g:3512:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:3518:2: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKiBuild.g:3519:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKiBuild.g:3519:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKiBuild.g:3520:3: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKiBuild.g:3520:3: ( ( rulePrimeID ) )
            // InternalKiBuild.g:3521:4: ( rulePrimeID )
            {
            // InternalKiBuild.g:3521:4: ( rulePrimeID )
            // InternalKiBuild.g:3522:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_47);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKiBuild.g:3539:3: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==27) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalKiBuild.g:3540:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalKiBuild.g:3544:4: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKiBuild.g:3545:5: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKiBuild.g:3545:5: (lv_indices_2_0= ruleExpression )
            	    // InternalKiBuild.g:3546:6: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
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

            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // InternalKiBuild.g:3568:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==45) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalKiBuild.g:3569:4: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalKiBuild.g:3573:4: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKiBuild.g:3574:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKiBuild.g:3574:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKiBuild.g:3575:6: lv_subReference_5_0= ruleValuedObjectReference
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


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKiBuild.g:3597:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKiBuild.g:3597:54: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKiBuild.g:3598:2: iv_ruleReferenceCall= ruleReferenceCall EOF
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
    // InternalKiBuild.g:3604:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
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
            // InternalKiBuild.g:3610:2: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKiBuild.g:3611:2: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKiBuild.g:3611:2: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKiBuild.g:3612:3: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKiBuild.g:3612:3: ( ( rulePrimeID ) )
            // InternalKiBuild.g:3613:4: ( rulePrimeID )
            {
            // InternalKiBuild.g:3613:4: ( rulePrimeID )
            // InternalKiBuild.g:3614:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_48);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKiBuild.g:3631:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            else if ( (LA64_0==46) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalKiBuild.g:3632:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKiBuild.g:3632:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKiBuild.g:3633:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalKiBuild.g:3637:5: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKiBuild.g:3638:6: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKiBuild.g:3638:6: (lv_parameters_2_0= ruleParameter )
                    // InternalKiBuild.g:3639:7: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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

                    // InternalKiBuild.g:3656:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==26) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalKiBuild.g:3657:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKiBuild.g:3661:6: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKiBuild.g:3662:7: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKiBuild.g:3662:7: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKiBuild.g:3663:8: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_50);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:3687:4: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:3696:1: entryRuleRandomCall returns [EObject current=null] : iv_ruleRandomCall= ruleRandomCall EOF ;
    public final EObject entryRuleRandomCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomCall = null;


        try {
            // InternalKiBuild.g:3696:51: (iv_ruleRandomCall= ruleRandomCall EOF )
            // InternalKiBuild.g:3697:2: iv_ruleRandomCall= ruleRandomCall EOF
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
    // InternalKiBuild.g:3703:1: ruleRandomCall returns [EObject current=null] : ( () otherlv_1= 'random' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKiBuild.g:3709:2: ( ( () otherlv_1= 'random' (otherlv_2= '()' )? ) )
            // InternalKiBuild.g:3710:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            {
            // InternalKiBuild.g:3710:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            // InternalKiBuild.g:3711:3: () otherlv_1= 'random' (otherlv_2= '()' )?
            {
            // InternalKiBuild.g:3711:3: ()
            // InternalKiBuild.g:3712:4: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomCallAccess().getRandomKeyword_1());
              		
            }
            // InternalKiBuild.g:3725:3: (otherlv_2= '()' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKiBuild.g:3726:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:3735:1: entryRuleRandomizeCall returns [EObject current=null] : iv_ruleRandomizeCall= ruleRandomizeCall EOF ;
    public final EObject entryRuleRandomizeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCall = null;


        try {
            // InternalKiBuild.g:3735:54: (iv_ruleRandomizeCall= ruleRandomizeCall EOF )
            // InternalKiBuild.g:3736:2: iv_ruleRandomizeCall= ruleRandomizeCall EOF
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
    // InternalKiBuild.g:3742:1: ruleRandomizeCall returns [EObject current=null] : ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomizeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKiBuild.g:3748:2: ( ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) )
            // InternalKiBuild.g:3749:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            {
            // InternalKiBuild.g:3749:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            // InternalKiBuild.g:3750:3: () otherlv_1= 'randomize' (otherlv_2= '()' )?
            {
            // InternalKiBuild.g:3750:3: ()
            // InternalKiBuild.g:3751:4: 
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

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomizeCallAccess().getRandomizeKeyword_1());
              		
            }
            // InternalKiBuild.g:3764:3: (otherlv_2= '()' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==46) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalKiBuild.g:3765:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:3774:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKiBuild.g:3774:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKiBuild.g:3775:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKiBuild.g:3781:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
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
            // InternalKiBuild.g:3787:2: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKiBuild.g:3788:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKiBuild.g:3788:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKiBuild.g:3789:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
              		
            }
            // InternalKiBuild.g:3793:3: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKiBuild.g:3794:4: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKiBuild.g:3794:4: (lv_functionName_1_0= RULE_ID )
            // InternalKiBuild.g:3795:5: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
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

            // InternalKiBuild.g:3811:3: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==42) ) {
                alt68=1;
            }
            else if ( (LA68_0==46) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalKiBuild.g:3812:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKiBuild.g:3812:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKiBuild.g:3813:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalKiBuild.g:3817:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKiBuild.g:3818:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKiBuild.g:3818:6: (lv_parameters_3_0= ruleParameter )
                    // InternalKiBuild.g:3819:7: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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

                    // InternalKiBuild.g:3836:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==26) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalKiBuild.g:3837:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	      					
                    	    }
                    	    // InternalKiBuild.g:3841:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKiBuild.g:3842:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKiBuild.g:3842:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKiBuild.g:3843:8: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_50);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:3867:4: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:3876:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKiBuild.g:3876:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKiBuild.g:3877:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKiBuild.g:3883:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:3889:2: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKiBuild.g:3890:2: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKiBuild.g:3890:2: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKiBuild.g:3891:3: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKiBuild.g:3891:3: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==33) ) {
                    alt70=1;
                }
            }
            else if ( (LA70_0==33) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalKiBuild.g:3892:4: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKiBuild.g:3892:4: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==50) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalKiBuild.g:3893:5: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKiBuild.g:3893:5: (lv_pureOutput_0_0= '!' )
                            // InternalKiBuild.g:3894:6: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,50,FollowSets000.FOLLOW_52); if (state.failed) return current;
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

                    // InternalKiBuild.g:3906:4: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKiBuild.g:3907:5: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKiBuild.g:3907:5: (lv_callByReference_1_0= '&' )
                    // InternalKiBuild.g:3908:6: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,33,FollowSets000.FOLLOW_25); if (state.failed) return current;
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

            // InternalKiBuild.g:3921:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKiBuild.g:3922:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKiBuild.g:3922:4: (lv_expression_2_0= ruleExpression )
            // InternalKiBuild.g:3923:5: lv_expression_2_0= ruleExpression
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
    // InternalKiBuild.g:3944:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKiBuild.g:3944:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKiBuild.g:3945:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalKiBuild.g:3951:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:3957:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKiBuild.g:3958:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKiBuild.g:3958:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKiBuild.g:3959:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKiBuild.g:3959:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_COMMENT_ANNOTATION||LA71_0==53) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalKiBuild.g:3960:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKiBuild.g:3960:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKiBuild.g:3961:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTextExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTextExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            // InternalKiBuild.g:3978:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKiBuild.g:3979:4: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKiBuild.g:3979:4: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKiBuild.g:3980:5: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_1_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTextExpressionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_1_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              				
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKiBuild.g:4000:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKiBuild.g:4000:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKiBuild.g:4001:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalKiBuild.g:4007:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:4013:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKiBuild.g:4014:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKiBuild.g:4014:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalKiBuild.g:4015:3: (lv_value_0_0= RULE_INT )
            {
            // InternalKiBuild.g:4015:3: (lv_value_0_0= RULE_INT )
            // InternalKiBuild.g:4016:4: lv_value_0_0= RULE_INT
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
    // InternalKiBuild.g:4035:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKiBuild.g:4035:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKiBuild.g:4036:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalKiBuild.g:4042:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:4048:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKiBuild.g:4049:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKiBuild.g:4049:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKiBuild.g:4050:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKiBuild.g:4050:3: (lv_value_0_0= RULE_FLOAT )
            // InternalKiBuild.g:4051:4: lv_value_0_0= RULE_FLOAT
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
    // InternalKiBuild.g:4070:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKiBuild.g:4070:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKiBuild.g:4071:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalKiBuild.g:4077:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:4083:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKiBuild.g:4084:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKiBuild.g:4084:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKiBuild.g:4085:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKiBuild.g:4085:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKiBuild.g:4086:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalKiBuild.g:4105:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKiBuild.g:4105:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKiBuild.g:4106:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalKiBuild.g:4112:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:4118:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKiBuild.g:4119:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKiBuild.g:4119:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKiBuild.g:4120:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalKiBuild.g:4120:3: (lv_value_0_0= RULE_STRING )
            // InternalKiBuild.g:4121:4: lv_value_0_0= RULE_STRING
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
    // InternalKiBuild.g:4140:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKiBuild.g:4140:52: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKiBuild.g:4141:2: iv_ruleVectorValue= ruleVectorValue EOF
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
    // InternalKiBuild.g:4147:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4153:2: ( (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) )
            // InternalKiBuild.g:4154:2: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            {
            // InternalKiBuild.g:4154:2: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            // InternalKiBuild.g:4155:3: otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKiBuild.g:4159:3: ( (lv_values_1_0= ruleVectorValueMember ) )
            // InternalKiBuild.g:4160:4: (lv_values_1_0= ruleVectorValueMember )
            {
            // InternalKiBuild.g:4160:4: (lv_values_1_0= ruleVectorValueMember )
            // InternalKiBuild.g:4161:5: lv_values_1_0= ruleVectorValueMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
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

            // InternalKiBuild.g:4178:3: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==26) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalKiBuild.g:4179:4: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalKiBuild.g:4183:4: ( (lv_values_3_0= ruleVectorValueMember ) )
            	    // InternalKiBuild.g:4184:5: (lv_values_3_0= ruleVectorValueMember )
            	    {
            	    // InternalKiBuild.g:4184:5: (lv_values_3_0= ruleVectorValueMember )
            	    // InternalKiBuild.g:4185:6: lv_values_3_0= ruleVectorValueMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
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
            	    break loop72;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:4211:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKiBuild.g:4211:58: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKiBuild.g:4212:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
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
    // InternalKiBuild.g:4218:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4224:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKiBuild.g:4225:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKiBuild.g:4225:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalKiBuild.g:4226:3: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalKiBuild.g:4238:3: this_ValuedExpression_1= ruleValuedExpression
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
                    // InternalKiBuild.g:4250:3: this_IgnoreValue_2= ruleIgnoreValue
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
    // InternalKiBuild.g:4265:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKiBuild.g:4265:52: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKiBuild.g:4266:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
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
    // InternalKiBuild.g:4272:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKiBuild.g:4278:2: ( ( () otherlv_1= '_' ) )
            // InternalKiBuild.g:4279:2: ( () otherlv_1= '_' )
            {
            // InternalKiBuild.g:4279:2: ( () otherlv_1= '_' )
            // InternalKiBuild.g:4280:3: () otherlv_1= '_'
            {
            // InternalKiBuild.g:4280:3: ()
            // InternalKiBuild.g:4281:4: 
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:4298:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKiBuild.g:4298:49: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKiBuild.g:4299:2: iv_ruleAnyValue= ruleAnyValue EOF
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
    // InternalKiBuild.g:4305:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4311:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKiBuild.g:4312:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKiBuild.g:4312:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt74=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt74=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt74=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt74=3;
                }
                break;
            case RULE_STRING:
                {
                alt74=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalKiBuild.g:4313:3: this_IntValue_0= ruleIntValue
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
                    // InternalKiBuild.g:4325:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalKiBuild.g:4337:3: this_BoolValue_2= ruleBoolValue
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
                    // InternalKiBuild.g:4349:3: this_StringValue_3= ruleStringValue
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


    // $ANTLR start "entryRuleJsonObjectValue"
    // InternalKiBuild.g:4364:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // InternalKiBuild.g:4364:56: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // InternalKiBuild.g:4365:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonObjectValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonObjectValue=ruleJsonObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonObjectValue; 
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
    // $ANTLR end "entryRuleJsonObjectValue"


    // $ANTLR start "ruleJsonObjectValue"
    // InternalKiBuild.g:4371:1: ruleJsonObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4377:2: ( ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) )
            // InternalKiBuild.g:4378:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            {
            // InternalKiBuild.g:4378:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            // InternalKiBuild.g:4379:3: () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}'
            {
            // InternalKiBuild.g:4379:3: ()
            // InternalKiBuild.g:4380:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonObjectValueAccess().getJsonObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalKiBuild.g:4393:3: ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_STRING) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalKiBuild.g:4394:4: ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    {
                    // InternalKiBuild.g:4394:4: ( (lv_members_2_0= ruleJsonObjectMember ) )
                    // InternalKiBuild.g:4395:5: (lv_members_2_0= ruleJsonObjectMember )
                    {
                    // InternalKiBuild.g:4395:5: (lv_members_2_0= ruleJsonObjectMember )
                    // InternalKiBuild.g:4396:6: lv_members_2_0= ruleJsonObjectMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
                    lv_members_2_0=ruleJsonObjectMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                      						}
                      						add(
                      							current,
                      							"members",
                      							lv_members_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectMember");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKiBuild.g:4413:4: (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==26) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalKiBuild.g:4414:5: otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_57); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:4418:5: ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    // InternalKiBuild.g:4419:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    {
                    	    // InternalKiBuild.g:4419:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    // InternalKiBuild.g:4420:7: lv_members_4_0= ruleJsonObjectMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_55);
                    	    lv_members_4_0=ruleJsonObjectMember();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"members",
                    	      								lv_members_4_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectMember");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJsonObjectValueAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleJsonObjectValue"


    // $ANTLR start "entryRuleJsonObjectMember"
    // InternalKiBuild.g:4447:1: entryRuleJsonObjectMember returns [EObject current=null] : iv_ruleJsonObjectMember= ruleJsonObjectMember EOF ;
    public final EObject entryRuleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectMember = null;


        try {
            // InternalKiBuild.g:4447:57: (iv_ruleJsonObjectMember= ruleJsonObjectMember EOF )
            // InternalKiBuild.g:4448:2: iv_ruleJsonObjectMember= ruleJsonObjectMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonObjectMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonObjectMember=ruleJsonObjectMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonObjectMember; 
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
    // $ANTLR end "entryRuleJsonObjectMember"


    // $ANTLR start "ruleJsonObjectMember"
    // InternalKiBuild.g:4454:1: ruleJsonObjectMember returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) ;
    public final EObject ruleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4460:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) )
            // InternalKiBuild.g:4461:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            {
            // InternalKiBuild.g:4461:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            // InternalKiBuild.g:4462:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) )
            {
            // InternalKiBuild.g:4462:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalKiBuild.g:4463:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalKiBuild.g:4463:4: (lv_key_0_0= RULE_STRING )
            // InternalKiBuild.g:4464:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getJsonObjectMemberAccess().getKeySTRINGTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJsonObjectMemberRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"de.cau.cs.kieler.annotations.Annotations.STRING");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectMemberAccess().getColonKeyword_1());
              		
            }
            // InternalKiBuild.g:4484:3: ( (lv_value_2_0= ruleJsonValue ) )
            // InternalKiBuild.g:4485:4: (lv_value_2_0= ruleJsonValue )
            {
            // InternalKiBuild.g:4485:4: (lv_value_2_0= ruleJsonValue )
            // InternalKiBuild.g:4486:5: lv_value_2_0= ruleJsonValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonObjectMemberAccess().getValueJsonValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonObjectMemberRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
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
    // $ANTLR end "ruleJsonObjectMember"


    // $ANTLR start "entryRuleJsonArrayValue"
    // InternalKiBuild.g:4507:1: entryRuleJsonArrayValue returns [EObject current=null] : iv_ruleJsonArrayValue= ruleJsonArrayValue EOF ;
    public final EObject entryRuleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArrayValue = null;


        try {
            // InternalKiBuild.g:4507:55: (iv_ruleJsonArrayValue= ruleJsonArrayValue EOF )
            // InternalKiBuild.g:4508:2: iv_ruleJsonArrayValue= ruleJsonArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonArrayValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonArrayValue=ruleJsonArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonArrayValue; 
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
    // $ANTLR end "entryRuleJsonArrayValue"


    // $ANTLR start "ruleJsonArrayValue"
    // InternalKiBuild.g:4514:1: ruleJsonArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4520:2: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) )
            // InternalKiBuild.g:4521:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalKiBuild.g:4521:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            // InternalKiBuild.g:4522:3: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']'
            {
            // InternalKiBuild.g:4522:3: ()
            // InternalKiBuild.g:4523:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonArrayValueAccess().getJsonArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalKiBuild.g:4536:3: ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_INT && LA78_0<=RULE_FLOAT)||(LA78_0>=RULE_BOOLEAN && LA78_0<=RULE_STRING)||LA78_0==19||LA78_0==27||LA78_0==52) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalKiBuild.g:4537:4: ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    {
                    // InternalKiBuild.g:4537:4: ( (lv_elements_2_0= ruleJsonValue ) )
                    // InternalKiBuild.g:4538:5: (lv_elements_2_0= ruleJsonValue )
                    {
                    // InternalKiBuild.g:4538:5: (lv_elements_2_0= ruleJsonValue )
                    // InternalKiBuild.g:4539:6: lv_elements_2_0= ruleJsonValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_elements_2_0=ruleJsonValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJsonArrayValueRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKiBuild.g:4556:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==26) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalKiBuild.g:4557:5: otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKiBuild.g:4561:5: ( (lv_elements_4_0= ruleJsonValue ) )
                    	    // InternalKiBuild.g:4562:6: (lv_elements_4_0= ruleJsonValue )
                    	    {
                    	    // InternalKiBuild.g:4562:6: (lv_elements_4_0= ruleJsonValue )
                    	    // InternalKiBuild.g:4563:7: lv_elements_4_0= ruleJsonValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_60);
                    	    lv_elements_4_0=ruleJsonValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJsonArrayValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJsonArrayValueAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleJsonArrayValue"


    // $ANTLR start "entryRuleJsonValue"
    // InternalKiBuild.g:4590:1: entryRuleJsonValue returns [EObject current=null] : iv_ruleJsonValue= ruleJsonValue EOF ;
    public final EObject entryRuleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonValue = null;


        try {
            // InternalKiBuild.g:4590:50: (iv_ruleJsonValue= ruleJsonValue EOF )
            // InternalKiBuild.g:4591:2: iv_ruleJsonValue= ruleJsonValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonValue=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonValue; 
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
    // $ANTLR end "entryRuleJsonValue"


    // $ANTLR start "ruleJsonValue"
    // InternalKiBuild.g:4597:1: ruleJsonValue returns [EObject current=null] : (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) ;
    public final EObject ruleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObjectValue_0 = null;

        EObject this_JsonArrayValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_AnyValue_3 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4603:2: ( (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) )
            // InternalKiBuild.g:4604:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            {
            // InternalKiBuild.g:4604:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt79=1;
                }
                break;
            case 27:
                {
                alt79=2;
                }
                break;
            case 52:
                {
                alt79=3;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalKiBuild.g:4605:3: this_JsonObjectValue_0= ruleJsonObjectValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonObjectValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonObjectValue_0=ruleJsonObjectValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonObjectValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:4617:3: this_JsonArrayValue_1= ruleJsonArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonArrayValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonArrayValue_1=ruleJsonArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonArrayValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKiBuild.g:4629:3: this_NullValue_2= ruleNullValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getNullValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKiBuild.g:4641:3: this_AnyValue_3= ruleAnyValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getAnyValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AnyValue_3=ruleAnyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnyValue_3;
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
    // $ANTLR end "ruleJsonValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalKiBuild.g:4656:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalKiBuild.g:4656:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalKiBuild.g:4657:2: iv_ruleNullValue= ruleNullValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullValue; 
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
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalKiBuild.g:4663:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKiBuild.g:4669:2: ( ( () otherlv_1= 'null' ) )
            // InternalKiBuild.g:4670:2: ( () otherlv_1= 'null' )
            {
            // InternalKiBuild.g:4670:2: ( () otherlv_1= 'null' )
            // InternalKiBuild.g:4671:3: () otherlv_1= 'null'
            {
            // InternalKiBuild.g:4671:3: ()
            // InternalKiBuild.g:4672:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullValueAccess().getNullValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
              		
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
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalKiBuild.g:4689:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKiBuild.g:4689:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKiBuild.g:4690:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalKiBuild.g:4696:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4702:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKiBuild.g:4703:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKiBuild.g:4703:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt80=4;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalKiBuild.g:4704:3: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CommentAnnotation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:4716:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_KeyStringValueAnnotation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKiBuild.g:4728:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedKeyStringValueAnnotation_2=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedKeyStringValueAnnotation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKiBuild.g:4740:3: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TagAnnotation_3;
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKiBuild.g:4755:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKiBuild.g:4755:58: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKiBuild.g:4756:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKiBuild.g:4762:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:4768:2: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKiBuild.g:4769:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKiBuild.g:4769:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKiBuild.g:4770:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKiBuild.g:4770:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKiBuild.g:4771:4: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalKiBuild.g:4790:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKiBuild.g:4790:54: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKiBuild.g:4791:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKiBuild.g:4797:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4803:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiBuild.g:4804:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiBuild.g:4804:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiBuild.g:4805:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKiBuild.g:4809:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:4810:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:4810:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:4811:5: lv_name_1_0= ruleExtendedID
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
    // InternalKiBuild.g:4832:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKiBuild.g:4832:50: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKiBuild.g:4833:2: iv_rulePragmaTag= rulePragmaTag EOF
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
    // InternalKiBuild.g:4839:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4845:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiBuild.g:4846:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiBuild.g:4846:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiBuild.g:4847:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKiBuild.g:4851:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:4852:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:4852:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:4853:5: lv_name_1_0= ruleExtendedID
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
    // InternalKiBuild.g:4874:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKiBuild.g:4874:65: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKiBuild.g:4875:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKiBuild.g:4881:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4887:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiBuild.g:4888:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiBuild.g:4888:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiBuild.g:4889:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKiBuild.g:4893:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:4894:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:4894:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:4895:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_61);
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

            // InternalKiBuild.g:4912:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiBuild.g:4913:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiBuild.g:4913:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiBuild.g:4914:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalKiBuild.g:4931:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==26) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalKiBuild.g:4932:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKiBuild.g:4936:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiBuild.g:4937:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiBuild.g:4937:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiBuild.g:4938:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiBuild.g:4960:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKiBuild.g:4960:75: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiBuild.g:4961:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKiBuild.g:4967:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:4973:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiBuild.g:4974:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiBuild.g:4974:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKiBuild.g:4975:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKiBuild.g:4979:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:4980:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:4980:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:4981:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_62);
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

            // InternalKiBuild.g:4998:3: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKiBuild.g:4999:4: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKiBuild.g:4999:4: (lv_values_2_0= ruleEStringBoolean )
            // InternalKiBuild.g:5000:5: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalKiBuild.g:5017:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==26) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalKiBuild.g:5018:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKiBuild.g:5022:4: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKiBuild.g:5023:5: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKiBuild.g:5023:5: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKiBuild.g:5024:6: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiBuild.g:5046:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKiBuild.g:5046:53: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKiBuild.g:5047:2: iv_ruleStringPragma= ruleStringPragma EOF
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
    // InternalKiBuild.g:5053:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:5059:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiBuild.g:5060:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiBuild.g:5060:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiBuild.g:5061:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKiBuild.g:5065:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:5066:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5066:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:5067:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_61);
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

            // InternalKiBuild.g:5084:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiBuild.g:5085:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiBuild.g:5085:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiBuild.g:5086:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalKiBuild.g:5103:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==26) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalKiBuild.g:5104:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKiBuild.g:5108:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiBuild.g:5109:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiBuild.g:5109:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiBuild.g:5110:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiBuild.g:5132:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiBuild.g:5132:70: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiBuild.g:5133:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiBuild.g:5139:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKiBuild.g:5145:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiBuild.g:5146:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiBuild.g:5146:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKiBuild.g:5147:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKiBuild.g:5151:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:5152:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5152:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:5153:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_63);
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

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKiBuild.g:5174:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiBuild.g:5175:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5175:4: (lv_type_3_0= ruleExtendedID )
            // InternalKiBuild.g:5176:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
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

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKiBuild.g:5197:3: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKiBuild.g:5198:4: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKiBuild.g:5198:4: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKiBuild.g:5199:5: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalKiBuild.g:5216:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==26) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalKiBuild.g:5217:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKiBuild.g:5221:4: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKiBuild.g:5222:5: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiBuild.g:5222:5: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKiBuild.g:5223:6: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiBuild.g:5245:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiBuild.g:5245:80: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiBuild.g:5246:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKiBuild.g:5252:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKiBuild.g:5258:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiBuild.g:5259:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiBuild.g:5259:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKiBuild.g:5260:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKiBuild.g:5264:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:5265:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5265:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:5266:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_63);
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

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKiBuild.g:5287:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiBuild.g:5288:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5288:4: (lv_type_3_0= ruleExtendedID )
            // InternalKiBuild.g:5289:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
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

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKiBuild.g:5310:3: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKiBuild.g:5311:4: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKiBuild.g:5311:4: (lv_values_5_0= ruleEStringBoolean )
            // InternalKiBuild.g:5312:5: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalKiBuild.g:5329:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==26) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalKiBuild.g:5330:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKiBuild.g:5334:4: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKiBuild.g:5335:5: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKiBuild.g:5335:5: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKiBuild.g:5336:6: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiBuild.g:5358:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKiBuild.g:5358:71: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiBuild.g:5359:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiBuild.g:5365:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:5371:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKiBuild.g:5372:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKiBuild.g:5372:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKiBuild.g:5373:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKiBuild.g:5377:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:5378:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5378:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:5379:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_57);
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

            // InternalKiBuild.g:5396:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKiBuild.g:5397:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalKiBuild.g:5397:4: (lv_values_2_0= RULE_STRING )
            // InternalKiBuild.g:5398:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            // InternalKiBuild.g:5414:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==26) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalKiBuild.g:5415:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKiBuild.g:5419:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKiBuild.g:5420:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKiBuild.g:5420:5: (lv_values_4_0= RULE_STRING )
            	    // InternalKiBuild.g:5421:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_19); if (state.failed) return current;
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
    // InternalKiBuild.g:5442:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiBuild.g:5442:76: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiBuild.g:5443:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiBuild.g:5449:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKiBuild.g:5455:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKiBuild.g:5456:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKiBuild.g:5456:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKiBuild.g:5457:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKiBuild.g:5461:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiBuild.g:5462:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5462:4: (lv_name_1_0= ruleExtendedID )
            // InternalKiBuild.g:5463:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_63);
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

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKiBuild.g:5484:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiBuild.g:5485:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiBuild.g:5485:4: (lv_type_3_0= ruleExtendedID )
            // InternalKiBuild.g:5486:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
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

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKiBuild.g:5507:3: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKiBuild.g:5508:4: (lv_values_5_0= RULE_STRING )
            {
            // InternalKiBuild.g:5508:4: (lv_values_5_0= RULE_STRING )
            // InternalKiBuild.g:5509:5: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            // InternalKiBuild.g:5525:3: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==26) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalKiBuild.g:5526:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKiBuild.g:5530:4: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKiBuild.g:5531:5: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKiBuild.g:5531:5: (lv_values_7_0= RULE_STRING )
            	    // InternalKiBuild.g:5532:6: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_19); if (state.failed) return current;
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
    // InternalKiBuild.g:5553:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKiBuild.g:5553:54: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKiBuild.g:5554:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKiBuild.g:5560:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:5566:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKiBuild.g:5567:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKiBuild.g:5567:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
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
                    // InternalKiBuild.g:5568:3: this_STRING_0= RULE_STRING
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
                    // InternalKiBuild.g:5576:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiBuild.g:5587:3: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKiBuild.g:5598:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKiBuild.g:5598:55: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKiBuild.g:5599:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKiBuild.g:5605:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;



        	enterRule();

        try {
            // InternalKiBuild.g:5611:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKiBuild.g:5612:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKiBuild.g:5612:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
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
            case 38:
                {
                int LA89_4 = input.LA(2);

                if ( (LA89_4==RULE_INT) ) {
                    alt89=4;
                }
                else if ( (LA89_4==RULE_FLOAT) ) {
                    alt89=5;
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
                    // InternalKiBuild.g:5613:3: this_STRING_0= RULE_STRING
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
                    // InternalKiBuild.g:5621:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiBuild.g:5632:3: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKiBuild.g:5640:3: this_Integer_3= ruleInteger
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
                    // InternalKiBuild.g:5651:3: this_Floateger_4= ruleFloateger
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
    // InternalKiBuild.g:5665:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKiBuild.g:5665:50: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKiBuild.g:5666:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKiBuild.g:5672:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5678:2: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKiBuild.g:5679:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKiBuild.g:5679:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKiBuild.g:5680:3: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKiBuild.g:5687:3: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==38) ) {
                    int LA91_2 = input.LA(2);

                    if ( (LA91_2==RULE_ID) ) {
                        alt91=1;
                    }


                }
                else if ( (LA91_0==45) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalKiBuild.g:5688:4: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKiBuild.g:5688:4: (kw= '.' | kw= '-' )
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==45) ) {
            	        alt90=1;
            	    }
            	    else if ( (LA90_0==38) ) {
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
            	            // InternalKiBuild.g:5689:5: kw= '.'
            	            {
            	            kw=(Token)match(input,45,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKiBuild.g:5695:5: kw= '-'
            	            {
            	            kw=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_64); if (state.failed) return current;
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

            // InternalKiBuild.g:5709:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==54) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalKiBuild.g:5710:4: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
    // InternalKiBuild.g:5727:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKiBuild.g:5727:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalKiBuild.g:5728:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKiBuild.g:5734:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5740:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKiBuild.g:5741:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKiBuild.g:5741:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKiBuild.g:5742:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKiBuild.g:5742:3: (kw= '-' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==38) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalKiBuild.g:5743:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
    // InternalKiBuild.g:5760:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKiBuild.g:5760:49: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKiBuild.g:5761:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKiBuild.g:5767:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5773:2: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKiBuild.g:5774:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKiBuild.g:5774:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKiBuild.g:5775:3: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKiBuild.g:5775:3: (kw= '-' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==38) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalKiBuild.g:5776:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
    // InternalKiBuild.g:5793:1: ruleSign returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5799:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalKiBuild.g:5800:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalKiBuild.g:5800:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==37) ) {
                alt95=1;
            }
            else if ( (LA95_0==38) ) {
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
                    // InternalKiBuild.g:5801:3: (enumLiteral_0= '+' )
                    {
                    // InternalKiBuild.g:5801:3: (enumLiteral_0= '+' )
                    // InternalKiBuild.g:5802:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:5809:3: (enumLiteral_1= '-' )
                    {
                    // InternalKiBuild.g:5809:3: (enumLiteral_1= '-' )
                    // InternalKiBuild.g:5810:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5820:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKiBuild.g:5826:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKiBuild.g:5827:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKiBuild.g:5827:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt96=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt96=1;
                }
                break;
            case 56:
                {
                alt96=2;
                }
                break;
            case 57:
                {
                alt96=3;
                }
                break;
            case 58:
                {
                alt96=4;
                }
                break;
            case 59:
                {
                alt96=5;
                }
                break;
            case 60:
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
                    // InternalKiBuild.g:5828:3: (enumLiteral_0= '==' )
                    {
                    // InternalKiBuild.g:5828:3: (enumLiteral_0= '==' )
                    // InternalKiBuild.g:5829:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:5836:3: (enumLiteral_1= '<' )
                    {
                    // InternalKiBuild.g:5836:3: (enumLiteral_1= '<' )
                    // InternalKiBuild.g:5837:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiBuild.g:5844:3: (enumLiteral_2= '<=' )
                    {
                    // InternalKiBuild.g:5844:3: (enumLiteral_2= '<=' )
                    // InternalKiBuild.g:5845:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiBuild.g:5852:3: (enumLiteral_3= '>' )
                    {
                    // InternalKiBuild.g:5852:3: (enumLiteral_3= '>' )
                    // InternalKiBuild.g:5853:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKiBuild.g:5860:3: (enumLiteral_4= '>=' )
                    {
                    // InternalKiBuild.g:5860:3: (enumLiteral_4= '>=' )
                    // InternalKiBuild.g:5861:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKiBuild.g:5868:3: (enumLiteral_5= '!=' )
                    {
                    // InternalKiBuild.g:5868:3: (enumLiteral_5= '!=' )
                    // InternalKiBuild.g:5869:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5879:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5885:2: ( (enumLiteral_0= 'pre' ) )
            // InternalKiBuild.g:5886:2: (enumLiteral_0= 'pre' )
            {
            // InternalKiBuild.g:5886:2: (enumLiteral_0= 'pre' )
            // InternalKiBuild.g:5887:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5896:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5902:2: ( (enumLiteral_0= '~' ) )
            // InternalKiBuild.g:5903:2: (enumLiteral_0= '~' )
            {
            // InternalKiBuild.g:5903:2: (enumLiteral_0= '~' )
            // InternalKiBuild.g:5904:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5913:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5919:2: ( (enumLiteral_0= '^' ) )
            // InternalKiBuild.g:5920:2: (enumLiteral_0= '^' )
            {
            // InternalKiBuild.g:5920:2: (enumLiteral_0= '^' )
            // InternalKiBuild.g:5921:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5930:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5936:2: ( (enumLiteral_0= '|' ) )
            // InternalKiBuild.g:5937:2: (enumLiteral_0= '|' )
            {
            // InternalKiBuild.g:5937:2: (enumLiteral_0= '|' )
            // InternalKiBuild.g:5938:3: enumLiteral_0= '|'
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
    // InternalKiBuild.g:5947:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5953:2: ( (enumLiteral_0= '&' ) )
            // InternalKiBuild.g:5954:2: (enumLiteral_0= '&' )
            {
            // InternalKiBuild.g:5954:2: (enumLiteral_0= '&' )
            // InternalKiBuild.g:5955:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5964:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5970:2: ( (enumLiteral_0= '!' ) )
            // InternalKiBuild.g:5971:2: (enumLiteral_0= '!' )
            {
            // InternalKiBuild.g:5971:2: (enumLiteral_0= '!' )
            // InternalKiBuild.g:5972:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5981:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:5987:2: ( (enumLiteral_0= '+' ) )
            // InternalKiBuild.g:5988:2: (enumLiteral_0= '+' )
            {
            // InternalKiBuild.g:5988:2: (enumLiteral_0= '+' )
            // InternalKiBuild.g:5989:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:5998:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6004:2: ( (enumLiteral_0= '-' ) )
            // InternalKiBuild.g:6005:2: (enumLiteral_0= '-' )
            {
            // InternalKiBuild.g:6005:2: (enumLiteral_0= '-' )
            // InternalKiBuild.g:6006:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6015:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6021:2: ( (enumLiteral_0= '*' ) )
            // InternalKiBuild.g:6022:2: (enumLiteral_0= '*' )
            {
            // InternalKiBuild.g:6022:2: (enumLiteral_0= '*' )
            // InternalKiBuild.g:6023:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6032:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6038:2: ( (enumLiteral_0= '%' ) )
            // InternalKiBuild.g:6039:2: (enumLiteral_0= '%' )
            {
            // InternalKiBuild.g:6039:2: (enumLiteral_0= '%' )
            // InternalKiBuild.g:6040:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6049:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6055:2: ( (enumLiteral_0= '/' ) )
            // InternalKiBuild.g:6056:2: (enumLiteral_0= '/' )
            {
            // InternalKiBuild.g:6056:2: (enumLiteral_0= '/' )
            // InternalKiBuild.g:6057:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6066:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6072:2: ( (enumLiteral_0= 'val' ) )
            // InternalKiBuild.g:6073:2: (enumLiteral_0= 'val' )
            {
            // InternalKiBuild.g:6073:2: (enumLiteral_0= 'val' )
            // InternalKiBuild.g:6074:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6083:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6089:2: ( (enumLiteral_0= '||' ) )
            // InternalKiBuild.g:6090:2: (enumLiteral_0= '||' )
            {
            // InternalKiBuild.g:6090:2: (enumLiteral_0= '||' )
            // InternalKiBuild.g:6091:3: enumLiteral_0= '||'
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
    // InternalKiBuild.g:6100:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6106:2: ( (enumLiteral_0= '&&' ) )
            // InternalKiBuild.g:6107:2: (enumLiteral_0= '&&' )
            {
            // InternalKiBuild.g:6107:2: (enumLiteral_0= '&&' )
            // InternalKiBuild.g:6108:3: enumLiteral_0= '&&'
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


    // $ANTLR start "ruleShiftLeftOperator"
    // InternalKiBuild.g:6117:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6123:2: ( (enumLiteral_0= '<<' ) )
            // InternalKiBuild.g:6124:2: (enumLiteral_0= '<<' )
            {
            // InternalKiBuild.g:6124:2: (enumLiteral_0= '<<' )
            // InternalKiBuild.g:6125:3: enumLiteral_0= '<<'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6134:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6140:2: ( (enumLiteral_0= '>>' ) )
            // InternalKiBuild.g:6141:2: (enumLiteral_0= '>>' )
            {
            // InternalKiBuild.g:6141:2: (enumLiteral_0= '>>' )
            // InternalKiBuild.g:6142:3: enumLiteral_0= '>>'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6151:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6157:2: ( (enumLiteral_0= '>>>' ) )
            // InternalKiBuild.g:6158:2: (enumLiteral_0= '>>>' )
            {
            // InternalKiBuild.g:6158:2: (enumLiteral_0= '>>>' )
            // InternalKiBuild.g:6159:3: enumLiteral_0= '>>>'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiBuild.g:6168:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6174:2: ( (enumLiteral_0= '?' ) )
            // InternalKiBuild.g:6175:2: (enumLiteral_0= '?' )
            {
            // InternalKiBuild.g:6175:2: (enumLiteral_0= '?' )
            // InternalKiBuild.g:6176:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleFBYOperator"
    // InternalKiBuild.g:6185:1: ruleFBYOperator returns [Enumerator current=null] : (enumLiteral_0= '->' ) ;
    public final Enumerator ruleFBYOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKiBuild.g:6191:2: ( (enumLiteral_0= '->' ) )
            // InternalKiBuild.g:6192:2: (enumLiteral_0= '->' )
            {
            // InternalKiBuild.g:6192:2: (enumLiteral_0= '->' )
            // InternalKiBuild.g:6193:3: enumLiteral_0= '->'
            {
            enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getFBYOperatorAccess().getFBYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getFBYOperatorAccess().getFBYEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleFBYOperator"

    // $ANTLR start synpred21_InternalKiBuild
    public final void synpred21_InternalKiBuild_fragment() throws RecognitionException {   
        EObject lv_value_2_0 = null;


        // InternalKiBuild.g:809:3: ( ( (lv_value_2_0= ruleSignedInt ) ) )
        // InternalKiBuild.g:809:3: ( (lv_value_2_0= ruleSignedInt ) )
        {
        // InternalKiBuild.g:809:3: ( (lv_value_2_0= ruleSignedInt ) )
        // InternalKiBuild.g:810:4: (lv_value_2_0= ruleSignedInt )
        {
        // InternalKiBuild.g:810:4: (lv_value_2_0= ruleSignedInt )
        // InternalKiBuild.g:811:5: lv_value_2_0= ruleSignedInt
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
    // $ANTLR end synpred21_InternalKiBuild

    // $ANTLR start synpred22_InternalKiBuild
    public final void synpred22_InternalKiBuild_fragment() throws RecognitionException {   
        EObject lv_value_3_0 = null;


        // InternalKiBuild.g:829:3: ( ( (lv_value_3_0= ruleSignedFloat ) ) )
        // InternalKiBuild.g:829:3: ( (lv_value_3_0= ruleSignedFloat ) )
        {
        // InternalKiBuild.g:829:3: ( (lv_value_3_0= ruleSignedFloat ) )
        // InternalKiBuild.g:830:4: (lv_value_3_0= ruleSignedFloat )
        {
        // InternalKiBuild.g:830:4: (lv_value_3_0= ruleSignedFloat )
        // InternalKiBuild.g:831:5: lv_value_3_0= ruleSignedFloat
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
    // $ANTLR end synpred22_InternalKiBuild

    // $ANTLR start synpred26_InternalKiBuild
    public final void synpred26_InternalKiBuild_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKiBuild.g:1079:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKiBuild.g:1079:3: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred26_InternalKiBuild

    // $ANTLR start synpred38_InternalKiBuild
    public final void synpred38_InternalKiBuild_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKiBuild.g:1764:3: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKiBuild.g:1764:3: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred38_InternalKiBuild

    // $ANTLR start synpred58_InternalKiBuild
    public final void synpred58_InternalKiBuild_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKiBuild.g:2933:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKiBuild.g:2933:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKiBuild.g:2933:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        // InternalKiBuild.g:2934:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        {
        // InternalKiBuild.g:2934:4: ()
        // InternalKiBuild.g:2935:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKiBuild.g:2944:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKiBuild.g:2945:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKiBuild.g:2945:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKiBuild.g:2946:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_40);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiBuild.g:2963:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKiBuild.g:2964:5: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKiBuild.g:2964:5: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKiBuild.g:2965:6: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_32);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiBuild.g:2982:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKiBuild.g:2983:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKiBuild.g:2983:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKiBuild.g:2984:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_41);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_32); if (state.failed) return ;
        // InternalKiBuild.g:3005:4: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        // InternalKiBuild.g:3006:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        {
        // InternalKiBuild.g:3006:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        // InternalKiBuild.g:3007:6: lv_subExpressions_5_0= ruleAtomicValuedExpression
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
    // $ANTLR end synpred58_InternalKiBuild

    // $ANTLR start synpred59_InternalKiBuild
    public final void synpred59_InternalKiBuild_fragment() throws RecognitionException {   
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalKiBuild.g:3056:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKiBuild.g:3056:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKiBuild.g:3056:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
        // InternalKiBuild.g:3057:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        {
        // InternalKiBuild.g:3057:4: ()
        // InternalKiBuild.g:3058:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKiBuild.g:3067:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKiBuild.g:3068:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKiBuild.g:3068:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKiBuild.g:3069:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_42);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiBuild.g:3086:4: ( (lv_operator_2_0= ruleFBYOperator ) )
        // InternalKiBuild.g:3087:5: (lv_operator_2_0= ruleFBYOperator )
        {
        // InternalKiBuild.g:3087:5: (lv_operator_2_0= ruleFBYOperator )
        // InternalKiBuild.g:3088:6: lv_operator_2_0= ruleFBYOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFBYExpressionAccess().getOperatorFBYOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_32);
        lv_operator_2_0=ruleFBYOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiBuild.g:3105:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKiBuild.g:3106:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKiBuild.g:3106:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKiBuild.g:3107:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred59_InternalKiBuild

    // $ANTLR start synpred71_InternalKiBuild
    public final void synpred71_InternalKiBuild_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKiBuild.g:3328:3: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKiBuild.g:3328:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKiBuild.g:3328:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKiBuild.g:3329:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_32); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_43);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred71_InternalKiBuild

    // $ANTLR start synpred87_InternalKiBuild
    public final void synpred87_InternalKiBuild_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKiBuild.g:4226:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKiBuild.g:4226:3: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred87_InternalKiBuild

    // $ANTLR start synpred88_InternalKiBuild
    public final void synpred88_InternalKiBuild_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKiBuild.g:4238:3: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKiBuild.g:4238:3: this_ValuedExpression_1= ruleValuedExpression
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
    // $ANTLR end synpred88_InternalKiBuild

    // Delegated rules

    public final boolean synpred58_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalKiBuild() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalKiBuild_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA80 dfa80 = new DFA80(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\3\uffff\1\13\2\uffff\4\13\3\uffff\2\13\1\uffff\1\13";
    static final String dfa_3s = "\1\23\1\4\1\uffff\1\4\2\5\4\4\1\5\2\uffff\2\4\1\34\1\4";
    static final String dfa_4s = "\1\31\1\46\1\uffff\1\33\2\6\4\32\1\5\2\uffff\2\32\1\34\1\33";
    static final String dfa_5s = "\2\uffff\1\3\10\uffff\1\1\1\2\4\uffff";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\5\uffff\1\1",
            "\1\3\1\6\1\7\1\uffff\1\10\1\11\11\uffff\1\2\21\uffff\1\4\1\5",
            "",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14\1\12",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14",
            "\1\17",
            "",
            "",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14",
            "\1\20",
            "\1\13\14\uffff\1\13\2\uffff\3\13\3\uffff\1\14\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "635:3: ( (otherlv_2= ':' ( (lv_value_3_0= ruleLiteral ) ) ) | (otherlv_4= ':' ( (lv_values_5_0= ruleLiteral ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLiteral ) ) )+ ) | ( (otherlv_8= ':' )? otherlv_9= '{' ( (lv_attributes_10_0= ruleAttributeMapping ) )+ otherlv_11= '}' ) )";
        }
    }
    static final String dfa_8s = "\24\uffff";
    static final String dfa_9s = "\1\4\20\0\3\uffff";
    static final String dfa_10s = "\1\77\20\0\3\uffff";
    static final String dfa_11s = "\21\uffff\1\1\1\uffff\1\2";
    static final String dfa_12s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\3\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\1\2\1\3\1\20\1\7\1\4\1\16\10\uffff\1\5\22\uffff\1\1\3\uffff\1\6\4\uffff\1\14\1\15\1\13\1\21\2\uffff\1\17\7\uffff\1\10\1\21\1\11",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1078:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_14 = input.LA(1);

                         
                        int index22_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA22_16 = input.LA(1);

                         
                        int index22_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKiBuild()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index22_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\1\4\5\uffff\13\0\2\uffff";
    static final String dfa_16s = "\1\77\5\uffff\13\0\2\uffff";
    static final String dfa_17s = "\1\uffff\1\1\17\uffff\1\2\1\uffff";
    static final String dfa_18s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\12\2\1\1\20\1\7\1\1\1\16\10\uffff\1\1\22\uffff\1\1\3\uffff\1\6\4\uffff\1\14\1\15\1\13\1\21\2\uffff\1\17\7\uffff\1\10\1\21\1\11",
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
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1763:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_16 = input.LA(1);

                         
                        int index34_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKiBuild()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\22\uffff";
    static final String dfa_21s = "\1\4\17\0\2\uffff";
    static final String dfa_22s = "\1\77\17\0\2\uffff";
    static final String dfa_23s = "\20\uffff\1\1\1\2";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\2\uffff}>";
    static final String[] dfa_25s = {
            "\1\11\1\1\1\2\1\17\1\6\1\3\1\15\10\uffff\1\4\26\uffff\1\5\4\uffff\1\13\1\14\1\12\3\uffff\1\16\7\uffff\1\7\1\uffff\1\10",
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
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2932:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA54_14 = input.LA(1);

                         
                        int index54_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA54_15 = input.LA(1);

                         
                        int index54_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "3055:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_11 = input.LA(1);

                         
                        int index55_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_13 = input.LA(1);

                         
                        int index55_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_14 = input.LA(1);

                         
                        int index55_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA55_15 = input.LA(1);

                         
                        int index55_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\13\uffff";
    static final String dfa_27s = "\3\uffff\1\2\5\uffff\1\2\1\uffff";
    static final String dfa_28s = "\1\4\2\uffff\1\24\5\uffff\1\24\1\uffff";
    static final String dfa_29s = "\1\77\2\uffff\1\101\5\uffff\1\101\1\uffff";
    static final String dfa_30s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\7\1\10\1\uffff\1\4";
    static final String dfa_31s = "\13\uffff}>";
    static final String[] dfa_32s = {
            "\1\3\2\uffff\1\10\1\1\1\uffff\1\10\37\uffff\1\4\4\uffff\1\6\1\7\1\5\3\uffff\1\10\7\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "\1\2\4\uffff\21\2\1\12\1\2\1\11\1\2\1\12\10\uffff\6\2\3\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "\1\2\4\uffff\21\2\1\12\1\2\1\11\1\2\1\12\10\uffff\6\2\3\uffff\2\2",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "3155:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )";
        }
    }
    static final String dfa_33s = "\1\4\4\uffff\1\0\13\uffff";
    static final String dfa_34s = "\1\77\4\uffff\1\0\13\uffff";
    static final String dfa_35s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\11\uffff\1\5";
    static final String dfa_36s = "\5\uffff\1\0\13\uffff}>";
    static final String[] dfa_37s = {
            "\1\6\1\1\1\2\2\6\1\3\1\6\10\uffff\1\4\26\uffff\1\5\4\uffff\3\6\3\uffff\1\6\7\uffff\1\6\1\uffff\1\6",
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
            "",
            "",
            ""
    };
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "3279:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_5 = input.LA(1);

                         
                        int index57_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKiBuild()) ) {s = 16;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index57_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_38s = "\25\uffff";
    static final String dfa_39s = "\1\4\20\0\4\uffff";
    static final String dfa_40s = "\1\77\20\0\4\uffff";
    static final String dfa_41s = "\21\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_42s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\4\uffff}>";
    static final String[] dfa_43s = {
            "\1\12\1\2\1\3\1\20\1\7\1\4\1\16\10\uffff\1\5\22\uffff\1\1\3\uffff\1\6\4\uffff\1\14\1\15\1\13\1\21\1\23\1\uffff\1\17\7\uffff\1\10\1\21\1\11",
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
            ""
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "4225:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalKiBuild()) ) {s = 17;}

                        else if ( (synpred88_InternalKiBuild()) ) {s = 20;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\14\uffff";
    static final String dfa_45s = "\3\uffff\1\11\6\uffff\2\11";
    static final String dfa_46s = "\1\12\1\uffff\4\4\1\5\3\uffff\2\4";
    static final String dfa_47s = "\1\65\1\uffff\1\4\1\66\1\4\1\6\1\5\3\uffff\1\66\1\65";
    static final String dfa_48s = "\1\uffff\1\1\5\uffff\1\3\1\2\1\4\2\uffff";
    static final String dfa_49s = "\14\uffff}>";
    static final String[] dfa_50s = {
            "\1\1\52\uffff\1\2",
            "",
            "\1\3",
            "\3\10\1\11\2\10\1\11\20\uffff\1\7\12\uffff\1\5\6\uffff\1\4\7\uffff\1\11\1\6",
            "\1\12",
            "\1\12\2\10",
            "\1\13",
            "",
            "",
            "",
            "\3\10\1\11\2\10\1\11\20\uffff\1\7\12\uffff\1\5\6\uffff\1\4\7\uffff\1\11\1\6",
            "\3\10\1\11\2\10\1\11\20\uffff\1\7\12\uffff\1\10\16\uffff\1\11"
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_44;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "4703:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000620012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000620002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000720010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000A080000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006000000370L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xE0278460000807F0L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1F80000000000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xA0238460000807F0L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xA000000000000010L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200008000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000440000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xE0278462000807F0L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080004000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000480L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xE02F8460000807F0L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000100200L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0010006008080370L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010006018080370L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000004000000370L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0040204000000002L});
    }


}