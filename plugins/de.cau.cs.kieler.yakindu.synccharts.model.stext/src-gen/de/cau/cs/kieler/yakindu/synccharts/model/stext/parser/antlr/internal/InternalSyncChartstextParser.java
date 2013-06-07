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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'static'", "'='", "';'", "'input'", "'output'", "'signal'", "':'", "'with'", "'extern'", "'('", "')'", "'/'", "'Suspend'", "'Entry'", "'During'", "'Exit'", "'#'", "','", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'operation'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'>'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:77:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_Static_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_Static_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_varInitialValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:80:28: ( ( () ( (lv_Static_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:1: ( () ( (lv_Static_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:1: ( () ( (lv_Static_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:81:2: () ( (lv_Static_1_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_varInitialValue_5_0= ruleExpression ) ) )? otherlv_6= ';'
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:87:2: ( (lv_Static_1_0= 'static' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:88:1: (lv_Static_1_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:88:1: (lv_Static_1_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:89:3: lv_Static_1_0= 'static'
                    {
                    lv_Static_1_0=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinition137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_Static_1_0, grammarAccess.getVariableDefinitionAccess().getStaticStaticKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "Static", true, "static");
                      	    
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

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||LA4_0==14||(LA4_0>=17 && LA4_0<=19)||LA4_0==22||LA4_0==25||(LA4_0>=27 && LA4_0<=29)||(LA4_0>=36 && LA4_0<=55)) ) {
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
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 14:
            	    case 36:
            	    case 37:
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
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 17:
            	    case 18:
            	    case 19:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case RULE_INT:
            	    case 25:
            	    case 27:
            	    case 28:
            	    case 29:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:301:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:304:28: ( ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:305:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:305:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:305:2: () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:311:2: ( (lv_Input_1_0= 'input' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:312:1: (lv_Input_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:312:1: (lv_Input_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:313:3: lv_Input_1_0= 'input'
                    {
                    lv_Input_1_0=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition596); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:326:3: ( (lv_Output_2_0= 'output' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:327:1: (lv_Output_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:327:1: (lv_Output_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:328:3: lv_Output_2_0= 'output'
                    {
                    lv_Output_2_0=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition628); if (state.failed) return current;
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

            if ( (LA11_0==RULE_INT||(LA11_0>=27 && LA11_0<=29)) ) {
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

                    if ( ((LA10_0>=27 && LA10_0<=29)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_INT) ) {
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

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==23||LA12_0==32||(LA12_0>=54 && LA12_0<=55)||LA12_0==61||(LA12_0>=87 && LA12_0<=88)||LA12_0==91) ) {
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:670:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_reactionTrigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:673:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:674:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:674:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:674:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:698:2: (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:698:4: otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleLocalReactionTrigger1387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:702:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
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
            case 27:
                {
                alt15=1;
                }
                break;
            case 28:
                {
                alt15=2;
                }
                break;
            case 29:
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEntry1649); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInside1741); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExit1833); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:880:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )? ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_labelPriority_1_0=null;
        Token otherlv_2=null;
        Token lv_isImmediate_3_0=null;
        Token lv_delay_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_trigger_5_0 = null;

        EObject lv_guardExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:883:28: ( ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )? ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:884:1: ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )? ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:884:1: ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:884:2: () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )? )
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:890:2: ( (lv_labelPriority_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:891:1: (lv_labelPriority_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:891:1: (lv_labelPriority_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:892:3: lv_labelPriority_1_0= RULE_INT
            {
            lv_labelPriority_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_labelPriority_1_0, grammarAccess.getReactionTriggerAccess().getLabelPriorityINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReactionTriggerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"labelPriority",
                      		lv_labelPriority_1_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleReactionTrigger1947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:912:1: ( (lv_isImmediate_3_0= '#' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:913:1: (lv_isImmediate_3_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:913:1: (lv_isImmediate_3_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:914:3: lv_isImmediate_3_0= '#'
                    {
                    lv_isImmediate_3_0=(Token)match(input,30,FOLLOW_30_in_ruleReactionTrigger1965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isImmediate_3_0, grammarAccess.getReactionTriggerAccess().getIsImmediateNumberSignKeyword_3_0());
                          
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:927:3: ( (lv_delay_4_0= RULE_INT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:928:1: (lv_delay_4_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:928:1: (lv_delay_4_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:929:3: lv_delay_4_0= RULE_INT
                    {
                    lv_delay_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_delay_4_0, grammarAccess.getReactionTriggerAccess().getDelayINTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReactionTriggerRule());
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:945:3: ( ( (lv_trigger_5_0= ruleRegularEventSpec ) ) | (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )? )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==23||LA19_0==25||LA19_0==30) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:945:4: ( (lv_trigger_5_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:945:4: ( (lv_trigger_5_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:946:1: (lv_trigger_5_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:946:1: (lv_trigger_5_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:947:3: lv_trigger_5_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2024);
                    lv_trigger_5_0=ruleRegularEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:964:6: (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )?
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:964:6: (otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==23) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:964:8: otherlv_6= '(' ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ')'
                            {
                            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleReactionTrigger2043); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getLeftParenthesisKeyword_5_1_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:968:1: ( (lv_guardExpression_7_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:969:1: (lv_guardExpression_7_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:969:1: (lv_guardExpression_7_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:970:3: lv_guardExpression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_5_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger2064);
                            lv_guardExpression_7_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
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

                            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleReactionTrigger2076); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getReactionTriggerAccess().getRightParenthesisKeyword_5_1_2());
                                  
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
    // $ANTLR end "ruleReactionTrigger"


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:998:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:999:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1000:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2115);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2125); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1007:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1010:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1011:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1011:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1011:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1011:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1012:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1017:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1018:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1018:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1019:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2180);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1035:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) && (synpred1_InternalSyncChartstext())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1035:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1035:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1035:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReactionEffect2201); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1040:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1041:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1041:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1042:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2223);
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
            	    break loop20;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1066:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1067:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1068:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2261);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2271); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1075:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1078:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1079:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1079:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            int alt21=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
                {
                alt21=2;
                }
                break;
            case 55:
                {
                alt21=3;
                }
                break;
            case 32:
                {
                alt21=4;
                }
                break;
            case 23:
                {
                alt21=5;
                }
                break;
            case 54:
                {
                alt21=6;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1080:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2318);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1090:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2345);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1100:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2372);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1110:5: this_PreValueExpression_3= rulePreValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2399);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1120:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2426);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1130:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2453);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1146:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1147:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1148:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2488);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2498); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1155:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1158:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1159:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1159:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1159:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1159:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1160:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePreValueExpression2544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePreValueExpression2556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1173:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1174:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1174:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1175:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2577);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePreValueExpression2589); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1205:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1206:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1207:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2627);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2637); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1214:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1217:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1218:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1218:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 35:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1219:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2684);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1229:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2711);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1239:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2738);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1255:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1256:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1257:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2773);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2783); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1264:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1267:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1268:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1268:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1268:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStatechartRoot2820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1272:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1273:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1273:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1274:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2841);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1298:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1299:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1300:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2877);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2887); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1307:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1310:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1311:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1311:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1311:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStateRoot2924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1315:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1316:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1316:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1317:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2945);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1341:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1342:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1343:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2981);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2991); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1350:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1353:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1354:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1354:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1354:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTransitionRoot3028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1358:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1359:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1359:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1360:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3049);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1386:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1387:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1388:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3087);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification3097); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1395:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1398:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1399:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1399:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1399:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1399:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1400:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1405:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1405:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleStatechartSpecification3144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1409:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1410:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1410:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1411:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3165);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1427:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=37 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1428:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1428:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1429:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3188);
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
            	    break loop24;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1453:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1454:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1455:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3225);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3235); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1462:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1465:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1466:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1466:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1467:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1467:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1468:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3280);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1492:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1493:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1494:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3315);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3325); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1501:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1504:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1505:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1505:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1506:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1506:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1507:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3370);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1533:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1534:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1535:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3407);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3417); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1542:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1545:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1546:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1546:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            else if ( (LA25_0==38) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1547:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3464);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1557:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3491);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1575:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1576:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1577:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3528);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3538); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1584:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1587:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1588:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1588:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1588:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1588:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1589:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleInterfaceScope3584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1598:1: ( (lv_name_2_0= ruleXID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||(LA26_0>=36 && LA26_0<=55)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1599:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1599:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1600:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3605);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInterfaceScope3618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1620:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==56) ) {
                        alt28=1;
                    }
                    else if ( (LA28_2==RULE_ID) ) {
                        int LA28_5 = input.LA(3);

                        if ( ((LA28_5>=15 && LA28_5<=16)) ) {
                            alt28=1;
                        }


                    }


                    }
                    break;
                case 38:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (LA28_3==RULE_ID||LA28_3==56) ) {
                        alt28=1;
                    }


                    }
                    break;
                case RULE_ID:
                case 14:
                case 22:
                case 36:
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
                    {
                    alt28=1;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1621:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1621:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1622:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1622:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        int LA27_1 = input.LA(2);

            	        if ( (LA27_1==RULE_ID||LA27_1==56) ) {
            	            alt27=2;
            	        }
            	        else if ( (LA27_1==39) ) {
            	            alt27=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 27, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 41:
            	        {
            	        int LA27_2 = input.LA(2);

            	        if ( (LA27_2==39) ) {
            	            alt27=1;
            	        }
            	        else if ( (LA27_2==RULE_ID||LA27_2==56) ) {
            	            alt27=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 27, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 42:
            	        {
            	        int LA27_3 = input.LA(2);

            	        if ( (LA27_3==39) ) {
            	            alt27=1;
            	        }
            	        else if ( (LA27_3==RULE_ID||LA27_3==56) ) {
            	            alt27=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 27, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 39:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 56:
            	            {
            	            alt27=2;
            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA27_8 = input.LA(3);

            	            if ( ((LA27_8>=15 && LA27_8<=16)) ) {
            	                alt27=2;
            	            }
            	            else if ( (LA27_8==EOF||LA27_8==RULE_ID||LA27_8==14||LA27_8==20||LA27_8==22||(LA27_8>=36 && LA27_8<=55)) ) {
            	                alt27=1;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 27, 8, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 36:
            	        case 37:
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
            	            {
            	            alt27=1;
            	            }
            	            break;
            	        default:
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 27, 4, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case RULE_ID:
            	    case 14:
            	    case 36:
            	    case 37:
            	    case 38:
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
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1623:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3641);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1638:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3660);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1653:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3679);
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
            	    break loop28;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1679:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1680:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1681:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3719);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3729); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1688:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1691:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1692:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1692:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1692:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1692:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1693:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleInternalScope3775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleInternalScope3787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1706:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==56) ) {
                        alt30=1;
                    }
                    else if ( (LA30_2==RULE_ID) ) {
                        int LA30_5 = input.LA(3);

                        if ( ((LA30_5>=15 && LA30_5<=16)) ) {
                            alt30=1;
                        }


                    }


                    }
                    break;
                case 38:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (LA30_3==RULE_ID||LA30_3==56) ) {
                        alt30=1;
                    }


                    }
                    break;
                case RULE_ID:
                case RULE_INT:
                case 14:
                case 22:
                case 25:
                case 27:
                case 28:
                case 29:
                case 36:
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
                    {
                    alt30=1;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1707:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1707:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1708:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1708:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt29=4;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1709:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3810);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1724:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3829);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1739:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3848);
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
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1754:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3867);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1782:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1783:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1784:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3909);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3919); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1791:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1794:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1796:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3965);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1814:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1815:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1816:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4001);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition4011); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1823:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1826:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1827:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1827:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1827:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1827:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=40 && LA31_0<=42)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1828:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1828:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1829:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition4057);
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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEventDefinition4070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1849:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1850:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1850:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1851:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition4091);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1867:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1867:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventDefinition4104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1871:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1872:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1872:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1873:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4127);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1894:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1895:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1896:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4165);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4175); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1903:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1906:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1908:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4221);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1926:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1927:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1928:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4257);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4267); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1935:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1938:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1940:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4313);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1960:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1961:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1962:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4352);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4363); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1969:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1972:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1973:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1973:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt33=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt33=1;
                }
                break;
            case 36:
                {
                alt33=2;
                }
                break;
            case 37:
                {
                alt33=3;
                }
                break;
            case 38:
                {
                alt33=4;
                }
                break;
            case 39:
                {
                alt33=5;
                }
                break;
            case 40:
                {
                alt33=6;
                }
                break;
            case 41:
                {
                alt33=7;
                }
                break;
            case 42:
                {
                alt33=8;
                }
                break;
            case 43:
                {
                alt33=9;
                }
                break;
            case 44:
                {
                alt33=10;
                }
                break;
            case 45:
                {
                alt33=11;
                }
                break;
            case 46:
                {
                alt33=12;
                }
                break;
            case 47:
                {
                alt33=13;
                }
                break;
            case 48:
                {
                alt33=14;
                }
                break;
            case 49:
                {
                alt33=15;
                }
                break;
            case 50:
                {
                alt33=16;
                }
                break;
            case 51:
                {
                alt33=17;
                }
                break;
            case 52:
                {
                alt33=18;
                }
                break;
            case 53:
                {
                alt33=19;
                }
                break;
            case 54:
                {
                alt33=20;
                }
                break;
            case 55:
                {
                alt33=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1973:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1982:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleXID4427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1989:2: kw= 'interface'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleXID4446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1996:2: kw= 'internal'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2003:2: kw= 'event'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2010:2: kw= 'local'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2017:2: kw= 'in'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2024:2: kw= 'out'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2031:2: kw= 'var'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2038:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2045:2: kw= 'external'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2052:2: kw= 'operation'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2059:2: kw= 'default'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2066:2: kw= 'else'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2073:2: kw= 'entry'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2080:2: kw= 'exit'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2087:2: kw= 'always'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2094:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2101:2: kw= 'raise'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2108:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2115:2: kw= 'active'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID4788); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2128:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2129:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2130:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4829);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4840); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2137:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2140:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2141:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2141:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2142:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN4887);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2152:1: (kw= '.' this_XID_2= ruleXID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==56) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2153:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruleFQN4906); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN4928);
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
            	    break loop34;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2179:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2180:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2181:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4977);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4987); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2188:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2191:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2192:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2192:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2192:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2192:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2193:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2198:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT||(LA35_0>=47 && LA35_0<=48)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2199:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2199:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2200:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5042);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2216:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2216:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTransitionReaction5056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2220:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2221:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2221:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2222:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5077);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2238:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2238:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleTransitionReaction5092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2242:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID||LA37_0==57) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2243:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2243:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2244:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5113);
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
    // $ANTLR end "ruleTransitionReaction"


    // $ANTLR start "entryRuleStextTrigger"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2268:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2269:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2270:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5152);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5162); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2277:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2280:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2281:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2281:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=47 && LA39_0<=48)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2282:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5209);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2292:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5236);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2308:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2309:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2310:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5271);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5281); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2317:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2320:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2321:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2321:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2321:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2321:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2322:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2327:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            else if ( (LA40_0==48) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2327:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDefaultTrigger5328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2332:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDefaultTrigger5346); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2344:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2345:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2346:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5383);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty5393); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2353:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2356:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2357:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2357:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2358:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5440);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2368:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5467);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2384:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2385:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2386:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5502);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5512); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2393:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2396:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2397:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2397:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2397:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleEntryPointSpec5549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2401:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2402:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2402:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2403:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec5566); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2427:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2428:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2429:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5607);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5617); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2436:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2439:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2440:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2440:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2440:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2440:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2441:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2441:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2442:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec5659); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleExitPointSpec5676); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2472:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2473:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2474:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5714);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5724); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2481:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2484:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2485:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2485:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2486:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2486:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2487:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5769);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2511:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2512:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2513:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5804);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5814); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2520:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2523:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2524:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2524:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2524:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2524:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2525:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2525:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2526:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5860);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2542:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2543:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2543:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2544:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5881);
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

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2560:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2561:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2561:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2562:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5902);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2586:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2587:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2588:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5938);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5948); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2595:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2598:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2599:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2599:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt42=1;
                }
                break;
            case 50:
                {
                alt42=2;
                }
                break;
            case 51:
            case 52:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2600:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5995);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2610:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6022);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2620:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6049);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2636:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2637:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2638:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6084);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent6094); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2645:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2648:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2649:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2649:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2649:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2649:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2650:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleEntryEvent6140); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2667:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2668:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2669:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6176);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6186); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2676:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2679:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2680:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2680:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2680:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2680:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2681:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleExitEvent6232); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2698:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2699:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2700:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6268);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6278); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2707:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2710:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2711:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2711:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2711:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2711:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2712:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2717:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            else if ( (LA43_0==52) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2717:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAlwaysEvent6325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2722:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleAlwaysEvent6343); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2738:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2739:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2740:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6384);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6394); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2747:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2750:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2752:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6440);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2768:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2769:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2770:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6474);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6484); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2777:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2780:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2781:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2781:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2782:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6531);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2790:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==15||(LA44_0>=75 && LA44_0<=84)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2790:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2790:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2791:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2796:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2797:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2797:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2798:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6561);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2814:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2815:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2815:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2816:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6582);
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
            	    break loop44;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2840:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2841:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2842:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6620);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6630); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2849:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2852:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2853:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2853:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2854:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6677);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2862:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2862:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2862:2: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2863:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleConditionalExpression6698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2872:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2873:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2873:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2874:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6719);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConditionalExpression6731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2894:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2895:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2895:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2896:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6752);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2920:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2921:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2922:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6790);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6800); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2929:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2932:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2933:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2933:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2934:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6847);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2942:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==59) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2942:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2942:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2943:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleLogicalOrExpression6868); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2952:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2953:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2953:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2954:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6889);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2978:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2979:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2980:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6927);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6937); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2987:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2990:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2991:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2991:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:2992:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6984);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3000:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==60) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3000:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3000:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3001:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleLogicalAndExpression7005); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3010:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3011:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3011:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3012:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7026);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3036:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3037:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3038:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7064);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7074); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3045:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3048:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3049:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3049:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==23||LA48_0==32||(LA48_0>=54 && LA48_0<=55)||(LA48_0>=87 && LA48_0<=88)||LA48_0==91) ) {
                alt48=1;
            }
            else if ( (LA48_0==61) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3050:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7121);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3059:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3059:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3059:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3059:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3060:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLogicalNotExpression7148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3069:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3070:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3070:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3071:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7169);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3095:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3096:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3097:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7206);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7216); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3104:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3107:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3108:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3108:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3109:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7263);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3117:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==62) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3117:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3117:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3118:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleBitwiseXorExpression7284); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3127:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3128:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3128:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3129:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7305);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3153:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3154:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3155:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7343);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7353); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3162:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3165:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3166:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3166:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3167:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7400);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3175:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==63) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3175:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3175:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3176:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleBitwiseOrExpression7421); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3185:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3186:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3186:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3187:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7442);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3211:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3212:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3213:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7480);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7490); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3220:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3223:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3224:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3224:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3225:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7537);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3233:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==64) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3233:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3233:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3234:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseAndExpression7558); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3243:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3244:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3244:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3245:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7579);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3269:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3270:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3271:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7617);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7627); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3278:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3281:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3282:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3282:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3283:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7674);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3291:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==57||(LA52_0>=92 && LA52_0<=96)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3291:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3291:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3292:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3297:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3298:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3298:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3299:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7704);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3315:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3316:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3316:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3317:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7725);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3341:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3342:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3343:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7763);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7773); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3350:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3353:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3354:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3354:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3355:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7820);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3363:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=85 && LA53_0<=86)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3363:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3363:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3364:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3369:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3370:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3370:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3371:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7850);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3387:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3388:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3388:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3389:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7871);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3413:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3414:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3415:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7909);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7919); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3422:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3425:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3426:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3426:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3427:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7966);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3435:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=87 && LA54_0<=88)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3435:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3435:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3436:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3441:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3442:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3442:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3443:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7996);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3459:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3460:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3460:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3461:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8017);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3485:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3486:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3487:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8055);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8065); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3494:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3497:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3498:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3498:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3499:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8112);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3507:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==25||(LA55_0>=89 && LA55_0<=90)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3507:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3507:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3508:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3513:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3514:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3514:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3515:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8142);
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

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3531:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3532:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3532:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3533:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8163);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3557:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3558:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3559:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8201);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8211); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3566:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3569:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3570:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3570:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||LA56_0==23||LA56_0==32||(LA56_0>=54 && LA56_0<=55)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=87 && LA56_0<=88)||LA56_0==91) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3571:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8258);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3580:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3580:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3580:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3580:7: ()
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3581:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3586:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3587:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3587:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3588:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8294);
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3604:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3605:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3605:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3606:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8315);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3630:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3631:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3632:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8352);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8362); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3639:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3642:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3643:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3643:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3643:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3643:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3644:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3649:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3650:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3650:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3651:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8417);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3675:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3676:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3677:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8453);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8463); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3684:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3687:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3688:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3688:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3689:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8510);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3697:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==56) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3697:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3697:2: ()
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3698:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleFeatureCall8531); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3707:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3708:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3708:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3709:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8551); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3720:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==23) && (synpred2_InternalSyncChartstext())) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3720:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3720:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3720:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3727:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3728:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,23,FOLLOW_23_in_ruleFeatureCall8585); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3741:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt58=2;
            	            int LA58_0 = input.LA(1);

            	            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||LA58_0==23||LA58_0==32||(LA58_0>=54 && LA58_0<=55)||LA58_0==61||(LA58_0>=87 && LA58_0<=88)||LA58_0==91) ) {
            	                alt58=1;
            	            }
            	            switch (alt58) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3741:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3741:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3742:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3742:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3743:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8620);
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

            	                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3759:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop57:
            	                    do {
            	                        int alt57=2;
            	                        int LA57_0 = input.LA(1);

            	                        if ( (LA57_0==31) ) {
            	                            alt57=1;
            	                        }


            	                        switch (alt57) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3759:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleFeatureCall8633); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3763:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3764:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3764:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3765:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8654);
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
            	                    	    break loop57;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleFeatureCall8670); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3793:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3794:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3795:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8710);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8720); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3802:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3805:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3806:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3806:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3806:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3806:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3812:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3813:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3813:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3814:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3825:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==23) && (synpred3_InternalSyncChartstext())) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3825:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3825:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3825:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3832:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3833:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,23,FOLLOW_23_in_ruleElementReferenceExpression8808); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3846:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_STRING)||LA62_0==23||LA62_0==32||(LA62_0>=54 && LA62_0<=55)||LA62_0==61||(LA62_0>=87 && LA62_0<=88)||LA62_0==91) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3846:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3846:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3847:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3847:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3848:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8843);
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

                            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3864:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==31) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3864:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleElementReferenceExpression8856); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3868:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3869:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3869:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3870:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8877);
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
                            	    break loop61;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleElementReferenceExpression8893); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3898:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3899:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3900:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8931);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8941); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3907:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3910:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3911:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3911:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3911:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3911:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3912:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleEventValueReferenceExpression8987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEventValueReferenceExpression8999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3925:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3926:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3926:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3927:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9020);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleEventValueReferenceExpression9032); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3955:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3956:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3957:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9068);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9078); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3964:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3967:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3968:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3968:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3968:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3968:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3969:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleActiveStateReferenceExpression9124); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleActiveStateReferenceExpression9136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3982:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3983:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3983:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3984:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9159);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleActiveStateReferenceExpression9171); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4009:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4010:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4011:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9207);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9217); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4018:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4021:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4022:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4022:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4022:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4022:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4023:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParenthesizedExpression9263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4032:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4033:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4033:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4034:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9284);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParenthesizedExpression9296); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4062:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4063:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4064:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9332);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9342); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4071:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4074:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4075:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4075:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt64=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt64=1;
                }
                break;
            case RULE_INT:
                {
                alt64=2;
                }
                break;
            case RULE_HEX:
                {
                alt64=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt64=4;
                }
                break;
            case RULE_STRING:
                {
                alt64=5;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4076:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9389);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4086:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9416);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4096:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9443);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4106:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9470);
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4116:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9497);
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4132:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4133:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4134:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9532);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9542); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4141:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4144:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4145:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4145:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4145:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4145:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4146:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4151:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4152:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4152:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4153:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9593); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4177:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4178:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4179:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9634);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9644); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4186:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4189:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4190:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4190:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4190:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4190:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4191:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4196:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4197:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4197:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4198:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9695); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4222:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4223:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4224:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9736);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9746); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4231:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4234:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4235:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4235:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4235:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4235:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4236:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4241:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4242:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4242:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4243:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9797); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4267:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4268:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4269:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9838);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9848); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4276:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4279:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4280:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4280:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4280:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4280:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4281:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4286:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4287:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4287:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4288:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9899); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4312:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4313:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4314:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9940);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9950); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4321:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4324:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4325:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4325:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4325:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4325:2: ()
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4326:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4331:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4332:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4332:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4333:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10001); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4357:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4359:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4360:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4360:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt65=8;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt65=1;
                }
                break;
            case 66:
                {
                alt65=2;
                }
                break;
            case 67:
                {
                alt65=3;
                }
                break;
            case 68:
                {
                alt65=4;
                }
                break;
            case 69:
                {
                alt65=5;
                }
                break;
            case 70:
                {
                alt65=6;
                }
                break;
            case 71:
                {
                alt65=7;
                }
                break;
            case 72:
                {
                alt65=8;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4360:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4360:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4360:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator10056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4366:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4366:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4366:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator10073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4372:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4372:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4372:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator10090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4378:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4378:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4378:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator10107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4384:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4384:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4384:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator10124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4390:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4390:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4390:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4396:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4396:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4396:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4402:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4402:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4402:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10175); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4412:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4414:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4415:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4415:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt66=1;
                }
                break;
            case 41:
                {
                alt66=2;
                }
                break;
            case 42:
                {
                alt66=3;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4415:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4415:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4415:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleDirection10220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4421:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4421:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4421:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleDirection10237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4427:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4427:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4427:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleDirection10254); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4437:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4439:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4440:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4440:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==73) ) {
                alt67=1;
            }
            else if ( (LA67_0==74) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4440:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4440:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4440:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleTimeEventType10299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4446:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4446:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4446:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleTimeEventType10316); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4456:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4458:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4459:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4459:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt68=11;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt68=1;
                }
                break;
            case 75:
                {
                alt68=2;
                }
                break;
            case 76:
                {
                alt68=3;
                }
                break;
            case 77:
                {
                alt68=4;
                }
                break;
            case 78:
                {
                alt68=5;
                }
                break;
            case 79:
                {
                alt68=6;
                }
                break;
            case 80:
                {
                alt68=7;
                }
                break;
            case 81:
                {
                alt68=8;
                }
                break;
            case 82:
                {
                alt68=9;
                }
                break;
            case 83:
                {
                alt68=10;
                }
                break;
            case 84:
                {
                alt68=11;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4459:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4459:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4459:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_15_in_ruleAssignmentOperator10361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4465:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4465:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4465:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4471:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4471:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4471:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4477:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4477:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4477:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4483:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4483:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4483:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4489:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4489:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4489:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4495:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4495:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4495:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4501:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4501:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4501:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4507:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4507:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4507:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4513:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4513:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4513:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4519:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4519:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4519:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10531); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4529:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4531:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4532:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4532:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==85) ) {
                alt69=1;
            }
            else if ( (LA69_0==86) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4532:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4532:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4532:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleShiftOperator10576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4538:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4538:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4538:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleShiftOperator10593); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4548:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4550:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4551:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4551:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==87) ) {
                alt70=1;
            }
            else if ( (LA70_0==88) ) {
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4551:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4551:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4551:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleAdditiveOperator10638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4557:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4557:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4557:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleAdditiveOperator10655); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4567:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4569:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4570:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4570:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt71=1;
                }
                break;
            case 25:
                {
                alt71=2;
                }
                break;
            case 90:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4570:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4570:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4570:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleMultiplicativeOperator10700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4576:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4576:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4576:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicativeOperator10717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4582:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4582:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4582:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleMultiplicativeOperator10734); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4592:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4594:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4595:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4595:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt72=1;
                }
                break;
            case 88:
                {
                alt72=2;
                }
                break;
            case 91:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4595:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4595:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4595:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleUnaryOperator10779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4601:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4601:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4601:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleUnaryOperator10796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4607:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4607:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4607:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleUnaryOperator10813); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4617:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4619:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4620:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4620:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt73=6;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt73=1;
                }
                break;
            case 93:
                {
                alt73=2;
                }
                break;
            case 57:
                {
                alt73=3;
                }
                break;
            case 94:
                {
                alt73=4;
                }
                break;
            case 95:
                {
                alt73=5;
                }
                break;
            case 96:
                {
                alt73=6;
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4620:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4620:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4620:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator10858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4626:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4626:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4626:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator10875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4632:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4632:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4632:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleRelationalOperator10892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4638:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4638:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4638:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator10909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4644:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4644:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4644:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator10926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4650:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4650:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4650:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator10943); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4660:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4662:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4663:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4663:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt74=1;
                }
                break;
            case 98:
                {
                alt74=2;
                }
                break;
            case 99:
                {
                alt74=3;
                }
                break;
            case 100:
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
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4663:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4663:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4663:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_97_in_ruleTimeUnit10988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4669:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4669:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4669:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit11005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4675:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4675:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4675:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit11022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4681:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4681:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:4681:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit11039); if (state.failed) return current;
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
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1035:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:1035:6: ','
        {
        match(input,31,FOLLOW_31_in_synpred1_InternalSyncChartstext2193); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSyncChartstext

    // $ANTLR start synpred2_InternalSyncChartstext
    public final void synpred2_InternalSyncChartstext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3720:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3721:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3721:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3722:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred2_InternalSyncChartstext8567); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSyncChartstext

    // $ANTLR start synpred3_InternalSyncChartstext
    public final void synpred3_InternalSyncChartstext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3825:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3826:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3826:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.synccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/synccharts/model/stext/parser/antlr/internal/InternalSyncChartstext.g:3827:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred3_InternalSyncChartstext8790); if (state.failed) return ;

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


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\11\uffff\1\10";
    static final String DFA29_minS =
        "\5\4\4\uffff\1\4";
    static final String DFA29_maxS =
        "\1\67\4\70\4\uffff\1\67";
    static final String DFA29_acceptS =
        "\5\uffff\1\2\1\3\1\4\1\1\1\uffff";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\5\1\7\10\uffff\1\5\7\uffff\1\6\2\uffff\1\7\1\uffff\3\7\6"+
            "\uffff\3\5\1\4\1\1\1\2\1\3\15\5",
            "\1\5\42\uffff\1\10\20\uffff\1\5",
            "\1\5\42\uffff\1\10\20\uffff\1\5",
            "\1\5\42\uffff\1\10\20\uffff\1\5",
            "\1\11\37\uffff\24\10\1\5",
            "",
            "",
            "",
            "",
            "\2\10\10\uffff\1\10\2\5\3\uffff\1\10\1\uffff\1\10\2\uffff"+
            "\1\10\1\uffff\3\10\6\uffff\24\10"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1708:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
        }
    }
 

    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinition137 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition191 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition209 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition230 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinition244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope347 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope366 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope385 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope404 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSignalDefinition596 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition628 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition671 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition689 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSignalDefinition712 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition725 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition746 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleSignalDefinition761 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition782 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSignalDefinition798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperationDefinition890 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition913 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition934 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition946 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition969 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperationDefinition981 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOperationDefinition993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1087 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1106 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLocalReaction1123 = new BitSet(new long[]{0x20C00001048003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction1146 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1165 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLocalReaction1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSuspendEffect1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1374 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleLocalReactionTrigger1387 = new BitSet(new long[]{0x0000000038000022L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEntry1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInside1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExit1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1930 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReactionTrigger1947 = new BitSet(new long[]{0x0000000040800032L});
    public static final BitSet FOLLOW_30_in_ruleReactionTrigger1965 = new BitSet(new long[]{0x0000000000800032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1996 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReactionTrigger2043 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger2064 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleReactionTrigger2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2180 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleReactionEffect2201 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2223 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePreValueExpression2544 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePreValueExpression2556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2577 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePreValueExpression2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatechartRoot2820 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateRoot2924 = new BitSet(new long[]{0x00FFFFF03A4E4030L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTransitionRoot3028 = new BitSet(new long[]{0x000180007A000020L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStatechartSpecification3144 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3165 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3188 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInterfaceScope3584 = new BitSet(new long[]{0x00FFFFF000100010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3605 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceScope3618 = new BitSet(new long[]{0x00FFFFF000404012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3641 = new BitSet(new long[]{0x00FFFFF000404012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3660 = new BitSet(new long[]{0x00FFFFF000404012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3679 = new BitSet(new long[]{0x00FFFFF000404012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInternalScope3775 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInternalScope3787 = new BitSet(new long[]{0x00FFFFF03A4E4030L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3810 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3829 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3848 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3867 = new BitSet(new long[]{0x00FFFFF03A4E4032L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition4057 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEventDefinition4070 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition4091 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventDefinition4104 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXID4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXID4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4887 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFQN4906 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4928 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5042 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_25_in_ruleTransitionReaction5056 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5077 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleTransitionReaction5092 = new BitSet(new long[]{0x0200000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5113 = new BitSet(new long[]{0x0200000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultTrigger5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultTrigger5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEntryPointSpec5549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec5659 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleExitPointSpec5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5860 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5881 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEntryEvent6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExitEvent6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAlwaysEvent6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAlwaysEvent6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6531 = new BitSet(new long[]{0x0000000000008002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6561 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6582 = new BitSet(new long[]{0x0000000000008002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6677 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleConditionalExpression6698 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6719 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConditionalExpression6731 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6847 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLogicalOrExpression6868 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6889 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6984 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicalAndExpression7005 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7026 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalNotExpression7148 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7263 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBitwiseXorExpression7284 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7305 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7400 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBitwiseOrExpression7421 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7442 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseAndExpression7558 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7674 = new BitSet(new long[]{0x0200000000000002L,0x00000001F0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7704 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7725 = new BitSet(new long[]{0x0200000000000002L,0x00000001F0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7820 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7850 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7966 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7996 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8017 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8112 = new BitSet(new long[]{0x0000000002000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8142 = new BitSet(new long[]{0x00C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8163 = new BitSet(new long[]{0x0000000002000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8294 = new BitSet(new long[]{0x00C00001008003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8510 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFeatureCall8531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8551 = new BitSet(new long[]{0x0100000000800002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureCall8585 = new BitSet(new long[]{0x20C00001018003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8620 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleFeatureCall8633 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8654 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_24_in_ruleFeatureCall8670 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8774 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleElementReferenceExpression8808 = new BitSet(new long[]{0x20C00001018003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8843 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleElementReferenceExpression8856 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8877 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_24_in_ruleElementReferenceExpression8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEventValueReferenceExpression8987 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEventValueReferenceExpression8999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9020 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEventValueReferenceExpression9032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleActiveStateReferenceExpression9124 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActiveStateReferenceExpression9136 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9159 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActiveStateReferenceExpression9171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParenthesizedExpression9263 = new BitSet(new long[]{0x20C00001008003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9284 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParenthesizedExpression9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator10056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator10090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDirection10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDirection10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDirection10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTimeEventType10299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTimeEventType10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAssignmentOperator10361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleShiftOperator10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleShiftOperator10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAdditiveOperator10638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAdditiveOperator10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleMultiplicativeOperator10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicativeOperator10717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleMultiplicativeOperator10734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnaryOperator10779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUnaryOperator10796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUnaryOperator10813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator10858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator10875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleRelationalOperator10892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTimeUnit10988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit11005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1_InternalSyncChartstext2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred2_InternalSyncChartstext8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred3_InternalSyncChartstext8790 = new BitSet(new long[]{0x0000000000000002L});

}