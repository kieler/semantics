package de.cau.cs.kieler.yakindu.sccharts.model.stext.parser.antlr.internal; 

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
import de.cau.cs.kieler.yakindu.sccharts.model.stext.services.SCChartsExpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCChartsExpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'static'", "'='", "'with'", "';'", "'signal'", "':'", "'extern'", "'('", "')'", "'/'", "'Suspend'", "'Entry'", "'During'", "'Exit'", "'#'", "'['", "']'", "','", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'operation'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'>'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
    public static final int RULE_HEX=8;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__99=99;
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
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=9;
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
    public static final int RULE_BOOL=6;
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
    public static final int RULE_INT=5;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=11;
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


        public InternalSCChartsExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCChartsExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSCChartsExpParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g"; }



     	private SCChartsExpGrammarAccess grammarAccess;
     	
        public InternalSCChartsExpParser(TokenStream input, SCChartsExpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VariableDefinition";	
       	}
       	
       	@Override
       	protected SCChartsExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:68:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:69:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:70:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition75);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:77:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_1_0=null;
        Token lv_isOutput_2_0=null;
        Token lv_isStatic_3_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_initialValue_7_0 = null;

        Enumerator lv_varCombineOperator_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:80:28: ( ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:81:2: () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:87:2: ( (lv_isInput_1_0= 'input' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:88:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:88:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:89:3: lv_isInput_1_0= 'input'
                    {
                    lv_isInput_1_0=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinition137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isInput_1_0, grammarAccess.getVariableDefinitionAccess().getIsInputInputKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isInput", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:102:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:103:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:103:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:104:3: lv_isOutput_2_0= 'output'
                    {
                    lv_isOutput_2_0=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isOutput_2_0, grammarAccess.getVariableDefinitionAccess().getIsOutputOutputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isOutput", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:117:3: ( (lv_isStatic_3_0= 'static' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:118:1: (lv_isStatic_3_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:118:1: (lv_isStatic_3_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:119:3: lv_isStatic_3_0= 'static'
                    {
                    lv_isStatic_3_0=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinition201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isStatic_3_0, grammarAccess.getVariableDefinitionAccess().getIsStaticStaticKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isStatic", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:132:3: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:133:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:133:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:134:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition238);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:147:2: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:148:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:148:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:149:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:165:2: (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:165:4: otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinition273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:169:1: ( (lv_initialValue_7_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:170:1: (lv_initialValue_7_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:170:1: (lv_initialValue_7_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:171:3: lv_initialValue_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition294);
                    lv_initialValue_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_7_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:187:4: (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:187:6: otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getWithKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:191:1: ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:192:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:192:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:193:3: lv_varCombineOperator_9_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleVariableDefinition330);
                    lv_varCombineOperator_9_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"varCombineOperator",
                              		lv_varCombineOperator_9_0, 
                              		"CombineOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleVariableDefinition344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getVariableDefinitionAccess().getSemicolonKeyword_8());
                  
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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:221:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:222:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:223:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope380);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope390); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:230:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;

        EObject lv_declarations_1_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:233:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:234:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:234:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:234:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:234:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:235:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:240:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||(LA7_0>=14 && LA7_0<=16)||LA7_0==20||LA7_0==22||LA7_0==25||(LA7_0>=27 && LA7_0<=31)||(LA7_0>=38 && LA7_0<=57)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:241:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:241:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:242:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:242:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    int alt6=4;
            	    alt6 = dfa6.predict(input);
            	    switch (alt6) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:243:3: lv_declarations_1_1= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStateScope447);
            	            lv_declarations_1_1=ruleVariableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_1_1, 
            	                      		"VariableDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:258:8: lv_declarations_1_2= ruleSignalDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsSignalDeclarationParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleStateScope466);
            	            lv_declarations_1_2=ruleSignalDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_1_2, 
            	                      		"SignalDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:273:8: lv_declarations_1_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleStateScope485);
            	            lv_declarations_1_3=ruleOperationDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_1_3, 
            	                      		"OperationDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:288:8: lv_declarations_1_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope504);
            	            lv_declarations_1_4=ruleLocalReaction();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getStateScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_1_4, 
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
            	    break loop7;
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


    // $ANTLR start "entryRuleSignalDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:314:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:315:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:316:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration544);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration554); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalDeclaration"


    // $ANTLR start "ruleSignalDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:323:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:326:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:328:5: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration600);
            this_SignalDefinition_0=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SignalDefinition_0; 
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
    // $ANTLR end "ruleSignalDeclaration"


    // $ANTLR start "entryRuleSignalDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:344:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:345:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:346:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition634);
            iv_ruleSignalDefinition=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDefinition644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalDefinition"


    // $ANTLR start "ruleSignalDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:353:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
    public final EObject ruleSignalDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_Input_1_0=null;
        Token lv_Output_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_varInitialValue_8_0 = null;

        Enumerator lv_varCombineOperator_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:356:28: ( ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:357:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:357:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:357:2: () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:357:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:358:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:363:2: ( (lv_Input_1_0= 'input' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:364:1: (lv_Input_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:364:1: (lv_Input_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:365:3: lv_Input_1_0= 'input'
                    {
                    lv_Input_1_0=(Token)match(input,14,FOLLOW_14_in_ruleSignalDefinition696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Input_1_0, grammarAccess.getSignalDefinitionAccess().getInputInputKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "Input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:378:3: ( (lv_Output_2_0= 'output' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:379:1: (lv_Output_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:379:1: (lv_Output_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:380:3: lv_Output_2_0= 'output'
                    {
                    lv_Output_2_0=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Output_2_0, grammarAccess.getSignalDefinitionAccess().getOutputOutputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "Output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSignalDefinition754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:397:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:398:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:398:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:399:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getSignalDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:415:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:415:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSignalDefinition789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:419:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:420:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:420:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:421:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getTypeTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSignalDefinition812);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:434:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==17) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:434:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition825); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:438:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:439:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:439:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:440:3: lv_varInitialValue_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleSignalDefinition846);
                            lv_varInitialValue_8_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"varInitialValue",
                                      		lv_varInitialValue_8_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:456:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==18) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:456:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition861); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:460:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:461:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:461:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:462:3: lv_varCombineOperator_10_0= ruleCombineOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignalDefinition882);
                            lv_varCombineOperator_10_0=ruleCombineOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"varCombineOperator",
                                      		lv_varCombineOperator_10_0, 
                                      		"CombineOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getSignalDefinitionAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleSignalDefinition"


    // $ANTLR start "entryRuleOperationDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:490:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:491:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:492:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition934);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition944); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:499:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:502:28: ( ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:503:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:503:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:503:2: () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:503:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:504:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOperationDefinition990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getExternKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:513:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:514:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:514:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:515:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getFunctionTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition1013);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:528:2: ( (lv_name_3_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:529:1: (lv_name_3_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:529:1: (lv_name_3_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:530:3: lv_name_3_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition1034);
            lv_name_3_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"XID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOperationDefinition1046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:550:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:551:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:551:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:552:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParamTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition1069);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOperationDefinition1081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleOperationDefinition1093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getSemicolonKeyword_7());
                  
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


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:581:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:582:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:583:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1129);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction1139); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:590:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_trigger_0_1 = null;

        EObject lv_trigger_0_2 = null;

        EObject lv_effect_2_1 = null;

        EObject lv_effect_2_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:593:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:594:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:594:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:594:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:594:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=27 && LA14_0<=31)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:595:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:595:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:596:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:596:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=27 && LA13_0<=29)) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||(LA13_0>=30 && LA13_0<=31)) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:597:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1187);
                            lv_trigger_0_1=ruleLocalReactionTrigger();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"trigger",
                                      		lv_trigger_0_1, 
                                      		"LocalReactionTrigger");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:612:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1206);
                            lv_trigger_0_2=ruleReactionTrigger();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"trigger",
                                      		lv_trigger_0_2, 
                                      		"ReactionTrigger");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:630:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:630:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLocalReaction1223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:634:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:635:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:635:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:636:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:636:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==23||LA15_0==34||(LA15_0>=56 && LA15_0<=57)||LA15_0==63||(LA15_0>=89 && LA15_0<=90)||LA15_0==93) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:637:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction1246);
                    lv_effect_2_1=ruleReactionEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_2_1, 
                              		"ReactionEffect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:652:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1265);
                    lv_effect_2_2=ruleSuspendEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_2_2, 
                              		"SuspendEffect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleLocalReaction1281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalReactionAccess().getSemicolonKeyword_2());
                  
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


    // $ANTLR start "entryRuleSuspendEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:682:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:683:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:684:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1317);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect1327); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuspendEffect"


    // $ANTLR start "ruleSuspendEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:691:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:694:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:695:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:695:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:695:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:695:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:696:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSuspendEffect1373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendEffectAccess().getSuspendKeyword_1());
                  
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
    // $ANTLR end "ruleSuspendEffect"


    // $ANTLR start "entryRuleLocalReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:713:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:714:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:715:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1409);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger1419); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalReactionTrigger"


    // $ANTLR start "ruleLocalReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:722:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_reactionTrigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:725:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:726:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:726:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:726:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:726:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:727:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:732:2: ( (lv_stateReaction_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:733:1: (lv_stateReaction_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:733:1: (lv_stateReaction_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:734:3: lv_stateReaction_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getStateReactionStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1474);
            lv_stateReaction_1_0=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
              	        }
                     		set(
                     			current, 
                     			"stateReaction",
                      		lv_stateReaction_1_0, 
                      		"StateReaction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:750:2: (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:750:4: otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleLocalReactionTrigger1487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:754:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||(LA16_0>=30 && LA16_0<=31)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:755:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:755:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:756:3: lv_reactionTrigger_3_0= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerReactionTriggerParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1508);
                            lv_reactionTrigger_3_0=ruleReactionTrigger();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"reactionTrigger",
                                      		lv_reactionTrigger_3_0, 
                                      		"ReactionTrigger");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

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
    // $ANTLR end "ruleLocalReactionTrigger"


    // $ANTLR start "entryRuleStateReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:780:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:781:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:782:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1547);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1557); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateReaction"


    // $ANTLR start "ruleStateReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:789:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:792:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:793:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:793:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            case 29:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:794:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1604);
                    this_Entry_0=ruleEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entry_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:804:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1631);
                    this_Inside_1=ruleInside();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Inside_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:814:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1658);
                    this_Exit_2=ruleExit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Exit_2; 
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
    // $ANTLR end "ruleStateReaction"


    // $ANTLR start "entryRuleEntry"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:830:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:831:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:832:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1693);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1703); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:839:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:842:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:843:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:843:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:843:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:843:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:844:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEntry1749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryAccess().getEntryKeyword_1());
                  
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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleInside"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:861:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:862:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:863:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1785);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1795); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInside"


    // $ANTLR start "ruleInside"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:870:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:873:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:874:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:874:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:874:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:874:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:875:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInside1841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInsideAccess().getDuringKeyword_1());
                  
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
    // $ANTLR end "ruleInside"


    // $ANTLR start "entryRuleExit"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:892:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:893:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:894:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1877);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1887); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:901:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:904:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:905:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:905:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:905:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:905:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:906:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExit1933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitAccess().getExitKeyword_1());
                  
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
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:923:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:924:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:925:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1969);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1979); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:932:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_guardExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:935:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:936:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:936:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:936:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:936:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:937:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:942:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:943:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:943:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:944:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,30,FOLLOW_30_in_ruleReactionTrigger2031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isImmediate_1_0, grammarAccess.getReactionTriggerAccess().getIsImmediateNumberSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReactionTriggerRule());
                      	        }
                             		setWithLastConsumed(current, "isImmediate", true, "#");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:957:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:958:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:958:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:959:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger2062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_delay_2_0, grammarAccess.getReactionTriggerAccess().getDelayINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReactionTriggerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"delay",
                              		lv_delay_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:975:3: ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:975:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:975:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:976:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:976:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:977:3: lv_trigger_3_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2090);
                    lv_trigger_3_0=ruleRegularEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_3_0, 
                              		"RegularEventSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:994:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:994:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:994:8: otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleReactionTrigger2109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:998:1: ( (lv_guardExpression_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:999:1: (lv_guardExpression_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:999:1: (lv_guardExpression_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1000:3: lv_guardExpression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger2130);
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

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleReactionTrigger2142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_3_1_2());
                          
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


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1028:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1029:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1030:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2180);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2190); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1037:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1040:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1041:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1041:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1041:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1041:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1047:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1048:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1048:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1049:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2245);
            lv_actions_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
              	        }
                     		add(
                     			current, 
                     			"actions",
                      		lv_actions_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1065:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) && (synpred1_InternalSCChartsExp())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1065:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1065:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1065:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleReactionEffect2266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1070:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1071:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1071:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1072:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2288);
            	    lv_actions_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReactionEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actions",
            	              		lv_actions_3_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1096:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1097:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1098:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2326);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2336); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1105:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_ActiveStateReferenceExpression_2 = null;

        EObject this_PreValueExpression_3 = null;

        EObject this_ParenthesizedExpression_4 = null;

        EObject this_EventValueReferenceExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1108:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1109:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1109:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            int alt23=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
                {
                alt23=2;
                }
                break;
            case 57:
                {
                alt23=3;
                }
                break;
            case 34:
                {
                alt23=4;
                }
                break;
            case 23:
                {
                alt23=5;
                }
                break;
            case 56:
                {
                alt23=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1110:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2383);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1120:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2410);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1130:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2437);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1140:5: this_PreValueExpression_3= rulePreValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2464);
                    this_PreValueExpression_3=rulePreValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PreValueExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1150:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2491);
                    this_ParenthesizedExpression_4=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1160:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2518);
                    this_EventValueReferenceExpression_5=ruleEventValueReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventValueReferenceExpression_5; 
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


    // $ANTLR start "entryRulePreValueExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1176:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1177:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1178:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2553);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2563); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreValueExpression"


    // $ANTLR start "rulePreValueExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1185:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1188:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1189:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1189:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1189:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1189:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1190:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePreValueExpression2609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePreValueExpression2621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1203:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1204:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1204:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1205:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2642);
            lv_value_3_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPreValueExpressionRule());
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePreValueExpression2654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPreValueExpressionAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "rulePreValueExpression"


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1235:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1236:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1237:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2692);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2702); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1244:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1247:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1248:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1248:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt24=1;
                }
                break;
            case 36:
                {
                alt24=2;
                }
                break;
            case 37:
                {
                alt24=3;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1249:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2749);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1259:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2776);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1269:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2803);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1285:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1286:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1287:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2838);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2848); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1294:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1297:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1298:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1298:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1298:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleStatechartRoot2885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1302:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1303:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1303:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1304:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2906);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1328:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1329:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1330:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2942);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2952); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1337:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1340:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1341:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1341:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1341:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStateRoot2989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1345:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1346:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1346:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1347:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot3010);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1371:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1372:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1373:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot3046);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot3056); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1380:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1383:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1384:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1384:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1384:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTransitionRoot3093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1388:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1389:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1389:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1390:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3114);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1416:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1417:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1418:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3152);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification3162); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1425:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1428:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1429:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1429:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1429:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1429:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1430:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1435:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1435:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleStatechartSpecification3209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1439:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1440:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1440:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1441:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3230);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1457:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=39 && LA26_0<=40)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1458:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1458:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1459:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3253);
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
            	    break loop26;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1483:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1484:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1485:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3290);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3300); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1492:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1495:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1496:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1496:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1497:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1497:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1498:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3345);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1522:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1523:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1524:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3380);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3390); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1531:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1534:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1535:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1535:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1536:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1536:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1537:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3435);
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


    // $ANTLR start "entryRuleStatechartScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1563:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1564:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1565:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3472);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3482); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1572:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1575:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1576:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1576:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            else if ( (LA27_0==40) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1577:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3529);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1587:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3556);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1605:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1606:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1607:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3593);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3603); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1614:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1617:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1618:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1618:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1618:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1618:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1619:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleInterfaceScope3649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1628:1: ( (lv_name_2_0= ruleXID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||(LA28_0>=38 && LA28_0<=57)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1629:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1629:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1630:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3670);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleInterfaceScope3683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1650:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==58) ) {
                        alt30=1;
                    }
                    else if ( (LA30_2==RULE_ID) ) {
                        int LA30_5 = input.LA(3);

                        if ( ((LA30_5>=17 && LA30_5<=19)) ) {
                            alt30=1;
                        }


                    }


                    }
                    break;
                case 40:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (LA30_3==RULE_ID||LA30_3==58) ) {
                        alt30=1;
                    }


                    }
                    break;
                case RULE_ID:
                case 14:
                case 15:
                case 16:
                case 22:
                case 38:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    {
                    alt30=1;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1651:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1651:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1652:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1652:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        int LA29_1 = input.LA(2);

            	        if ( (LA29_1==RULE_ID||LA29_1==58) ) {
            	            alt29=2;
            	        }
            	        else if ( (LA29_1==41) ) {
            	            alt29=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 29, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 43:
            	        {
            	        int LA29_2 = input.LA(2);

            	        if ( (LA29_2==RULE_ID||LA29_2==58) ) {
            	            alt29=2;
            	        }
            	        else if ( (LA29_2==41) ) {
            	            alt29=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 29, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 44:
            	        {
            	        int LA29_3 = input.LA(2);

            	        if ( (LA29_3==41) ) {
            	            alt29=1;
            	        }
            	        else if ( (LA29_3==RULE_ID||LA29_3==58) ) {
            	            alt29=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 29, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 41:
            	        {
            	        switch ( input.LA(2) ) {
            	        case RULE_ID:
            	            {
            	            int LA29_8 = input.LA(3);

            	            if ( ((LA29_8>=17 && LA29_8<=19)) ) {
            	                alt29=2;
            	            }
            	            else if ( (LA29_8==EOF||LA29_8==RULE_ID||(LA29_8>=14 && LA29_8<=16)||(LA29_8>=21 && LA29_8<=22)||(LA29_8>=38 && LA29_8<=57)) ) {
            	                alt29=1;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 29, 8, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 38:
            	        case 39:
            	        case 40:
            	        case 41:
            	        case 42:
            	        case 43:
            	        case 44:
            	        case 45:
            	        case 46:
            	        case 47:
            	        case 48:
            	        case 49:
            	        case 50:
            	        case 51:
            	        case 52:
            	        case 53:
            	        case 54:
            	        case 55:
            	        case 56:
            	        case 57:
            	            {
            	            alt29=1;
            	            }
            	            break;
            	        case 58:
            	            {
            	            alt29=2;
            	            }
            	            break;
            	        default:
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 29, 4, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case RULE_ID:
            	    case 14:
            	    case 15:
            	    case 16:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 45:
            	    case 46:
            	    case 47:
            	    case 48:
            	    case 49:
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	    case 56:
            	    case 57:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt29=3;
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1653:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3706);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1668:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3725);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1683:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3744);
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1709:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1710:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1711:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3784);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3794); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1718:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1721:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1722:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1722:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1722:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1722:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1723:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleInternalScope3840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleInternalScope3852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1736:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==58) ) {
                        alt32=1;
                    }
                    else if ( (LA32_2==RULE_ID) ) {
                        int LA32_5 = input.LA(3);

                        if ( ((LA32_5>=17 && LA32_5<=19)) ) {
                            alt32=1;
                        }


                    }


                    }
                    break;
                case 40:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (LA32_3==RULE_ID||LA32_3==58) ) {
                        alt32=1;
                    }


                    }
                    break;
                case RULE_ID:
                case RULE_INT:
                case 14:
                case 15:
                case 16:
                case 22:
                case 25:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 38:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    {
                    alt32=1;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1737:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1737:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1738:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1738:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt31=4;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1739:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3875);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1754:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3894);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1769:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3913);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1784:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3932);
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
            	    break loop32;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1812:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1813:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1814:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3974);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3984); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1821:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1824:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1826:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion4030);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1844:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1845:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1846:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4066);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition4076); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1853:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1856:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1857:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1857:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1857:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1857:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=42 && LA33_0<=44)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1858:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1858:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1859:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition4122);
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleEventDefinition4135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1879:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1880:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1880:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1881:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition4156);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1897:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1897:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleEventDefinition4169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1901:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1902:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1902:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1903:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4192);
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1924:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1925:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1926:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4230);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4240); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1933:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1936:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1938:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4286);
            this_VariableDefinition_0=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VariableDefinition_0; 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleOperationDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1956:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1957:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1958:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4322);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4332); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1965:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1968:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1970:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4378);
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


    // $ANTLR start "entryRuleXID"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1990:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1991:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1992:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4417);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4428); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1999:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2002:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2003:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2003:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt35=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt35=1;
                }
                break;
            case 38:
                {
                alt35=2;
                }
                break;
            case 39:
                {
                alt35=3;
                }
                break;
            case 40:
                {
                alt35=4;
                }
                break;
            case 41:
                {
                alt35=5;
                }
                break;
            case 42:
                {
                alt35=6;
                }
                break;
            case 43:
                {
                alt35=7;
                }
                break;
            case 44:
                {
                alt35=8;
                }
                break;
            case 45:
                {
                alt35=9;
                }
                break;
            case 46:
                {
                alt35=10;
                }
                break;
            case 47:
                {
                alt35=11;
                }
                break;
            case 48:
                {
                alt35=12;
                }
                break;
            case 49:
                {
                alt35=13;
                }
                break;
            case 50:
                {
                alt35=14;
                }
                break;
            case 51:
                {
                alt35=15;
                }
                break;
            case 52:
                {
                alt35=16;
                }
                break;
            case 53:
                {
                alt35=17;
                }
                break;
            case 54:
                {
                alt35=18;
                }
                break;
            case 55:
                {
                alt35=19;
                }
                break;
            case 56:
                {
                alt35=20;
                }
                break;
            case 57:
                {
                alt35=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2003:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2012:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2019:2: kw= 'interface'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2026:2: kw= 'internal'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2033:2: kw= 'event'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2040:2: kw= 'local'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2047:2: kw= 'in'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2054:2: kw= 'out'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2061:2: kw= 'var'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2068:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2075:2: kw= 'external'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2082:2: kw= 'operation'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2089:2: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2096:2: kw= 'else'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2103:2: kw= 'entry'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2110:2: kw= 'exit'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2117:2: kw= 'always'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2124:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2131:2: kw= 'raise'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID4815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2138:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleXID4834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2145:2: kw= 'active'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleXID4853); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2158:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2159:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2160:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4894);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4905); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2167:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2170:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2171:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2171:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2172:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN4952);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2182:1: (kw= '.' this_XID_2= ruleXID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==58) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2183:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleFQN4971); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN4993);
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
            	    break loop36;
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


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2209:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2210:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2211:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5042);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5052); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2218:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2221:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2222:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2222:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2222:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2222:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2228:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_INT||LA37_1==31) ) {
                    alt37=1;
                }
                else if ( (LA37_1==RULE_ID) ) {
                    int LA37_4 = input.LA(3);

                    if ( (LA37_4==EOF||LA37_4==23||LA37_4==25||LA37_4==30||LA37_4==58) ) {
                        alt37=1;
                    }
                }
            }
            else if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==31||(LA37_0>=49 && LA37_0<=50)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2229:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2229:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2230:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5107);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2246:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2246:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTransitionReaction5121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2250:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2251:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2251:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2252:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5142);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2268:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2268:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleTransitionReaction5157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2272:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID||LA39_0==59) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2273:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2273:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2274:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5178);
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
    // $ANTLR end "ruleTransitionReaction"


    // $ANTLR start "entryRuleStextTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2298:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2299:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2300:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5217);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5227); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2307:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2310:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2311:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2311:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||(LA41_0>=30 && LA41_0<=31)) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=49 && LA41_0<=50)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2312:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5274);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2322:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5301);
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


    // $ANTLR start "entryRuleDefaultTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2338:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2339:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2340:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5336);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5346); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2347:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2350:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2351:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2351:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2351:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2351:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2352:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2357:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            else if ( (LA42_0==50) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2357:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleDefaultTrigger5393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2362:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleDefaultTrigger5411); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTransitionProperty"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2374:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2375:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2376:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5448);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty5458); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2383:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2386:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2387:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2387:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==59) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2388:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5505);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2398:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5532);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2414:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2415:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2416:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5567);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5577); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2423:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2426:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2427:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2427:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2427:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleEntryPointSpec5614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2431:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2432:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2432:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2433:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec5631); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2457:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2458:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2459:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5672);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5682); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2466:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2469:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2470:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2470:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2470:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2470:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2471:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2471:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2472:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec5724); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleExitPointSpec5741); if (state.failed) return current;
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


    // $ANTLR start "entryRuleRegularEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2502:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2503:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2504:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5779);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5789); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2511:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2514:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2515:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2515:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2516:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2516:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2517:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5834);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2541:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2542:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2543:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5869);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5879); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2550:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2553:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2554:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2554:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2554:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2554:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2555:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2555:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2556:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5925);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2572:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2573:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2573:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2574:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5946);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2590:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2591:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2591:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2592:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5967);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2616:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2617:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2618:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6003);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec6013); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2625:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2628:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2629:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2629:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt44=1;
                }
                break;
            case 52:
                {
                alt44=2;
                }
                break;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2630:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6060);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2640:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6087);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2650:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6114);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2666:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2667:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2668:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6149);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent6159); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2675:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2678:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2679:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2679:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2679:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2679:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2680:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleEntryEvent6205); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2697:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2698:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2699:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6241);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6251); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2706:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2709:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2710:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2710:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2710:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2710:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2711:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExitEvent6297); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2728:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2729:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2730:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6333);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6343); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2737:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2740:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2741:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2741:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2741:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2741:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2742:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2747:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            else if ( (LA45_0==54) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2747:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleAlwaysEvent6390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2752:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleAlwaysEvent6408); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2768:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2769:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2770:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6449);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6459); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2777:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2780:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2782:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6505);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2798:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2799:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2800:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6539);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6549); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2807:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2810:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2811:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2811:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2812:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6596);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2820:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==17||(LA46_0>=77 && LA46_0<=86)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2820:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2820:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2821:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2826:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2827:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2827:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2828:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6626);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2844:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2845:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2845:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2846:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6647);
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
            	    break loop46;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2870:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2871:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2872:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6685);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6695); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2879:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2882:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2883:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2883:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2884:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6742);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2892:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2892:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2892:2: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2893:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleConditionalExpression6763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2902:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2903:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2903:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2904:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6784);
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

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleConditionalExpression6796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2924:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2925:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2925:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2926:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6817);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2950:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2951:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2952:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6855);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6865); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2959:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2962:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2963:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2963:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2964:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6912);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2972:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==61) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2972:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2972:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2973:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLogicalOrExpression6933); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2982:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2983:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2983:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:2984:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6954);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3008:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3009:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3010:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6992);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression7002); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3017:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3020:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3021:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3021:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3022:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7049);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3030:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==62) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3030:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3030:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3031:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleLogicalAndExpression7070); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3040:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3041:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3041:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3042:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7091);
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
            	    break loop49;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3066:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3067:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3068:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7129);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7139); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3075:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3078:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3079:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3079:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==23||LA50_0==34||(LA50_0>=56 && LA50_0<=57)||(LA50_0>=89 && LA50_0<=90)||LA50_0==93) ) {
                alt50=1;
            }
            else if ( (LA50_0==63) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3080:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7186);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3089:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3089:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3089:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3089:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3090:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleLogicalNotExpression7213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3099:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3100:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3100:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3101:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7234);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3125:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3126:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3127:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7271);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7281); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3134:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3137:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3138:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3138:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3139:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7328);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3147:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==64) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3147:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3147:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3148:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseXorExpression7349); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3157:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3158:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3158:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3159:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7370);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3183:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3184:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3185:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7408);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7418); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3192:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3195:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3196:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3196:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3197:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7465);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3205:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==65) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3205:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3205:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3206:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleBitwiseOrExpression7486); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3215:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3216:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3216:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3217:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7507);
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
            	    break loop52;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3241:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3242:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3243:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7545);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7555); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3250:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3253:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3254:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3254:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3255:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7602);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3263:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==66) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3263:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3263:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3264:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleBitwiseAndExpression7623); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3273:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3274:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3274:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3275:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7644);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3299:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3300:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3301:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7682);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7692); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3308:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3311:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3312:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3312:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3313:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7739);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3321:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==59||(LA54_0>=94 && LA54_0<=98)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3321:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3321:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3322:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3327:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3328:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3328:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3329:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7769);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3345:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3346:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3346:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3347:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7790);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3371:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3372:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3373:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7828);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7838); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3380:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3383:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3384:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3384:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3385:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7885);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3393:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=87 && LA55_0<=88)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3393:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3393:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3394:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3399:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3400:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3400:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3401:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7915);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3417:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3418:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3418:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3419:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7936);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3443:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3444:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3445:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7974);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7984); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3452:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3455:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3456:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3456:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3457:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8031);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3465:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=89 && LA56_0<=90)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3465:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3465:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3466:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3471:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3472:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3472:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3473:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8061);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3489:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3490:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3490:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3491:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8082);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3515:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3516:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3517:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8120);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8130); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3524:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3527:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3528:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3528:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3529:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8177);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3537:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==25||(LA57_0>=91 && LA57_0<=92)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3537:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3537:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3538:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3543:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3544:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3544:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3545:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8207);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3561:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3562:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3562:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3563:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8228);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3587:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3588:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3589:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8266);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8276); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3596:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3599:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3600:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3600:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||LA58_0==23||LA58_0==34||(LA58_0>=56 && LA58_0<=57)) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=89 && LA58_0<=90)||LA58_0==93) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3601:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8323);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3610:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3610:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3610:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3610:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3611:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3616:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3617:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3617:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3618:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8359);
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3634:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3635:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3635:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3636:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8380);
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


    // $ANTLR start "entryRulePrimitiveValueExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3660:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3661:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3662:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8417);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8427); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3669:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3672:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3673:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3673:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3673:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3673:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3674:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3679:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3680:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3680:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3681:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8482);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3705:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3706:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3707:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8518);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8528); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3714:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3717:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3718:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3718:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3719:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8575);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3727:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==58) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3727:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3727:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3728:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleFeatureCall8596); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3737:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3738:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3738:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3739:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8616); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3750:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==23) && (synpred2_InternalSCChartsExp())) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3750:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3750:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3750:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3757:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3758:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,23,FOLLOW_23_in_ruleFeatureCall8650); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3771:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt60=2;
            	            int LA60_0 = input.LA(1);

            	            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||LA60_0==23||LA60_0==34||(LA60_0>=56 && LA60_0<=57)||LA60_0==63||(LA60_0>=89 && LA60_0<=90)||LA60_0==93) ) {
            	                alt60=1;
            	            }
            	            switch (alt60) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3771:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3771:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3772:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3772:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3773:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8685);
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

            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3789:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop59:
            	                    do {
            	                        int alt59=2;
            	                        int LA59_0 = input.LA(1);

            	                        if ( (LA59_0==33) ) {
            	                            alt59=1;
            	                        }


            	                        switch (alt59) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3789:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleFeatureCall8698); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3793:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3794:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3794:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3795:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8719);
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
            	                    	    break loop59;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleFeatureCall8735); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3823:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3824:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3825:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8775);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8785); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3832:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3835:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3836:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3836:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3836:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3836:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3837:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3842:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3843:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3843:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3844:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3855:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==23) && (synpred3_InternalSCChartsExp())) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3855:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3855:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3855:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3862:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3863:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,23,FOLLOW_23_in_ruleElementReferenceExpression8873); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3876:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)||LA64_0==23||LA64_0==34||(LA64_0>=56 && LA64_0<=57)||LA64_0==63||(LA64_0>=89 && LA64_0<=90)||LA64_0==93) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3876:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3876:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3877:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3877:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3878:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8908);
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

                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3894:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==33) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3894:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleElementReferenceExpression8921); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3898:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3899:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3899:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3900:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8942);
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
                            	    break loop63;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleElementReferenceExpression8958); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3928:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3929:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3930:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8996);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9006); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3937:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3940:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3941:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3941:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3941:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3941:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3942:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEventValueReferenceExpression9052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEventValueReferenceExpression9064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3955:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3956:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3956:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3957:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9085);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleEventValueReferenceExpression9097); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3985:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3986:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3987:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9133);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9143); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3994:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3997:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3998:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3998:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3998:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3998:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3999:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleActiveStateReferenceExpression9189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleActiveStateReferenceExpression9201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4012:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4013:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4013:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4014:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9224);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleActiveStateReferenceExpression9236); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4039:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4040:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4041:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9272);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9282); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4048:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4051:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4052:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4052:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4052:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4052:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4053:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParenthesizedExpression9328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4062:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4063:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4063:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4064:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9349);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParenthesizedExpression9361); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4092:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4093:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4094:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9397);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9407); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4101:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4104:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4105:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4105:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt66=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt66=1;
                }
                break;
            case RULE_INT:
                {
                alt66=2;
                }
                break;
            case RULE_HEX:
                {
                alt66=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt66=4;
                }
                break;
            case RULE_STRING:
                {
                alt66=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4106:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9454);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4116:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9481);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4126:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9508);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4136:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9535);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4146:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9562);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4162:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4163:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4164:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9597);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9607); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4171:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4174:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4175:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4175:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4175:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4175:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4181:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4182:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4182:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4183:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9658); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4207:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4208:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4209:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9699);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9709); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4216:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4219:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4220:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4220:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4220:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4220:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4221:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4226:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4227:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4227:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4228:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9760); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4252:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4253:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4254:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9801);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9811); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4261:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4264:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4265:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4265:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4265:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4265:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4266:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4271:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4272:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4272:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4273:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9862); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4297:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4298:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4299:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9903);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9913); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4306:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4309:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4310:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4310:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4310:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4310:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4311:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4316:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4317:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4317:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4318:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9964); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4342:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4343:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4344:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10005);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral10015); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4351:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4354:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4355:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4355:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4355:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4355:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4356:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4361:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4362:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4362:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4363:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10066); if (state.failed) return current;
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


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4387:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4389:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4390:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4390:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt67=8;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt67=1;
                }
                break;
            case 68:
                {
                alt67=2;
                }
                break;
            case 69:
                {
                alt67=3;
                }
                break;
            case 70:
                {
                alt67=4;
                }
                break;
            case 71:
                {
                alt67=5;
                }
                break;
            case 72:
                {
                alt67=6;
                }
                break;
            case 73:
                {
                alt67=7;
                }
                break;
            case 74:
                {
                alt67=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4390:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4390:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4390:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator10121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4396:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4396:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4396:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator10138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4402:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4402:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4402:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator10155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4408:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4408:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4408:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4414:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4414:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4414:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4420:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4420:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4420:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4426:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4426:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4426:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_73_in_ruleCombineOperator10223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4432:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4432:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4432:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_74_in_ruleCombineOperator10240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                          
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
    // $ANTLR end "ruleCombineOperator"


    // $ANTLR start "ruleDirection"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4442:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4444:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4445:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4445:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt68=1;
                }
                break;
            case 43:
                {
                alt68=2;
                }
                break;
            case 44:
                {
                alt68=3;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4445:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4445:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4445:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleDirection10285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4451:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4451:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4451:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleDirection10302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4457:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4457:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4457:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleDirection10319); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4467:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4469:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4470:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4470:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==75) ) {
                alt69=1;
            }
            else if ( (LA69_0==76) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4470:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4470:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4470:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleTimeEventType10364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4476:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4476:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4476:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleTimeEventType10381); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4486:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4488:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4489:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4489:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt70=11;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt70=1;
                }
                break;
            case 77:
                {
                alt70=2;
                }
                break;
            case 78:
                {
                alt70=3;
                }
                break;
            case 79:
                {
                alt70=4;
                }
                break;
            case 80:
                {
                alt70=5;
                }
                break;
            case 81:
                {
                alt70=6;
                }
                break;
            case 82:
                {
                alt70=7;
                }
                break;
            case 83:
                {
                alt70=8;
                }
                break;
            case 84:
                {
                alt70=9;
                }
                break;
            case 85:
                {
                alt70=10;
                }
                break;
            case 86:
                {
                alt70=11;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4489:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4489:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4489:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleAssignmentOperator10426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4495:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4495:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4495:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4501:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4501:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4501:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4507:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4507:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4507:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4513:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4513:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4513:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4519:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4519:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4519:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4525:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4525:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4525:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4531:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4531:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4531:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4537:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4537:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4537:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4543:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4543:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4543:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,85,FOLLOW_85_in_ruleAssignmentOperator10579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4549:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4549:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4549:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,86,FOLLOW_86_in_ruleAssignmentOperator10596); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4559:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4561:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4562:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4562:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==87) ) {
                alt71=1;
            }
            else if ( (LA71_0==88) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4562:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4562:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4562:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleShiftOperator10641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4568:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4568:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4568:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleShiftOperator10658); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4578:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4580:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4581:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4581:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==89) ) {
                alt72=1;
            }
            else if ( (LA72_0==90) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4581:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4581:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4581:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleAdditiveOperator10703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4587:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4587:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4587:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleAdditiveOperator10720); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4597:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4599:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4600:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4600:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt73=1;
                }
                break;
            case 25:
                {
                alt73=2;
                }
                break;
            case 92:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4600:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4600:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4600:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_91_in_ruleMultiplicativeOperator10765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4606:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4606:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4606:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicativeOperator10782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4612:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4612:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4612:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_92_in_ruleMultiplicativeOperator10799); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4622:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4624:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4625:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4625:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt74=1;
                }
                break;
            case 90:
                {
                alt74=2;
                }
                break;
            case 93:
                {
                alt74=3;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4625:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4625:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4625:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleUnaryOperator10844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4631:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4631:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4631:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleUnaryOperator10861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4637:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4637:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4637:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_93_in_ruleUnaryOperator10878); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4647:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4649:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4650:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4650:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt75=1;
                }
                break;
            case 95:
                {
                alt75=2;
                }
                break;
            case 59:
                {
                alt75=3;
                }
                break;
            case 96:
                {
                alt75=4;
                }
                break;
            case 97:
                {
                alt75=5;
                }
                break;
            case 98:
                {
                alt75=6;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4650:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4650:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4650:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator10923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4656:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4656:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4656:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator10940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4662:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4662:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4662:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleRelationalOperator10957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4668:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4668:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4668:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator10974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4674:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4674:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4674:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_97_in_ruleRelationalOperator10991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4680:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4680:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4680:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,98,FOLLOW_98_in_ruleRelationalOperator11008); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4690:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4692:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4693:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4693:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt76=1;
                }
                break;
            case 100:
                {
                alt76=2;
                }
                break;
            case 101:
                {
                alt76=3;
                }
                break;
            case 102:
                {
                alt76=4;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4693:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4693:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4693:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit11053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4699:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4699:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4699:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit11070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4705:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4705:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4705:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_101_in_ruleTimeUnit11087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4711:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4711:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:4711:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_102_in_ruleTimeUnit11104); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSCChartsExp
    public final void synpred1_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1065:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:1065:6: ','
        {
        match(input,33,FOLLOW_33_in_synpred1_InternalSCChartsExp2258); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSCChartsExp

    // $ANTLR start synpred2_InternalSCChartsExp
    public final void synpred2_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3750:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3751:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3751:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3752:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred2_InternalSCChartsExp8632); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSCChartsExp

    // $ANTLR start synpred3_InternalSCChartsExp
    public final void synpred3_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3855:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3856:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3856:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSCChartsExp.g:3857:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred3_InternalSCChartsExp8855); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSCChartsExp

    // Delegated rules

    public final boolean synpred1_InternalSCChartsExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSCChartsExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSCChartsExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSCChartsExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSCChartsExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSCChartsExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\3\4\1\uffff\1\4\3\uffff\2\4";
    static final String DFA6_maxS =
        "\3\71\1\uffff\1\72\3\uffff\1\71\1\72";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\1\3\1\4\2\uffff";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\4\1\7\10\uffff\1\1\1\2\1\3\3\uffff\1\5\1\uffff\1\6\2\uffff"+
            "\1\7\1\uffff\5\7\6\uffff\24\3",
            "\1\3\12\uffff\1\2\1\3\3\uffff\1\5\21\uffff\24\3",
            "\1\3\13\uffff\1\3\3\uffff\1\5\21\uffff\24\3",
            "",
            "\1\3\22\uffff\1\7\1\uffff\1\7\40\uffff\1\10",
            "",
            "",
            "",
            "\1\11\41\uffff\24\3",
            "\1\3\22\uffff\1\7\1\uffff\1\7\40\uffff\1\10"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "242:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )";
        }
    }
    static final String DFA31_eotS =
        "\15\uffff";
    static final String DFA31_eofS =
        "\12\uffff\1\11\2\uffff";
    static final String DFA31_minS =
        "\5\4\1\uffff\1\4\3\uffff\3\4";
    static final String DFA31_maxS =
        "\1\71\4\72\1\uffff\1\72\3\uffff\2\71\1\72";
    static final String DFA31_acceptS =
        "\5\uffff\1\2\1\uffff\1\3\1\4\1\1\3\uffff";
    static final String DFA31_specialS =
        "\15\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\6\1\10\10\uffff\3\5\5\uffff\1\7\2\uffff\1\10\1\uffff\5\10"+
            "\6\uffff\3\5\1\4\1\1\1\2\1\3\15\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\12\41\uffff\24\11\1\5",
            "",
            "\1\5\22\uffff\1\10\1\uffff\1\10\40\uffff\1\13",
            "",
            "",
            "",
            "\2\11\10\uffff\3\11\3\5\1\uffff\2\11\2\uffff\1\11\1\uffff"+
            "\5\11\6\uffff\24\11",
            "\1\14\41\uffff\24\5",
            "\1\5\22\uffff\1\10\1\uffff\1\10\40\uffff\1\13"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1738:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
        }
    }
 

    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinition137 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition169 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinition201 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition255 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinition273 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition294 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition309 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleVariableDefinition330 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariableDefinition344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope447 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope466 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope485 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope504 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSignalDefinition696 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition728 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition771 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_ruleSignalDefinition789 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSignalDefinition812 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleSignalDefinition825 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition846 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition861 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition882 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperationDefinition990 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition1013 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition1034 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition1046 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition1069 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperationDefinition1081 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperationDefinition1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1187 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1206 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLocalReaction1223 = new BitSet(new long[]{0x83000004048003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction1246 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1265 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLocalReaction1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSuspendEffect1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1474 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleLocalReactionTrigger1487 = new BitSet(new long[]{0x00000000F8000032L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEntry1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInside1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExit1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleReactionTrigger2031 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger2062 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleReactionTrigger2109 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger2130 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleReactionTrigger2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2245 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleReactionEffect2266 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2288 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePreValueExpression2609 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePreValueExpression2621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2642 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePreValueExpression2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatechartRoot2885 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStateRoot2989 = new BitSet(new long[]{0x03FFFFC0FA51C030L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot3046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTransitionRoot3093 = new BitSet(new long[]{0x00060000FA000030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStatechartSpecification3209 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3230 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3253 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInterfaceScope3649 = new BitSet(new long[]{0x03FFFFC000218010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3670 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInterfaceScope3683 = new BitSet(new long[]{0x03FFFFC00041C012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3706 = new BitSet(new long[]{0x03FFFFC00041C012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3725 = new BitSet(new long[]{0x03FFFFC00041C012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3744 = new BitSet(new long[]{0x03FFFFC00041C012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInternalScope3840 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInternalScope3852 = new BitSet(new long[]{0x03FFFFC0FA51C030L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3875 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3894 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3913 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3932 = new BitSet(new long[]{0x03FFFFC0FA51C032L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition4122 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEventDefinition4135 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition4156 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleEventDefinition4169 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXID4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXID4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4952 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFQN4971 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4993 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5107 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_25_in_ruleTransitionReaction5121 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5142 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleTransitionReaction5157 = new BitSet(new long[]{0x0800000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5178 = new BitSet(new long[]{0x0800000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDefaultTrigger5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDefaultTrigger5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEntryPointSpec5614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec5724 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleExitPointSpec5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5925 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5946 = new BitSet(new long[]{0x0000000000000000L,0x0000007800000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEntryEvent6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExitEvent6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAlwaysEvent6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlwaysEvent6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6596 = new BitSet(new long[]{0x0000000000020002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6626 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6647 = new BitSet(new long[]{0x0000000000020002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6742 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleConditionalExpression6763 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6784 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConditionalExpression6796 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6912 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalOrExpression6933 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6954 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7049 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLogicalAndExpression7070 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7091 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLogicalNotExpression7213 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseXorExpression7349 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBitwiseOrExpression7486 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleBitwiseAndExpression7623 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7739 = new BitSet(new long[]{0x0800000000000002L,0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7769 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7790 = new BitSet(new long[]{0x0800000000000002L,0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7885 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7915 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7936 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8031 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8061 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8082 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8177 = new BitSet(new long[]{0x0000000002000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8207 = new BitSet(new long[]{0x03000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8228 = new BitSet(new long[]{0x0000000002000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8359 = new BitSet(new long[]{0x03000004008003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8575 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFeatureCall8596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8616 = new BitSet(new long[]{0x0400000000800002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureCall8650 = new BitSet(new long[]{0x83000004018003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8685 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_33_in_ruleFeatureCall8698 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8719 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_24_in_ruleFeatureCall8735 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8839 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleElementReferenceExpression8873 = new BitSet(new long[]{0x83000004018003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8908 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_33_in_ruleElementReferenceExpression8921 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8942 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_24_in_ruleElementReferenceExpression8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEventValueReferenceExpression9052 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEventValueReferenceExpression9064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9085 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEventValueReferenceExpression9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleActiveStateReferenceExpression9189 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActiveStateReferenceExpression9201 = new BitSet(new long[]{0x03FFFFC000018010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9224 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActiveStateReferenceExpression9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParenthesizedExpression9328 = new BitSet(new long[]{0x83000004008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9349 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParenthesizedExpression9361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator10121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator10138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator10155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCombineOperator10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCombineOperator10240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDirection10285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDirection10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDirection10319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTimeEventType10364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTimeEventType10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAssignmentOperator10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssignmentOperator10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAssignmentOperator10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleShiftOperator10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleShiftOperator10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAdditiveOperator10703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAdditiveOperator10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleMultiplicativeOperator10765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicativeOperator10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleMultiplicativeOperator10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleUnaryOperator10844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUnaryOperator10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleUnaryOperator10878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRelationalOperator10957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator10974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRelationalOperator10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleRelationalOperator11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTimeUnit11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleTimeUnit11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred1_InternalSCChartsExp2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred2_InternalSCChartsExp8632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred3_InternalSCChartsExp8855 = new BitSet(new long[]{0x0000000000000002L});

}