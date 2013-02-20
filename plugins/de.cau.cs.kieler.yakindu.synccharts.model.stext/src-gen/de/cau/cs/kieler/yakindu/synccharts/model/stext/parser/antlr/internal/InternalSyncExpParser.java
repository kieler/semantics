package de.cau.cs.kieler.yakindu.synccharts.model.stext.parser.antlr.internal; 

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
import de.cau.cs.kieler.yakindu.synccharts.model.stext.services.SyncExpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSyncExpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "':'", "'='", "'with'", "';'", "'static'", "'/'", "'Suspend'", "'&&'", "'#'", "'['", "']'", "'Entry'", "'During'", "'Exit'", "','", "'pre'", "'('", "')'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'operation'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'?'", "'||'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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


        public InternalSyncExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSyncExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSyncExpParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g"; }



     	private SyncExpGrammarAccess grammarAccess;
     	
        public InternalSyncExpParser(TokenStream input, SyncExpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SignalDefinition";	
       	}
       	
       	@Override
       	protected SyncExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSignalDefinition"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:68:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:69:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:70:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition75);
            iv_ruleSignalDefinition=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDefinition85); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:77:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
    public final EObject ruleSignalDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_1_0=null;
        Token lv_isOutput_2_0=null;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:80:28: ( ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:81:2: () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:87:2: ( (lv_isInput_1_0= 'input' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:88:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:88:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:89:3: lv_isInput_1_0= 'input'
                    {
                    lv_isInput_1_0=(Token)match(input,14,FOLLOW_14_in_ruleSignalDefinition137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isInput_1_0, grammarAccess.getSignalDefinitionAccess().getIsInputInputKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isInput", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:102:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:103:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:103:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:104:3: lv_isOutput_2_0= 'output'
                    {
                    lv_isOutput_2_0=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isOutput_2_0, grammarAccess.getSignalDefinitionAccess().getIsOutputOutputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isOutput", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSignalDefinition195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:121:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:122:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:122:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:123:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition212); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:139:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:139:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:143:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:144:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:144:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:145:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getTypeTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSignalDefinition253);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:158:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==18) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:158:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition266); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:162:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:163:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:163:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:164:3: lv_varInitialValue_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleSignalDefinition287);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:180:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==19) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:180:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition302); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:184:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:185:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:185:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:186:3: lv_varCombineOperator_10_0= ruleCombineOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignalDefinition323);
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleSignalDefinition339); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:214:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:215:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:216:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition375);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition385); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:223:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_varInitialValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:226:28: ( ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:227:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:227:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:227:2: () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:227:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:233:2: ( (lv_isStatic_1_0= 'static' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:234:1: (lv_isStatic_1_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:234:1: (lv_isStatic_1_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:235:3: lv_isStatic_1_0= 'static'
                    {
                    lv_isStatic_1_0=(Token)match(input,21,FOLLOW_21_in_ruleVariableDefinition437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isStatic_1_0, grammarAccess.getVariableDefinitionAccess().getIsStaticStaticKeyword_1_0());
                          
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:248:3: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:249:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:249:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:250:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition474);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:263:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:264:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:264:1: (lv_name_3_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:265:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:281:2: (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:281:4: otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:285:1: ( (lv_varInitialValue_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:286:1: (lv_varInitialValue_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:286:1: (lv_varInitialValue_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:287:3: lv_varInitialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarInitialValueExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition530);
                    lv_varInitialValue_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"varInitialValue",
                              		lv_varInitialValue_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:315:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:316:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:317:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression580);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression590); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:324:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:327:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:328:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:328:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 57:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case 33:
                {
                alt8=5;
                }
                break;
            case 56:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:329:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression637);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:339:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression664);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:349:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression691);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:359:5: this_PreValueExpression_3= rulePreValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpression_in_rulePrimaryExpression718);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:369:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression745);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:379:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression772);
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


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:395:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:396:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:397:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope807);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope817); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:404:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;

        EObject lv_declarations_1_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:407:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:408:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:408:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:408:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:408:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:409:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:414:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=14 && LA10_0<=16)||(LA10_0>=21 && LA10_0<=22)||(LA10_0>=25 && LA10_0<=26)||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=38 && LA10_0<=57)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:415:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:415:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:416:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:416:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    int alt9=4;
            	    alt9 = dfa9.predict(input);
            	    switch (alt9) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:417:3: lv_declarations_1_1= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStateScope874);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:432:8: lv_declarations_1_2= ruleSignalDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsSignalDeclarationParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleStateScope893);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:447:8: lv_declarations_1_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleStateScope912);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:462:8: lv_declarations_1_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope931);
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
    // $ANTLR end "ruleStateScope"


    // $ANTLR start "entryRuleSignalDeclaration"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:488:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:489:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:490:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration971);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration981); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:497:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:500:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:502:5: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration1027);
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


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:518:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:519:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:520:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1061);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction1071); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:527:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:530:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:531:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:531:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:531:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:531:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||(LA12_0>=25 && LA12_0<=26)||(LA12_0>=28 && LA12_0<=30)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:532:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:532:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:533:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:533:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=28 && LA11_0<=30)) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=25 && LA11_0<=26)) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:534:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1119);
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
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:549:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1138);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:567:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:567:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLocalReaction1155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:571:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:572:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:572:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:573:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:573:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||(LA13_0>=32 && LA13_0<=33)||(LA13_0>=56 && LA13_0<=57)||LA13_0==61||(LA13_0>=87 && LA13_0<=88)||LA13_0==91) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:574:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction1178);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:589:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1197);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLocalReaction1213); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:619:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:620:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:621:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1249);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect1259); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:628:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:631:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:632:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:632:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:632:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:632:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:633:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSuspendEffect1305); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:650:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:651:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:652:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1341);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger1351); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:659:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_isImmediate_3_0=null;
        Token lv_delay_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_trigger_5_0 = null;

        EObject lv_guardExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:662:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:663:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:663:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:663:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:663:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:664:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:669:2: ( (lv_stateReaction_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:670:1: (lv_stateReaction_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:670:1: (lv_stateReaction_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:671:3: lv_stateReaction_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getStateReactionStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1406);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:687:2: (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:687:4: otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )?
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLocalReactionTrigger1419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getAmpersandAmpersandKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:691:1: ( (lv_isImmediate_3_0= '#' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:692:1: (lv_isImmediate_3_0= '#' )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:692:1: (lv_isImmediate_3_0= '#' )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:693:3: lv_isImmediate_3_0= '#'
                            {
                            lv_isImmediate_3_0=(Token)match(input,25,FOLLOW_25_in_ruleLocalReactionTrigger1437); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isImmediate_3_0, grammarAccess.getLocalReactionTriggerAccess().getIsImmediateNumberSignKeyword_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLocalReactionTriggerRule());
                              	        }
                                     		setWithLastConsumed(current, "isImmediate", true, "#");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:706:3: ( (lv_delay_4_0= RULE_INT ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:707:1: (lv_delay_4_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:707:1: (lv_delay_4_0= RULE_INT )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:708:3: lv_delay_4_0= RULE_INT
                            {
                            lv_delay_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLocalReactionTrigger1468); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_delay_4_0, grammarAccess.getLocalReactionTriggerAccess().getDelayINTTerminalRuleCall_2_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLocalReactionTriggerRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"delay",
                                      		lv_delay_4_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:724:3: ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==26) ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:724:4: ( (lv_trigger_5_0= ruleRegularEventSpec ) )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:724:4: ( (lv_trigger_5_0= ruleRegularEventSpec ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:725:1: (lv_trigger_5_0= ruleRegularEventSpec )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:725:1: (lv_trigger_5_0= ruleRegularEventSpec )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:726:3: lv_trigger_5_0= ruleRegularEventSpec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_2_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleLocalReactionTrigger1496);
                            lv_trigger_5_0=ruleRegularEventSpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"trigger",
                                      		lv_trigger_5_0, 
                                      		"RegularEventSpec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:743:6: (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:743:6: (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:743:8: otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleLocalReactionTrigger1515); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getLocalReactionTriggerAccess().getLeftSquareBracketKeyword_2_3_1_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:747:1: ( (lv_guardExpression_7_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:748:1: (lv_guardExpression_7_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:748:1: (lv_guardExpression_7_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:749:3: lv_guardExpression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_2_3_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleLocalReactionTrigger1536);
                            lv_guardExpression_7_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"guardExpression",
                                      		lv_guardExpression_7_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleLocalReactionTrigger1548); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getLocalReactionTriggerAccess().getRightSquareBracketKeyword_2_3_1_2());
                                  
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:777:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:778:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:779:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1589);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1599); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:786:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:789:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:790:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:790:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 30:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:791:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1646);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:801:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1673);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:811:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1700);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:827:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:828:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:829:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1735);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1745); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:836:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:839:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:840:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:840:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:840:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:840:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:841:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEntry1791); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:858:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:859:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:860:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1827);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1837); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:867:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:870:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:871:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:871:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:871:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:871:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:872:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleInside1883); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:889:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:890:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:891:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1919);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1929); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:898:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:901:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:902:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:902:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:902:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:902:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:903:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleExit1975); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:920:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:921:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:922:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger2011);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger2021); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:929:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:932:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:933:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:933:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:933:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:933:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:934:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:939:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:940:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:940:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:941:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,25,FOLLOW_25_in_ruleReactionTrigger2073); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:954:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:955:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:955:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:956:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger2104); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:972:3: ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:972:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:972:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:973:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:973:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:974:3: lv_trigger_3_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2132);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:991:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:991:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:991:8: otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleReactionTrigger2151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:995:1: ( (lv_guardExpression_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:996:1: (lv_guardExpression_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:996:1: (lv_guardExpression_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:997:3: lv_guardExpression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger2172);
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

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleReactionTrigger2184); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1025:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1026:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1027:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2222);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2232); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1034:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1037:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1038:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1038:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1038:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1038:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1039:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1044:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1045:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1045:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1046:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2287);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1062:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) && (synpred1_InternalSyncExp())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1062:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1062:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1062:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReactionEffect2308); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1067:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1068:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1068:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1069:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2330);
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


    // $ANTLR start "entryRulePreValueExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1093:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1094:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1095:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2368);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2378); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1102:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1105:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1106:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1106:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1106:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1106:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1107:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePreValueExpression2424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulePreValueExpression2436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1120:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1121:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1121:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1122:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2457);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePreValueExpression2469); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1152:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1153:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1154:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2507);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2517); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1161:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1164:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1165:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1165:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1166:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2564);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1176:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2591);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1186:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2618);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1202:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1203:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1204:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2653);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2663); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1211:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1214:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1215:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1215:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1215:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleStatechartRoot2700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1219:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1220:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1220:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1221:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2721);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1245:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1246:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1247:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2757);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2767); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1254:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1257:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1258:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1258:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1258:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStateRoot2804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1262:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1263:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1263:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1264:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2825);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1288:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1289:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1290:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2861);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2871); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1297:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1300:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1301:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1301:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1301:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTransitionRoot2908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1305:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1306:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1306:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1307:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2929);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1333:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1334:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1335:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2967);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2977); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1342:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1345:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1346:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1346:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1346:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1346:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1352:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1352:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleStatechartSpecification3024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1356:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1357:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1357:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1358:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3045);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1374:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=39 && LA25_0<=40)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1375:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1375:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1376:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3068);
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
            	    break loop25;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1400:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1401:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1402:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3105);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3115); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1409:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1412:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1413:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1413:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1414:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1414:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1415:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3160);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1439:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1440:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1441:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3195);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3205); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1448:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1451:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1452:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1452:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1453:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1453:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1454:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3250);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1480:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1481:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1482:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3287);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3297); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1489:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1492:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1493:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1493:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1494:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3344);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1504:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3371);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1522:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1523:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1524:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3408);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3418); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1531:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1534:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1535:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1535:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1535:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1535:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1536:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleInterfaceScope3464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1545:1: ( (lv_name_2_0= ruleXID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=38 && LA27_0<=57)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1546:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1546:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1547:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3485);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope3498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1567:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==RULE_ID) ) {
                        int LA29_5 = input.LA(3);

                        if ( (LA29_5==18||LA29_5==20) ) {
                            alt29=1;
                        }


                    }
                    else if ( (LA29_2==58) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (LA29_3==RULE_ID||LA29_3==58) ) {
                        alt29=1;
                    }


                    }
                    break;
                case RULE_ID:
                case 21:
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
                    alt29=1;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1568:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1568:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1569:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1569:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt28=3;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1570:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3521);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1585:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3540);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1600:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3559);
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
            	    break loop29;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1626:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1627:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1628:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3599);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3609); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1635:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1638:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1639:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1639:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1639:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1639:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleInternalScope3655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalScope3667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1653:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_ID) ) {
                        int LA31_5 = input.LA(3);

                        if ( (LA31_5==18||LA31_5==20) ) {
                            alt31=1;
                        }


                    }
                    else if ( (LA31_2==58) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (LA31_3==RULE_ID||LA31_3==58) ) {
                        alt31=1;
                    }


                    }
                    break;
                case RULE_ID:
                case RULE_INT:
                case 21:
                case 22:
                case 25:
                case 26:
                case 28:
                case 29:
                case 30:
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
                    alt31=1;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1654:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1654:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1655:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1655:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt30=4;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1656:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3690);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1671:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3709);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1686:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3728);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1701:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3747);
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
            	    break loop31;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1729:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1730:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1731:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3789);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3799); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1738:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1741:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1743:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3845);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1761:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1762:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1763:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3881);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3891); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1770:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1773:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1774:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1774:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1774:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1774:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=43 && LA32_0<=45)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1775:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1775:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1776:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3937);
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleEventDefinition3950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1796:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1797:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1797:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1798:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition3971);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1814:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1814:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventDefinition3984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1818:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1819:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1819:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1820:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4007);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1841:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1842:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1843:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4045);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4055); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1850:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1853:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1855:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4101);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1873:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1874:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1875:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4137);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4147); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1882:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1885:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1887:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4193);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1905:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1906:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1907:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4229);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition4239); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1914:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1917:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1918:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1918:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1918:2: () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1918:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1919:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOperationDefinition4285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1928:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1929:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1929:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1930:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition4306);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleOperationDefinition4318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1950:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||(LA35_0>=38 && LA35_0<=57)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1950:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1950:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1951:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1951:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1952:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4340);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1968:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==31) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1968:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleOperationDefinition4353); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1972:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1973:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1973:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1974:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4374);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleOperationDefinition4390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1994:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1994:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleOperationDefinition4403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1998:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1999:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1999:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2000:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4426);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2021:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2022:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2023:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4464);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4474); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2030:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2033:28: ( ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2034:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2034:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2034:2: ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2034:2: ( (lv_name_0_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2035:1: (lv_name_0_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2035:1: (lv_name_0_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2036:3: lv_name_0_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameXIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleParameter4520);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleParameter4532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2056:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2057:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2057:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2058:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter4555);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2079:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2080:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2081:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4592);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4603); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2088:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2091:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2092:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2092:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt37=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt37=1;
                }
                break;
            case 38:
                {
                alt37=2;
                }
                break;
            case 39:
                {
                alt37=3;
                }
                break;
            case 40:
                {
                alt37=4;
                }
                break;
            case 41:
                {
                alt37=5;
                }
                break;
            case 43:
                {
                alt37=6;
                }
                break;
            case 44:
                {
                alt37=7;
                }
                break;
            case 45:
                {
                alt37=8;
                }
                break;
            case 46:
                {
                alt37=9;
                }
                break;
            case 47:
                {
                alt37=10;
                }
                break;
            case 48:
                {
                alt37=11;
                }
                break;
            case 42:
                {
                alt37=12;
                }
                break;
            case 49:
                {
                alt37=13;
                }
                break;
            case 50:
                {
                alt37=14;
                }
                break;
            case 51:
                {
                alt37=15;
                }
                break;
            case 52:
                {
                alt37=16;
                }
                break;
            case 53:
                {
                alt37=17;
                }
                break;
            case 54:
                {
                alt37=18;
                }
                break;
            case 55:
                {
                alt37=19;
                }
                break;
            case 56:
                {
                alt37=20;
                }
                break;
            case 57:
                {
                alt37=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2092:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2101:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2108:2: kw= 'interface'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2115:2: kw= 'internal'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2122:2: kw= 'event'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2129:2: kw= 'local'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2136:2: kw= 'in'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2143:2: kw= 'out'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2150:2: kw= 'var'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2157:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2164:2: kw= 'external'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2171:2: kw= 'operation'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2178:2: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2185:2: kw= 'else'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2192:2: kw= 'entry'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2199:2: kw= 'exit'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2206:2: kw= 'always'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2213:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2220:2: kw= 'raise'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID4990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2227:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleXID5009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2234:2: kw= 'active'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleXID5028); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2247:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2248:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2249:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5069);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5080); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2256:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2259:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2260:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2260:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2261:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN5127);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2271:1: (kw= '.' this_XID_2= ruleXID )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2272:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleFQN5146); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN5168);
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
            	    break loop38;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2298:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2299:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2300:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5217);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5227); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2307:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2310:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2311:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2311:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2311:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2311:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2312:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2317:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INT)||(LA39_0>=25 && LA39_0<=26)||(LA39_0>=49 && LA39_0<=50)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2318:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2318:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2319:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5282);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2335:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==22) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2335:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransitionReaction5296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2339:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2340:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2340:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2341:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5317);
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2365:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2366:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2367:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5355);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5365); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2374:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2377:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2378:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2378:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||(LA41_0>=25 && LA41_0<=26)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2379:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5412);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2389:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5439);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2405:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2406:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2407:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5474);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5484); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2414:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2417:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2418:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2418:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2418:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2418:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2419:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2424:2: (otherlv_1= 'default' | otherlv_2= 'else' )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2424:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleDefaultTrigger5531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2429:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleDefaultTrigger5549); if (state.failed) return current;
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


    // $ANTLR start "entryRuleRegularEventSpec"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2443:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2444:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2445:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5588);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5598); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2452:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2455:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2456:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2456:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2457:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2457:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2458:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5643);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2482:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2483:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2484:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5678);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5688); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2491:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2494:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2495:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2495:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2495:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2495:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2496:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2496:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2497:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5734);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2513:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2514:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2514:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2515:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5755);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2531:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2532:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2532:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2533:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5776);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2557:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2558:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2559:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5812);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5822); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2566:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2569:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2570:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2570:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt43=1;
                }
                break;
            case 52:
                {
                alt43=2;
                }
                break;
            case 53:
            case 54:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2571:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5869);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2581:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5896);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2591:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5923);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2607:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2608:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2609:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5958);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5968); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2616:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2619:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2620:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2620:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2620:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2620:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2621:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleEntryEvent6014); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2638:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2639:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2640:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6050);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6060); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2647:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2650:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2651:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2651:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2651:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2651:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2652:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExitEvent6106); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2669:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2670:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2671:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6142);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6152); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2678:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2681:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2682:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2682:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2682:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2682:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2683:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2688:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            else if ( (LA44_0==54) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2688:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleAlwaysEvent6199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2693:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleAlwaysEvent6217); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2709:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2710:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2711:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6258);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6268); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2718:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2721:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2723:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6314);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2739:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2740:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2741:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6348);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6358); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2748:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2751:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2752:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2752:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2753:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6405);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2761:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==18||(LA45_0>=75 && LA45_0<=84)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2761:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2761:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2762:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2767:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2768:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2768:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2769:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6435);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2785:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2786:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2786:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2787:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6456);
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
            	    break loop45;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2811:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2812:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2813:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6494);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6504); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2820:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2823:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2824:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2824:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2825:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6551);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2833:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2833:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2833:2: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2834:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleConditionalExpression6572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2843:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2844:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2844:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2845:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6593);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConditionalExpression6605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2865:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2866:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2866:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2867:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6626);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2891:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2892:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2893:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6664);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6674); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2900:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2903:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2904:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2904:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2905:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6721);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2913:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==60) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2913:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2913:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2914:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleLogicalOrExpression6742); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2923:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2924:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2924:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2925:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6763);
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
            	    break loop47;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2949:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2950:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2951:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6801);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6811); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2958:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2961:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2962:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2962:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2963:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6858);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2971:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==24) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2971:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2971:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2972:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLogicalAndExpression6879); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2981:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2982:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2982:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:2983:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6900);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3007:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3008:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3009:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6938);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6948); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3016:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3019:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3020:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3020:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)||(LA49_0>=32 && LA49_0<=33)||(LA49_0>=56 && LA49_0<=57)||(LA49_0>=87 && LA49_0<=88)||LA49_0==91) ) {
                alt49=1;
            }
            else if ( (LA49_0==61) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3021:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6995);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3030:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3030:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3030:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3030:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3031:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLogicalNotExpression7022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3040:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3041:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3041:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3042:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7043);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3066:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3067:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3068:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7080);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7090); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3075:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3078:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3079:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3079:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3080:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7137);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3088:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==62) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3088:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3088:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3089:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleBitwiseXorExpression7158); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3098:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3099:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3099:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3100:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7179);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3124:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3125:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3126:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7217);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7227); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3133:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3136:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3137:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3137:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3138:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7274);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3146:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==63) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3146:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3146:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3147:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleBitwiseOrExpression7295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3156:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3157:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3157:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3158:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7316);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3182:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3183:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3184:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7354);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7364); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3191:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3194:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3195:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3195:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3196:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7411);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3204:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==64) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3204:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3204:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3205:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseAndExpression7432); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3214:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3215:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3215:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3216:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7453);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3240:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3241:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3242:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7491);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7501); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3249:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3252:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3253:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3253:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3254:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7548);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3262:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=92 && LA53_0<=97)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3262:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3262:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3263:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3268:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3269:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3269:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3270:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7578);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3286:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3287:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3287:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3288:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7599);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3312:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3313:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3314:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7637);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7647); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3321:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3324:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3325:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3325:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3326:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7694);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3334:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=85 && LA54_0<=86)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3334:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3334:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3335:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3340:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3341:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3341:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3342:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7724);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3358:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3359:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3359:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3360:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7745);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3384:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3385:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3386:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7783);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7793); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3393:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3396:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3397:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3397:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3398:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7840);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3406:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=87 && LA55_0<=88)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3406:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3406:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3407:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3412:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3413:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3413:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3414:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7870);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3430:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3431:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3431:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3432:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7891);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3456:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3457:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3458:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7929);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7939); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3465:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3468:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3469:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3469:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3470:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7986);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3478:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==22||(LA56_0>=89 && LA56_0<=90)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3478:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3478:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3479:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3484:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3485:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3485:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3486:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8016);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3502:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3503:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3503:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3504:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8037);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3528:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3529:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3530:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8075);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8085); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3537:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3540:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3541:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3541:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||(LA57_0>=32 && LA57_0<=33)||(LA57_0>=56 && LA57_0<=57)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=87 && LA57_0<=88)||LA57_0==91) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3542:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8132);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3551:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3551:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3551:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3551:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3552:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3557:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3558:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3558:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3559:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8168);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3575:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3576:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3576:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3577:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8189);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3601:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3602:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3603:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8226);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8236); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3610:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3613:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3614:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3614:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3614:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3614:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3615:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3620:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3621:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3621:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3622:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8291);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3646:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3647:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3648:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8327);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8337); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3655:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3658:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3659:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3659:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3660:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8384);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3668:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==58) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3668:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3668:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3669:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleFeatureCall8405); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3678:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3679:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3679:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3680:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8425); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3691:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==33) && (synpred2_InternalSyncExp())) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3691:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3691:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3691:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3698:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3699:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,33,FOLLOW_33_in_ruleFeatureCall8459); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3712:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt59=2;
            	            int LA59_0 = input.LA(1);

            	            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_STRING)||(LA59_0>=32 && LA59_0<=33)||(LA59_0>=56 && LA59_0<=57)||LA59_0==61||(LA59_0>=87 && LA59_0<=88)||LA59_0==91) ) {
            	                alt59=1;
            	            }
            	            switch (alt59) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3712:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3712:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3713:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3713:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3714:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8494);
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

            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3730:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop58:
            	                    do {
            	                        int alt58=2;
            	                        int LA58_0 = input.LA(1);

            	                        if ( (LA58_0==31) ) {
            	                            alt58=1;
            	                        }


            	                        switch (alt58) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3730:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleFeatureCall8507); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3734:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3735:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3735:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3736:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8528);
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
            	                    	    break loop58;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleFeatureCall8544); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3764:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3765:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3766:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8584);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8594); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3773:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3776:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3777:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3777:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3777:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3777:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3778:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3783:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3784:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3784:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3785:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3796:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==33) && (synpred3_InternalSyncExp())) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3796:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3796:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3796:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3803:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3804:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,33,FOLLOW_33_in_ruleElementReferenceExpression8682); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3817:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_STRING)||(LA63_0>=32 && LA63_0<=33)||(LA63_0>=56 && LA63_0<=57)||LA63_0==61||(LA63_0>=87 && LA63_0<=88)||LA63_0==91) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3817:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3817:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3818:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3818:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3819:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8717);
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

                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3835:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==31) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3835:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleElementReferenceExpression8730); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3839:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3840:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3840:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3841:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8751);
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
                            	    break loop62;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleElementReferenceExpression8767); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3869:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3870:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3871:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8805);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8815); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3878:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3881:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3882:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3882:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3882:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3882:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3883:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEventValueReferenceExpression8861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleEventValueReferenceExpression8873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3896:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3897:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3897:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3898:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8894);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleEventValueReferenceExpression8906); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3926:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3927:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3928:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8942);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8952); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3935:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3938:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3939:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3939:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3939:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3939:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3940:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleActiveStateReferenceExpression8998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleActiveStateReferenceExpression9010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3953:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3954:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3954:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3955:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9033);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleActiveStateReferenceExpression9045); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3980:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3981:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3982:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9081);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9091); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3989:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3992:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3993:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3993:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3993:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3993:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3994:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleParenthesizedExpression9137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4003:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4004:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4004:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4005:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9158);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleParenthesizedExpression9170); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4033:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4034:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4035:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9206);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9216); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4042:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4045:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4046:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4046:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt65=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt65=1;
                }
                break;
            case RULE_INT:
                {
                alt65=2;
                }
                break;
            case RULE_HEX:
                {
                alt65=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt65=4;
                }
                break;
            case RULE_STRING:
                {
                alt65=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4047:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9263);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4057:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9290);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4067:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9317);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4077:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9344);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4087:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9371);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4103:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4104:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4105:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9406);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9416); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4112:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4115:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4116:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4116:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4116:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4116:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4117:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4122:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4123:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4123:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4124:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9467); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4148:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4149:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4150:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9508);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9518); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4157:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4160:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4161:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4161:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4161:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4161:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4162:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4167:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4168:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4168:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4169:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9569); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4193:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4194:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4195:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9610);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9620); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4202:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4205:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4206:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4206:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4206:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4206:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4207:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4212:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4213:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4213:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4214:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9671); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4238:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4239:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4240:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9712);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9722); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4247:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4250:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4251:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4251:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4251:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4251:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4252:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4257:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4258:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4258:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4259:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9773); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4283:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4284:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4285:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9814);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9824); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4292:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4295:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4296:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4296:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4296:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4296:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4297:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4302:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4303:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4303:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4304:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9875); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4328:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4330:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4331:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4331:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt66=8;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt66=1;
                }
                break;
            case 66:
                {
                alt66=2;
                }
                break;
            case 67:
                {
                alt66=3;
                }
                break;
            case 68:
                {
                alt66=4;
                }
                break;
            case 69:
                {
                alt66=5;
                }
                break;
            case 70:
                {
                alt66=6;
                }
                break;
            case 71:
                {
                alt66=7;
                }
                break;
            case 72:
                {
                alt66=8;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4331:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4331:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4331:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator9930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4337:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4337:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4337:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator9947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4343:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4343:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4343:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator9964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4349:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4349:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4349:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator9981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4355:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4355:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4355:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator9998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4361:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4361:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4361:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4367:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4367:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4367:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4373:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4373:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4373:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10049); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4385:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4387:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4388:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4388:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt67=1;
                }
                break;
            case 44:
                {
                alt67=2;
                }
                break;
            case 45:
                {
                alt67=3;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4388:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4388:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4388:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleDirection10096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4394:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4394:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4394:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleDirection10113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4400:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4400:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4400:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleDirection10130); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4410:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4412:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4413:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4413:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==73) ) {
                alt68=1;
            }
            else if ( (LA68_0==74) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4413:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4413:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4413:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleTimeEventType10175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4419:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4419:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4419:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleTimeEventType10192); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4429:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4431:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4432:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4432:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt69=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt69=1;
                }
                break;
            case 75:
                {
                alt69=2;
                }
                break;
            case 76:
                {
                alt69=3;
                }
                break;
            case 77:
                {
                alt69=4;
                }
                break;
            case 78:
                {
                alt69=5;
                }
                break;
            case 79:
                {
                alt69=6;
                }
                break;
            case 80:
                {
                alt69=7;
                }
                break;
            case 81:
                {
                alt69=8;
                }
                break;
            case 82:
                {
                alt69=9;
                }
                break;
            case 83:
                {
                alt69=10;
                }
                break;
            case 84:
                {
                alt69=11;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4432:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4432:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4432:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleAssignmentOperator10237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4438:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4438:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4438:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4444:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4444:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4444:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4450:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4450:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4450:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4456:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4456:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4456:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4462:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4462:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4462:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4468:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4468:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4468:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4474:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4474:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4474:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4480:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4480:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4480:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4486:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4486:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4486:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4492:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4492:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4492:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10407); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4502:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4504:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4505:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4505:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==85) ) {
                alt70=1;
            }
            else if ( (LA70_0==86) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4505:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4505:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4505:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleShiftOperator10452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4511:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4511:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4511:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleShiftOperator10469); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4521:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4523:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4524:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4524:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4524:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4524:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4524:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleAdditiveOperator10514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4530:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4530:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4530:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleAdditiveOperator10531); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4540:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4542:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4543:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4543:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt72=1;
                }
                break;
            case 22:
                {
                alt72=2;
                }
                break;
            case 90:
                {
                alt72=3;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4543:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4543:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4543:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleMultiplicativeOperator10576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4549:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4549:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4549:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicativeOperator10593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4555:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4555:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4555:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleMultiplicativeOperator10610); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4565:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4567:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4568:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4568:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt73=1;
                }
                break;
            case 88:
                {
                alt73=2;
                }
                break;
            case 91:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4568:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4568:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4568:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleUnaryOperator10655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4574:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4574:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4574:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleUnaryOperator10672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4580:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4580:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4580:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleUnaryOperator10689); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4590:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4592:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4593:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4593:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt74=6;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt74=1;
                }
                break;
            case 93:
                {
                alt74=2;
                }
                break;
            case 94:
                {
                alt74=3;
                }
                break;
            case 95:
                {
                alt74=4;
                }
                break;
            case 96:
                {
                alt74=5;
                }
                break;
            case 97:
                {
                alt74=6;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4593:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4593:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4593:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator10734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4599:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4599:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4599:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator10751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4605:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4605:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4605:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator10768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4611:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4611:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4611:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator10785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4617:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4617:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4617:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator10802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4623:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4623:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4623:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,97,FOLLOW_97_in_ruleRelationalOperator10819); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4633:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4635:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4636:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4636:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt75=1;
                }
                break;
            case 99:
                {
                alt75=2;
                }
                break;
            case 100:
                {
                alt75=3;
                }
                break;
            case 101:
                {
                alt75=4;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4636:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4636:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4636:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit10864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4642:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4642:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4642:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit10881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4648:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4648:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4648:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit10898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4654:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4654:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:4654:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_101_in_ruleTimeUnit10915); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSyncExp
    public final void synpred1_InternalSyncExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1062:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:1062:6: ','
        {
        match(input,31,FOLLOW_31_in_synpred1_InternalSyncExp2300); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSyncExp

    // $ANTLR start synpred2_InternalSyncExp
    public final void synpred2_InternalSyncExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3691:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3692:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3692:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3693:2: '('
        {
        match(input,33,FOLLOW_33_in_synpred2_InternalSyncExp8441); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSyncExp

    // $ANTLR start synpred3_InternalSyncExp
    public final void synpred3_InternalSyncExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3796:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3797:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3797:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncExp.g:3798:2: '('
        {
        match(input,33,FOLLOW_33_in_synpred3_InternalSyncExp8664); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSyncExp

    // Delegated rules

    public final boolean synpred3_InternalSyncExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSyncExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSyncExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSyncExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSyncExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSyncExp_fragment(); // can never throw exception
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
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\4\1\uffff\2\4\2\uffff\1\4\1\22\1\uffff\1\4";
    static final String DFA9_maxS =
        "\1\71\1\uffff\2\72\2\uffff\1\71\1\41\1\uffff\1\72";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\4\2\uffff\1\3\1\uffff";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\5\10\uffff\3\4\4\uffff\1\1\1\5\2\uffff\2\5\1\uffff\3"+
            "\5\7\uffff\4\1\1\3\17\1",
            "",
            "\1\1\21\uffff\1\5\12\uffff\1\5\30\uffff\1\6",
            "\1\7\41\uffff\24\10\1\1",
            "",
            "",
            "\1\11\41\uffff\24\1",
            "\1\1\1\uffff\1\1\14\uffff\1\10",
            "",
            "\1\1\21\uffff\1\5\12\uffff\1\5\30\uffff\1\6"
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
            return "416:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )";
        }
    }
    static final String DFA28_eotS =
        "\13\uffff";
    static final String DFA28_eofS =
        "\10\uffff\1\7\2\uffff";
    static final String DFA28_minS =
        "\5\4\1\uffff\1\4\1\uffff\1\4\1\22\1\uffff";
    static final String DFA28_maxS =
        "\1\71\4\72\1\uffff\1\72\1\uffff\1\71\1\41\1\uffff";
    static final String DFA28_acceptS =
        "\5\uffff\1\2\1\uffff\1\1\2\uffff\1\3";
    static final String DFA28_specialS =
        "\13\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\5\20\uffff\1\5\20\uffff\3\5\1\4\1\6\1\1\1\2\1\3\14\5",
            "\1\5\44\uffff\1\7\20\uffff\1\5",
            "\1\5\44\uffff\1\7\20\uffff\1\5",
            "\1\5\44\uffff\1\7\20\uffff\1\5",
            "\1\10\41\uffff\24\7\1\5",
            "",
            "\1\11\41\uffff\24\12\1\5",
            "",
            "\1\7\14\uffff\1\7\1\5\1\uffff\1\5\1\7\20\uffff\24\7",
            "\1\5\1\uffff\1\5\14\uffff\1\12",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1569:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )";
        }
    }
    static final String DFA30_eotS =
        "\17\uffff";
    static final String DFA30_eofS =
        "\12\uffff\1\11\4\uffff";
    static final String DFA30_minS =
        "\5\4\1\uffff\2\4\2\uffff\2\4\1\22\1\uffff\1\4";
    static final String DFA30_maxS =
        "\1\71\4\72\1\uffff\2\72\2\uffff\2\71\1\41\1\uffff\1\72";
    static final String DFA30_acceptS =
        "\5\uffff\1\2\2\uffff\1\4\1\1\3\uffff\1\3\1\uffff";
    static final String DFA30_specialS =
        "\17\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\6\1\10\17\uffff\1\5\1\10\2\uffff\2\10\1\uffff\3\10\7\uffff"+
            "\3\5\1\4\1\7\1\1\1\2\1\3\14\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\12\41\uffff\24\11\1\5",
            "",
            "\1\5\21\uffff\1\10\12\uffff\1\10\30\uffff\1\13",
            "\1\14\41\uffff\24\15\1\5",
            "",
            "",
            "\2\11\13\uffff\1\11\1\5\1\uffff\1\5\2\11\2\uffff\2\11\1\uffff"+
            "\3\11\7\uffff\24\11",
            "\1\16\41\uffff\24\5",
            "\1\5\1\uffff\1\5\14\uffff\1\15",
            "",
            "\1\5\21\uffff\1\10\12\uffff\1\10\30\uffff\1\13"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1655:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSignalDefinition137 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition169 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSignalDefinition195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition212 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleSignalDefinition230 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSignalDefinition253 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition266 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition287 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition302 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableDefinition437 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition491 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition509 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition530 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_rulePrimaryExpression718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope874 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope893 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope912 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope931 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1119 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1138 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReaction1155 = new BitSet(new long[]{0x23000003008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction1178 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalReaction1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSuspendEffect1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1406 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLocalReactionTrigger1419 = new BitSet(new long[]{0x0000000006000032L});
    public static final BitSet FOLLOW_25_in_ruleLocalReactionTrigger1437 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLocalReactionTrigger1468 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleLocalReactionTrigger1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLocalReactionTrigger1515 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalReactionTrigger1536 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLocalReactionTrigger1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntry1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInside1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleExit1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger2011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleReactionTrigger2073 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger2104 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionTrigger2151 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger2172 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReactionTrigger2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2287 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleReactionEffect2308 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2330 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePreValueExpression2424 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePreValueExpression2436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2457 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePreValueExpression2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatechartRoot2700 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStateRoot2804 = new BitSet(new long[]{0x03FFFFC07661C030L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTransitionRoot2908 = new BitSet(new long[]{0x0006000076400030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStatechartSpecification3024 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3045 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3068 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInterfaceScope3464 = new BitSet(new long[]{0x03FFFFC000020010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3485 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope3498 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3521 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3540 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3559 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInternalScope3655 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalScope3667 = new BitSet(new long[]{0x03FFFFC07661C030L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3690 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3709 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3728 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3747 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3937 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEventDefinition3950 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition3971 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventDefinition3984 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperationDefinition4285 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition4306 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperationDefinition4318 = new BitSet(new long[]{0x03FFFFC400000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4340 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleOperationDefinition4353 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4374 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleOperationDefinition4390 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOperationDefinition4403 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleParameter4520 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParameter4532 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXID5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXID5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5127 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFQN5146 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5168 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5282 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTransitionReaction5296 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDefaultTrigger5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDefaultTrigger5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5734 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5755 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEntryEvent6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExitEvent6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAlwaysEvent6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlwaysEvent6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6405 = new BitSet(new long[]{0x0000000000040002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6435 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6456 = new BitSet(new long[]{0x0000000000040002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6551 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleConditionalExpression6572 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditionalExpression6605 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6721 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicalOrExpression6742 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6763 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6858 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLogicalAndExpression6879 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6900 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalNotExpression7022 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7137 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBitwiseXorExpression7158 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7179 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7274 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBitwiseOrExpression7295 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7316 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseAndExpression7432 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7548 = new BitSet(new long[]{0x0000000000000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7578 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7599 = new BitSet(new long[]{0x0000000000000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7724 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7840 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7870 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7891 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7986 = new BitSet(new long[]{0x0000000000400002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8016 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8037 = new BitSet(new long[]{0x0000000000400002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8168 = new BitSet(new long[]{0x03000003000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8384 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFeatureCall8405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8425 = new BitSet(new long[]{0x0400000200000002L});
    public static final BitSet FOLLOW_33_in_ruleFeatureCall8459 = new BitSet(new long[]{0x23000007000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8494 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureCall8507 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8528 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleFeatureCall8544 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8648 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleElementReferenceExpression8682 = new BitSet(new long[]{0x23000007000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8717 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleElementReferenceExpression8730 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8751 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleElementReferenceExpression8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEventValueReferenceExpression8861 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEventValueReferenceExpression8873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8894 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEventValueReferenceExpression8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleActiveStateReferenceExpression8998 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleActiveStateReferenceExpression9010 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9033 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleActiveStateReferenceExpression9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleParenthesizedExpression9137 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9158 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParenthesizedExpression9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator9930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator9981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDirection10096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDirection10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDirection10130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTimeEventType10175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTimeEventType10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssignmentOperator10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleShiftOperator10452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleShiftOperator10469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAdditiveOperator10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAdditiveOperator10531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleMultiplicativeOperator10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicativeOperator10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleMultiplicativeOperator10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnaryOperator10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUnaryOperator10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUnaryOperator10689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator10734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator10785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator10802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRelationalOperator10819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit10881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTimeUnit10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1_InternalSyncExp2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred2_InternalSyncExp8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred3_InternalSyncExp8664 = new BitSet(new long[]{0x0000000000000002L});

}