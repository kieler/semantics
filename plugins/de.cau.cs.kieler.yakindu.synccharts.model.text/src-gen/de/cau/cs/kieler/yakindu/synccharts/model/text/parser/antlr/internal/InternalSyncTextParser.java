package de.cau.cs.kieler.yakindu.synccharts.model.text.parser.antlr.internal; 

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
import de.cau.cs.kieler.yakindu.synccharts.model.text.services.SyncTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSyncTextParser extends AbstractInternalAntlrParser {
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


        public InternalSyncTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSyncTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSyncTextParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g"; }



     	private SyncTextGrammarAccess grammarAccess;
     	
        public InternalSyncTextParser(TokenStream input, SyncTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SignalDefinition";	
       	}
       	
       	@Override
       	protected SyncTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSignalDefinition"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:68:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:69:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:70:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:77:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:80:28: ( ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:81:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:81:2: () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:87:2: ( (lv_isInput_1_0= 'input' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:88:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:88:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:89:3: lv_isInput_1_0= 'input'
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:102:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:103:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:103:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:104:3: lv_isOutput_2_0= 'output'
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:121:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:122:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:122:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:123:3: lv_name_4_0= RULE_ID
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:139:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:139:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:143:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:144:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:144:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:145:3: ruleFQN
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:158:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==18) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:158:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition266); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:162:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:163:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:163:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:164:3: lv_varInitialValue_8_0= ruleExpression
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:180:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==19) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:180:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition302); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:184:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:185:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:185:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:186:3: lv_varCombineOperator_10_0= ruleCombineOperator
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:214:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:215:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:216:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:223:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_varInitialValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:226:28: ( ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:227:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:227:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:227:2: () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:227:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:233:2: ( (lv_isStatic_1_0= 'static' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:234:1: (lv_isStatic_1_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:234:1: (lv_isStatic_1_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:235:3: lv_isStatic_1_0= 'static'
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:248:3: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:249:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:249:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:250:3: ruleFQN
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:263:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:264:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:264:1: (lv_name_3_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:265:3: lv_name_3_0= RULE_ID
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:281:2: (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:281:4: otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:285:1: ( (lv_varInitialValue_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:286:1: (lv_varInitialValue_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:286:1: (lv_varInitialValue_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:287:3: lv_varInitialValue_5_0= ruleExpression
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:315:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:316:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:317:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:324:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:327:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:328:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:328:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:329:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:339:5: this_FeatureCall_1= ruleFeatureCall
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:349:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:359:5: this_PreValueExpression_3= rulePreValueExpression
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:369:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:379:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:395:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:396:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:397:2: iv_ruleStateScope= ruleStateScope EOF
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:404:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:407:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:408:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:408:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:408:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:408:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:409:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:414:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=14 && LA10_0<=16)||(LA10_0>=21 && LA10_0<=22)||(LA10_0>=25 && LA10_0<=26)||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=38 && LA10_0<=57)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:415:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:415:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:416:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:416:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction )
            	    int alt9=3;
            	    alt9 = dfa9.predict(input);
            	    switch (alt9) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:417:3: lv_declarations_1_1= ruleVariableDeclaration
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:432:8: lv_declarations_1_2= ruleSignalDeclaration
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:447:8: lv_declarations_1_3= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope912);
            	            lv_declarations_1_3=ruleLocalReaction();

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:473:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:474:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:475:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration952);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration962); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:482:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:485:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:487:5: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration1008);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:503:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:504:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:505:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1042);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction1052); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:512:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:515:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:516:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:516:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:516:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:516:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||(LA12_0>=25 && LA12_0<=26)||(LA12_0>=28 && LA12_0<=30)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:517:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:517:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:518:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:518:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
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
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:519:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1100);
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
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:534:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1119);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:552:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:552:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLocalReaction1136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:556:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:557:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:557:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:558:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:558:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:559:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction1159);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:574:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1178);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLocalReaction1194); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:604:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:605:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:606:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1230);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect1240); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:613:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:616:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:617:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:617:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:617:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:617:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:618:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSuspendEffect1286); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:635:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:636:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:637:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1322);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger1332); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:644:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_triggers_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_isImmediate_3_0=null;
        Token lv_delay_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_triggers_1_0 = null;

        EObject lv_triggers_5_0 = null;

        EObject lv_guardExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:647:28: ( ( () ( (lv_triggers_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:648:1: ( () ( (lv_triggers_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:648:1: ( () ( (lv_triggers_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:648:2: () ( (lv_triggers_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:648:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:649:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:654:2: ( (lv_triggers_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:655:1: (lv_triggers_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:655:1: (lv_triggers_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:656:3: lv_triggers_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getTriggersStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1387);
            lv_triggers_1_0=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
              	        }
                     		add(
                     			current, 
                     			"triggers",
                      		lv_triggers_1_0, 
                      		"StateReaction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:672:2: (otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:672:4: otherlv_2= '&&' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )?
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLocalReactionTrigger1400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getAmpersandAmpersandKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:676:1: ( (lv_isImmediate_3_0= '#' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:677:1: (lv_isImmediate_3_0= '#' )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:677:1: (lv_isImmediate_3_0= '#' )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:678:3: lv_isImmediate_3_0= '#'
                            {
                            lv_isImmediate_3_0=(Token)match(input,25,FOLLOW_25_in_ruleLocalReactionTrigger1418); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:691:3: ( (lv_delay_4_0= RULE_INT ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:692:1: (lv_delay_4_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:692:1: (lv_delay_4_0= RULE_INT )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:693:3: lv_delay_4_0= RULE_INT
                            {
                            lv_delay_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLocalReactionTrigger1449); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:709:3: ( ( (lv_triggers_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' ) )?
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
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:709:4: ( (lv_triggers_5_0= ruleRegularEventSpec ) )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:709:4: ( (lv_triggers_5_0= ruleRegularEventSpec ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:710:1: (lv_triggers_5_0= ruleRegularEventSpec )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:710:1: (lv_triggers_5_0= ruleRegularEventSpec )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:711:3: lv_triggers_5_0= ruleRegularEventSpec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getTriggersRegularEventSpecParserRuleCall_2_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleLocalReactionTrigger1477);
                            lv_triggers_5_0=ruleRegularEventSpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"triggers",
                                      		lv_triggers_5_0, 
                                      		"RegularEventSpec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:728:6: (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:728:6: (otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:728:8: otherlv_6= '[' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleLocalReactionTrigger1496); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getLocalReactionTriggerAccess().getLeftSquareBracketKeyword_2_3_1_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:732:1: ( (lv_guardExpression_7_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:733:1: (lv_guardExpression_7_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:733:1: (lv_guardExpression_7_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:734:3: lv_guardExpression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_2_3_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleLocalReactionTrigger1517);
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

                            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleLocalReactionTrigger1529); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:762:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:763:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:764:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1570);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1580); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:771:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:774:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:775:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:775:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:776:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1627);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:786:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1654);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:796:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1681);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:812:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:813:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:814:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1716);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1726); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:821:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:824:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:825:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:825:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:825:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:825:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:826:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEntry1772); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:843:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:844:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:845:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1808);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1818); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:852:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:855:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:856:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:856:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:856:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:856:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:857:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleInside1864); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:874:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:875:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:876:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1900);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1910); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:883:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:886:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:887:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:887:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:887:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:887:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:888:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleExit1956); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:905:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:906:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:907:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1992);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger2002); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:914:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_triggers_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_triggers_3_0 = null;

        EObject lv_guardExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:917:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_triggers_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:918:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_triggers_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:918:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_triggers_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:918:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_triggers_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:918:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:919:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:924:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:925:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:925:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:926:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,25,FOLLOW_25_in_ruleReactionTrigger2054); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:939:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:940:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:940:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:941:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger2085); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:957:3: ( ( (lv_triggers_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:957:4: ( (lv_triggers_3_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:957:4: ( (lv_triggers_3_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:958:1: (lv_triggers_3_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:958:1: (lv_triggers_3_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:959:3: lv_triggers_3_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersRegularEventSpecParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2113);
                    lv_triggers_3_0=ruleRegularEventSpec();

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
                              		"RegularEventSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:976:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:976:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:976:8: otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleReactionTrigger2132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:980:1: ( (lv_guardExpression_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:981:1: (lv_guardExpression_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:981:1: (lv_guardExpression_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:982:3: lv_guardExpression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger2153);
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

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleReactionTrigger2165); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1010:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1011:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1012:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2203);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2213); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1019:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1022:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1023:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1023:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1023:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1023:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1024:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1029:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1030:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1030:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1031:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2268);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1047:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) && (synpred1_InternalSyncText())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1047:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1047:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1047:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReactionEffect2289); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1052:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1053:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1053:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1054:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2311);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1078:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1079:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1080:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2349);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2359); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1087:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1090:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1091:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1091:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1091:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1091:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1092:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePreValueExpression2405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulePreValueExpression2417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1105:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1106:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1106:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1107:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2438);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePreValueExpression2450); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1137:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1138:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1139:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2488);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2498); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1146:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1149:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1150:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1150:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1151:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2545);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1161:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2572);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1171:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2599);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1187:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1188:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1189:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2634);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2644); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1196:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1199:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1200:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1200:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1200:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleStatechartRoot2681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1204:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1205:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1205:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1206:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2702);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1230:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1231:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1232:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2738);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2748); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1239:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1242:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1243:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1243:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1243:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStateRoot2785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1247:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1248:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1248:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1249:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2806);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1273:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1274:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1275:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2842);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2852); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1282:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1285:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1286:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1286:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1286:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTransitionRoot2889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1290:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1291:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1291:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1292:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2910);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1318:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1319:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1320:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2948);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2958); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1327:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1330:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1331:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1331:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1331:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1331:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1332:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1337:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1337:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleStatechartSpecification3005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1341:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1342:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1342:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1343:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3026);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1359:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=39 && LA25_0<=40)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1360:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1360:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1361:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3049);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1385:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1386:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1387:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3086);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3096); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1394:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1397:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1398:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1398:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1399:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1399:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1400:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3141);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1424:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1425:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1426:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3176);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3186); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1433:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1436:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1437:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1437:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1438:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1438:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1439:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3231);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1465:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1466:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1467:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3268);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3278); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1474:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1477:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1478:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1478:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1479:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3325);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1489:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3352);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1507:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1508:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1509:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3389);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3399); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1516:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1519:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1520:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1520:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1520:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1520:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1521:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleInterfaceScope3445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1530:1: ( (lv_name_2_0= ruleXID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=38 && LA27_0<=57)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1531:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1531:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1532:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3466);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope3479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1552:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==58) ) {
                        alt29=1;
                    }
                    else if ( (LA29_2==RULE_ID) ) {
                        int LA29_5 = input.LA(3);

                        if ( (LA29_5==18||LA29_5==20) ) {
                            alt29=1;
                        }


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
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1553:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1553:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1554:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1554:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt28=3;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1555:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3502);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1570:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3521);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1585:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3540);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1611:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1612:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1613:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3580);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3590); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1620:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1623:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1624:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1624:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1624:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1624:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1625:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleInternalScope3636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalScope3648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1638:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==58) ) {
                        alt31=1;
                    }
                    else if ( (LA31_2==RULE_ID) ) {
                        int LA31_5 = input.LA(3);

                        if ( (LA31_5==18||LA31_5==20) ) {
                            alt31=1;
                        }


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
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1639:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1639:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1640:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1640:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt30=4;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1641:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3671);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1656:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3690);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1671:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3709);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1686:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3728);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1714:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1715:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1716:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3770);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3780); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1723:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1726:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1728:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3826);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1746:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1747:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1748:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3862);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3872); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1755:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1758:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1759:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1759:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1759:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1759:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=43 && LA32_0<=45)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1760:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1760:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1761:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3918);
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleEventDefinition3931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1781:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1782:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1782:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1783:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition3952);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1799:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1799:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventDefinition3965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1803:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1804:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1804:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1805:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3988);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1826:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1827:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1828:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4026);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4036); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1835:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1838:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1840:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4082);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1858:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1859:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1860:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4118);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4128); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1867:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1870:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1872:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4174);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1890:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1891:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1892:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4210);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition4220); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1899:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1902:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1903:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1903:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1903:2: () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1903:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1904:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOperationDefinition4266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1913:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1914:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1914:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1915:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition4287);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleOperationDefinition4299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1935:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||(LA35_0>=38 && LA35_0<=57)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1935:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1935:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1936:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1936:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1937:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4321);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1953:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==31) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1953:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleOperationDefinition4334); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1957:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1958:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1958:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1959:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4355);
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

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleOperationDefinition4371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1979:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1979:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleOperationDefinition4384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1983:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1984:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1984:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1985:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4407);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2006:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2007:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2008:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4445);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4455); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2015:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2018:28: ( ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2019:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2019:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2019:2: ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2019:2: ( (lv_name_0_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2020:1: (lv_name_0_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2020:1: (lv_name_0_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2021:3: lv_name_0_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameXIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleParameter4501);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleParameter4513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2041:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2042:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2042:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2043:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter4536);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2064:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2065:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2066:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4573);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4584); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2073:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2076:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2077:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2077:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2077:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2086:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2093:2: kw= 'interface'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2100:2: kw= 'internal'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2107:2: kw= 'event'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2114:2: kw= 'local'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2121:2: kw= 'in'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2128:2: kw= 'out'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2135:2: kw= 'var'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2142:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2149:2: kw= 'external'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2156:2: kw= 'operation'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2163:2: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2170:2: kw= 'else'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2177:2: kw= 'entry'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2184:2: kw= 'exit'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2191:2: kw= 'always'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2198:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2205:2: kw= 'raise'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID4971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2212:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleXID4990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2219:2: kw= 'active'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleXID5009); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2232:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2233:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2234:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5050);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5061); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2241:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2244:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2245:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2245:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2246:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN5108);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2256:1: (kw= '.' this_XID_2= ruleXID )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2257:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleFQN5127); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN5149);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2283:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2284:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2285:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5198);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5208); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2292:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2295:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2296:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2296:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2296:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2296:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2297:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2302:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_INT)||(LA39_0>=25 && LA39_0<=26)||(LA39_0>=49 && LA39_0<=50)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2303:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2303:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2304:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5263);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2320:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==22) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2320:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransitionReaction5277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2324:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2325:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2325:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2326:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5298);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2350:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2351:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2352:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5336);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5346); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2359:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2362:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2363:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2363:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2364:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5393);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2374:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5420);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2390:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2391:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2392:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5455);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5465); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2399:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2402:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2403:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2403:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2403:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2403:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2404:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2409:2: (otherlv_1= 'default' | otherlv_2= 'else' )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2409:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleDefaultTrigger5512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2414:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleDefaultTrigger5530); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2428:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2429:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2430:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5569);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5579); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2437:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2440:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2441:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2441:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2442:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2442:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2443:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5624);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2467:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2468:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2469:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5659);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5669); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2476:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2479:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2480:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2480:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2480:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2480:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2481:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2481:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2482:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5715);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2498:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2499:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2499:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2500:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5736);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2516:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2517:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2517:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2518:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5757);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2542:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2543:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2544:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5793);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5803); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2551:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2554:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2555:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2555:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2556:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5850);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2566:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5877);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2576:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5904);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2592:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2593:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2594:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5939);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5949); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2601:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2604:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2605:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2605:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2605:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2605:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2606:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleEntryEvent5995); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2623:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2624:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2625:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6031);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6041); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2632:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2635:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2636:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2636:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2636:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2636:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2637:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExitEvent6087); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2654:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2655:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2656:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6123);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6133); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2663:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2666:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2667:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2667:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2667:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2667:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2668:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2673:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2673:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleAlwaysEvent6180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2678:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleAlwaysEvent6198); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2694:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2695:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2696:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6239);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6249); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2703:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2706:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2708:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6295);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2724:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2725:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2726:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6329);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6339); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2733:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2736:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2737:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2737:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2738:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6386);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2746:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==18||(LA45_0>=75 && LA45_0<=84)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2746:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2746:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2747:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2752:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2753:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2753:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2754:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6416);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2770:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2771:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2771:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2772:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6437);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2796:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2797:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2798:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6475);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6485); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2805:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2808:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2809:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2809:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2810:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6532);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2818:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2818:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2818:2: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2819:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleConditionalExpression6553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2828:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2829:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2829:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2830:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6574);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConditionalExpression6586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2850:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2851:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2851:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2852:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6607);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2876:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2877:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2878:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6645);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6655); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2885:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2888:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2889:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2889:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2890:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6702);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2898:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==60) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2898:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2898:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2899:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleLogicalOrExpression6723); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2908:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2909:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2909:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2910:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6744);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2934:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2935:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2936:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6782);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6792); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2943:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2946:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2947:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2947:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2948:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6839);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2956:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==24) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2956:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2956:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2957:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLogicalAndExpression6860); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2966:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2967:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2967:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2968:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6881);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2992:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2993:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:2994:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6919);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6929); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3001:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3004:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3005:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3005:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3006:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6976);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3015:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3015:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3015:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3015:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3016:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLogicalNotExpression7003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3025:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3026:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3026:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3027:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7024);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3051:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3052:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3053:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7061);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7071); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3060:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3063:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3064:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3064:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3065:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7118);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3073:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==62) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3073:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3073:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3074:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleBitwiseXorExpression7139); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3083:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3084:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3084:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3085:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7160);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3109:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3110:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3111:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7198);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7208); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3118:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3121:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3122:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3122:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3123:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7255);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3131:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==63) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3131:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3131:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3132:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleBitwiseOrExpression7276); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3141:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3142:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3142:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3143:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7297);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3167:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3168:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3169:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7335);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7345); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3176:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3179:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3180:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3180:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3181:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7392);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3189:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==64) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3189:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3189:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3190:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseAndExpression7413); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3199:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3200:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3200:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3201:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7434);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3225:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3226:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3227:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7472);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7482); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3234:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3237:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3238:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3238:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3239:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7529);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3247:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=92 && LA53_0<=97)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3247:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3247:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3248:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3253:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3254:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3254:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3255:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7559);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3271:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3272:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3272:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3273:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7580);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3297:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3298:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3299:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7618);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7628); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3306:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3309:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3310:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3310:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3311:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7675);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3319:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=85 && LA54_0<=86)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3319:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3319:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3320:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3325:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3326:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3326:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3327:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7705);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3343:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3344:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3344:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3345:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7726);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3369:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3370:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3371:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7764);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7774); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3378:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3381:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3382:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3382:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3383:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7821);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3391:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=87 && LA55_0<=88)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3391:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3391:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3392:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3397:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3398:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3398:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3399:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7851);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3415:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3416:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3416:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3417:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7872);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3441:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3442:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3443:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7910);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7920); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3450:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3453:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3454:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3454:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3455:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7967);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3463:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==22||(LA56_0>=89 && LA56_0<=90)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3463:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3463:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3464:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3469:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3470:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3470:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3471:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7997);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3487:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3488:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3488:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3489:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8018);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3513:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3514:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3515:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8056);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8066); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3522:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3525:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3526:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3526:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3527:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8113);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3536:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3536:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3536:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3536:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3537:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3542:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3543:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3543:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3544:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8149);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3560:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3561:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3561:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3562:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8170);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3586:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3587:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3588:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8207);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8217); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3595:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3598:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3599:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3599:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3599:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3599:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3600:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3605:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3606:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3606:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3607:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8272);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3631:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3632:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3633:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8308);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8318); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3640:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3643:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3644:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3644:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3645:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8365);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3653:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==58) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3653:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3653:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3654:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleFeatureCall8386); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3663:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3664:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3664:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3665:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8406); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3676:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==33) && (synpred2_InternalSyncText())) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3676:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3676:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3676:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3683:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3684:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,33,FOLLOW_33_in_ruleFeatureCall8440); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3697:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt59=2;
            	            int LA59_0 = input.LA(1);

            	            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_STRING)||(LA59_0>=32 && LA59_0<=33)||(LA59_0>=56 && LA59_0<=57)||LA59_0==61||(LA59_0>=87 && LA59_0<=88)||LA59_0==91) ) {
            	                alt59=1;
            	            }
            	            switch (alt59) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3697:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3697:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3698:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3698:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3699:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8475);
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

            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3715:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop58:
            	                    do {
            	                        int alt58=2;
            	                        int LA58_0 = input.LA(1);

            	                        if ( (LA58_0==31) ) {
            	                            alt58=1;
            	                        }


            	                        switch (alt58) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3715:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleFeatureCall8488); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3719:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3720:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3720:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3721:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8509);
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

            	            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleFeatureCall8525); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3749:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3750:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3751:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8565);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8575); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3758:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3761:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3762:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3762:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3762:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3762:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3763:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3768:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3769:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3769:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3770:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3781:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==33) && (synpred3_InternalSyncText())) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3781:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3781:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3781:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3788:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3789:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,33,FOLLOW_33_in_ruleElementReferenceExpression8663); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3802:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_STRING)||(LA63_0>=32 && LA63_0<=33)||(LA63_0>=56 && LA63_0<=57)||LA63_0==61||(LA63_0>=87 && LA63_0<=88)||LA63_0==91) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3802:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3802:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3803:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3803:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3804:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8698);
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

                            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3820:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==31) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3820:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleElementReferenceExpression8711); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3824:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3825:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3825:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3826:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8732);
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

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleElementReferenceExpression8748); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3854:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3855:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3856:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8786);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8796); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3863:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3866:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3867:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3867:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3867:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3867:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3868:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEventValueReferenceExpression8842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleEventValueReferenceExpression8854); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3881:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3882:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3882:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3883:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8875);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleEventValueReferenceExpression8887); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3911:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3912:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3913:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8923);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8933); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3920:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3923:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3924:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3924:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3924:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3924:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3925:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleActiveStateReferenceExpression8979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleActiveStateReferenceExpression8991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3938:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3939:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3939:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3940:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9014);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleActiveStateReferenceExpression9026); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3965:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3966:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3967:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9062);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9072); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3974:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3977:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3978:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3978:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3978:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3978:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleParenthesizedExpression9118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3988:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3989:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3989:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3990:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9139);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleParenthesizedExpression9151); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4018:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4019:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4020:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9187);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9197); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4027:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4030:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4031:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4031:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4032:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9244);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4042:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9271);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4052:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9298);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4062:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9325);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4072:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9352);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4088:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4089:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4090:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9387);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9397); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4097:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4100:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4101:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4101:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4101:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4101:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4102:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4107:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4108:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4108:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4109:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9448); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4133:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4134:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4135:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9489);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9499); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4142:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4145:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4146:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4146:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4146:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4146:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4147:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4152:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4153:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4153:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4154:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9550); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4178:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4179:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4180:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9591);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9601); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4187:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4190:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4191:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4191:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4191:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4191:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4197:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4198:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4198:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4199:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9652); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4223:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4224:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4225:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9693);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9703); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4232:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4235:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4236:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4236:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4236:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4236:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4237:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4242:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4243:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4243:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4244:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9754); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4268:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4269:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4270:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9795);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9805); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4277:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4280:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4281:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4281:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4281:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4281:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4282:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4287:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4288:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4288:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4289:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9856); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4313:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4315:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4316:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4316:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4316:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4316:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4316:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator9911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4322:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4322:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4322:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator9928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4328:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4328:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4328:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator9945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4334:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4334:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4334:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator9962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4340:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4340:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4340:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator9979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4346:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4346:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4346:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator9996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4352:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4352:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4352:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4358:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4358:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4358:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10030); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4370:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4372:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4373:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4373:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4373:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4373:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4373:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleDirection10077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4379:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4379:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4379:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleDirection10094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4385:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4385:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4385:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleDirection10111); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4395:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4397:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4398:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4398:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4398:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4398:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4398:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleTimeEventType10156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4404:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4404:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4404:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleTimeEventType10173); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4414:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4416:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4417:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4417:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4417:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4417:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4417:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleAssignmentOperator10218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4423:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4423:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4423:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4429:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4429:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4429:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4435:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4435:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4435:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4441:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4441:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4441:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4447:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4447:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4447:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4453:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4453:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4453:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4459:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4459:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4459:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4465:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4465:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4465:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4471:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4471:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4471:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4477:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4477:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4477:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10388); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4487:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4489:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4490:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4490:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4490:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4490:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4490:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleShiftOperator10433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4496:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4496:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4496:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleShiftOperator10450); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4506:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4508:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4509:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4509:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4509:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4509:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4509:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleAdditiveOperator10495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4515:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4515:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4515:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleAdditiveOperator10512); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4525:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4527:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4528:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4528:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4528:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4528:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4528:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleMultiplicativeOperator10557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4534:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4534:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4534:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicativeOperator10574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4540:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4540:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4540:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleMultiplicativeOperator10591); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4550:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4552:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4553:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4553:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4553:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4553:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4553:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleUnaryOperator10636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4559:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4559:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4559:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleUnaryOperator10653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4565:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4565:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4565:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleUnaryOperator10670); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4575:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4577:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4578:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4578:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4578:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4578:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4578:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator10715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4584:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4584:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4584:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator10732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4590:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4590:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4590:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator10749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4596:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4596:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4596:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator10766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4602:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4602:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4602:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator10783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4608:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4608:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4608:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,97,FOLLOW_97_in_ruleRelationalOperator10800); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4618:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4620:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4621:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4621:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4621:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4621:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4621:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit10845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4627:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4627:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4627:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit10862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4633:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4633:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4633:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit10879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4639:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4639:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:4639:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_101_in_ruleTimeUnit10896); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSyncText
    public final void synpred1_InternalSyncText_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1047:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:1047:6: ','
        {
        match(input,31,FOLLOW_31_in_synpred1_InternalSyncText2281); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSyncText

    // $ANTLR start synpred2_InternalSyncText
    public final void synpred2_InternalSyncText_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3676:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3677:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3677:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3678:2: '('
        {
        match(input,33,FOLLOW_33_in_synpred2_InternalSyncText8422); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSyncText

    // $ANTLR start synpred3_InternalSyncText
    public final void synpred3_InternalSyncText_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3781:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3782:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3782:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.text/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/text/parser/antlr/internal/InternalSyncText.g:3783:2: '('
        {
        match(input,33,FOLLOW_33_in_synpred3_InternalSyncText8645); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSyncText

    // Delegated rules

    public final boolean synpred1_InternalSyncText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSyncText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSyncText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSyncText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSyncText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSyncText_fragment(); // can never throw exception
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
        "\7\uffff";
    static final String DFA9_eofS =
        "\7\uffff";
    static final String DFA9_minS =
        "\1\4\1\uffff\1\4\2\uffff\2\4";
    static final String DFA9_maxS =
        "\1\71\1\uffff\1\72\2\uffff\1\71\1\72";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String DFA9_specialS =
        "\7\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\4\10\uffff\3\3\4\uffff\1\1\1\4\2\uffff\2\4\1\uffff\3"+
            "\4\7\uffff\24\1",
            "",
            "\1\1\21\uffff\1\4\12\uffff\1\4\30\uffff\1\5",
            "",
            "",
            "\1\6\41\uffff\24\1",
            "\1\1\21\uffff\1\4\12\uffff\1\4\30\uffff\1\5"
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
            return "416:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction )";
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
            return "1554:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )";
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
            return "1640:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
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
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope912 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1100 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1119 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReaction1136 = new BitSet(new long[]{0x23000003008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction1159 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1178 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalReaction1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSuspendEffect1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1387 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLocalReactionTrigger1400 = new BitSet(new long[]{0x0000000006000032L});
    public static final BitSet FOLLOW_25_in_ruleLocalReactionTrigger1418 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLocalReactionTrigger1449 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleLocalReactionTrigger1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLocalReactionTrigger1496 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalReactionTrigger1517 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLocalReactionTrigger1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntry1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInside1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleExit1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleReactionTrigger2054 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger2085 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionTrigger2132 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger2153 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReactionTrigger2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2268 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleReactionEffect2289 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2311 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePreValueExpression2405 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePreValueExpression2417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2438 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePreValueExpression2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatechartRoot2681 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStateRoot2785 = new BitSet(new long[]{0x03FFFFC07661C030L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTransitionRoot2889 = new BitSet(new long[]{0x0006000076400030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStatechartSpecification3005 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3026 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3049 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInterfaceScope3445 = new BitSet(new long[]{0x03FFFFC000020010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3466 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope3479 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3502 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3521 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3540 = new BitSet(new long[]{0x03FFFFC000200012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInternalScope3636 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalScope3648 = new BitSet(new long[]{0x03FFFFC07661C030L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3671 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3690 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3709 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3728 = new BitSet(new long[]{0x03FFFFC07661C032L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3918 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEventDefinition3931 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition3952 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventDefinition3965 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperationDefinition4266 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition4287 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperationDefinition4299 = new BitSet(new long[]{0x03FFFFC400000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4321 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleOperationDefinition4334 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4355 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleOperationDefinition4371 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOperationDefinition4384 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleParameter4501 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParameter4513 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXID4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXID5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5108 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFQN5127 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5149 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5263 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTransitionReaction5277 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDefaultTrigger5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDefaultTrigger5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5715 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5736 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEntryEvent5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExitEvent6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAlwaysEvent6180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlwaysEvent6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6386 = new BitSet(new long[]{0x0000000000040002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6416 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6437 = new BitSet(new long[]{0x0000000000040002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6532 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleConditionalExpression6553 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6574 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditionalExpression6586 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6702 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicalOrExpression6723 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6744 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6839 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLogicalAndExpression6860 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6881 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalNotExpression7003 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7118 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBitwiseXorExpression7139 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7160 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7255 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBitwiseOrExpression7276 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7297 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseAndExpression7413 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7434 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7529 = new BitSet(new long[]{0x0000000000000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7559 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7580 = new BitSet(new long[]{0x0000000000000002L,0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7705 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7821 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7851 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7872 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7967 = new BitSet(new long[]{0x0000000000400002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7997 = new BitSet(new long[]{0x03000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8018 = new BitSet(new long[]{0x0000000000400002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8149 = new BitSet(new long[]{0x03000003000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8365 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFeatureCall8386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8406 = new BitSet(new long[]{0x0400000200000002L});
    public static final BitSet FOLLOW_33_in_ruleFeatureCall8440 = new BitSet(new long[]{0x23000007000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8475 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureCall8488 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8509 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleFeatureCall8525 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8629 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleElementReferenceExpression8663 = new BitSet(new long[]{0x23000007000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8698 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_31_in_ruleElementReferenceExpression8711 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8732 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_34_in_ruleElementReferenceExpression8748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEventValueReferenceExpression8842 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEventValueReferenceExpression8854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8875 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEventValueReferenceExpression8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleActiveStateReferenceExpression8979 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleActiveStateReferenceExpression8991 = new BitSet(new long[]{0x03FFFFC000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9014 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleActiveStateReferenceExpression9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleParenthesizedExpression9118 = new BitSet(new long[]{0x23000003000003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9139 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParenthesizedExpression9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator9962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDirection10077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDirection10094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDirection10111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTimeEventType10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTimeEventType10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssignmentOperator10218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleShiftOperator10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleShiftOperator10450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAdditiveOperator10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAdditiveOperator10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleMultiplicativeOperator10557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicativeOperator10574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleMultiplicativeOperator10591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnaryOperator10636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUnaryOperator10653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUnaryOperator10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator10732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator10749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator10766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator10783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRelationalOperator10800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit10845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit10862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit10879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTimeUnit10896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1_InternalSyncText2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred2_InternalSyncText8422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred3_InternalSyncText8645 = new BitSet(new long[]{0x0000000000000002L});

}