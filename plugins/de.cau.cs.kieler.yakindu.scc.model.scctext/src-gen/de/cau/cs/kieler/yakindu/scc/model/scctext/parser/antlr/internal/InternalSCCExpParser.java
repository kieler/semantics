package de.cau.cs.kieler.yakindu.scc.model.scctext.parser.antlr.internal; 

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
import de.cau.cs.kieler.yakindu.scc.model.scctext.services.SCCExpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCCExpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'static'", "':'", "'='", "'with'", "'Exit'", "'/'", "';'", "'Inside'", "'Entry'", "'Suspend'", "'#'", "','", "'['", "']'", "'('", "')'", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'operation'", "'entrypoint'", "'exitpoint'", "'.'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'inout'", "'in'", "'out'", "'local'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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


        public InternalSCCExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCCExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSCCExpParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g"; }



     	private SCCExpGrammarAccess grammarAccess;
     	
        public InternalSCCExpParser(TokenStream input, SCCExpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateScope";	
       	}
       	
       	@Override
       	protected SCCExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:68:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:69:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:70:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope75);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope85); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:77:1: ruleStateScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleVariableDeclaration ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:80:28: ( ( () ( (lv_declarations_1_0= ruleVariableDeclaration ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( () ( (lv_declarations_1_0= ruleVariableDeclaration ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( () ( (lv_declarations_1_0= ruleVariableDeclaration ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:2: () ( (lv_declarations_1_0= ruleVariableDeclaration ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:87:2: ( (lv_declarations_1_0= ruleVariableDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14||(LA1_0>=65 && LA1_0<=67)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:88:1: (lv_declarations_1_0= ruleVariableDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:88:1: (lv_declarations_1_0= ruleVariableDeclaration )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:89:3: lv_declarations_1_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStateScope140);
            	    lv_declarations_1_0=ruleVariableDeclaration();

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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:113:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:114:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:115:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition177);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition187); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:122:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_direction_1_0 = null;

        EObject lv_varInitialValue_7_0 = null;

        Enumerator lv_varCombineOperator_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:125:28: ( ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:126:1: ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:126:1: ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:126:2: () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:126:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:127:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:132:2: ( (lv_direction_1_0= ruleVarDirection ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=65 && LA2_0<=67)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:133:1: (lv_direction_1_0= ruleVarDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:133:1: (lv_direction_1_0= ruleVarDirection )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:134:3: lv_direction_1_0= ruleVarDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDirectionVarDirectionEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDirection_in_ruleVariableDefinition242);
                    lv_direction_1_0=ruleVarDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"direction",
                              		lv_direction_1_0, 
                              		"VarDirection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:150:3: ( (lv_isStatic_2_0= 'static' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:151:1: (lv_isStatic_2_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:151:1: (lv_isStatic_2_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:152:3: lv_isStatic_2_0= 'static'
                    {
                    lv_isStatic_2_0=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinition261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isStatic_2_0, grammarAccess.getVariableDefinitionAccess().getIsStaticStaticKeyword_2_0());
                          
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:165:3: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:166:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:166:1: (lv_name_3_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:167:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition292); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:187:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:188:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:188:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:189:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition332);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:202:2: (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:202:4: otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinition345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:206:1: ( (lv_varInitialValue_7_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:207:1: (lv_varInitialValue_7_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:207:1: (lv_varInitialValue_7_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:208:3: lv_varInitialValue_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition366);
                    lv_varInitialValue_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"varInitialValue",
                              		lv_varInitialValue_7_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:224:4: (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:224:6: otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinition381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getWithKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:228:1: ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:229:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:229:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:230:3: lv_varCombineOperator_9_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleVariableDefinition402);
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleExitAction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:256:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:257:2: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:258:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction442);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExitAction"


    // $ANTLR start "ruleExitAction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:265:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:268:28: ( ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:269:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:269:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:269:2: () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:269:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:270:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionAccess().getExitActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleExitAction498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExitAction510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExitActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleExitAction522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:287:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:288:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:288:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:289:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleExitAction543);
            lv_effect_4_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExitActionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_4_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleExitAction555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExitActionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExitAction"


    // $ANTLR start "entryRuleInsideAction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:317:1: entryRuleInsideAction returns [EObject current=null] : iv_ruleInsideAction= ruleInsideAction EOF ;
    public final EObject entryRuleInsideAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:318:2: (iv_ruleInsideAction= ruleInsideAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:319:2: iv_ruleInsideAction= ruleInsideAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideActionRule()); 
            }
            pushFollow(FOLLOW_ruleInsideAction_in_entryRuleInsideAction591);
            iv_ruleInsideAction=ruleInsideAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsideAction601); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsideAction"


    // $ANTLR start "ruleInsideAction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:326:1: ruleInsideAction returns [EObject current=null] : ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleInsideAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:329:28: ( ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:330:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:330:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:330:2: () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:330:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:331:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideActionAccess().getInsideActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInsideAction647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInsideActionAccess().getInsideKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInsideAction659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInsideActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleInsideAction671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInsideActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:348:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:349:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:349:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:350:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInsideActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleInsideAction692);
            lv_effect_4_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInsideActionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_4_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleInsideAction704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInsideActionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsideAction"


    // $ANTLR start "entryRuleEntryAction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:378:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:379:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:380:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction740);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction750); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntryAction"


    // $ANTLR start "ruleEntryAction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:387:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:390:28: ( ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:391:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:391:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:391:2: () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:391:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:392:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionAccess().getEntryActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEntryAction796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntryAction808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEntryActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEntryAction820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:409:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:410:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:410:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:411:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleEntryAction841);
            lv_effect_4_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntryActionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_4_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleEntryAction853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntryActionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntryAction"


    // $ANTLR start "entryRuleSuspend"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:439:1: entryRuleSuspend returns [EObject current=null] : iv_ruleSuspend= ruleSuspend EOF ;
    public final EObject entryRuleSuspend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspend = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:440:2: (iv_ruleSuspend= ruleSuspend EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:441:2: iv_ruleSuspend= ruleSuspend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendRule()); 
            }
            pushFollow(FOLLOW_ruleSuspend_in_entryRuleSuspend889);
            iv_ruleSuspend=ruleSuspend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspend899); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuspend"


    // $ANTLR start "ruleSuspend"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:448:1: ruleSuspend returns [EObject current=null] : ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' ) ;
    public final EObject ruleSuspend() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:451:28: ( ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:452:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:452:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:452:2: () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:452:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:453:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendAccess().getSuspendAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSuspend945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendAccess().getSuspendKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSuspend957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSuspendAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:466:1: ( (lv_trigger_3_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:467:1: (lv_trigger_3_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:467:1: (lv_trigger_3_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:468:3: lv_trigger_3_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuspendAccess().getTriggerReactionTriggerParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleSuspend978);
            lv_trigger_3_0=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSuspendRule());
              	        }
                     		set(
                     			current, 
                     			"trigger",
                      		lv_trigger_3_0, 
                      		"ReactionTrigger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleSuspend990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSuspendAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuspend"


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:496:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:497:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:498:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1026);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1036); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:505:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_triggers_3_0 = null;

        EObject lv_triggers_5_0 = null;

        EObject lv_guardExpression_7_0 = null;

        EObject lv_guardExpression_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:508:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:509:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:509:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:509:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:509:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:510:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:515:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:516:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:516:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:517:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,24,FOLLOW_24_in_ruleReactionTrigger1088); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:530:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:531:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:531:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:532:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1119); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:548:3: ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=43 && LA10_0<=48)||(LA10_0>=69 && LA10_0<=70)) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:548:4: ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:548:4: ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:548:5: ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )?
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:548:5: ( (lv_triggers_3_0= ruleEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:549:1: (lv_triggers_3_0= ruleEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:549:1: (lv_triggers_3_0= ruleEventSpec )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:550:3: lv_triggers_3_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_3_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger1148);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:566:2: (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:566:4: otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleReactionTrigger1161); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getCommaKeyword_3_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:570:1: ( (lv_triggers_5_0= ruleEventSpec ) )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:571:1: (lv_triggers_5_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:571:1: (lv_triggers_5_0= ruleEventSpec )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:572:3: lv_triggers_5_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_3_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger1182);
                    	    lv_triggers_5_0=ruleEventSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"triggers",
                    	              		lv_triggers_5_0, 
                    	              		"EventSpec");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:588:4: ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==26) && (synpred1_InternalSCCExp())) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:588:5: ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:588:5: ( ( '[' )=>otherlv_6= '[' )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:588:6: ( '[' )=>otherlv_6= '['
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleReactionTrigger1205); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:593:2: ( (lv_guardExpression_7_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:594:1: (lv_guardExpression_7_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:594:1: (lv_guardExpression_7_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:595:3: lv_guardExpression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1227);
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

                            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleReactionTrigger1239); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_3_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:616:6: (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:616:6: (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:616:8: otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleReactionTrigger1261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:620:1: ( (lv_guardExpression_10_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:621:1: (lv_guardExpression_10_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:621:1: (lv_guardExpression_10_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:622:3: lv_guardExpression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1282);
                    lv_guardExpression_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"guardExpression",
                              		lv_guardExpression_10_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleReactionTrigger1294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_3_1_2());
                          
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:650:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:651:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:652:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1332);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1342); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:659:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_PreValueExpressionreturns_2 = null;

        EObject this_Expression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:662:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:663:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:663:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:664:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression1389);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:674:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression1416);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:5: this_PreValueExpressionreturns_2= rulePreValueExpressionreturns
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionreturnsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpressionreturns_in_rulePrimaryExpression1443);
                    this_PreValueExpressionreturns_2=rulePreValueExpressionreturns();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PreValueExpressionreturns_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:693:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:693:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:693:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePrimaryExpression1461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression1483);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_rulePrimaryExpression1494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRulePreValueExpressionreturns"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:718:1: entryRulePreValueExpressionreturns returns [EObject current=null] : iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF ;
    public final EObject entryRulePreValueExpressionreturns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpressionreturns = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:719:2: (iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:720:2: iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionreturnsRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpressionreturns_in_entryRulePreValueExpressionreturns1531);
            iv_rulePreValueExpressionreturns=rulePreValueExpressionreturns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpressionreturns; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpressionreturns1541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreValueExpressionreturns"


    // $ANTLR start "rulePreValueExpressionreturns"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:727:1: rulePreValueExpressionreturns returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpressionreturns() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:730:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:731:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:731:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:731:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:731:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:732:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionreturnsAccess().getPreValueExpressionreturnsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePreValueExpressionreturns1587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionreturnsAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePreValueExpressionreturns1599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionreturnsAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:745:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:746:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:746:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:747:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionreturnsAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpressionreturns1620);
            lv_value_3_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPreValueExpressionreturnsRule());
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_rulePreValueExpressionreturns1632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPreValueExpressionreturnsAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreValueExpressionreturns"


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:777:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:778:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:779:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot1670);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot1680); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:786:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:789:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:790:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:790:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:791:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot1727);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:801:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot1754);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:811:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot1781);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:827:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:828:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:829:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot1816);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot1826); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:836:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:839:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:840:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:840:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:840:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleStatechartRoot1863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:844:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:845:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:845:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:846:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot1884);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:870:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:871:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:872:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot1920);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot1930); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:879:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:882:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:883:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:883:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:883:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStateRoot1967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:887:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:888:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:888:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:889:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot1988);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:913:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:914:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:915:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2024);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2034); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:922:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:925:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:926:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:926:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:926:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTransitionRoot2071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:930:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:931:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:931:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:932:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2092);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:958:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:959:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:960:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2130);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2140); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:967:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:970:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:971:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:971:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:971:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:971:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:972:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:977:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:977:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleStatechartSpecification2187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:981:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:982:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:982:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:983:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2208);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:999:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1000:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1000:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1001:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2231);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1025:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1026:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1027:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2268);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification2278); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1034:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1037:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1038:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1038:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1039:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1039:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1040:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification2323);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1064:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1065:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1066:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2358);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2368); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1073:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1076:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1077:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1077:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1078:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1078:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1079:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2413);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1105:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1106:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1107:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2450);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2460); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1114:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1117:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1118:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1118:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1119:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2507);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1129:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope2534);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1147:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1148:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1149:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope2571);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope2581); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1156:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_declarations_4_1 = null;

        EObject lv_declarations_4_2 = null;

        EObject lv_declarations_4_3 = null;

        EObject lv_declarations_4_4 = null;

        EObject lv_declarations_4_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1159:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1160:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1160:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1160:2: () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1160:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleInterfaceScope2627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1170:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1171:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1171:1: (lv_name_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1172:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceScope2644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceScopeAccess().getNameIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleInterfaceScope2662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1192:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==14||(LA18_0>=37 && LA18_0<=40)||(LA18_0>=65 && LA18_0<=68)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1193:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1193:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1194:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1194:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    int alt17=5;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 68:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        int LA17_2 = input.LA(2);

            	        if ( (LA17_2==RULE_ID||LA17_2==14) ) {
            	            alt17=2;
            	        }
            	        else if ( (LA17_2==37) ) {
            	            alt17=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 17, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 67:
            	        {
            	        int LA17_3 = input.LA(2);

            	        if ( (LA17_3==37) ) {
            	            alt17=1;
            	        }
            	        else if ( (LA17_3==RULE_ID||LA17_3==14) ) {
            	            alt17=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 17, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ID:
            	    case 14:
            	    case 65:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt17=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1195:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope2685);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1210:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope2704);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1225:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope2723);
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
            	        case 4 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1240:8: lv_declarations_4_4= ruleEntrypoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEntrypointParserRuleCall_4_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEntrypoint_in_ruleInterfaceScope2742);
            	            lv_declarations_4_4=ruleEntrypoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_4, 
            	                      		"Entrypoint");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1255:8: lv_declarations_4_5= ruleExitpoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsExitpointParserRuleCall_4_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExitpoint_in_ruleInterfaceScope2761);
            	            lv_declarations_4_5=ruleExitpoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_4_5, 
            	                      		"Exitpoint");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1281:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1282:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1283:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope2801);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope2811); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1290:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1293:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1295:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInternalScope2857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInternalScope2869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1308:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==14||LA20_0==24||LA20_0==26||(LA20_0>=37 && LA20_0<=38)||(LA20_0>=43 && LA20_0<=48)||(LA20_0>=65 && LA20_0<=70)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1309:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1309:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1310:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1310:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 68:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        int LA19_2 = input.LA(2);

            	        if ( (LA19_2==37) ) {
            	            alt19=1;
            	        }
            	        else if ( (LA19_2==RULE_ID||LA19_2==14) ) {
            	            alt19=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 67:
            	        {
            	        int LA19_3 = input.LA(2);

            	        if ( (LA19_3==37) ) {
            	            alt19=1;
            	        }
            	        else if ( (LA19_3==RULE_ID||LA19_3==14) ) {
            	            alt19=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 14:
            	    case 65:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        int LA19_5 = input.LA(2);

            	        if ( (LA19_5==15) ) {
            	            alt19=2;
            	        }
            	        else if ( (LA19_5==19||(LA19_5>=25 && LA19_5<=26)||LA19_5==28||LA19_5==41) ) {
            	            alt19=4;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 5, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case RULE_INT:
            	    case 24:
            	    case 26:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 46:
            	    case 47:
            	    case 48:
            	    case 69:
            	    case 70:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1311:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2892);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1326:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope2911);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1341:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope2930);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1356:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope2949);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1384:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1385:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1386:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion2991);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3001); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1393:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1396:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1398:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3047);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1416:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1417:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1418:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3083);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3093); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1425:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1428:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1429:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1429:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1429:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1429:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=66 && LA21_0<=68)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1430:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1430:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1431:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3139);
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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleEventDefinition3152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1451:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1452:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1452:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1453:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition3169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEventDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1469:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1469:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventDefinition3187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1473:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1474:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1474:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1475:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3210);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1496:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1497:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1498:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3248);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3258); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1505:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1508:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1510:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3304);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1528:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1529:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1530:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3340);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration3350); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1537:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1540:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1542:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3396);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1560:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1561:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1562:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3432);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition3442); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1569:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1572:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1573:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1573:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1573:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1573:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1574:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleOperationDefinition3488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1583:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1584:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1584:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1585:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition3505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getOperationDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleOperationDefinition3522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1605:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1605:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1605:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1606:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1606:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1607:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3544);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1623:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1623:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleOperationDefinition3557); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1627:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1628:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1628:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1629:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3578);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleOperationDefinition3594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1649:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1649:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleOperationDefinition3607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1653:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1654:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1654:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1655:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition3630);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1676:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1677:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1678:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3668);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3678); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1685:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1688:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1689:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1689:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1689:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1689:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1690:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1690:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1691:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameter3737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1711:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1712:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1712:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1713:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter3760);
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


    // $ANTLR start "entryRuleEntrypoint"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1734:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1735:2: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1736:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntrypointRule()); 
            }
            pushFollow(FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3796);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntrypoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntrypoint3806); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntrypoint"


    // $ANTLR start "ruleEntrypoint"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1743:1: ruleEntrypoint returns [EObject current=null] : ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1746:28: ( ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1747:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1747:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1747:2: () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1747:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1748:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntrypointAccess().getEntrypointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEntrypoint3852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntrypointAccess().getEntrypointKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1757:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1758:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1758:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1759:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntrypoint3869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEntrypointAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntrypointRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
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
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleExitpoint"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1783:1: entryRuleExitpoint returns [EObject current=null] : iv_ruleExitpoint= ruleExitpoint EOF ;
    public final EObject entryRuleExitpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitpoint = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1784:2: (iv_ruleExitpoint= ruleExitpoint EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1785:2: iv_ruleExitpoint= ruleExitpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitpointRule()); 
            }
            pushFollow(FOLLOW_ruleExitpoint_in_entryRuleExitpoint3910);
            iv_ruleExitpoint=ruleExitpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitpoint3920); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExitpoint"


    // $ANTLR start "ruleExitpoint"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1792:1: ruleExitpoint returns [EObject current=null] : ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleExitpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1795:28: ( ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1796:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1796:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1796:2: () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1796:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1797:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitpointAccess().getExitpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleExitpoint3966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitpointAccess().getExitpointKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1806:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1807:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1807:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1808:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitpoint3983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getExitpointAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExitpointRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
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
    // $ANTLR end "ruleExitpoint"


    // $ANTLR start "entryRuleFQN"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1832:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1833:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1834:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4025);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4036); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1841:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1844:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1845:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1845:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1845:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1852:1: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1853:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFQN4095); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4110); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1875:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1876:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1877:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4159);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction4169); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1884:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1887:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1888:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1888:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1888:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1888:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1889:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1889:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1890:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4215);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1906:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1906:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1911:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1911:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLocalReaction4247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1915:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1916:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1916:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1917:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction4268);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1941:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1942:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1943:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4306);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4316); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1950:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1953:28: ( ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1954:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1954:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1954:2: () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1954:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1955:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1960:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1961:1: (lv_trigger_1_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1961:1: (lv_trigger_1_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1962:3: lv_trigger_1_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerReactionTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4371);
                    lv_trigger_1_0=ruleReactionTrigger();

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
                              		"ReactionTrigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1978:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1978:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTransitionReaction4385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1982:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1983:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1983:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4406);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2000:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2000:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTransitionReaction4421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2004:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2005:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2005:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2006:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4442);
                    lv_properties_5_0=ruleReactionProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"properties",
                              		lv_properties_5_0, 
                              		"ReactionProperties");
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


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2031:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2032:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4480);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect4490); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2039:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2042:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2043:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2043:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2043:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2043:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2044:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2049:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2050:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2050:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2051:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2051:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==28||LA30_0==30||LA30_0==53||(LA30_0>=83 && LA30_0<=84)||LA30_0==87) ) {
                alt30=1;
            }
            else if ( (LA30_0==49) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2052:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4547);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2067:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4566);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleReactionEffect4590); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2090:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2091:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2091:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2092:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2092:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==28||LA31_0==30||LA31_0==53||(LA31_0>=83 && LA31_0<=84)||LA31_0==87) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==49) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2093:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4614);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2108:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4633);
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleReactionProperties"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2134:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2135:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2136:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4674);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties4684); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionProperties"


    // $ANTLR start "ruleReactionProperties"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2143:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2146:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2148:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2153:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==42) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2154:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2154:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2155:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties4739);
            	    lv_properties_1_0=ruleReactionProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReactionPropertiesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_1_0, 
            	              		"ReactionProperty");
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactionProperties"


    // $ANTLR start "entryRuleReactionProperty"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2179:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2180:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2181:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4776);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty4786); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionProperty"


    // $ANTLR start "ruleReactionProperty"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2188:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2191:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2192:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2192:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2193:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4833);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2203:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4860);
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
    // $ANTLR end "ruleReactionProperty"


    // $ANTLR start "entryRuleEntryPointSpec"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2219:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2220:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2221:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4895);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec4905); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2228:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2231:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2232:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2232:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2232:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEntryPointSpec4942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2236:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2237:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2237:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2238:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec4965);
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
    // $ANTLR end "ruleEntryPointSpec"


    // $ANTLR start "entryRuleExitPointSpec"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2259:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2260:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2261:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5001);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5011); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2268:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2271:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2272:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2272:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2272:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2272:2: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2273:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2273:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2274:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec5059);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleExitPointSpec5071); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2299:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2300:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2301:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec5107);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec5117); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2308:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2311:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2312:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2312:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt35=1;
                }
                break;
            case 69:
            case 70:
                {
                alt35=2;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt35=3;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2313:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5164);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2323:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5191);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2333:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5218);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2349:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2350:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2351:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5253);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5263); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2358:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2361:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2362:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2362:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2363:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2363:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2364:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5308);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2388:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2389:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2390:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5343);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5353); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2397:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2400:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2401:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2401:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2401:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2401:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2402:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2402:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2403:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5399);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2419:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2420:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2420:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2421:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec5416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getTimeEventSpecAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeEventSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2437:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=93 && LA36_0<=96)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2438:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2438:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2439:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5442);
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
    // $ANTLR end "ruleTimeEventSpec"


    // $ANTLR start "entryRuleBuiltinEventSpec"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2463:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2464:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2465:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5479);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5489); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2472:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2475:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2476:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2476:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt37=1;
                }
                break;
            case 44:
                {
                alt37=2;
                }
                break;
            case 45:
                {
                alt37=3;
                }
                break;
            case 46:
                {
                alt37=4;
                }
                break;
            case 47:
            case 48:
                {
                alt37=5;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2477:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5536);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2487:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5563);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2497:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5590);
                    this_OnCycleEvent_2=ruleOnCycleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OnCycleEvent_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2507:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5617);
                    this_AlwaysEvent_3=ruleAlwaysEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlwaysEvent_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2517:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5644);
                    this_DefaultEvent_4=ruleDefaultEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefaultEvent_4; 
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2533:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2534:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2535:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5679);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5689); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2542:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2545:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2546:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2546:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2546:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2546:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2547:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleEntryEvent5735); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2564:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2565:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2566:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5771);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5781); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2573:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2576:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2578:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleExitEvent5827); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOnCycleEvent"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2595:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2596:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2597:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5863);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnCycleEvent"


    // $ANTLR start "ruleOnCycleEvent"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2604:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2607:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleOnCycleEvent5919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOnCycleEventAccess().getOncycleKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnCycleEvent"


    // $ANTLR start "entryRuleAlwaysEvent"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2626:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2627:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2628:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5955);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent5965); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2635:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2638:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:1: ( () otherlv_1= 'always' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:2: () otherlv_1= 'always'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleAlwaysEvent6011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleDefaultEvent"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2657:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2658:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2659:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6047);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent6057); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultEvent"


    // $ANTLR start "ruleDefaultEvent"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2666:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2669:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2676:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            else if ( (LA38_0==48) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2676:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDefaultEvent6104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2681:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDefaultEvent6122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDefaultEventAccess().getElseKeyword_1_1());
                          
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
    // $ANTLR end "ruleDefaultEvent"


    // $ANTLR start "entryRuleEventRaisingExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2693:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2694:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2695:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6159);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression6169); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2702:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2705:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2706:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2706:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2706:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2706:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2707:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleEventRaisingExpression6215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2716:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2717:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2717:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2718:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6236);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2734:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2734:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventRaisingExpression6249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2738:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2739:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2739:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2740:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression6270);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2766:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2767:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2768:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6310);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6320); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2775:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2778:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2780:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6366);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2796:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2797:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2798:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6400);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6410); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2805:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2808:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2809:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2809:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2810:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6457);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==16||(LA40_0>=71 && LA40_0<=80)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2819:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2824:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2825:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2825:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2826:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6487);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2842:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2843:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2843:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2844:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6508);
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
            	    break loop40;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2868:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2869:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2870:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6546);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6556); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2877:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2880:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2881:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2881:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2882:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6603);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2890:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2890:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2890:2: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2891:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleConditionalExpression6624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2900:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2901:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2901:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2902:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6645);
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

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConditionalExpression6657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2922:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2923:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2923:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2924:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6678);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2948:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2949:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2950:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6716);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6726); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2957:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2960:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2961:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2961:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2962:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6773);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2970:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==51) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2970:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2970:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2971:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleLogicalOrExpression6794); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2980:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2981:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2981:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2982:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6815);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3006:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3007:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3008:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6853);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6863); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3015:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3018:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3019:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3019:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3020:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6910);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3028:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==52) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3028:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3028:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3029:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleLogicalAndExpression6931); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3038:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3039:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3039:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3040:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6952);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3064:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3065:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3066:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6990);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7000); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3073:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3076:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3077:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3077:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==28||LA44_0==30||(LA44_0>=83 && LA44_0<=84)||LA44_0==87) ) {
                alt44=1;
            }
            else if ( (LA44_0==53) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3078:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7047);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3087:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3087:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3087:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3087:7: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3088:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleLogicalNotExpression7074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3097:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3098:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3098:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3099:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7095);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3123:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3124:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3125:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7132);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7142); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3132:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3135:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3136:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3136:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3137:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7189);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3145:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==54) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3145:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3145:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3146:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBitwiseXorExpression7210); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3155:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3156:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3156:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3157:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7231);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3181:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3182:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3183:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7269);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7279); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3190:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3193:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3194:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3194:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3195:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7326);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3203:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==55) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3203:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3203:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3204:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleBitwiseOrExpression7347); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3213:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3215:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7368);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3239:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3240:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3241:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7406);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7416); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3248:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3251:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3252:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3252:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3253:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7463);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3261:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==56) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3261:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3261:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3262:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleBitwiseAndExpression7484); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3271:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3272:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3272:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3273:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7505);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3297:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3298:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3299:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7543);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7553); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3306:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3309:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3310:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3310:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3311:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7600);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3319:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==42||(LA48_0>=88 && LA48_0<=92)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3319:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3319:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3320:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3325:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3326:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3326:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3327:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7630);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3343:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3344:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3344:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3345:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7651);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3369:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3370:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3371:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7689);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7699); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3378:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3381:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3382:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3382:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3383:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7746);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3391:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=81 && LA49_0<=82)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3391:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3391:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3392:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3397:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3398:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3398:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3399:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7776);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3415:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3416:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3416:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3417:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7797);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3441:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3442:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3443:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7835);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7845); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3450:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3453:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3454:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3454:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3455:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7892);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3463:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=83 && LA50_0<=84)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3463:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3463:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3464:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3469:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3470:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3470:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3471:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7922);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3487:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3488:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3488:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3489:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7943);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3513:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3514:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3515:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7981);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7991); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3522:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3525:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3526:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3526:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3527:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8038);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3535:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==19||(LA51_0>=85 && LA51_0<=86)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3535:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3535:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3536:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3541:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3542:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3542:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3543:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8068);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3559:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3560:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3560:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3561:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8089);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3585:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3586:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3587:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8127);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8137); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3594:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3597:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3598:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3598:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)||LA52_0==28||LA52_0==30) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=83 && LA52_0<=84)||LA52_0==87) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3599:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8184);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3608:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3608:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3608:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3608:7: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3609:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3614:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3616:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8220);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3632:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3633:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3633:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3634:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8241);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3658:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3659:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3660:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8278);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8288); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3667:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3670:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3671:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3671:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3671:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3671:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3672:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3678:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3678:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3679:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8343);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3703:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3704:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3705:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8379);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8389); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3712:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3715:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3716:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3716:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3717:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8436);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3725:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==41) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3725:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3725:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3726:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleFeatureCall8457); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3735:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3736:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3736:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3737:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8477); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3748:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==28) && (synpred4_InternalSCCExp())) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3748:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3748:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3748:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3755:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3756:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,28,FOLLOW_28_in_ruleFeatureCall8511); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3769:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt54=2;
            	            int LA54_0 = input.LA(1);

            	            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||LA54_0==28||LA54_0==30||LA54_0==53||(LA54_0>=83 && LA54_0<=84)||LA54_0==87) ) {
            	                alt54=1;
            	            }
            	            switch (alt54) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3769:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3769:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3770:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3770:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3771:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8546);
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

            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3787:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop53:
            	                    do {
            	                        int alt53=2;
            	                        int LA53_0 = input.LA(1);

            	                        if ( (LA53_0==25) ) {
            	                            alt53=1;
            	                        }


            	                        switch (alt53) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3787:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleFeatureCall8559); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3791:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3792:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3792:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3793:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8580);
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
            	                    	    break loop53;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleFeatureCall8596); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3821:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3822:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3823:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8636);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8646); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3830:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3833:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3834:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3834:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3834:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3834:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3835:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3840:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3841:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3841:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3842:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3853:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==28) && (synpred5_InternalSCCExp())) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3853:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3853:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3853:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3860:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3861:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,28,FOLLOW_28_in_ruleElementReferenceExpression8734); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3874:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||LA58_0==28||LA58_0==30||LA58_0==53||(LA58_0>=83 && LA58_0<=84)||LA58_0==87) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3874:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3874:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3875:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3875:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3876:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8769);
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

                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3892:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==25) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3892:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleElementReferenceExpression8782); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3896:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3897:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3897:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3898:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8803);
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
                            	    break loop57;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleElementReferenceExpression8819); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3930:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3931:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3932:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8861);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8871); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3939:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3942:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3943:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3943:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt60=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt60=1;
                }
                break;
            case RULE_INT:
                {
                alt60=2;
                }
                break;
            case RULE_HEX:
                {
                alt60=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt60=4;
                }
                break;
            case RULE_STRING:
                {
                alt60=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3944:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral8918);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3954:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral8945);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3964:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral8972);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral8999);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3984:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9026);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4000:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4001:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4002:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9061);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9071); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4009:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4012:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4013:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4013:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4013:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4013:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4014:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4019:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4020:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4020:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4021:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9122); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4045:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4046:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4047:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9163);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9173); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4054:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4057:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4058:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4058:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4058:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4058:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4059:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4064:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4065:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4065:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4066:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9224); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4090:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4091:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4092:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9265);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9275); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4099:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4102:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4103:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4103:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4103:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4103:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4104:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4109:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4110:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4110:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4111:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9326); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4135:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4136:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4137:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9367);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9377); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4144:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4147:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4148:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4148:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4148:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4148:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4149:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4154:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4155:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4155:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4156:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9428); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4180:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4181:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4182:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9469);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9479); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4189:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4192:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4193:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4193:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4193:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4193:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4194:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4199:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4200:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4200:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4201:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9530); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4225:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4227:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4228:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4228:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt61=8;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt61=1;
                }
                break;
            case 58:
                {
                alt61=2;
                }
                break;
            case 59:
                {
                alt61=3;
                }
                break;
            case 60:
                {
                alt61=4;
                }
                break;
            case 61:
                {
                alt61=5;
                }
                break;
            case 62:
                {
                alt61=6;
                }
                break;
            case 63:
                {
                alt61=7;
                }
                break;
            case 64:
                {
                alt61=8;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4228:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4228:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4228:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleCombineOperator9585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4234:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4234:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4234:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleCombineOperator9602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4240:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4240:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4240:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleCombineOperator9619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4246:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4246:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4246:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_60_in_ruleCombineOperator9636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4252:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4252:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4252:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_61_in_ruleCombineOperator9653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4258:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4258:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4258:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_62_in_ruleCombineOperator9670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4264:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4264:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4264:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_63_in_ruleCombineOperator9687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4270:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4270:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4270:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_64_in_ruleCombineOperator9704); if (state.failed) return current;
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


    // $ANTLR start "ruleVarDirection"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4280:1: ruleVarDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleVarDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4282:28: ( ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt62=1;
                }
                break;
            case 66:
                {
                alt62=2;
                }
                break;
            case 67:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:2: (enumLiteral_0= 'inout' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:2: (enumLiteral_0= 'inout' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:4: enumLiteral_0= 'inout'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleVarDirection9749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4289:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4289:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4289:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleVarDirection9766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4295:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4295:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4295:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleVarDirection9783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVarDirectionAccess().getOUTEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleVarDirection"


    // $ANTLR start "ruleDirection"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4305:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4308:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4308:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt63=1;
                }
                break;
            case 66:
                {
                alt63=2;
                }
                break;
            case 67:
                {
                alt63=3;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4308:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4308:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4308:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleDirection9828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleDirection9845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4320:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4320:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4320:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleDirection9862); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4330:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4333:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4333:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==69) ) {
                alt64=1;
            }
            else if ( (LA64_0==70) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4333:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4333:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4333:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleTimeEventType9907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleTimeEventType9924); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4349:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4352:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4352:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt65=11;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt65=1;
                }
                break;
            case 71:
                {
                alt65=2;
                }
                break;
            case 72:
                {
                alt65=3;
                }
                break;
            case 73:
                {
                alt65=4;
                }
                break;
            case 74:
                {
                alt65=5;
                }
                break;
            case 75:
                {
                alt65=6;
                }
                break;
            case 76:
                {
                alt65=7;
                }
                break;
            case 77:
                {
                alt65=8;
                }
                break;
            case 78:
                {
                alt65=9;
                }
                break;
            case 79:
                {
                alt65=10;
                }
                break;
            case 80:
                {
                alt65=11;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4352:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4352:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4352:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_16_in_ruleAssignmentOperator9969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4358:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4358:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4358:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator9986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator10003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4370:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4370:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4370:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator10020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4376:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4376:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4376:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator10037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4382:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4382:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4382:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4388:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4388:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4388:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4394:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4394:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4394:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4400:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4400:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4400:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4406:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4406:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4406:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4412:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4412:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4412:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10139); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4422:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==81) ) {
                alt66=1;
            }
            else if ( (LA66_0==82) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator10184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4431:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4431:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4431:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleShiftOperator10201); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4441:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4444:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4444:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==83) ) {
                alt67=1;
            }
            else if ( (LA67_0==84) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4444:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4444:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4444:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleAdditiveOperator10246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4450:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4450:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4450:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleAdditiveOperator10263); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4460:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4463:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4463:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt68=1;
                }
                break;
            case 19:
                {
                alt68=2;
                }
                break;
            case 86:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4463:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4463:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4463:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleMultiplicativeOperator10308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4469:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4469:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4469:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicativeOperator10325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_86_in_ruleMultiplicativeOperator10342); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4485:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4488:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4488:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt69=1;
                }
                break;
            case 84:
                {
                alt69=2;
                }
                break;
            case 87:
                {
                alt69=3;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4488:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4488:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4488:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleUnaryOperator10387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleUnaryOperator10404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4500:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4500:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4500:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_87_in_ruleUnaryOperator10421); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4510:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4512:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4513:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4513:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt70=6;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt70=1;
                }
                break;
            case 89:
                {
                alt70=2;
                }
                break;
            case 42:
                {
                alt70=3;
                }
                break;
            case 90:
                {
                alt70=4;
                }
                break;
            case 91:
                {
                alt70=5;
                }
                break;
            case 92:
                {
                alt70=6;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4513:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4513:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4513:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleRelationalOperator10466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator10483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4525:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4525:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4525:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleRelationalOperator10500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4531:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4531:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4531:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator10517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4537:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4537:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4537:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator10534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4543:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4543:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4543:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator10551); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4553:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt71=1;
                }
                break;
            case 94:
                {
                alt71=2;
                }
                break;
            case 95:
                {
                alt71=3;
                }
                break;
            case 96:
                {
                alt71=4;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleTimeUnit10596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4562:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4562:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4562:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleTimeUnit10613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4568:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4568:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4568:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_95_in_ruleTimeUnit10630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4574:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4574:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4574:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_96_in_ruleTimeUnit10647); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSCCExp
    public final void synpred1_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:588:6: ( '[' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:588:8: '['
        {
        match(input,26,FOLLOW_26_in_synpred1_InternalSCCExp1197); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSCCExp

    // $ANTLR start synpred3_InternalSCCExp
    public final void synpred3_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:4: ( ';' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:6: ';'
        {
        match(input,20,FOLLOW_20_in_synpred3_InternalSCCExp4582); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSCCExp

    // $ANTLR start synpred4_InternalSCCExp
    public final void synpred4_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3748:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3749:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3749:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3750:2: '('
        {
        match(input,28,FOLLOW_28_in_synpred4_InternalSCCExp8493); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSCCExp

    // $ANTLR start synpred5_InternalSCCExp
    public final void synpred5_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3853:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3854:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3854:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3855:2: '('
        {
        match(input,28,FOLLOW_28_in_synpred5_InternalSCCExp8716); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSCCExp

    // Delegated rules

    public final boolean synpred4_InternalSCCExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSCCExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSCCExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSCCExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSCCExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSCCExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSCCExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSCCExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA27_eotS =
        "\7\uffff";
    static final String DFA27_eofS =
        "\2\3\2\uffff\1\2\1\uffff\1\2";
    static final String DFA27_minS =
        "\2\4\2\uffff\1\23\1\4\1\23";
    static final String DFA27_maxS =
        "\2\106\2\uffff\1\52\1\4\1\52";
    static final String DFA27_acceptS =
        "\2\uffff\1\1\1\2\3\uffff";
    static final String DFA27_specialS =
        "\7\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\2\15\uffff\1\3\4\uffff\1\1\1\uffff\1\2\20\uffff\6\2\24\uffff"+
            "\2\2",
            "\1\4\1\2\24\uffff\1\2\17\uffff\1\3\6\2\24\uffff\2\2",
            "",
            "",
            "\1\2\4\uffff\3\2\1\uffff\1\2\14\uffff\1\5\1\3",
            "\1\6",
            "\1\2\4\uffff\3\2\1\uffff\1\2\14\uffff\1\5\1\3"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1960:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?";
        }
    }
    static final String DFA32_eotS =
        "\20\uffff";
    static final String DFA32_eofS =
        "\2\2\16\uffff";
    static final String DFA32_minS =
        "\2\4\16\uffff";
    static final String DFA32_maxS =
        "\1\106\1\127\16\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\15\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\2\10\uffff\1\2\5\uffff\1\1\3\uffff\1\2\1\uffff\1\2\10\uffff"+
            "\4\2\4\uffff\6\2\20\uffff\6\2",
            "\1\10\1\4\1\3\1\6\1\5\1\7\22\uffff\1\12\1\uffff\1\11\22\uffff"+
            "\1\17\3\uffff\1\16\35\uffff\1\13\1\14\2\uffff\1\15",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 2085:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_1==EOF) ) {s = 2;}

                        else if ( (LA32_1==RULE_BOOL) && (synpred3_InternalSCCExp())) {s = 3;}

                        else if ( (LA32_1==RULE_INT) && (synpred3_InternalSCCExp())) {s = 4;}

                        else if ( (LA32_1==RULE_HEX) && (synpred3_InternalSCCExp())) {s = 5;}

                        else if ( (LA32_1==RULE_FLOAT) && (synpred3_InternalSCCExp())) {s = 6;}

                        else if ( (LA32_1==RULE_STRING) && (synpred3_InternalSCCExp())) {s = 7;}

                        else if ( (LA32_1==RULE_ID) && (synpred3_InternalSCCExp())) {s = 8;}

                        else if ( (LA32_1==30) && (synpred3_InternalSCCExp())) {s = 9;}

                        else if ( (LA32_1==28) && (synpred3_InternalSCCExp())) {s = 10;}

                        else if ( (LA32_1==83) && (synpred3_InternalSCCExp())) {s = 11;}

                        else if ( (LA32_1==84) && (synpred3_InternalSCCExp())) {s = 12;}

                        else if ( (LA32_1==87) && (synpred3_InternalSCCExp())) {s = 13;}

                        else if ( (LA32_1==53) && (synpred3_InternalSCCExp())) {s = 14;}

                        else if ( (LA32_1==49) && (synpred3_InternalSCCExp())) {s = 15;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope140 = new BitSet(new long[]{0x0000000000004012L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDirection_in_ruleVariableDefinition242 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinition261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition332 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinition345 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition366 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinition381 = new BitSet(new long[]{0xFE00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleVariableDefinition402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExitAction498 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExitAction510 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExitAction522 = new BitSet(new long[]{0x00220000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleExitAction543 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExitAction555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideAction_in_entryRuleInsideAction591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsideAction601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInsideAction647 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsideAction659 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInsideAction671 = new BitSet(new long[]{0x00220000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleInsideAction692 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInsideAction704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEntryAction796 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntryAction808 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEntryAction820 = new BitSet(new long[]{0x00220000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleEntryAction841 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntryAction853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_entryRuleSuspend889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspend899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSuspend945 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSuspend957 = new BitSet(new long[]{0x0001F80005000030L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleSuspend978 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSuspend990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleReactionTrigger1088 = new BitSet(new long[]{0x0001F80004000030L,0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1119 = new BitSet(new long[]{0x0001F80004000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger1148 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleReactionTrigger1161 = new BitSet(new long[]{0x0001F80000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger1182 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionTrigger1205 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1227 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReactionTrigger1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionTrigger1261 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1282 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReactionTrigger1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpressionreturns_in_rulePrimaryExpression1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimaryExpression1461 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression1483 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpressionreturns_in_entryRulePreValueExpressionreturns1531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpressionreturns1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePreValueExpressionreturns1587 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePreValueExpressionreturns1599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpressionreturns1620 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePreValueExpressionreturns1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStatechartRoot1863 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStateRoot1967 = new BitSet(new long[]{0x0000000000004010L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTransitionRoot2071 = new BitSet(new long[]{0x0001F80005080030L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStatechartSpecification2187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2208 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2231 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope2571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInterfaceScope2627 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceScope2644 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceScope2662 = new BitSet(new long[]{0x000001E000004010L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope2685 = new BitSet(new long[]{0x000001E000004012L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope2704 = new BitSet(new long[]{0x000001E000004012L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope2723 = new BitSet(new long[]{0x000001E000004012L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleEntrypoint_in_ruleInterfaceScope2742 = new BitSet(new long[]{0x000001E000004012L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleExitpoint_in_ruleInterfaceScope2761 = new BitSet(new long[]{0x000001E000004012L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope2801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInternalScope2857 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInternalScope2869 = new BitSet(new long[]{0x0001F86005004030L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2892 = new BitSet(new long[]{0x0001F86005004032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope2911 = new BitSet(new long[]{0x0001F86005004032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope2930 = new BitSet(new long[]{0x0001F86005004032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope2949 = new BitSet(new long[]{0x0001F86005004032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion2991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3139 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEventDefinition3152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition3169 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventDefinition3187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperationDefinition3488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition3505 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOperationDefinition3522 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3544 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_25_in_ruleOperationDefinition3557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3578 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_29_in_ruleOperationDefinition3594 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOperationDefinition3607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3720 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter3737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntrypoint3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntrypoint3852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntrypoint3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitpoint_in_entryRuleExitpoint3910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitpoint3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExitpoint3966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitpoint3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4076 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleFQN4095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4110 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLocalReaction4247 = new BitSet(new long[]{0x00220000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4371 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_19_in_ruleTransitionReaction4385 = new BitSet(new long[]{0x00220000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4406 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTransitionReaction4421 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4547 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4566 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleReactionEffect4590 = new BitSet(new long[]{0x00220000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4614 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4633 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties4739 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntryPointSpec4942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec5059 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExitPointSpec5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec5107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec5416 = new BitSet(new long[]{0x0000000000000002L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEntryEvent5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExitEvent5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOnCycleEvent5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAlwaysEvent6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultEvent6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultEvent6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEventRaisingExpression6215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6236 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventRaisingExpression6249 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6457 = new BitSet(new long[]{0x0000000000010002L,0x000000000001FF80L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6487 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6508 = new BitSet(new long[]{0x0000000000010002L,0x000000000001FF80L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6603 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConditionalExpression6624 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6645 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConditionalExpression6657 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6773 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLogicalOrExpression6794 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6815 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6910 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLogicalAndExpression6931 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6952 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLogicalNotExpression7074 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7189 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBitwiseXorExpression7210 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7231 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7326 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBitwiseOrExpression7347 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7368 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7463 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBitwiseAndExpression7484 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7505 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7600 = new BitSet(new long[]{0x0000040000000002L,0x000000001F000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7630 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7651 = new BitSet(new long[]{0x0000040000000002L,0x000000001F000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7746 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7776 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7922 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8038 = new BitSet(new long[]{0x0000000000080002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8068 = new BitSet(new long[]{0x00000000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8089 = new BitSet(new long[]{0x0000000000080002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8220 = new BitSet(new long[]{0x00000000500003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8436 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleFeatureCall8457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8477 = new BitSet(new long[]{0x0000020010000002L});
    public static final BitSet FOLLOW_28_in_ruleFeatureCall8511 = new BitSet(new long[]{0x00200000700003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8546 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_25_in_ruleFeatureCall8559 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8580 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_29_in_ruleFeatureCall8596 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8700 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleElementReferenceExpression8734 = new BitSet(new long[]{0x00200000700003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8769 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_25_in_ruleElementReferenceExpression8782 = new BitSet(new long[]{0x00200000500003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8803 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_29_in_ruleElementReferenceExpression8819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral8999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator9585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCombineOperator9602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCombineOperator9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCombineOperator9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCombineOperator9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCombineOperator9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCombineOperator9687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCombineOperator9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleVarDirection9749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleVarDirection9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleVarDirection9783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDirection9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDirection9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDirection9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTimeEventType9907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTimeEventType9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAssignmentOperator9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator10003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator10184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleShiftOperator10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAdditiveOperator10246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAdditiveOperator10263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleMultiplicativeOperator10308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicativeOperator10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleMultiplicativeOperator10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnaryOperator10387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnaryOperator10404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnaryOperator10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRelationalOperator10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationalOperator10500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator10517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator10551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTimeUnit10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTimeUnit10613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTimeUnit10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTimeUnit10647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred1_InternalSCCExp1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred3_InternalSCCExp4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred4_InternalSCCExp8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred5_InternalSCCExp8716 = new BitSet(new long[]{0x0000000000000002L});

}