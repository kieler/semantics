package de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.parser.antlr.internal; 

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
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.services.SCChartsExpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCChartsExpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'signal'", "';'", "'static'", "'='", "'with'", "'/'", "','", "'['", "']'", "'Entry'", "'During'", "'Exit'", "'#'", "'('", "')'", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "':'", "'internal'", "'event'", "'operation'", "'.'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'inputoutut'", "'input'", "'output'", "'local'", "'in'", "'out'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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


        public InternalSCChartsExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCChartsExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSCChartsExpParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g"; }



     	private SCChartsExpGrammarAccess grammarAccess;
     	
        public InternalSCChartsExpParser(TokenStream input, SCChartsExpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateScope";	
       	}
       	
       	@Override
       	protected SCChartsExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:68:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:69:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:70:2: iv_ruleStateScope= ruleStateScope EOF
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:77:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:80:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:81:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:81:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:81:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:87:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==14||LA2_0==16||LA2_0==21||(LA2_0>=23 && LA2_0<=25)||(LA2_0>=62 && LA2_0<=64)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:88:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:88:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:89:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:89:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction )
            	    int alt1=3;
            	    alt1 = dfa1.predict(input);
            	    switch (alt1) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:90:3: lv_declarations_1_1= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStateScope142);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:105:8: lv_declarations_1_2= ruleSignalDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsSignalDeclarationParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleStateScope161);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:120:8: lv_declarations_1_3= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope180);
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
            	    break loop2;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:146:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:147:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:148:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration220);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration230); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:155:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:158:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:160:5: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration276);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:176:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:177:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:178:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition310);
            iv_ruleSignalDefinition=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDefinition320); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:185:1: ruleSignalDefinition returns [EObject current=null] : ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleSignalDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:188:28: ( ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:189:1: ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:189:1: ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:189:2: () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:189:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:190:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSignalDefinition366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:199:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:200:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:200:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:201:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSignalDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:229:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:230:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:231:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition436);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition446); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:238:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_2_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_direction_1_0 = null;

        EObject lv_varInitialValue_6_0 = null;

        Enumerator lv_varCombineOperator_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:241:28: ( ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? otherlv_9= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:242:1: ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? otherlv_9= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:242:1: ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? otherlv_9= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:242:2: () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? otherlv_9= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:242:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:243:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:248:2: ( (lv_direction_1_0= ruleVarDirection ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=62 && LA3_0<=64)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:249:1: (lv_direction_1_0= ruleVarDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:249:1: (lv_direction_1_0= ruleVarDirection )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:250:3: lv_direction_1_0= ruleVarDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDirectionVarDirectionEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDirection_in_ruleVariableDefinition501);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:266:3: ( (lv_isStatic_2_0= 'static' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:267:1: (lv_isStatic_2_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:267:1: (lv_isStatic_2_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:268:3: lv_isStatic_2_0= 'static'
                    {
                    lv_isStatic_2_0=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinition520); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:281:3: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:282:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:282:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:283:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition557);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:296:2: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:297:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:297:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:298:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:314:2: (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:314:4: otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinition592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:318:1: ( (lv_varInitialValue_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:319:1: (lv_varInitialValue_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:319:1: (lv_varInitialValue_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:320:3: lv_varInitialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition613);
                    lv_varInitialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"varInitialValue",
                              		lv_varInitialValue_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:336:4: (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:336:6: otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionAccess().getWithKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:340:1: ( (lv_varCombineOperator_8_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:341:1: (lv_varCombineOperator_8_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:341:1: (lv_varCombineOperator_8_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:342:3: lv_varCombineOperator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleVariableDefinition649);
                    lv_varCombineOperator_8_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"varCombineOperator",
                              		lv_varCombineOperator_8_0, 
                              		"CombineOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getVariableDefinitionAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:370:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:371:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:372:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction699);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction709); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:379:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleLocalReactionTrigger ) ) ( ( ( '/' ( ( ruleLocalReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:382:28: ( ( ( (lv_trigger_0_0= ruleLocalReactionTrigger ) ) ( ( ( '/' ( ( ruleLocalReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:383:1: ( ( (lv_trigger_0_0= ruleLocalReactionTrigger ) ) ( ( ( '/' ( ( ruleLocalReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:383:1: ( ( (lv_trigger_0_0= ruleLocalReactionTrigger ) ) ( ( ( '/' ( ( ruleLocalReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:383:2: ( (lv_trigger_0_0= ruleLocalReactionTrigger ) ) ( ( ( '/' ( ( ruleLocalReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:383:2: ( (lv_trigger_0_0= ruleLocalReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:384:1: (lv_trigger_0_0= ruleLocalReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:384:1: (lv_trigger_0_0= ruleLocalReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:385:3: lv_trigger_0_0= ruleLocalReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction755);
            lv_trigger_0_0=ruleLocalReactionTrigger();

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
                      		"LocalReactionTrigger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:401:2: ( ( ( '/' ( ( ruleLocalReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:401:3: ( ( '/' ( ( ruleLocalReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:406:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:406:8: otherlv_1= '/' ( (lv_effect_2_0= ruleLocalReactionEffect ) )
            {
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLocalReaction787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:410:1: ( (lv_effect_2_0= ruleLocalReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:411:1: (lv_effect_2_0= ruleLocalReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:411:1: (lv_effect_2_0= ruleLocalReactionEffect )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:412:3: lv_effect_2_0= ruleLocalReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectLocalReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalReactionEffect_in_ruleLocalReaction808);
            lv_effect_2_0=ruleLocalReactionEffect();

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
                      		"LocalReactionEffect");
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


    // $ANTLR start "entryRuleLocalReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:436:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:437:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:438:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger846);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger856); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:445:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_triggers_1_0 = null;

        EObject lv_triggers_3_0 = null;

        EObject lv_guardExpression_5_0 = null;

        EObject lv_guardExpression_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:448:28: ( ( () ( ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:449:1: ( () ( ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:449:1: ( () ( ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:449:2: () ( ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:449:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:450:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:455:2: ( ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=23 && LA9_0<=25)) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:455:3: ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:455:3: ( ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:455:4: ( (lv_triggers_1_0= ruleLocalReactionSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:455:4: ( (lv_triggers_1_0= ruleLocalReactionSpec ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:456:1: (lv_triggers_1_0= ruleLocalReactionSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:456:1: (lv_triggers_1_0= ruleLocalReactionSpec )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:457:3: lv_triggers_1_0= ruleLocalReactionSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getTriggersLocalReactionSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLocalReactionSpec_in_ruleLocalReactionTrigger913);
                    lv_triggers_1_0=ruleLocalReactionSpec();

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
                              		"LocalReactionSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:473:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:473:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleLocalReactionSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleLocalReactionTrigger926); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:477:1: ( (lv_triggers_3_0= ruleLocalReactionSpec ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:478:1: (lv_triggers_3_0= ruleLocalReactionSpec )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:478:1: (lv_triggers_3_0= ruleLocalReactionSpec )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:479:3: lv_triggers_3_0= ruleLocalReactionSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getTriggersLocalReactionSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLocalReactionSpec_in_ruleLocalReactionTrigger947);
                    	    lv_triggers_3_0=ruleLocalReactionSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"triggers",
                    	              		lv_triggers_3_0, 
                    	              		"LocalReactionSpec");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:495:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) && (synpred2_InternalSCChartsExp())) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:495:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:495:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:495:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleLocalReactionTrigger970); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getLocalReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:500:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:501:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:501:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:502:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleLocalReactionTrigger992);
                            lv_guardExpression_5_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
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

                            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleLocalReactionTrigger1004); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getLocalReactionTriggerAccess().getRightSquareBracketKeyword_1_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:523:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:523:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:523:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleLocalReactionTrigger1026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLocalReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:527:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:528:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:528:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:529:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLocalReactionTrigger1047);
                    lv_guardExpression_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"guardExpression",
                              		lv_guardExpression_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleLocalReactionTrigger1059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getLocalReactionTriggerAccess().getRightSquareBracketKeyword_1_1_2());
                          
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
    // $ANTLR end "ruleLocalReactionTrigger"


    // $ANTLR start "entryRuleLocalReactionEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:557:1: entryRuleLocalReactionEffect returns [EObject current=null] : iv_ruleLocalReactionEffect= ruleLocalReactionEffect EOF ;
    public final EObject entryRuleLocalReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:558:2: (iv_ruleLocalReactionEffect= ruleLocalReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:559:2: iv_ruleLocalReactionEffect= ruleLocalReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionEffect_in_entryRuleLocalReactionEffect1097);
            iv_ruleLocalReactionEffect=ruleLocalReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionEffect1107); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalReactionEffect"


    // $ANTLR start "ruleLocalReactionEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:566:1: ruleLocalReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleLocalReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:569:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:570:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:570:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:570:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:570:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:571:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:576:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:577:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:577:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:578:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLocalReactionEffect1162);
            lv_actions_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalReactionEffectRule());
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:594:2: ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) && (synpred3_InternalSCChartsExp())) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:594:3: ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:594:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:594:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLocalReactionEffect1183); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:599:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:600:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:600:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:601:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleLocalReactionEffect1205);
            	    lv_actions_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalReactionEffectRule());
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
    // $ANTLR end "ruleLocalReactionEffect"


    // $ANTLR start "entryRuleLocalReactionSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:625:1: entryRuleLocalReactionSpec returns [EObject current=null] : iv_ruleLocalReactionSpec= ruleLocalReactionSpec EOF ;
    public final EObject entryRuleLocalReactionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:626:2: (iv_ruleLocalReactionSpec= ruleLocalReactionSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:627:2: iv_ruleLocalReactionSpec= ruleLocalReactionSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionSpecRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionSpec_in_entryRuleLocalReactionSpec1243);
            iv_ruleLocalReactionSpec=ruleLocalReactionSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionSpec1253); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalReactionSpec"


    // $ANTLR start "ruleLocalReactionSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:634:1: ruleLocalReactionSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_StateReaction_1= ruleStateReaction ) ;
    public final EObject ruleLocalReactionSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_StateReaction_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:637:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_StateReaction_1= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:638:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_StateReaction_1= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:638:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_StateReaction_1= ruleStateReaction )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=23 && LA11_0<=25)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:639:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalReactionSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleLocalReactionSpec1300);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:649:5: this_StateReaction_1= ruleStateReaction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalReactionSpecAccess().getStateReactionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionSpec1327);
                    this_StateReaction_1=ruleStateReaction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateReaction_1; 
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
    // $ANTLR end "ruleLocalReactionSpec"


    // $ANTLR start "entryRuleStateReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:665:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:666:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:667:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1362);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1372); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:674:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:677:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:678:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:678:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:679:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1419);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:689:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1446);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:699:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1473);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:715:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:716:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:717:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1508);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1518); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:724:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:727:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:728:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:728:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:728:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:728:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:729:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleEntry1564); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:746:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:747:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:748:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1600);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1610); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:755:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:758:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:759:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:759:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:759:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:759:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:760:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleInside1656); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:777:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:778:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:779:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1692);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1702); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:786:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:789:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:790:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:790:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:790:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:790:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:791:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleExit1748); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:808:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:809:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:810:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1784);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1794); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:817:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:820:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:821:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:821:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:821:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:821:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:822:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:827:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:828:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:828:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:829:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,26,FOLLOW_26_in_ruleReactionTrigger1846); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:842:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:843:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:843:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:844:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1877); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:860:3: ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=40 && LA17_0<=45)||(LA17_0>=68 && LA17_0<=69)) ) {
                alt17=1;
            }
            else if ( (LA17_0==21) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:860:4: ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:860:4: ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:860:5: ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )?
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:860:5: ( (lv_triggers_3_0= ruleEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:861:1: (lv_triggers_3_0= ruleEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:861:1: (lv_triggers_3_0= ruleEventSpec )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:862:3: lv_triggers_3_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_3_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger1906);
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:878:2: (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:878:4: otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleReactionTrigger1919); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getCommaKeyword_3_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:882:1: ( (lv_triggers_5_0= ruleEventSpec ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:883:1: (lv_triggers_5_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:883:1: (lv_triggers_5_0= ruleEventSpec )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:884:3: lv_triggers_5_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_3_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger1940);
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
                    	    break loop15;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:900:4: ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==21) && (synpred4_InternalSCChartsExp())) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:900:5: ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:900:5: ( ( '[' )=>otherlv_6= '[' )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:900:6: ( '[' )=>otherlv_6= '['
                            {
                            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleReactionTrigger1963); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:905:2: ( (lv_guardExpression_7_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:906:1: (lv_guardExpression_7_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:906:1: (lv_guardExpression_7_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:907:3: lv_guardExpression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1985);
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

                            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleReactionTrigger1997); if (state.failed) return current;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:928:6: (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:928:6: (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:928:8: otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleReactionTrigger2019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:932:1: ( (lv_guardExpression_10_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:933:1: (lv_guardExpression_10_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:933:1: (lv_guardExpression_10_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:934:3: lv_guardExpression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger2040);
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

                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleReactionTrigger2052); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:962:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:963:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:964:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2090);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2100); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:971:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:974:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:975:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:975:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            case 27:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:976:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2147);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:986:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2174);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:996:5: this_PreValueExpressionreturns_2= rulePreValueExpressionreturns
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionreturnsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpressionreturns_in_rulePrimaryExpression2201);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1005:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1005:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1005:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression2219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression2241);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_rulePrimaryExpression2252); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1030:1: entryRulePreValueExpressionreturns returns [EObject current=null] : iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF ;
    public final EObject entryRulePreValueExpressionreturns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpressionreturns = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1031:2: (iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1032:2: iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionreturnsRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpressionreturns_in_entryRulePreValueExpressionreturns2289);
            iv_rulePreValueExpressionreturns=rulePreValueExpressionreturns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpressionreturns; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpressionreturns2299); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1039:1: rulePreValueExpressionreturns returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpressionreturns() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1042:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1043:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1043:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1043:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1043:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1044:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionreturnsAccess().getPreValueExpressionreturnsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_rulePreValueExpressionreturns2345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionreturnsAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePreValueExpressionreturns2357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionreturnsAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1057:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1058:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1058:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1059:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionreturnsAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpressionreturns2378);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_rulePreValueExpressionreturns2390); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1089:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1090:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1091:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2428);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2438); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1098:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1101:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1102:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1102:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 32:
                {
                alt19=3;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1103:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2485);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1113:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2512);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1123:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2539);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1139:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1140:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1141:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2574);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2584); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1148:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1151:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1152:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1152:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1152:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleStatechartRoot2621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1156:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1157:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1157:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1158:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2642);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1182:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1183:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1184:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2678);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2688); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1191:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1194:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1195:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1195:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1195:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleStateRoot2725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1199:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1200:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1200:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1201:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2746);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1225:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1226:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1227:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2782);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2792); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1234:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1237:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1238:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1238:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1238:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTransitionRoot2829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1242:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1243:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1243:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1244:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2850);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1270:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1271:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1272:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2888);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2898); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1279:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1282:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1283:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1283:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1283:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1283:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1284:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1289:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1289:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleStatechartSpecification2945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1293:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1294:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1294:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1295:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2966);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1311:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34||LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1312:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1312:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1313:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2989);
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
            	    break loop21;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1337:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1338:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1339:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3026);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3036); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1346:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1349:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1350:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1350:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1351:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1351:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1352:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3081);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1376:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1377:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1378:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3116);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3126); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1385:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1388:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1389:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1389:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1390:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1390:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1391:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3171);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1417:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1418:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1419:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3208);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3218); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1426:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1429:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1430:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1430:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1431:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3265);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1441:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3292);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1459:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1460:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1461:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3329);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3339); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1468:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_declarations_4_1 = null;

        EObject lv_declarations_4_2 = null;

        EObject lv_declarations_4_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1471:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1472:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1472:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1472:2: () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1472:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1473:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleInterfaceScope3385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1482:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1483:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1483:1: (lv_name_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1484:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceScope3402); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleInterfaceScope3420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1504:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==16||(LA25_0>=37 && LA25_0<=38)||(LA25_0>=62 && LA25_0<=67)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1505:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1505:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1506:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1506:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 65:
            	    case 66:
            	    case 67:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 16:
            	    case 62:
            	    case 63:
            	    case 64:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 38:
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1507:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3443);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1522:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3462);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1537:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3481);
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1563:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1564:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1565:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3521);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3531); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1572:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1575:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1576:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1576:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1576:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1576:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1577:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInternalScope3577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleInternalScope3589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1590:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==16||LA27_0==21||(LA27_0>=23 && LA27_0<=25)||(LA27_0>=37 && LA27_0<=38)||(LA27_0>=62 && LA27_0<=67)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1591:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1591:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1592:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1592:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt26=4;
            	    alt26 = dfa26.predict(input);
            	    switch (alt26) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1593:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3612);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1608:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3631);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1623:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3650);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1638:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3669);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1666:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1667:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1668:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3711);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3721); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1675:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1678:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1680:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3767);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1698:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1699:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1700:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3803);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3813); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1707:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1710:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1711:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1711:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1711:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1711:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=65 && LA28_0<=67)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1712:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1712:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1713:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3859);
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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleEventDefinition3872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1733:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1734:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1734:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1735:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition3889); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1751:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1751:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleEventDefinition3907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1755:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1756:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1756:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1757:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3930);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1778:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1779:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1780:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3968);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3978); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1787:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1790:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1792:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4024);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1810:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1811:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1812:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4060);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4070); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1819:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1822:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1824:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4116);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1842:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1843:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1844:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4152);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition4162); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1851:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1854:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1855:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1855:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1855:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1855:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1856:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleOperationDefinition4208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1865:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1866:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1866:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1867:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition4225); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleOperationDefinition4242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1887:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1887:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1887:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1888:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1888:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1889:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4264);
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1905:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==20) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1905:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition4277); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1909:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1910:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1910:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1911:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4298);
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
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleOperationDefinition4314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1931:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1931:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleOperationDefinition4327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1935:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1936:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1936:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1937:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4350);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1958:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1959:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1960:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4388);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4398); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1967:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1970:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1971:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1971:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1971:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1971:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1972:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1972:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1973:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter4440); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleParameter4457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1993:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1994:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1994:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:1995:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter4480);
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


    // $ANTLR start "entryRuleFQN"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2016:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2017:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2018:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4517);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4528); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2025:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2028:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2029:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2029:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2029:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2036:1: (kw= '.' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==39) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2037:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleFQN4587); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4602); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2059:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2060:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2061:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4651);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4661); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2068:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2071:28: ( ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2072:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2072:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2072:2: () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2072:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2073:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2078:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)||LA34_0==21||LA34_0==26||(LA34_0>=40 && LA34_0<=45)||(LA34_0>=68 && LA34_0<=69)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2079:1: (lv_trigger_1_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2079:1: (lv_trigger_1_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2080:3: lv_trigger_1_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerReactionTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4716);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2096:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2096:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTransitionReaction4730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2100:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2101:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2101:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2102:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4751);
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


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2126:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2127:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2128:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4789);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect4799); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2135:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2138:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2139:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2139:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2139:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2139:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2140:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2145:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2146:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2146:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2147:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2147:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||LA36_0==27||LA36_0==29||LA36_0==50||(LA36_0>=82 && LA36_0<=83)||LA36_0==86) ) {
                alt36=1;
            }
            else if ( (LA36_0==46) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2148:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4856);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2163:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4875);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2181:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==15) && (synpred5_InternalSCChartsExp())) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2181:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2181:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2181:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleReactionEffect4899); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2186:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2187:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2187:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2188:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2188:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_STRING)||LA37_0==27||LA37_0==29||LA37_0==50||(LA37_0>=82 && LA37_0<=83)||LA37_0==86) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==46) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2189:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4923);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2204:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4942);
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleEventSpec"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2230:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2231:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2232:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec4983);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec4993); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2239:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2242:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2243:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2243:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case 68:
            case 69:
                {
                alt39=2;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2244:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5040);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2254:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5067);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2264:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5094);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2280:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2281:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2282:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5129);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5139); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2289:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2292:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2293:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2293:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2294:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2294:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2295:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5184);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2319:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2320:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2321:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5219);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5229); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2328:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2331:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2332:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2332:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2332:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2332:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2333:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2333:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2334:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5275);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2350:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2351:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2351:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2352:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5296);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2368:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2369:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2369:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2370:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5317);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2394:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2395:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2396:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5353);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5363); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2403:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2406:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2407:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2407:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt40=1;
                }
                break;
            case 41:
                {
                alt40=2;
                }
                break;
            case 42:
                {
                alt40=3;
                }
                break;
            case 43:
                {
                alt40=4;
                }
                break;
            case 44:
            case 45:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2408:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5410);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2418:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5437);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2428:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5464);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2438:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5491);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2448:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5518);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2464:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2465:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2466:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5553);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5563); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2473:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2476:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2477:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2477:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2477:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2477:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2478:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEntryEvent5609); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2495:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2496:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2497:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5645);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5655); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2504:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2507:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2508:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2508:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2508:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2508:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2509:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleExitEvent5701); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2526:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2527:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2528:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5737);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5747); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2535:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2538:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2539:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2539:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2539:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2539:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2540:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOnCycleEvent5793); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2557:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2558:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2559:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5829);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent5839); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2566:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2569:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2570:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2570:1: ( () otherlv_1= 'always' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2570:2: () otherlv_1= 'always'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2570:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2571:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAlwaysEvent5885); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2588:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2589:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2590:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5921);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent5931); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2597:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2600:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2601:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2601:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2601:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2601:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2602:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2607:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            else if ( (LA41_0==45) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2607:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDefaultEvent5978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2612:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleDefaultEvent5996); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2624:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2625:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2626:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6033);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression6043); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2633:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2636:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2637:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2637:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2637:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2637:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2638:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleEventRaisingExpression6089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2647:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2648:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2648:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2649:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6110);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2665:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2665:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleEventRaisingExpression6123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2669:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2670:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2670:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2671:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression6144);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2697:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2698:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2699:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6184);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6194); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2706:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2709:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2711:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6240);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2727:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2728:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2729:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6274);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6284); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2736:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2739:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2740:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2740:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2741:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6331);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2749:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==17||(LA43_0>=70 && LA43_0<=79)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2749:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2749:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2750:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2755:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2756:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2756:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2757:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6361);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2773:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2774:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2774:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2775:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6382);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2799:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2800:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2801:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6420);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6430); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2808:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2811:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2812:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2812:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2813:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6477);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2821:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2821:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2821:2: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2822:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleConditionalExpression6498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2831:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2832:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2832:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2833:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6519);
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

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleConditionalExpression6531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2853:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2854:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2854:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2855:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6552);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2879:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2880:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2881:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6590);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6600); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2888:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2891:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2892:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2892:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2893:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6647);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2901:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==48) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2901:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2901:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2902:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleLogicalOrExpression6668); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2911:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2912:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2912:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2913:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6689);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2937:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2938:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2939:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6727);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6737); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2946:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2949:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2950:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2950:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2951:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6784);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2959:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==49) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2959:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2959:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2960:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleLogicalAndExpression6805); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2969:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2970:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2970:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2971:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6826);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2995:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2996:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2997:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6864);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6874); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3004:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3007:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3008:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3008:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==27||LA47_0==29||(LA47_0>=82 && LA47_0<=83)||LA47_0==86) ) {
                alt47=1;
            }
            else if ( (LA47_0==50) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3009:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6921);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3018:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3018:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3018:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3018:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3019:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleLogicalNotExpression6948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3028:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3029:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3029:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3030:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6969);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3054:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3055:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3056:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7006);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7016); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3063:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3066:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3067:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3067:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3068:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7063);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3076:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==51) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3076:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3076:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3077:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleBitwiseXorExpression7084); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3086:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3087:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3087:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3088:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7105);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3112:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3113:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3114:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7143);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7153); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3121:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3124:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3125:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3125:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3126:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7200);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3134:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==52) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3134:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3134:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3135:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBitwiseOrExpression7221); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3144:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3145:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3145:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3146:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7242);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3170:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3171:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3172:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7280);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7290); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3179:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3182:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3183:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3183:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3184:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7337);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3192:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==53) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3192:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3192:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3193:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleBitwiseAndExpression7358); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3202:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3203:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3203:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3204:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7379);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3228:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3229:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3230:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7417);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7427); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3237:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3240:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3241:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3241:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3242:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7474);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3250:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=87 && LA51_0<=92)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3250:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3250:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3251:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3256:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3257:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3257:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3258:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7504);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3274:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3275:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3275:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3276:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7525);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3300:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3301:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3302:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7563);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7573); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3309:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3312:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3313:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3313:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3314:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7620);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3322:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=80 && LA52_0<=81)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3322:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3322:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3323:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3328:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3329:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3329:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3330:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7650);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3346:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3347:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3347:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3348:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7671);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3372:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3373:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3374:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7709);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7719); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3381:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3384:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3385:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3385:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3386:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7766);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3394:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=82 && LA53_0<=83)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3394:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3394:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3395:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3400:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3401:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3401:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3402:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7796);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3418:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3419:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3419:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3420:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7817);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3444:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3445:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3446:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7855);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7865); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3453:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3456:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3457:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3457:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3458:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7912);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3466:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==19||(LA54_0>=84 && LA54_0<=85)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3466:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3466:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3467:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3472:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3473:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3473:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3474:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7942);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3490:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3491:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3491:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3492:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7963);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3516:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3517:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3518:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8001);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8011); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3525:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3528:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3529:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3529:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_STRING)||LA55_0==27||LA55_0==29) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=82 && LA55_0<=83)||LA55_0==86) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3530:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8058);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3539:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3539:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3539:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3539:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3540:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3545:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3546:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3546:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3547:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8094);
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3563:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3564:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3564:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3565:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8115);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3589:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3590:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3591:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8152);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8162); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3598:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3601:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3602:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3602:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3602:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3602:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3603:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3608:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3609:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3609:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3610:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8217);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3634:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3635:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3636:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8253);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8263); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3643:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3646:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3647:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3647:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3648:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8310);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3656:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==39) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3656:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3656:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3657:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleFeatureCall8331); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3666:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3667:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3667:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3668:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8351); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3679:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==27) && (synpred6_InternalSCChartsExp())) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3679:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3679:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3679:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3686:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3687:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,27,FOLLOW_27_in_ruleFeatureCall8385); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3700:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt57=2;
            	            int LA57_0 = input.LA(1);

            	            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==27||LA57_0==29||LA57_0==50||(LA57_0>=82 && LA57_0<=83)||LA57_0==86) ) {
            	                alt57=1;
            	            }
            	            switch (alt57) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3700:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3700:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3701:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3701:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3702:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8420);
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

            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3718:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop56:
            	                    do {
            	                        int alt56=2;
            	                        int LA56_0 = input.LA(1);

            	                        if ( (LA56_0==20) ) {
            	                            alt56=1;
            	                        }


            	                        switch (alt56) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3718:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFeatureCall8433); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3722:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3723:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3723:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3724:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8454);
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

            	            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleFeatureCall8470); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3752:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3753:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3754:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8510);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8520); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3761:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3764:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3765:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3765:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3765:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3765:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3766:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3771:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3772:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3772:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3773:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3784:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==27) && (synpred7_InternalSCChartsExp())) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3784:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3784:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3784:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3791:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3792:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,27,FOLLOW_27_in_ruleElementReferenceExpression8608); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3805:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==27||LA61_0==29||LA61_0==50||(LA61_0>=82 && LA61_0<=83)||LA61_0==86) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3805:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3805:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3806:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3806:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3807:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8643);
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

                            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3823:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==20) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3823:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleElementReferenceExpression8656); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3827:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3828:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3828:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3829:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8677);
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

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleElementReferenceExpression8693); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3863:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3864:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3865:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8737);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8747); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3872:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3875:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3876:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3876:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3877:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral8794);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3887:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral8821);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3897:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral8848);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3907:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral8875);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3917:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral8902);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3933:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3934:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3935:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral8937);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral8947); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3942:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3945:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3946:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3946:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3946:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3946:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3947:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3952:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3953:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3953:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3954:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral8998); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3978:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3979:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3980:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9039);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9049); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3987:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3990:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3991:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3991:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3991:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3991:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3992:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3997:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3998:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3998:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3999:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9100); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4023:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4024:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4025:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9141);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9151); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4032:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4035:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4036:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4036:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4036:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4036:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4037:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4042:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4043:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4043:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4044:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9202); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4068:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4069:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4070:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9243);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9253); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4077:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4080:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4081:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4081:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4081:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4081:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4082:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4087:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4088:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4088:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4089:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9304); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4113:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4114:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4115:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9345);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9355); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4122:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4125:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4126:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4126:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4126:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4126:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4127:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4132:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4133:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4133:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4134:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9406); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4158:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4160:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4161:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4161:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt64=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt64=1;
                }
                break;
            case 55:
                {
                alt64=2;
                }
                break;
            case 56:
                {
                alt64=3;
                }
                break;
            case 57:
                {
                alt64=4;
                }
                break;
            case 58:
                {
                alt64=5;
                }
                break;
            case 59:
                {
                alt64=6;
                }
                break;
            case 60:
                {
                alt64=7;
                }
                break;
            case 61:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4161:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4161:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4161:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleCombineOperator9461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4167:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4167:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4167:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleCombineOperator9478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4173:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4173:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4173:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleCombineOperator9495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4179:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4179:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4179:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_ruleCombineOperator9512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4185:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4185:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4185:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_58_in_ruleCombineOperator9529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4191:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4191:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4191:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_59_in_ruleCombineOperator9546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4197:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4197:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4197:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_60_in_ruleCombineOperator9563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4203:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4203:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4203:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,61,FOLLOW_61_in_ruleCombineOperator9580); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4213:1: ruleVarDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'inputoutut' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) ;
    public final Enumerator ruleVarDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4215:28: ( ( (enumLiteral_0= 'inputoutut' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4216:1: ( (enumLiteral_0= 'inputoutut' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4216:1: ( (enumLiteral_0= 'inputoutut' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt65=1;
                }
                break;
            case 63:
                {
                alt65=2;
                }
                break;
            case 64:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4216:2: (enumLiteral_0= 'inputoutut' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4216:2: (enumLiteral_0= 'inputoutut' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4216:4: enumLiteral_0= 'inputoutut'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleVarDirection9625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4222:6: (enumLiteral_1= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4222:6: (enumLiteral_1= 'input' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4222:8: enumLiteral_1= 'input'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleVarDirection9642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4228:6: (enumLiteral_2= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4228:6: (enumLiteral_2= 'output' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4228:8: enumLiteral_2= 'output'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_64_in_ruleVarDirection9659); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4238:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4240:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4241:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4241:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt66=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4241:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4241:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4241:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleDirection9704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4247:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4247:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4247:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleDirection9721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4253:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4253:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4253:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleDirection9738); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4263:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4265:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4266:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4266:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            else if ( (LA67_0==69) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4266:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4266:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4266:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleTimeEventType9783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4272:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4272:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4272:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleTimeEventType9800); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4282:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4284:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4285:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4285:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt68=11;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt68=1;
                }
                break;
            case 70:
                {
                alt68=2;
                }
                break;
            case 71:
                {
                alt68=3;
                }
                break;
            case 72:
                {
                alt68=4;
                }
                break;
            case 73:
                {
                alt68=5;
                }
                break;
            case 74:
                {
                alt68=6;
                }
                break;
            case 75:
                {
                alt68=7;
                }
                break;
            case 76:
                {
                alt68=8;
                }
                break;
            case 77:
                {
                alt68=9;
                }
                break;
            case 78:
                {
                alt68=10;
                }
                break;
            case 79:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4285:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4285:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4285:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleAssignmentOperator9845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4291:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4291:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4291:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator9862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4297:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4297:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4297:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator9879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4303:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4303:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4303:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator9896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4309:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4309:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4309:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator9913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4315:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4315:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4315:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator9930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4321:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4321:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4321:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator9947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4327:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4327:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4327:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator9964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4333:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4333:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4333:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator9981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4339:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4339:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4339:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator9998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4345:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4345:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4345:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10015); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4355:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4357:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4358:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4358:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==80) ) {
                alt69=1;
            }
            else if ( (LA69_0==81) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4358:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4358:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4358:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleShiftOperator10060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4364:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4364:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4364:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator10077); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4374:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4376:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4377:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4377:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==82) ) {
                alt70=1;
            }
            else if ( (LA70_0==83) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4377:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4377:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4377:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleAdditiveOperator10122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4383:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4383:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4383:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleAdditiveOperator10139); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4393:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4395:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4396:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4396:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt71=1;
                }
                break;
            case 19:
                {
                alt71=2;
                }
                break;
            case 85:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4396:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4396:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4396:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleMultiplicativeOperator10184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4402:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4402:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4402:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicativeOperator10201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4408:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4408:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4408:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_85_in_ruleMultiplicativeOperator10218); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4418:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4420:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4421:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4421:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt72=1;
                }
                break;
            case 83:
                {
                alt72=2;
                }
                break;
            case 86:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4421:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4421:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4421:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleUnaryOperator10263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4427:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4427:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4427:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleUnaryOperator10280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4433:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4433:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4433:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_86_in_ruleUnaryOperator10297); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4443:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4445:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4446:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4446:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt73=6;
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
            case 89:
                {
                alt73=3;
                }
                break;
            case 90:
                {
                alt73=4;
                }
                break;
            case 91:
                {
                alt73=5;
                }
                break;
            case 92:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4446:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4446:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4446:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleRelationalOperator10342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4452:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4452:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4452:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleRelationalOperator10359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4458:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4458:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4458:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator10376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4464:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4464:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4464:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator10393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4470:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4470:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4470:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator10410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4476:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4476:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4476:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator10427); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4486:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4488:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4489:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4489:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt74=1;
                }
                break;
            case 94:
                {
                alt74=2;
                }
                break;
            case 95:
                {
                alt74=3;
                }
                break;
            case 96:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4489:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4489:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4489:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleTimeUnit10472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4495:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4495:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4495:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleTimeUnit10489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4501:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4501:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4501:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_95_in_ruleTimeUnit10506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4507:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4507:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:4507:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_96_in_ruleTimeUnit10523); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalSCChartsExp
    public final void synpred2_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:495:6: ( '[' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:495:8: '['
        {
        match(input,21,FOLLOW_21_in_synpred2_InternalSCChartsExp962); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSCChartsExp

    // $ANTLR start synpred3_InternalSCChartsExp
    public final void synpred3_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:594:4: ( ';' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:594:6: ';'
        {
        match(input,15,FOLLOW_15_in_synpred3_InternalSCChartsExp1175); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSCChartsExp

    // $ANTLR start synpred4_InternalSCChartsExp
    public final void synpred4_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:900:6: ( '[' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:900:8: '['
        {
        match(input,21,FOLLOW_21_in_synpred4_InternalSCChartsExp1955); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalSCChartsExp

    // $ANTLR start synpred5_InternalSCChartsExp
    public final void synpred5_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2181:4: ( ';' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:2181:6: ';'
        {
        match(input,15,FOLLOW_15_in_synpred5_InternalSCChartsExp4891); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalSCChartsExp

    // $ANTLR start synpred6_InternalSCChartsExp
    public final void synpred6_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3679:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3680:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3680:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3681:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred6_InternalSCChartsExp8367); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSCChartsExp

    // $ANTLR start synpred7_InternalSCChartsExp
    public final void synpred7_InternalSCChartsExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3784:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3785:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3785:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.scchartstext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/parser/antlr/internal/InternalSCChartsExp.g:3786:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred7_InternalSCChartsExp8590); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSCChartsExp

    // Delegated rules

    public final boolean synpred6_InternalSCChartsExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSCChartsExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSCChartsExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSCChartsExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSCChartsExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSCChartsExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSCChartsExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSCChartsExp_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA1_eotS =
        "\7\uffff";
    static final String DFA1_eofS =
        "\7\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\4\2\uffff\2\4";
    static final String DFA1_maxS =
        "\1\100\1\uffff\1\47\2\uffff\1\4\1\47";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\2\uffff";
    static final String DFA1_specialS =
        "\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\11\uffff\1\3\1\uffff\1\1\4\uffff\1\4\1\uffff\3\4\44\uffff"+
            "\3\1",
            "",
            "\1\1\16\uffff\3\4\5\uffff\1\4\13\uffff\1\5",
            "",
            "",
            "\1\6",
            "\1\1\16\uffff\3\4\5\uffff\1\4\13\uffff\1\5"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "89:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleLocalReaction )";
        }
    }
    static final String DFA26_eotS =
        "\10\uffff";
    static final String DFA26_eofS =
        "\10\uffff";
    static final String DFA26_minS =
        "\1\4\2\uffff\1\4\2\uffff\2\4";
    static final String DFA26_maxS =
        "\1\103\2\uffff\1\47\2\uffff\1\4\1\47";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\2\uffff";
    static final String DFA26_specialS =
        "\10\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\13\uffff\1\2\4\uffff\1\5\1\uffff\3\5\13\uffff\1\1\1\4"+
            "\27\uffff\3\2\3\1",
            "",
            "",
            "\1\2\16\uffff\3\5\5\uffff\1\5\13\uffff\1\6",
            "",
            "",
            "\1\7",
            "\1\2\16\uffff\3\5\5\uffff\1\5\13\uffff\1\6"
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
            return "1592:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
        }
    }
 

    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope142 = new BitSet(new long[]{0xC000000003A14012L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope161 = new BitSet(new long[]{0xC000000003A14012L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope180 = new BitSet(new long[]{0xC000000003A14012L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSignalDefinition366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition383 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDirection_in_ruleVariableDefinition501 = new BitSet(new long[]{0xC000000000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinition520 = new BitSet(new long[]{0xC000000000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition574 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinition592 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition613 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition628 = new BitSet(new long[]{0x3FC0000000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleVariableDefinition649 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction755 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLocalReaction787 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLocalReactionEffect_in_ruleLocalReaction808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionSpec_in_ruleLocalReactionTrigger913 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleLocalReactionTrigger926 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_ruleLocalReactionSpec_in_ruleLocalReactionTrigger947 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21_in_ruleLocalReactionTrigger970 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalReactionTrigger992 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReactionTrigger1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLocalReactionTrigger1026 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalReactionTrigger1047 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReactionTrigger1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionEffect_in_entryRuleLocalReactionEffect1097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionEffect1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalReactionEffect1162 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLocalReactionEffect1183 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalReactionEffect1205 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleLocalReactionSpec_in_entryRuleLocalReactionSpec1243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionSpec1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleLocalReactionSpec1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionSpec1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEntry1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInside1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleExit1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionTrigger1846 = new BitSet(new long[]{0x00003F0000200030L,0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1877 = new BitSet(new long[]{0x00003F0000200010L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger1906 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleReactionTrigger1919 = new BitSet(new long[]{0x00003F0000000010L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger1940 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21_in_ruleReactionTrigger1963 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1985 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReactionTrigger1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleReactionTrigger2019 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger2040 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReactionTrigger2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpressionreturns_in_rulePrimaryExpression2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression2219 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression2241 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimaryExpression2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpressionreturns_in_entryRulePreValueExpressionreturns2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpressionreturns2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePreValueExpressionreturns2345 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePreValueExpressionreturns2357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpressionreturns2378 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePreValueExpressionreturns2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStatechartRoot2621 = new BitSet(new long[]{0x0000001600000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStateRoot2725 = new BitSet(new long[]{0xC000000003A14010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTransitionRoot2829 = new BitSet(new long[]{0x00003F0004280030L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatechartSpecification2945 = new BitSet(new long[]{0xC000000000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2966 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2989 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInterfaceScope3385 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceScope3402 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInterfaceScope3420 = new BitSet(new long[]{0xC000006000010012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3443 = new BitSet(new long[]{0xC000006000010012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3462 = new BitSet(new long[]{0xC000006000010012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3481 = new BitSet(new long[]{0xC000006000010012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInternalScope3577 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInternalScope3589 = new BitSet(new long[]{0xC000006003A14010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3612 = new BitSet(new long[]{0xC000006003A14012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3631 = new BitSet(new long[]{0xC000006003A14012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3650 = new BitSet(new long[]{0xC000006003A14012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3669 = new BitSet(new long[]{0xC000006003A14012L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3859 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEventDefinition3872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition3889 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleEventDefinition3907 = new BitSet(new long[]{0xC000000000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperationDefinition4208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition4225 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOperationDefinition4242 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4264 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition4277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4298 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleOperationDefinition4314 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleOperationDefinition4327 = new BitSet(new long[]{0xC000000000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter4440 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleParameter4457 = new BitSet(new long[]{0xC000000000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4568 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleFQN4587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4602 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4716 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleTransitionReaction4730 = new BitSet(new long[]{0x00044000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4856 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4875 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleReactionEffect4899 = new BitSet(new long[]{0x00044000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4923 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4942 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec4983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5275 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5296 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntryEvent5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExitEvent5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOnCycleEvent5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlwaysEvent5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDefaultEvent5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDefaultEvent5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEventRaisingExpression6089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6110 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleEventRaisingExpression6123 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6331 = new BitSet(new long[]{0x0000000000020002L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6361 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6382 = new BitSet(new long[]{0x0000000000020002L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6477 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleConditionalExpression6498 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6519 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleConditionalExpression6531 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6647 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLogicalOrExpression6668 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6689 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6784 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLogicalAndExpression6805 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6826 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLogicalNotExpression6948 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7063 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBitwiseXorExpression7084 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7105 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7200 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBitwiseOrExpression7221 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7242 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7337 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBitwiseAndExpression7358 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7379 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7474 = new BitSet(new long[]{0x0000000000000002L,0x000000001F800000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7504 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7525 = new BitSet(new long[]{0x0000000000000002L,0x000000001F800000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7650 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7671 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7766 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7796 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7817 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7912 = new BitSet(new long[]{0x0000000000080002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7942 = new BitSet(new long[]{0x00000000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7963 = new BitSet(new long[]{0x0000000000080002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8094 = new BitSet(new long[]{0x00000000280003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8310 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleFeatureCall8331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8351 = new BitSet(new long[]{0x0000008008000002L});
    public static final BitSet FOLLOW_27_in_ruleFeatureCall8385 = new BitSet(new long[]{0x00040000380003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8420 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleFeatureCall8433 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8454 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleFeatureCall8470 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8574 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleElementReferenceExpression8608 = new BitSet(new long[]{0x00040000380003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8643 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleElementReferenceExpression8656 = new BitSet(new long[]{0x00040000280003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8677 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleElementReferenceExpression8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral8937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCombineOperator9461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCombineOperator9478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator9495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCombineOperator9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCombineOperator9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCombineOperator9563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCombineOperator9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleVarDirection9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleVarDirection9642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleVarDirection9659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDirection9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDirection9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDirection9738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTimeEventType9783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTimeEventType9800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAssignmentOperator9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator9896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator9930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator9981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleShiftOperator10060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator10077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAdditiveOperator10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAdditiveOperator10139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleMultiplicativeOperator10184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicativeOperator10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleMultiplicativeOperator10218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleUnaryOperator10263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnaryOperator10280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnaryOperator10297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleRelationalOperator10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRelationalOperator10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator10376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTimeUnit10472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTimeUnit10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTimeUnit10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTimeUnit10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred2_InternalSCChartsExp962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred3_InternalSCChartsExp1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred4_InternalSCChartsExp1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred5_InternalSCChartsExp4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred6_InternalSCChartsExp8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred7_InternalSCChartsExp8590 = new BitSet(new long[]{0x0000000000000002L});

}