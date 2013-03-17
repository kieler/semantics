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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'static'", "'='", "';'", "'input'", "'output'", "'signal'", "':'", "'with'", "'extern'", "'('", "')'", "'/'", "'Suspend'", "'&&'", "'Entry'", "'During'", "'Exit'", "'#'", "'['", "']'", "','", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'operation'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'>'", "'?'", "'||'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
        	return "VariableDefinition";	
       	}
       	
       	@Override
       	protected SyncChartstextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:68:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:69:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:70:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:77:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_varInitialValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:80:28: ( ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:1: ( () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:2: () ( (lv_isStatic_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:87:2: ( (lv_isStatic_1_0= 'static' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:88:1: (lv_isStatic_1_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:88:1: (lv_isStatic_1_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:89:3: lv_isStatic_1_0= 'static'
                    {
                    lv_isStatic_1_0=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinition137); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:102:3: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:103:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:103:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:104:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition174);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:117:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:118:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:118:1: (lv_name_3_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:119:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition191); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:135:2: (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:135:4: otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:139:1: ( (lv_varInitialValue_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:140:1: (lv_varInitialValue_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:140:1: (lv_varInitialValue_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:141:3: lv_varInitialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarInitialValueExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition230);
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinition244); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:169:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:170:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:171:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope280);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope290); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:178:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;

        EObject lv_declarations_1_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:181:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:182:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:182:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:182:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:182:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:183:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:188:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||LA4_0==14||(LA4_0>=17 && LA4_0<=19)||LA4_0==22||LA4_0==25||(LA4_0>=28 && LA4_0<=32)||(LA4_0>=39 && LA4_0<=58)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:189:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:189:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:190:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:190:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    int alt3=4;
            	    alt3 = dfa3.predict(input);
            	    switch (alt3) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:191:3: lv_declarations_1_1= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStateScope347);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:206:8: lv_declarations_1_2= ruleSignalDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsSignalDeclarationParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleStateScope366);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:221:8: lv_declarations_1_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleStateScope385);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:236:8: lv_declarations_1_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope404);
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
    // $ANTLR end "ruleStateScope"


    // $ANTLR start "entryRuleSignalDeclaration"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:262:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:263:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:264:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration444);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration454); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:271:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:274:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:276:5: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration500);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:292:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:293:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:294:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition534);
            iv_ruleSignalDefinition=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDefinition544); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:301:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:304:28: ( ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:305:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:305:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:305:2: () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:305:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:306:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:311:2: ( (lv_isInput_1_0= 'input' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:312:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:312:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:313:3: lv_isInput_1_0= 'input'
                    {
                    lv_isInput_1_0=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition596); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:326:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:327:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:327:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:328:3: lv_isOutput_2_0= 'output'
                    {
                    lv_isOutput_2_0=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition628); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:345:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:346:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:346:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:347:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition671); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:363:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:363:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSignalDefinition689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:367:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:368:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:368:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:369:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getTypeTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSignalDefinition712);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:382:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:382:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition725); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:386:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:387:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:387:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:388:3: lv_varInitialValue_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleSignalDefinition746);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:404:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:404:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleSignalDefinition761); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:408:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:409:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:409:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:410:3: lv_varCombineOperator_10_0= ruleCombineOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignalDefinition782);
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

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleSignalDefinition798); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:438:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:439:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:440:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition834);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition844); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:447:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:450:28: ( ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:2: () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:451:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:452:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOperationDefinition890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getExternKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:461:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:462:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:462:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:463:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getFunctionTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition913);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:476:2: ( (lv_name_3_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:477:1: (lv_name_3_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:477:1: (lv_name_3_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:478:3: lv_name_3_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition934);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOperationDefinition946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:498:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:499:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:499:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:500:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParamTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition969);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOperationDefinition981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleOperationDefinition993); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:529:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:530:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:531:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1029);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction1039); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:538:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:541:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:542:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:542:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:542:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:542:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=28 && LA11_0<=32)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:543:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:543:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:544:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:544:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=28 && LA10_0<=30)) ) {
                        alt10=1;
                    }
                    else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=31 && LA10_0<=32)) ) {
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
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:545:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1087);
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
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:560:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1106);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:578:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:578:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLocalReaction1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:582:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:583:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:583:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:584:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:584:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==23||LA12_0==35||(LA12_0>=57 && LA12_0<=58)||LA12_0==63||(LA12_0>=89 && LA12_0<=90)||LA12_0==93) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:585:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction1146);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:600:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1165);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleLocalReaction1181); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:630:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:631:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:632:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1217);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect1227); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:639:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:642:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:643:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:643:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:643:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:643:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:644:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSuspendEffect1273); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:661:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:662:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:663:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1309);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger1319); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:670:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_reactionTrigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:673:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:674:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:674:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:674:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:674:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:675:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:680:2: ( (lv_stateReaction_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:681:1: (lv_stateReaction_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:681:1: (lv_stateReaction_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:682:3: lv_stateReaction_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getStateReactionStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1374);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:698:2: (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:698:4: otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLocalReactionTrigger1387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getAmpersandAmpersandKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:702:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||(LA13_0>=31 && LA13_0<=32)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:703:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:703:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:704:3: lv_reactionTrigger_3_0= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerReactionTriggerParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1408);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:728:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:729:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:730:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1447);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1457); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:737:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:740:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:741:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:741:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:742:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1504);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:752:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1531);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:762:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1558);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:778:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:779:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:780:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1593);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1603); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:787:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:790:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:791:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:791:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:791:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:791:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:792:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEntry1649); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:809:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:810:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:811:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1685);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1695); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:818:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:821:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:822:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:822:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:822:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:822:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:823:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleInside1741); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:840:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:841:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:842:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1777);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1787); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:849:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:852:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:853:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:853:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:853:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:853:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:854:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleExit1833); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:871:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:872:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:873:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1869);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1879); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:880:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:883:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:884:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:884:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:884:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:884:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:885:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:890:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:891:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:891:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:892:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,31,FOLLOW_31_in_ruleReactionTrigger1931); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:905:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:906:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:906:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:907:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1962); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:923:3: ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:923:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:923:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:924:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:924:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:925:3: lv_trigger_3_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1990);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:942:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:942:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:942:8: otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleReactionTrigger2009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:946:1: ( (lv_guardExpression_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:947:1: (lv_guardExpression_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:947:1: (lv_guardExpression_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:948:3: lv_guardExpression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger2030);
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

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleReactionTrigger2042); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:976:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:977:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:978:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2080);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2090); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:985:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:988:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:989:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:989:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:989:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:989:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:990:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:995:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:996:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:996:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:997:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2145);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1013:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) && (synpred1_InternalSyncChartstext())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1013:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1013:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1013:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleReactionEffect2166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1018:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1019:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1019:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1020:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2188);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1044:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1045:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1046:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2226);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2236); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1053:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1056:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1057:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1057:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
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
            case 58:
                {
                alt20=3;
                }
                break;
            case 35:
                {
                alt20=4;
                }
                break;
            case 23:
                {
                alt20=5;
                }
                break;
            case 57:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1058:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2283);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1068:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2310);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1078:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2337);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1088:5: this_PreValueExpression_3= rulePreValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2364);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1098:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2391);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1108:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2418);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1124:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1125:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1126:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2453);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2463); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1133:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1136:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1137:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1137:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1137:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1137:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1138:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_rulePreValueExpression2509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePreValueExpression2521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1151:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1152:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1152:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1153:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2542);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePreValueExpression2554); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1183:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1184:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1185:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2592);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2602); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1192:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1195:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1196:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1196:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1197:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2649);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1207:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2676);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1217:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2703);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1233:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1234:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1235:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2738);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2748); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1242:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1245:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1246:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1246:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1246:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStatechartRoot2785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1250:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1251:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1251:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1252:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2806);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1276:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1277:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1278:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2842);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2852); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1285:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1288:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1289:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1289:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1289:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleStateRoot2889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1293:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1294:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1294:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1295:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2910);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1319:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1320:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1321:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2946);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2956); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1328:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1331:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1332:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1332:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1332:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTransitionRoot2993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1336:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1337:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1337:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1338:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3014);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1364:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1365:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1366:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3052);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification3062); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1373:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1376:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1377:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1377:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1377:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1377:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1378:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1383:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1383:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleStatechartSpecification3109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1387:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1388:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1388:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1389:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3130);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1405:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=40 && LA23_0<=41)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1406:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1406:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1407:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3153);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1431:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1432:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1433:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3190);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3200); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1440:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1443:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1444:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1444:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1445:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1445:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1446:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3245);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1470:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1471:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1472:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3280);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3290); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1479:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1482:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1483:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1483:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1484:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1484:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1485:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3335);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1511:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1512:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1513:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3372);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3382); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1520:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1523:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1524:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1524:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==41) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1525:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3429);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1535:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3456);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1553:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1554:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1555:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3493);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3503); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1562:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1565:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1566:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1566:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1566:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1566:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1567:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleInterfaceScope3549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1576:1: ( (lv_name_2_0= ruleXID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||(LA25_0>=39 && LA25_0<=58)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1577:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1577:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1578:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3570);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInterfaceScope3583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1598:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==59) ) {
                        alt27=1;
                    }
                    else if ( (LA27_2==RULE_ID) ) {
                        int LA27_5 = input.LA(3);

                        if ( ((LA27_5>=15 && LA27_5<=16)) ) {
                            alt27=1;
                        }


                    }


                    }
                    break;
                case 41:
                    {
                    int LA27_3 = input.LA(2);

                    if ( (LA27_3==RULE_ID||LA27_3==59) ) {
                        alt27=1;
                    }


                    }
                    break;
                case RULE_ID:
                case 14:
                case 22:
                case 39:
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
                case 58:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1599:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1599:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1600:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1600:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        int LA26_1 = input.LA(2);

            	        if ( (LA26_1==42) ) {
            	            alt26=1;
            	        }
            	        else if ( (LA26_1==RULE_ID||LA26_1==59) ) {
            	            alt26=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 26, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 44:
            	        {
            	        int LA26_2 = input.LA(2);

            	        if ( (LA26_2==RULE_ID||LA26_2==59) ) {
            	            alt26=2;
            	        }
            	        else if ( (LA26_2==42) ) {
            	            alt26=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 26, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 45:
            	        {
            	        int LA26_3 = input.LA(2);

            	        if ( (LA26_3==RULE_ID||LA26_3==59) ) {
            	            alt26=2;
            	        }
            	        else if ( (LA26_3==42) ) {
            	            alt26=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 26, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 42:
            	        {
            	        switch ( input.LA(2) ) {
            	        case RULE_ID:
            	            {
            	            int LA26_8 = input.LA(3);

            	            if ( (LA26_8==EOF||LA26_8==RULE_ID||LA26_8==14||LA26_8==20||LA26_8==22||(LA26_8>=39 && LA26_8<=58)) ) {
            	                alt26=1;
            	            }
            	            else if ( ((LA26_8>=15 && LA26_8<=16)) ) {
            	                alt26=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 26, 8, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
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
            	        case 58:
            	            {
            	            alt26=1;
            	            }
            	            break;
            	        case 59:
            	            {
            	            alt26=2;
            	            }
            	            break;
            	        default:
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 26, 4, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case RULE_ID:
            	    case 14:
            	    case 39:
            	    case 40:
            	    case 41:
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
            	    case 58:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1601:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3606);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1616:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3625);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1631:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3644);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1657:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1658:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1659:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3684);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3694); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1666:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1669:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1670:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1670:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1670:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1670:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleInternalScope3740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleInternalScope3752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1684:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==59) ) {
                        alt29=1;
                    }
                    else if ( (LA29_2==RULE_ID) ) {
                        int LA29_5 = input.LA(3);

                        if ( ((LA29_5>=15 && LA29_5<=16)) ) {
                            alt29=1;
                        }


                    }


                    }
                    break;
                case 41:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (LA29_3==RULE_ID||LA29_3==59) ) {
                        alt29=1;
                    }


                    }
                    break;
                case RULE_ID:
                case RULE_INT:
                case 14:
                case 22:
                case 25:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 39:
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
                case 58:
                    {
                    alt29=1;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1685:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1685:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1686:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1686:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt28=4;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1687:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3775);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1702:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3794);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1717:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3813);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1732:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3832);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1760:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1761:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1762:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3874);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3884); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1769:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1772:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1774:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3930);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1792:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1793:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1794:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3966);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3976); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1801:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1804:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1805:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1805:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1805:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1805:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=43 && LA30_0<=45)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1806:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1806:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1807:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition4022);
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleEventDefinition4035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1827:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1828:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1828:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1829:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition4056);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1845:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1845:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventDefinition4069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1849:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1850:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1850:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1851:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4092);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1872:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1873:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1874:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4130);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4140); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1881:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1884:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1886:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4186);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1904:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1905:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1906:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4222);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4232); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1913:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1916:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1918:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4278);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1938:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1939:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1940:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4317);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4328); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1947:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1950:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1951:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1951:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt32=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt32=1;
                }
                break;
            case 39:
                {
                alt32=2;
                }
                break;
            case 40:
                {
                alt32=3;
                }
                break;
            case 41:
                {
                alt32=4;
                }
                break;
            case 42:
                {
                alt32=5;
                }
                break;
            case 43:
                {
                alt32=6;
                }
                break;
            case 44:
                {
                alt32=7;
                }
                break;
            case 45:
                {
                alt32=8;
                }
                break;
            case 46:
                {
                alt32=9;
                }
                break;
            case 47:
                {
                alt32=10;
                }
                break;
            case 48:
                {
                alt32=11;
                }
                break;
            case 49:
                {
                alt32=12;
                }
                break;
            case 50:
                {
                alt32=13;
                }
                break;
            case 51:
                {
                alt32=14;
                }
                break;
            case 52:
                {
                alt32=15;
                }
                break;
            case 53:
                {
                alt32=16;
                }
                break;
            case 54:
                {
                alt32=17;
                }
                break;
            case 55:
                {
                alt32=18;
                }
                break;
            case 56:
                {
                alt32=19;
                }
                break;
            case 57:
                {
                alt32=20;
                }
                break;
            case 58:
                {
                alt32=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1951:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1960:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1967:2: kw= 'interface'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1974:2: kw= 'internal'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1981:2: kw= 'event'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1988:2: kw= 'local'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1995:2: kw= 'in'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2002:2: kw= 'out'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2009:2: kw= 'var'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2016:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2023:2: kw= 'external'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2030:2: kw= 'operation'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2037:2: kw= 'default'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2044:2: kw= 'else'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2051:2: kw= 'entry'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2058:2: kw= 'exit'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2065:2: kw= 'always'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2072:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID4696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2079:2: kw= 'raise'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleXID4715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2086:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleXID4734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2093:2: kw= 'active'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleXID4753); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2106:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2107:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2108:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4794);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4805); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2115:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2118:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2119:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2119:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2120:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN4852);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2130:1: (kw= '.' this_XID_2= ruleXID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==59) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2131:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,59,FOLLOW_59_in_ruleFQN4871); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN4893);
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
            	    break loop33;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2157:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2158:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2159:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4942);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4952); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2166:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2169:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2170:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2170:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2170:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2170:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2171:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2176:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_INT||LA34_1==32) ) {
                    alt34=1;
                }
                else if ( (LA34_1==RULE_ID) ) {
                    int LA34_4 = input.LA(3);

                    if ( (LA34_4==EOF||LA34_4==23||LA34_4==25||LA34_4==31||LA34_4==59) ) {
                        alt34=1;
                    }
                }
            }
            else if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)||LA34_0==32||(LA34_0>=50 && LA34_0<=51)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2177:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2177:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2178:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5007);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2194:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2194:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTransitionReaction5021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2198:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2199:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2199:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2200:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5042);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2216:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2216:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleTransitionReaction5057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2220:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID||LA36_0==60) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2221:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2221:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2222:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5078);
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
                    	    break loop36;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2246:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2247:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2248:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5117);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5127); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2255:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2258:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2259:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2259:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_INT)||(LA38_0>=31 && LA38_0<=32)) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=50 && LA38_0<=51)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2260:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5174);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2270:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5201);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2286:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2287:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2288:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5236);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5246); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2295:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2298:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2299:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2299:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2299:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2299:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2300:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2305:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            else if ( (LA39_0==51) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2305:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleDefaultTrigger5293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2310:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleDefaultTrigger5311); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2322:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2323:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2324:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5348);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty5358); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2331:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2334:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2335:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2335:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==60) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2336:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5405);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2346:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5432);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2362:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2363:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2364:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5467);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5477); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2371:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2374:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2375:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2375:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2375:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleEntryPointSpec5514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2379:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2380:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2380:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2381:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec5531); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2405:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2406:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2407:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5572);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5582); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2414:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2417:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2418:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2418:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2418:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2418:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2419:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2419:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2420:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec5624); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleExitPointSpec5641); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2450:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2451:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2452:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5679);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5689); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2459:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2462:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2463:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2463:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2464:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2464:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2465:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5734);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2489:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2490:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2491:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5769);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5779); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2498:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2501:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2502:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2502:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2502:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2502:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2503:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2503:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2504:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5825);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2520:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2521:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2521:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2522:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5846);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2538:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2539:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2539:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2540:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5867);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2564:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2565:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2566:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5903);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5913); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2573:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2576:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2577:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2577:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt41=1;
                }
                break;
            case 53:
                {
                alt41=2;
                }
                break;
            case 54:
            case 55:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2578:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5960);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2588:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5987);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2598:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6014);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2614:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2615:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2616:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6049);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent6059); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2623:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2626:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2627:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2627:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2627:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2627:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2628:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleEntryEvent6105); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2645:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2646:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2647:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6141);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6151); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2654:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2657:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2658:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2658:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2658:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2658:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleExitEvent6197); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2676:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2677:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2678:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6233);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6243); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2685:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2688:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2689:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2689:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2689:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2689:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2690:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2695:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            else if ( (LA42_0==55) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2695:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleAlwaysEvent6290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2700:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleAlwaysEvent6308); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2716:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2717:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2718:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6349);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6359); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2725:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2728:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2730:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6405);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2746:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2747:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2748:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6439);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6449); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2755:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2758:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2759:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2759:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2760:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6496);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2768:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==15||(LA43_0>=77 && LA43_0<=86)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2768:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2768:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2769:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2774:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2775:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2775:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2776:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6526);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2792:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2793:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2793:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2794:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6547);
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
            	    break loop43;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2818:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2819:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2820:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6585);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6595); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2827:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2830:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2831:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2831:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2832:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6642);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2840:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2840:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2840:2: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2841:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleConditionalExpression6663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2850:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2851:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2851:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2852:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6684);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConditionalExpression6696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2872:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2873:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2873:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2874:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6717);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2898:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2899:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2900:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6755);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6765); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2907:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2910:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2911:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2911:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2912:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6812);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2920:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==62) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2920:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2920:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2921:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleLogicalOrExpression6833); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2930:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2931:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2931:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2932:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6854);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2956:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2957:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2958:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6892);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6902); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2965:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2968:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2969:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2969:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2970:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6949);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2978:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2978:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2978:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2979:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLogicalAndExpression6970); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2988:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2989:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2989:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2990:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6991);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3014:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3015:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3016:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7029);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7039); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3023:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3026:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3027:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3027:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==23||LA47_0==35||(LA47_0>=57 && LA47_0<=58)||(LA47_0>=89 && LA47_0<=90)||LA47_0==93) ) {
                alt47=1;
            }
            else if ( (LA47_0==63) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3028:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7086);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3037:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3037:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3037:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3037:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3038:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleLogicalNotExpression7113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3047:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3048:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3048:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3049:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7134);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3073:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3074:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3075:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7171);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7181); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3082:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3085:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3086:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3086:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3087:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7228);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3095:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==64) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3095:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3095:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3096:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseXorExpression7249); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3105:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3106:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3106:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3107:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7270);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3131:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3132:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3133:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7308);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7318); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3140:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3143:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3144:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3144:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3145:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7365);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3153:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==65) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3153:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3153:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3154:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleBitwiseOrExpression7386); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3163:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3164:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3164:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3165:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7407);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3189:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3190:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3191:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7445);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7455); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3198:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3201:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3202:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3202:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3203:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7502);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3211:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==66) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3211:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3211:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3212:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleBitwiseAndExpression7523); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3221:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3222:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3222:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3223:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7544);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3247:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3248:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3249:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7582);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7592); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3256:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3259:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3260:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3260:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3261:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7639);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3269:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==60||(LA51_0>=94 && LA51_0<=98)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3269:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3269:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3270:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3275:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3276:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3276:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3277:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7669);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3293:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3294:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3294:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3295:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7690);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3319:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3320:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3321:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7728);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7738); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3328:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3331:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3332:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3332:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3333:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7785);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3341:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=87 && LA52_0<=88)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3341:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3341:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3342:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3347:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3348:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3348:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3349:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7815);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3365:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3366:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3366:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3367:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7836);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3391:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3392:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3393:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7874);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7884); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3400:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3403:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3404:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3404:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3405:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7931);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3413:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=89 && LA53_0<=90)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3413:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3413:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3414:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3419:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3420:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3420:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3421:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7961);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3437:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3438:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3438:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3439:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7982);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3463:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3464:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3465:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8020);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8030); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3472:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3475:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3476:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3476:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3477:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8077);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3485:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==25||(LA54_0>=91 && LA54_0<=92)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3485:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3485:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3486:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3491:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3492:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3492:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3493:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8107);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3509:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3510:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3510:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3511:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8128);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3535:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3536:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3537:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8166);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8176); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3544:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3547:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3548:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3548:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_STRING)||LA55_0==23||LA55_0==35||(LA55_0>=57 && LA55_0<=58)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=89 && LA55_0<=90)||LA55_0==93) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3549:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8223);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3558:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3558:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3558:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3558:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3559:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3564:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3565:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3565:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3566:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8259);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3582:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3583:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3583:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3584:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8280);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3608:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3609:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3610:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8317);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8327); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3617:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3620:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3621:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3621:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3621:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3621:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3622:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3627:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3628:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3628:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3629:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8382);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3653:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3654:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3655:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8418);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8428); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3662:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3665:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3666:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3666:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3667:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8475);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3675:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==59) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3675:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3675:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3676:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleFeatureCall8496); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3685:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3686:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3686:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3687:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8516); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3698:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==23) && (synpred2_InternalSyncChartstext())) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3698:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3698:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3698:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3705:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3706:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,23,FOLLOW_23_in_ruleFeatureCall8550); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3719:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt57=2;
            	            int LA57_0 = input.LA(1);

            	            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==23||LA57_0==35||(LA57_0>=57 && LA57_0<=58)||LA57_0==63||(LA57_0>=89 && LA57_0<=90)||LA57_0==93) ) {
            	                alt57=1;
            	            }
            	            switch (alt57) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3719:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3719:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3720:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3720:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3721:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8585);
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

            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3737:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop56:
            	                    do {
            	                        int alt56=2;
            	                        int LA56_0 = input.LA(1);

            	                        if ( (LA56_0==34) ) {
            	                            alt56=1;
            	                        }


            	                        switch (alt56) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3737:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleFeatureCall8598); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3741:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3742:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3742:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3743:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8619);
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
            	                    	    break loop56;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleFeatureCall8635); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3771:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3772:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3773:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8675);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8685); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3780:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3783:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3784:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3784:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3784:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3784:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3785:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3790:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3791:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3791:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3792:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3803:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==23) && (synpred3_InternalSyncChartstext())) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3803:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3803:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3803:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3810:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3811:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,23,FOLLOW_23_in_ruleElementReferenceExpression8773); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3824:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==23||LA61_0==35||(LA61_0>=57 && LA61_0<=58)||LA61_0==63||(LA61_0>=89 && LA61_0<=90)||LA61_0==93) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3824:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3824:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3825:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3825:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3826:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8808);
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

                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3842:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==34) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3842:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleElementReferenceExpression8821); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3846:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3847:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3847:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3848:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8842);
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
                            	    break loop60;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleElementReferenceExpression8858); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3876:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3877:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3878:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8896);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8906); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3885:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3888:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3889:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3889:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3889:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3889:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3890:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleEventValueReferenceExpression8952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEventValueReferenceExpression8964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3903:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3904:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3904:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3905:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8985);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleEventValueReferenceExpression8997); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3933:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3934:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3935:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9033);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9043); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3942:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3945:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3946:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3946:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3946:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3946:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3947:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleActiveStateReferenceExpression9089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleActiveStateReferenceExpression9101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3960:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3961:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3961:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3962:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9124);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleActiveStateReferenceExpression9136); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3987:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3988:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3989:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9172);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9182); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3996:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3999:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4000:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4000:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4000:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4000:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4001:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParenthesizedExpression9228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4010:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4011:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4011:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4012:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9249);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParenthesizedExpression9261); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4040:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4041:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4042:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9297);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9307); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4049:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4052:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4053:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4053:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt63=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt63=1;
                }
                break;
            case RULE_INT:
                {
                alt63=2;
                }
                break;
            case RULE_HEX:
                {
                alt63=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt63=4;
                }
                break;
            case RULE_STRING:
                {
                alt63=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4054:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9354);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4064:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9381);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4074:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9408);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4084:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9435);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4094:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9462);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4110:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4111:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4112:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9497);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9507); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4119:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4122:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4123:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4123:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4123:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4123:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4124:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4129:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4130:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4130:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4131:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9558); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4155:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4156:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4157:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9599);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9609); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4164:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4167:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4168:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4168:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4168:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4168:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4169:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4174:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4175:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4175:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4176:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9660); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4200:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4201:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4202:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9701);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9711); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4209:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4212:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4213:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4213:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4213:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4213:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4214:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4219:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4220:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4220:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4221:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9762); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4245:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4246:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4247:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9803);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9813); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4254:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4257:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4258:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4258:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4258:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4258:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4259:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4264:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4265:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4265:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4266:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9864); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4290:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4291:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4292:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9905);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9915); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4299:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4302:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4303:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4303:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4303:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4303:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4304:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4309:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4310:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4310:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4311:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9966); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4335:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4337:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4338:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4338:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt64=8;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt64=1;
                }
                break;
            case 68:
                {
                alt64=2;
                }
                break;
            case 69:
                {
                alt64=3;
                }
                break;
            case 70:
                {
                alt64=4;
                }
                break;
            case 71:
                {
                alt64=5;
                }
                break;
            case 72:
                {
                alt64=6;
                }
                break;
            case 73:
                {
                alt64=7;
                }
                break;
            case 74:
                {
                alt64=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4338:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4338:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4338:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator10021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4344:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4344:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4344:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator10038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4350:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4350:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4350:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator10055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4356:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4356:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4356:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4362:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4362:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4362:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4368:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4368:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4368:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4374:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4374:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4374:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_73_in_ruleCombineOperator10123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4380:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4380:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4380:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_74_in_ruleCombineOperator10140); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4390:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4392:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4393:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4393:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt65=1;
                }
                break;
            case 44:
                {
                alt65=2;
                }
                break;
            case 45:
                {
                alt65=3;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4393:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4393:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4393:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleDirection10185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4399:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4399:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4399:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleDirection10202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4405:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4405:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4405:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleDirection10219); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4415:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4417:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4418:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4418:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==75) ) {
                alt66=1;
            }
            else if ( (LA66_0==76) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4418:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4418:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4418:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleTimeEventType10264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4424:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4424:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4424:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleTimeEventType10281); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4434:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4436:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt67=11;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt67=1;
                }
                break;
            case 77:
                {
                alt67=2;
                }
                break;
            case 78:
                {
                alt67=3;
                }
                break;
            case 79:
                {
                alt67=4;
                }
                break;
            case 80:
                {
                alt67=5;
                }
                break;
            case 81:
                {
                alt67=6;
                }
                break;
            case 82:
                {
                alt67=7;
                }
                break;
            case 83:
                {
                alt67=8;
                }
                break;
            case 84:
                {
                alt67=9;
                }
                break;
            case 85:
                {
                alt67=10;
                }
                break;
            case 86:
                {
                alt67=11;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_15_in_ruleAssignmentOperator10326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4443:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4443:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4443:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4449:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4449:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4449:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4455:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4455:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4455:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4461:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4461:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4461:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4467:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4467:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4467:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4473:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4473:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4473:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4479:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4479:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4479:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4485:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4485:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4485:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4491:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4491:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4491:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,85,FOLLOW_85_in_ruleAssignmentOperator10479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4497:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4497:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4497:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,86,FOLLOW_86_in_ruleAssignmentOperator10496); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4507:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4509:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4510:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4510:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==87) ) {
                alt68=1;
            }
            else if ( (LA68_0==88) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4510:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4510:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4510:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleShiftOperator10541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4516:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4516:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4516:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleShiftOperator10558); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4526:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4528:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4529:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4529:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==89) ) {
                alt69=1;
            }
            else if ( (LA69_0==90) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4529:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4529:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4529:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleAdditiveOperator10603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4535:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4535:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4535:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleAdditiveOperator10620); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4545:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4547:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt70=1;
                }
                break;
            case 25:
                {
                alt70=2;
                }
                break;
            case 92:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_91_in_ruleMultiplicativeOperator10665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4554:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4554:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4554:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicativeOperator10682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4560:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4560:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4560:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_92_in_ruleMultiplicativeOperator10699); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4570:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4572:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4573:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4573:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt71=1;
                }
                break;
            case 90:
                {
                alt71=2;
                }
                break;
            case 93:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4573:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4573:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4573:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleUnaryOperator10744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4579:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4579:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4579:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleUnaryOperator10761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4585:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4585:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4585:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_93_in_ruleUnaryOperator10778); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4595:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4597:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4598:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4598:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt72=6;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt72=1;
                }
                break;
            case 95:
                {
                alt72=2;
                }
                break;
            case 60:
                {
                alt72=3;
                }
                break;
            case 96:
                {
                alt72=4;
                }
                break;
            case 97:
                {
                alt72=5;
                }
                break;
            case 98:
                {
                alt72=6;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4598:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4598:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4598:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator10823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4604:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4604:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4604:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator10840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4610:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleRelationalOperator10857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4616:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4616:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4616:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator10874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4622:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4622:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4622:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_97_in_ruleRelationalOperator10891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4628:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4628:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4628:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,98,FOLLOW_98_in_ruleRelationalOperator10908); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4638:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4640:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt73=1;
                }
                break;
            case 100:
                {
                alt73=2;
                }
                break;
            case 101:
                {
                alt73=3;
                }
                break;
            case 102:
                {
                alt73=4;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4641:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit10953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4647:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4647:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4647:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit10970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4653:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4653:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4653:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_101_in_ruleTimeUnit10987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4659:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4659:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4659:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_102_in_ruleTimeUnit11004); if (state.failed) return current;
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
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1013:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1013:6: ','
        {
        match(input,34,FOLLOW_34_in_synpred1_InternalSyncChartstext2158); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSyncChartstext

    // $ANTLR start synpred2_InternalSyncChartstext
    public final void synpred2_InternalSyncChartstext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3698:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3699:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3699:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3700:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred2_InternalSyncChartstext8532); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSyncChartstext

    // $ANTLR start synpred3_InternalSyncChartstext
    public final void synpred3_InternalSyncChartstext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3803:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3804:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3804:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3805:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred3_InternalSyncChartstext8755); if (state.failed) return ;

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA3_eotS =
        "\10\uffff";
    static final String DFA3_eofS =
        "\10\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\3\uffff\2\4";
    static final String DFA3_maxS =
        "\1\72\1\uffff\1\73\3\uffff\1\72\1\73";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\2\uffff";
    static final String DFA3_specialS =
        "\10\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\5\10\uffff\1\1\2\uffff\3\3\2\uffff\1\4\2\uffff\1\5\2"+
            "\uffff\5\5\6\uffff\24\1",
            "",
            "\1\1\22\uffff\1\5\1\uffff\1\5\41\uffff\1\6",
            "",
            "",
            "",
            "\1\7\42\uffff\24\1",
            "\1\1\22\uffff\1\5\1\uffff\1\5\41\uffff\1\6"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "190:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )";
        }
    }
    static final String DFA28_eotS =
        "\15\uffff";
    static final String DFA28_eofS =
        "\12\uffff\1\11\2\uffff";
    static final String DFA28_minS =
        "\5\4\1\uffff\1\4\3\uffff\3\4";
    static final String DFA28_maxS =
        "\1\72\4\73\1\uffff\1\73\3\uffff\2\72\1\73";
    static final String DFA28_acceptS =
        "\5\uffff\1\2\1\uffff\1\3\1\4\1\1\3\uffff";
    static final String DFA28_specialS =
        "\15\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\6\1\10\10\uffff\1\5\7\uffff\1\7\2\uffff\1\10\2\uffff\5\10"+
            "\6\uffff\3\5\1\4\1\1\1\2\1\3\15\5",
            "\1\5\45\uffff\1\11\20\uffff\1\5",
            "\1\5\45\uffff\1\11\20\uffff\1\5",
            "\1\5\45\uffff\1\11\20\uffff\1\5",
            "\1\12\42\uffff\24\11\1\5",
            "",
            "\1\5\22\uffff\1\10\1\uffff\1\10\41\uffff\1\13",
            "",
            "",
            "",
            "\2\11\10\uffff\1\11\2\5\3\uffff\1\11\1\uffff\1\11\2\uffff"+
            "\1\11\2\uffff\5\11\6\uffff\24\11",
            "\1\14\42\uffff\24\5",
            "\1\5\22\uffff\1\10\1\uffff\1\10\41\uffff\1\13"
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
            return "1686:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
        }
    }
 

    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinition137 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition191 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition209 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition230 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinition244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope347 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope366 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope385 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope404 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSignalDefinition596 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition628 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition671 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition689 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSignalDefinition712 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition725 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition746 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleSignalDefinition761 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition782 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSignalDefinition798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperationDefinition890 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition913 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition934 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition946 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition969 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperationDefinition981 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOperationDefinition993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1087 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1106 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLocalReaction1123 = new BitSet(new long[]{0x86000008048003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction1146 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1165 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLocalReaction1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSuspendEffect1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1374 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleLocalReactionTrigger1387 = new BitSet(new long[]{0x00000001F0000032L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntry1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInside1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleExit1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleReactionTrigger1931 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1962 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleReactionTrigger2009 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger2030 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleReactionTrigger2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2145 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleReactionEffect2166 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2188 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePreValueExpression2509 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePreValueExpression2521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2542 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePreValueExpression2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStatechartRoot2785 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStateRoot2889 = new BitSet(new long[]{0x07FFFF81F24E4030L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTransitionRoot2993 = new BitSet(new long[]{0x000C0001F2000030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStatechartSpecification3109 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3130 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3153 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInterfaceScope3549 = new BitSet(new long[]{0x07FFFF8000100010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3570 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceScope3583 = new BitSet(new long[]{0x07FFFF8000404012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3606 = new BitSet(new long[]{0x07FFFF8000404012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3625 = new BitSet(new long[]{0x07FFFF8000404012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3644 = new BitSet(new long[]{0x07FFFF8000404012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInternalScope3740 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInternalScope3752 = new BitSet(new long[]{0x07FFFF81F24E4030L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3775 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3794 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3813 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3832 = new BitSet(new long[]{0x07FFFF81F24E4032L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition4022 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEventDefinition4035 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition4056 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventDefinition4069 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXID4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXID4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXID4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4852 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFQN4871 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4893 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5007 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_25_in_ruleTransitionReaction5021 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5042 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleTransitionReaction5057 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5078 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDefaultTrigger5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDefaultTrigger5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEntryPointSpec5514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec5624 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleExitPointSpec5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5825 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5846 = new BitSet(new long[]{0x0000000000000000L,0x0000007800000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEntryEvent6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExitEvent6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAlwaysEvent6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAlwaysEvent6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6496 = new BitSet(new long[]{0x0000000000008002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6526 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6547 = new BitSet(new long[]{0x0000000000008002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6642 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleConditionalExpression6663 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6684 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConditionalExpression6696 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6812 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLogicalOrExpression6833 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6854 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6949 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleLogicalAndExpression6970 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6991 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLogicalNotExpression7113 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseXorExpression7249 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBitwiseOrExpression7386 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleBitwiseAndExpression7523 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7639 = new BitSet(new long[]{0x1000000000000002L,0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7669 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7690 = new BitSet(new long[]{0x1000000000000002L,0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7785 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7815 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7836 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7931 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7961 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7982 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8077 = new BitSet(new long[]{0x0000000002000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8107 = new BitSet(new long[]{0x06000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8128 = new BitSet(new long[]{0x0000000002000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8259 = new BitSet(new long[]{0x06000008008003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8475 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFeatureCall8496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8516 = new BitSet(new long[]{0x0800000000800002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureCall8550 = new BitSet(new long[]{0x86000008018003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8585 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_ruleFeatureCall8598 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8619 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_ruleFeatureCall8635 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8739 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleElementReferenceExpression8773 = new BitSet(new long[]{0x86000008018003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8808 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_ruleElementReferenceExpression8821 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8842 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_ruleElementReferenceExpression8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEventValueReferenceExpression8952 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEventValueReferenceExpression8964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8985 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEventValueReferenceExpression8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleActiveStateReferenceExpression9089 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActiveStateReferenceExpression9101 = new BitSet(new long[]{0x07FFFF8000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9124 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActiveStateReferenceExpression9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParenthesizedExpression9228 = new BitSet(new long[]{0x86000008008003F0L,0x0000000026000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9249 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParenthesizedExpression9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator10055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCombineOperator10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCombineOperator10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDirection10185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDirection10202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDirection10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTimeEventType10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTimeEventType10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAssignmentOperator10326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssignmentOperator10479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAssignmentOperator10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleShiftOperator10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleShiftOperator10558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAdditiveOperator10603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAdditiveOperator10620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleMultiplicativeOperator10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicativeOperator10682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleMultiplicativeOperator10699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleUnaryOperator10744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUnaryOperator10761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleUnaryOperator10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator10823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator10840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleRelationalOperator10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator10874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRelationalOperator10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleRelationalOperator10908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit10953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit10970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTimeUnit10987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleTimeUnit11004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred1_InternalSyncChartstext2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred2_InternalSyncChartstext8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred3_InternalSyncChartstext8755 = new BitSet(new long[]{0x0000000000000002L});

}