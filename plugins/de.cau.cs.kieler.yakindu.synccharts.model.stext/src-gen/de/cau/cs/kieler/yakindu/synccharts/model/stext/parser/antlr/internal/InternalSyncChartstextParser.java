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
import de.cau.cs.kieler.yakindu.synccharts.model.stext.services.SyncChartstextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSyncChartstextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "':'", "'='", "'with'", "';'", "'static'", "'/'", "'Suspend'", "'&&'", "'Entry'", "'During'", "'Exit'", "'#'", "'['", "']'", "','", "'pre'", "'('", "')'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'operation'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'>'", "'?'", "'||'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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


        public InternalSyncChartstextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSyncChartstextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSyncChartstextParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g"; }



     	private SyncChartstextGrammarAccess grammarAccess;
     	
        public InternalSyncChartstextParser(TokenStream input, SyncChartstextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SignalDefinition";	
       	}
       	
       	@Override
       	protected SyncChartstextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSignalDefinition"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:68:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:69:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:70:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:77:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:80:28: ( ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:2: () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:87:2: ( (lv_isInput_1_0= 'input' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:88:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:88:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:89:3: lv_isInput_1_0= 'input'
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:102:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:103:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:103:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:104:3: lv_isOutput_2_0= 'output'
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:121:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:122:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:122:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:123:3: lv_name_4_0= RULE_ID
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:139:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:139:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:143:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:144:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:144:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:145:3: ruleFQN
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:158:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==18) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:158:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition266); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:162:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:163:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:163:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:164:3: lv_varInitialValue_8_0= ruleExpression
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:180:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==19) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:180:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition302); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:184:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:185:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:185:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:186:3: lv_varCombineOperator_10_0= ruleCombineOperator
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:214:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:215:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:216:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:223:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_varInitialValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:226:28: ( ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:227:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:227:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:227:2: () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:227:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:233:2: ( (lv_isStatic_1_0= 'static' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:234:1: (lv_isStatic_1_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:234:1: (lv_isStatic_1_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:235:3: lv_isStatic_1_0= 'static'
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:248:3: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:249:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:249:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:250:3: ruleFQN
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:263:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:264:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:264:1: (lv_name_3_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:265:3: lv_name_3_0= RULE_ID
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:281:2: (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:281:4: otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:285:1: ( (lv_varInitialValue_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:286:1: (lv_varInitialValue_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:286:1: (lv_varInitialValue_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:287:3: lv_varInitialValue_5_0= ruleExpression
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


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:315:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:316:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:317:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope580);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope590); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:324:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;

        EObject lv_declarations_1_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:327:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:328:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:328:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:328:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:328:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:329:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:334:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||(LA9_0>=14 && LA9_0<=16)||(LA9_0>=21 && LA9_0<=22)||(LA9_0>=25 && LA9_0<=29)||(LA9_0>=38 && LA9_0<=57)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:335:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:335:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:336:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:336:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    int alt8=4;
            	    alt8 = dfa8.predict(input);
            	    switch (alt8) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:337:3: lv_declarations_1_1= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStateScope647);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:352:8: lv_declarations_1_2= ruleSignalDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsSignalDeclarationParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleStateScope666);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:367:8: lv_declarations_1_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleStateScope685);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:382:8: lv_declarations_1_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope704);
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
            	    break loop9;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:408:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:409:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:410:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration744);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration754); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:417:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:420:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:422:5: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration800);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:438:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:439:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:440:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction834);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction844); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:447:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:450:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=25 && LA11_0<=29)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:452:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:452:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:453:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:453:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=25 && LA10_0<=27)) ) {
                        alt10=1;
                    }
                    else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=28 && LA10_0<=29)) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:454:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction892);
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
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:469:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction911);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:487:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:487:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLocalReaction928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:491:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:492:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:492:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:493:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:493:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||(LA12_0>=32 && LA12_0<=33)||(LA12_0>=56 && LA12_0<=57)||LA12_0==62||(LA12_0>=88 && LA12_0<=89)||LA12_0==92) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:494:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction951);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:509:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction970);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLocalReaction986); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:539:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:540:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:541:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1022);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect1032); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:548:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:551:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:552:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:552:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:552:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:552:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:553:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSuspendEffect1078); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:570:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:571:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:572:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1114);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger1124); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:579:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_reactionTrigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:582:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:583:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:583:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:583:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:583:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:584:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:589:2: ( (lv_stateReaction_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:590:1: (lv_stateReaction_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:590:1: (lv_stateReaction_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:591:3: lv_stateReaction_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getStateReactionStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1179);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:607:2: (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:607:4: otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLocalReactionTrigger1192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getAmpersandAmpersandKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:611:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||(LA13_0>=28 && LA13_0<=29)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:612:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:612:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:613:3: lv_reactionTrigger_3_0= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerReactionTriggerParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1213);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:637:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:638:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:639:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1252);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1262); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:646:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:649:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:650:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:650:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:651:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1309);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:661:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1336);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:671:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1363);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:687:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:688:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:689:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1398);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1408); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:696:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:699:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:700:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:700:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:700:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:700:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:701:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEntry1454); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:718:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:719:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:720:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1490);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1500); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:727:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:730:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:731:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:731:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:731:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:731:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:732:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleInside1546); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:749:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:750:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:751:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1582);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1592); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:758:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:761:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:762:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:762:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:762:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:762:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:763:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleExit1638); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:780:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:781:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:782:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1674);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1684); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:789:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:792:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:793:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:793:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:793:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:793:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:794:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:799:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:800:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:800:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:801:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,28,FOLLOW_28_in_ruleReactionTrigger1736); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:814:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:815:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:815:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:816:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1767); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:832:3: ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:832:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:832:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:833:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:833:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:834:3: lv_trigger_3_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1795);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:851:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:851:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:851:8: otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleReactionTrigger1814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:855:1: ( (lv_guardExpression_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:856:1: (lv_guardExpression_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:856:1: (lv_guardExpression_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:857:3: lv_guardExpression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1835);
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

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleReactionTrigger1847); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:885:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:886:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:887:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1885);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect1895); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:894:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:897:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:898:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:898:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:898:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:898:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:899:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:904:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:905:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:905:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:906:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect1950);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:922:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) && (synpred1_InternalSyncChartstext())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:922:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:922:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:922:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReactionEffect1971); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:927:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:928:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:928:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:929:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect1993);
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:953:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:954:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:955:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2031);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2041); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:962:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:965:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:966:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:966:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            int alt20=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                alt20=2;
                }
                break;
            case 57:
                {
                alt20=3;
                }
                break;
            case 32:
                {
                alt20=4;
                }
                break;
            case 33:
                {
                alt20=5;
                }
                break;
            case 56:
                {
                alt20=6;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:967:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2088);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:977:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2115);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:987:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2142);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:997:5: this_PreValueExpression_3= rulePreValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2169);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1007:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2196);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1017:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2223);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1033:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1034:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1035:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2258);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2268); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1042:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1045:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1046:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1046:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1046:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1046:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1047:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePreValueExpression2314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulePreValueExpression2326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1060:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1061:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1061:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1062:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2347);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePreValueExpression2359); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1092:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1093:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1094:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2397);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2407); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1101:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1104:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1105:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1105:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1106:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2454);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1116:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2481);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1126:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2508);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1142:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1143:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1144:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2543);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2553); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1151:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1154:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1155:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1155:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1155:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleStatechartRoot2590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1159:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1160:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1160:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1161:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2611);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1185:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1186:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1187:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2647);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2657); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1194:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1197:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1198:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1198:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1198:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStateRoot2694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1202:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1203:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1203:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1204:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2715);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1228:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1229:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1230:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2751);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2761); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1237:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1240:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1241:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1241:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1241:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTransitionRoot2798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1245:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1246:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1246:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1247:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2819);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1273:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1274:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1275:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2857);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2867); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1282:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1285:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1286:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1286:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1286:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1286:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1287:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1292:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1292:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleStatechartSpecification2914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1296:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1297:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1297:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1298:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2935);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1314:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=39 && LA23_0<=40)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1315:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1315:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1316:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2958);
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
            	    break loop23;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1340:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1341:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1342:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2995);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3005); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1349:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1352:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1353:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1353:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1354:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1354:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1355:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3050);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1379:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1380:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1381:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3085);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3095); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1388:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1391:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1392:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1392:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1393:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1393:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1394:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3140);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1420:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1421:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1422:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3177);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3187); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1429:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1432:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1433:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1433:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1434:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3234);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1444:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3261);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1462:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1463:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1464:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3298);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3308); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1471:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1474:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1475:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1475:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1475:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1475:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1476:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleInterfaceScope3354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1485:1: ( (lv_name_2_0= ruleXID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||(LA25_0>=38 && LA25_0<=57)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1486:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1486:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1487:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3375);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope3388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1507:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        int LA27_5 = input.LA(3);

                        if ( (LA27_5==18||LA27_5==20) ) {
                            alt27=1;
                        }


                    }
                    else if ( (LA27_2==58) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (LA27_3==RULE_ID||LA27_3==58) ) {
                        alt27=1;
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
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1508:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1508:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1509:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1509:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt26=3;
            	    alt26 = dfa26.predict(input);
            	    switch (alt26) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1510:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3411);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1525:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3430);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1540:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3449);
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
            	    break loop27;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1566:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1567:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1568:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3489);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3499); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1575:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1578:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1579:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1579:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1579:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1579:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1580:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleInternalScope3545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalScope3557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1593:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
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
                case RULE_INT:
                case 21:
                case 22:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
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
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1594:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1594:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1595:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1595:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt28=4;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1596:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3580);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1611:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3599);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1626:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3618);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1641:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3637);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1669:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1670:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1671:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3679);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3689); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1678:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1681:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1683:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3735);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1701:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1702:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1703:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3771);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3781); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1710:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1713:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1714:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1714:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1714:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1714:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=43 && LA30_0<=45)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1715:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1715:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1716:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3827);
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleEventDefinition3840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1736:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1737:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1737:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1738:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition3861);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1754:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1754:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventDefinition3874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1758:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1759:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1759:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1760:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3897);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1781:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1782:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1783:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3935);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3945); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1790:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1793:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1795:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3991);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1813:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1814:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1815:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4027);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4037); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1822:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1825:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1827:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4083);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1845:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1846:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1847:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4119);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition4129); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1854:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1857:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1858:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1858:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1858:2: () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1858:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1859:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOperationDefinition4175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1868:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1869:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1869:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1870:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition4196);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleOperationDefinition4208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1890:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||(LA33_0>=38 && LA33_0<=57)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1890:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1890:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1891:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1891:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1892:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4230);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1908:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==31) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1908:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleOperationDefinition4243); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1912:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1913:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1913:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1914:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4264);
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleOperationDefinition4280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1934:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1934:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleOperationDefinition4293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1938:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1939:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1939:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1940:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4316);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1961:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1962:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1963:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4354);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4364); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1970:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1973:28: ( ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1974:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1974:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1974:2: ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1974:2: ( (lv_name_0_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1975:1: (lv_name_0_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1975:1: (lv_name_0_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1976:3: lv_name_0_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameXIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleParameter4410);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleParameter4422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1996:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1997:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1997:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1998:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter4445);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2019:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2020:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2021:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4482);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4493); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2028:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2031:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2032:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2032:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
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
            case 43:
                {
                alt35=6;
                }
                break;
            case 44:
                {
                alt35=7;
                }
                break;
            case 45:
                {
                alt35=8;
                }
                break;
            case 46:
                {
                alt35=9;
                }
                break;
            case 47:
                {
                alt35=10;
                }
                break;
            case 48:
                {
                alt35=11;
                }
                break;
            case 42:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2032:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2041:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2048:2: kw= 'interface'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2055:2: kw= 'internal'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2062:2: kw= 'event'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2069:2: kw= 'local'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2076:2: kw= 'in'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2083:2: kw= 'out'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2090:2: kw= 'var'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2097:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2104:2: kw= 'external'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2111:2: kw= 'operation'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2118:2: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2125:2: kw= 'else'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2132:2: kw= 'entry'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2139:2: kw= 'exit'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2146:2: kw= 'always'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2153:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2160:2: kw= 'raise'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID4880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2167:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleXID4899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2174:2: kw= 'active'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleXID4918); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2187:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2188:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2189:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4959);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4970); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2196:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2199:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2200:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2200:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2201:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN5017);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2211:1: (kw= '.' this_XID_2= ruleXID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==58) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2212:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleFQN5036); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN5058);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2238:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2239:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2240:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5107);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5117); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2247:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2250:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2251:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2251:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2251:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2251:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2252:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2257:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_INT||LA37_1==29) ) {
                    alt37=1;
                }
                else if ( (LA37_1==RULE_ID) ) {
                    int LA37_4 = input.LA(3);

                    if ( (LA37_4==EOF||LA37_4==22||LA37_4==28||LA37_4==33||LA37_4==58) ) {
                        alt37=1;
                    }
                }
            }
            else if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==29||(LA37_0>=49 && LA37_0<=50)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2258:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2258:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2259:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5172);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2275:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2275:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransitionReaction5186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2279:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2280:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2280:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2281:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5207);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2297:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2297:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTransitionReaction5222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2301:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID||LA39_0==59) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2302:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2302:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2303:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5243);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2327:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2328:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2329:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5282);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5292); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2336:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2339:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2340:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2340:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||(LA41_0>=28 && LA41_0<=29)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2341:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5339);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2351:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5366);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2367:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2368:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2369:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5401);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5411); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2376:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2379:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2380:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2380:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2380:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2380:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2381:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2386:2: (otherlv_1= 'default' | otherlv_2= 'else' )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2386:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleDefaultTrigger5458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2391:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleDefaultTrigger5476); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2403:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2404:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2405:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5513);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty5523); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2412:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2415:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2416:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2416:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2417:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5570);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2427:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5597);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2443:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2444:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2445:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5632);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5642); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2452:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2455:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2456:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2456:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2456:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleEntryPointSpec5679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2460:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2461:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2461:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2462:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec5696); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2486:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2487:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2488:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5737);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5747); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2495:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2498:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2499:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2499:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2499:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2499:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2500:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2500:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2501:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec5789); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleExitPointSpec5806); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2531:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2532:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2533:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5844);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5854); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2540:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2543:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2544:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2544:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2545:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2545:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2546:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5899);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2570:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2571:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2572:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5934);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5944); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2579:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2582:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2583:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2583:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2583:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2583:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2584:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2584:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2585:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5990);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2601:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2602:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2602:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2603:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6011);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2619:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2620:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2620:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2621:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6032);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2645:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2646:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2647:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6068);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec6078); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2654:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2657:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2658:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2658:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2659:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6125);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2669:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6152);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2679:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6179);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2695:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2696:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2697:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6214);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent6224); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2704:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2707:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2708:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2708:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2708:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2708:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2709:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleEntryEvent6270); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2726:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2727:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2728:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6306);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6316); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2735:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2738:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2739:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2739:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2739:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2739:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2740:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExitEvent6362); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2757:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2758:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2759:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6398);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6408); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2766:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2769:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2770:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2770:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2770:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2770:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2771:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2776:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2776:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleAlwaysEvent6455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2781:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleAlwaysEvent6473); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2797:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2798:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2799:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6514);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6524); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2806:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2809:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2811:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6570);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2827:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2828:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2829:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6604);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6614); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2836:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2839:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2840:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2840:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2841:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6661);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2849:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==18||(LA46_0>=76 && LA46_0<=85)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2849:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2849:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2850:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2855:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2856:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2856:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2857:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6691);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2873:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2874:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2874:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2875:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6712);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2899:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2900:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2901:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6750);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6760); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2908:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2911:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2912:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2912:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2913:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6807);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2921:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2921:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2921:2: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2922:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleConditionalExpression6828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2931:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2932:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2932:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2933:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6849);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConditionalExpression6861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2953:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2954:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2954:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2955:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6882);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2979:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2980:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2981:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6920);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6930); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2988:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2991:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2992:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2992:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2993:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6977);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3001:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==61) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3001:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3001:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3002:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLogicalOrExpression6998); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3011:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3012:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3012:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3013:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7019);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3037:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3038:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3039:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7057);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression7067); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3046:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3049:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3050:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3050:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3051:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7114);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3059:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==24) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3059:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3059:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3060:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLogicalAndExpression7135); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3069:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3070:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3070:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3071:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7156);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3095:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3096:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3097:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7194);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7204); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3104:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3107:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3108:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3108:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||(LA50_0>=32 && LA50_0<=33)||(LA50_0>=56 && LA50_0<=57)||(LA50_0>=88 && LA50_0<=89)||LA50_0==92) ) {
                alt50=1;
            }
            else if ( (LA50_0==62) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3109:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7251);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3118:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3118:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3118:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3118:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3119:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleLogicalNotExpression7278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3128:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3129:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3129:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3130:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7299);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3154:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3155:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3156:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7336);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7346); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3163:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3166:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3167:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3167:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3168:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7393);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3176:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==63) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3176:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3176:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3177:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleBitwiseXorExpression7414); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3186:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3187:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3187:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3188:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7435);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3212:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3213:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3214:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7473);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7483); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3221:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3224:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3225:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3225:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3226:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7530);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3234:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==64) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3234:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3234:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3235:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseOrExpression7551); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3244:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3245:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3245:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3246:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7572);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3270:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3271:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3272:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7610);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7620); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3279:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3282:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3283:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3283:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3284:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7667);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3292:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==65) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3292:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3292:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3293:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleBitwiseAndExpression7688); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3302:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3303:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3303:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3304:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7709);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3328:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3329:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3330:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7747);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7757); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3337:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3340:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3341:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3341:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3342:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7804);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3350:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==59||(LA54_0>=93 && LA54_0<=97)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3350:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3350:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3351:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3356:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3357:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3357:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3358:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7834);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3374:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3375:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3375:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3376:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7855);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3400:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3401:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3402:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7893);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7903); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3409:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3412:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3413:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3413:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3414:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7950);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3422:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=86 && LA55_0<=87)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3422:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3422:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3423:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3428:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3429:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3429:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3430:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7980);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3446:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3447:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3447:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3448:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8001);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3472:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3473:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3474:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression8039);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression8049); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3481:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3484:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3485:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3485:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3486:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8096);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3494:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=88 && LA56_0<=89)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3494:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3494:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3495:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3500:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3501:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3501:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3502:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8126);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3518:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3519:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3519:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3520:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8147);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3544:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3545:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3546:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8185);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8195); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3553:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3556:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3557:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3557:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3558:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8242);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3566:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==22||(LA57_0>=90 && LA57_0<=91)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3566:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3566:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3567:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3572:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3573:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3573:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3574:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8272);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3590:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3591:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3591:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3592:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8293);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3616:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3617:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3618:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8331);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8341); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3625:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3628:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3629:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3629:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||(LA58_0>=32 && LA58_0<=33)||(LA58_0>=56 && LA58_0<=57)) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=88 && LA58_0<=89)||LA58_0==92) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3630:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8388);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3639:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3639:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3639:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3639:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3640:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3645:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3646:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3646:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3647:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8424);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3663:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3664:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3664:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3665:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8445);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3689:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3690:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3691:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8482);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8492); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3698:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3701:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3702:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3702:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3702:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3702:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3703:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3708:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3709:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3709:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3710:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8547);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3734:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3735:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3736:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8583);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8593); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3743:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3746:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3747:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3747:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3748:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8640);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3756:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==58) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3756:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3756:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3757:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleFeatureCall8661); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3766:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3767:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3767:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3768:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8681); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3779:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==33) && (synpred2_InternalSyncChartstext())) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3779:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3779:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3779:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3786:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3787:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,33,FOLLOW_33_in_ruleFeatureCall8715); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3800:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt60=2;
            	            int LA60_0 = input.LA(1);

            	            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||(LA60_0>=32 && LA60_0<=33)||(LA60_0>=56 && LA60_0<=57)||LA60_0==62||(LA60_0>=88 && LA60_0<=89)||LA60_0==92) ) {
            	                alt60=1;
            	            }
            	            switch (alt60) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3800:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3800:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3801:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3801:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3802:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8750);
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

            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3818:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop59:
            	                    do {
            	                        int alt59=2;
            	                        int LA59_0 = input.LA(1);

            	                        if ( (LA59_0==31) ) {
            	                            alt59=1;
            	                        }


            	                        switch (alt59) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3818:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleFeatureCall8763); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3822:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3823:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3823:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3824:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8784);
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

            	            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleFeatureCall8800); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3852:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3853:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3854:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8840);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8850); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3861:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3864:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3865:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3865:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3865:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3865:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3866:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3871:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3872:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3872:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3873:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3884:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==33) && (synpred3_InternalSyncChartstext())) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3884:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3884:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3884:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3891:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3892:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,33,FOLLOW_33_in_ruleElementReferenceExpression8938); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3905:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)||(LA64_0>=32 && LA64_0<=33)||(LA64_0>=56 && LA64_0<=57)||LA64_0==62||(LA64_0>=88 && LA64_0<=89)||LA64_0==92) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3905:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3905:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3906:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3906:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3907:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8973);
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

                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3923:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==31) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3923:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleElementReferenceExpression8986); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3927:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3928:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3928:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3929:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9007);
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

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleElementReferenceExpression9023); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3957:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3958:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3959:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9061);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9071); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3966:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3969:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3970:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3970:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3970:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3970:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3971:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEventValueReferenceExpression9117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleEventValueReferenceExpression9129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3984:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3985:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3985:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3986:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9150);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleEventValueReferenceExpression9162); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4014:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4015:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4016:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9198);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9208); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4023:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4026:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4027:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4027:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4027:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4027:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4028:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleActiveStateReferenceExpression9254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleActiveStateReferenceExpression9266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4041:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4042:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4042:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4043:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9289);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleActiveStateReferenceExpression9301); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4068:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4069:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4070:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9337);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9347); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4077:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4080:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4081:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4081:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4081:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4081:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4082:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleParenthesizedExpression9393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4091:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4092:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4092:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4093:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9414);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleParenthesizedExpression9426); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4121:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4122:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4123:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9462);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9472); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4130:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4133:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4134:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4134:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4135:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9519);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4145:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9546);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4155:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9573);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4165:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9600);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4175:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9627);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4191:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4192:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4193:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9662);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9672); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4200:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4203:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4204:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4204:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4204:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4204:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4205:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4210:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4211:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4211:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4212:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9723); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4236:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4237:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4238:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9764);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9774); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4245:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4248:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4249:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4249:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4249:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4249:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4250:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4255:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4256:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4256:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4257:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9825); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4281:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4282:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4283:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9866);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9876); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4290:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4293:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4294:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4294:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4294:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4294:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4295:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4300:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4301:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4301:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4302:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9927); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4326:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4327:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4328:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9968);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9978); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4335:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4338:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4339:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4339:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4339:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4339:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4340:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4345:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4346:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4346:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4347:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral10029); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4371:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4372:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4373:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10070);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral10080); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4380:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4383:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4384:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4384:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4384:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4384:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4385:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4390:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4391:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4391:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4392:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10131); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4416:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4418:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4419:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4419:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt67=8;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt67=1;
                }
                break;
            case 67:
                {
                alt67=2;
                }
                break;
            case 68:
                {
                alt67=3;
                }
                break;
            case 69:
                {
                alt67=4;
                }
                break;
            case 70:
                {
                alt67=5;
                }
                break;
            case 71:
                {
                alt67=6;
                }
                break;
            case 72:
                {
                alt67=7;
                }
                break;
            case 73:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4419:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4419:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4419:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator10186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4425:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4425:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4425:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator10203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4431:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4431:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4431:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator10220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator10237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4443:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4443:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4443:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4449:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4449:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4449:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4455:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4455:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4455:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4461:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4461:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4461:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_73_in_ruleCombineOperator10305); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4471:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4473:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4474:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4474:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt68=1;
                }
                break;
            case 44:
                {
                alt68=2;
                }
                break;
            case 45:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4474:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4474:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4474:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleDirection10350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4480:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4480:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4480:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleDirection10367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4486:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4486:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4486:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleDirection10384); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4496:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4498:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4499:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4499:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==74) ) {
                alt69=1;
            }
            else if ( (LA69_0==75) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4499:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4499:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4499:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleTimeEventType10429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4505:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4505:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4505:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleTimeEventType10446); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4515:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4517:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4518:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4518:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt70=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt70=1;
                }
                break;
            case 76:
                {
                alt70=2;
                }
                break;
            case 77:
                {
                alt70=3;
                }
                break;
            case 78:
                {
                alt70=4;
                }
                break;
            case 79:
                {
                alt70=5;
                }
                break;
            case 80:
                {
                alt70=6;
                }
                break;
            case 81:
                {
                alt70=7;
                }
                break;
            case 82:
                {
                alt70=8;
                }
                break;
            case 83:
                {
                alt70=9;
                }
                break;
            case 84:
                {
                alt70=10;
                }
                break;
            case 85:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4518:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4518:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4518:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleAssignmentOperator10491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4524:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4524:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4524:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4530:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4530:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4530:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4536:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4536:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4536:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4542:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4542:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4542:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4554:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4554:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4554:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4560:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4560:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4560:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4566:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4566:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4566:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4572:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4572:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4572:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4578:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4578:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4578:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,85,FOLLOW_85_in_ruleAssignmentOperator10661); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4588:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4590:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4591:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4591:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==86) ) {
                alt71=1;
            }
            else if ( (LA71_0==87) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4591:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4591:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4591:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleShiftOperator10706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4597:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4597:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4597:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleShiftOperator10723); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4607:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4609:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==88) ) {
                alt72=1;
            }
            else if ( (LA72_0==89) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleAdditiveOperator10768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4616:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4616:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4616:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleAdditiveOperator10785); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4626:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4628:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4629:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4629:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt73=1;
                }
                break;
            case 22:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4629:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4629:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4629:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_90_in_ruleMultiplicativeOperator10830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4635:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4635:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4635:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicativeOperator10847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleMultiplicativeOperator10864); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4651:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4653:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4654:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4654:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt74=1;
                }
                break;
            case 89:
                {
                alt74=2;
                }
                break;
            case 92:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4654:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4654:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4654:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleUnaryOperator10909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4660:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4660:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4660:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleUnaryOperator10926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4666:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4666:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4666:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_92_in_ruleUnaryOperator10943); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4676:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4678:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4679:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4679:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt75=1;
                }
                break;
            case 94:
                {
                alt75=2;
                }
                break;
            case 59:
                {
                alt75=3;
                }
                break;
            case 95:
                {
                alt75=4;
                }
                break;
            case 96:
                {
                alt75=5;
                }
                break;
            case 97:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4679:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4679:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4679:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator10988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4685:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4685:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4685:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator11005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4691:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4691:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4691:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleRelationalOperator11022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4697:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4697:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4697:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator11039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4703:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4703:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4703:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator11056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4709:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4709:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4709:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,97,FOLLOW_97_in_ruleRelationalOperator11073); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4719:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4721:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4722:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4722:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt76=1;
                }
                break;
            case 99:
                {
                alt76=2;
                }
                break;
            case 100:
                {
                alt76=3;
                }
                break;
            case 101:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4722:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4722:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4722:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit11118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4728:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4728:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4728:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit11135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4734:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4734:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4734:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit11152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4740:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4740:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4740:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_101_in_ruleTimeUnit11169); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSyncChartstext
    public final void synpred1_InternalSyncChartstext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:922:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:922:6: ','
        {
        match(input,31,FOLLOW_31_in_synpred1_InternalSyncChartstext1963); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSyncChartstext

    // $ANTLR start synpred2_InternalSyncChartstext
    public final void synpred2_InternalSyncChartstext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3779:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3780:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3780:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3781:2: '('
        {
        match(input,33,FOLLOW_33_in_synpred2_InternalSyncChartstext8697); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSyncChartstext

    // $ANTLR start synpred3_InternalSyncChartstext
    public final void synpred3_InternalSyncChartstext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3884:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3885:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3885:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3886:2: '('
        {
        match(input,33,FOLLOW_33_in_synpred3_InternalSyncChartstext8920); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSyncChartstext

    // Delegated rules

    public final boolean synpred1_InternalSyncChartstext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSyncChartstext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSyncChartstext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSyncChartstext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSyncChartstext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSyncChartstext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\4\1\uffff\2\4\2\uffff\1\4\1\22\1\uffff\1\4";
    static final String DFA8_maxS =
        "\1\71\1\uffff\2\72\2\uffff\1\71\1\41\1\uffff\1\72";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\4\2\uffff\1\3\1\uffff";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\5\10\uffff\3\4\4\uffff\1\1\1\5\2\uffff\5\5\10\uffff"+
            "\4\1\1\3\17\1",
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "336:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )";
        }
    }
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\10\uffff\1\7\2\uffff";
    static final String DFA26_minS =
        "\5\4\1\uffff\1\4\1\uffff\1\4\1\22\1\uffff";
    static final String DFA26_maxS =
        "\1\71\4\72\1\uffff\1\72\1\uffff\1\71\1\41\1\uffff";
    static final String DFA26_acceptS =
        "\5\uffff\1\2\1\uffff\1\1\2\uffff\1\3";
    static final String DFA26_specialS =
        "\13\uffff}>";
    static final String[] DFA26_transitionS = {
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1509:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )";
        }
    }
    static final String DFA28_eotS =
        "\17\uffff";
    static final String DFA28_eofS =
        "\12\uffff\1\11\4\uffff";
    static final String DFA28_minS =
        "\5\4\1\uffff\2\4\2\uffff\2\4\1\22\1\uffff\1\4";
    static final String DFA28_maxS =
        "\1\71\4\72\1\uffff\2\72\2\uffff\2\71\1\41\1\uffff\1\72";
    static final String DFA28_acceptS =
        "\5\uffff\1\2\2\uffff\1\4\1\1\3\uffff\1\3\1\uffff";
    static final String DFA28_specialS =
        "\17\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\6\1\10\17\uffff\1\5\1\10\2\uffff\5\10\10\uffff\3\5\1\4\1"+
            "\7\1\1\1\2\1\3\14\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\5\44\uffff\1\11\20\uffff\1\5",
            "\1\12\41\uffff\24\11\1\5",
            "",
            "\1\5\21\uffff\1\10\12\uffff\1\10\30\uffff\1\13",
            "\1\14\41\uffff\24\15\1\5",
            "",
            "",
            "\2\11\13\uffff\1\11\1\5\1\uffff\1\5\2\11\2\uffff\5\11\10\uffff"+
            "\24\11",
            "\1\16\41\uffff\24\5",
            "\1\5\1\uffff\1\5\14\uffff\1\15",
            "",
            "\1\5\21\uffff\1\10\12\uffff\1\10\30\uffff\1\13"
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
            return "1595:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
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
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition266 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition287 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition302 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableDefinition437 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition491 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition509 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition530 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope647 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope666 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope685 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope704 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction892 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction911 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReaction928 = new BitSet(new long[]{0x43000003008003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction951 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction970 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalReaction986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSuspendEffect1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1179 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLocalReactionTrigger1192 = new BitSet(new long[]{0x000000003E000032L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEntry1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInside1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExit1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleReactionTrigger1736 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1767 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReactionTrigger1814 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1835 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleReactionTrigger1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect1950 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleReactionEffect1971 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect1993 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePreValueExpression2314 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePreValueExpression2326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2347 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePreValueExpression2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatechartRoot2590 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStateRoot2694 = new BitSet(new long[]{0x03FFFFC03E61C030L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTransitionRoot2798 = new BitSet(new long[]{0x000600003E400030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStatechartSpecification2914 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2935 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2958 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInterfaceScope3354 = new BitSet(new long[]{0x03FFFFC000020010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3375 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope3388 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3411 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3430 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3449 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInternalScope3545 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalScope3557 = new BitSet(new long[]{0x03FFFFC03E61C030L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3580 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3599 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3618 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3637 = new BitSet(new long[]{0x03FFFFC03E61C032L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3827 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEventDefinition3840 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition3861 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventDefinition3874 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperationDefinition4175 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition4196 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperationDefinition4208 = new BitSet(new long[]{0x03FFFFC400000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4230 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleOperationDefinition4243 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4264 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleOperationDefinition4280 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOperationDefinition4293 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleParameter4410 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParameter4422 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXID4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXID4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5017 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFQN5036 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5058 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5172 = new BitSet(new long[]{0x0000000010400002L});
    public static final BitSet FOLLOW_22_in_ruleTransitionReaction5186 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5207 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleTransitionReaction5222 = new BitSet(new long[]{0x0800000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5243 = new BitSet(new long[]{0x0800000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDefaultTrigger5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDefaultTrigger5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEntryPointSpec5679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec5789 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleExitPointSpec5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5990 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6011 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEntryEvent6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExitEvent6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAlwaysEvent6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlwaysEvent6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6661 = new BitSet(new long[]{0x0000000000040002L,0x00000000003FF000L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6691 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6712 = new BitSet(new long[]{0x0000000000040002L,0x00000000003FF000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6807 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleConditionalExpression6828 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6849 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditionalExpression6861 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6977 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalOrExpression6998 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7019 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7114 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLogicalAndExpression7135 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7156 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLogicalNotExpression7278 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7393 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBitwiseXorExpression7414 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7435 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseOrExpression7551 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7572 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7667 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBitwiseAndExpression7688 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7804 = new BitSet(new long[]{0x0800000000000002L,0x00000003E0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7834 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7855 = new BitSet(new long[]{0x0800000000000002L,0x00000003E0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7980 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression8039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8096 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8126 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8147 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8242 = new BitSet(new long[]{0x0000000000400002L,0x000000000C000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8272 = new BitSet(new long[]{0x03000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8293 = new BitSet(new long[]{0x0000000000400002L,0x000000000C000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8424 = new BitSet(new long[]{0x03000003000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8640 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFeatureCall8661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8681 = new BitSet(new long[]{0x0400000200000002L});
    public static final BitSet FOLLOW_33_in_ruleFeatureCall8715 = new BitSet(new long[]{0x43000007000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8750 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureCall8763 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8784 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleFeatureCall8800 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8904 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleElementReferenceExpression8938 = new BitSet(new long[]{0x43000007000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8973 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleElementReferenceExpression8986 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9007 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleElementReferenceExpression9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEventValueReferenceExpression9117 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEventValueReferenceExpression9129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9150 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEventValueReferenceExpression9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleActiveStateReferenceExpression9254 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleActiveStateReferenceExpression9266 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9289 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleActiveStateReferenceExpression9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleParenthesizedExpression9393 = new BitSet(new long[]{0x43000003000003F0L,0x0000000013000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9414 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParenthesizedExpression9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral10080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCombineOperator10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDirection10350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDirection10367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDirection10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTimeEventType10429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTimeEventType10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssignmentOperator10491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssignmentOperator10661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleShiftOperator10706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleShiftOperator10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAdditiveOperator10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAdditiveOperator10785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleMultiplicativeOperator10830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicativeOperator10847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleMultiplicativeOperator10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUnaryOperator10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleUnaryOperator10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleUnaryOperator10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator10988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator11005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRelationalOperator11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator11056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRelationalOperator11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit11118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTimeUnit11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1_InternalSyncChartstext1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred2_InternalSyncChartstext8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred3_InternalSyncChartstext8920 = new BitSet(new long[]{0x0000000000000002L});

}