package de.cau.cs.kieler.yakindu.model.stext.parser.antlr.internal; 

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
import de.cau.cs.kieler.yakindu.model.stext.services.SynctextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSynctextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "':'", "'='", "'with'", "';'", "'variable'", "'extern'", "'('", "')'", "'/'", "'Suspend'", "'Entry'", "'During'", "'Exit'", "','", "'val'", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'operation'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'#'", "'>'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'*'", "'%'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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


        public InternalSynctextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSynctextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSynctextParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SynctextGrammarAccess grammarAccess;
     	
        public InternalSynctextParser(TokenStream input, SynctextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateScope";	
       	}
       	
       	@Override
       	protected SynctextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:74:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:75:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:76:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope81);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope91); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:83:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;

        EObject lv_declarations_1_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:86:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:87:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:87:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:87:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:87:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:96:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||(LA2_0>=14 && LA2_0<=16)||(LA2_0>=21 && LA2_0<=23)||LA2_0==25||(LA2_0>=27 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=32)||LA2_0==55||LA2_0==62||(LA2_0>=90 && LA2_0<=92)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:97:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:97:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:98:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:98:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    int alt1=4;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 14:
            	    case 15:
            	    case 16:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case EOF:
            	    case RULE_ID:
            	    case RULE_INT:
            	    case RULE_BOOL:
            	    case RULE_FLOAT:
            	    case RULE_HEX:
            	    case RULE_STRING:
            	    case 23:
            	    case 25:
            	    case 27:
            	    case 28:
            	    case 29:
            	    case 31:
            	    case 32:
            	    case 55:
            	    case 57:
            	    case 62:
            	    case 90:
            	    case 91:
            	    case 92:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:99:3: lv_declarations_1_1= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStateScope151);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:114:8: lv_declarations_1_2= ruleSignalDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsSignalDeclarationParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleStateScope170);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:129:8: lv_declarations_1_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleStateScope189);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:144:8: lv_declarations_1_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope208);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:170:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:171:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:172:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration248);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration258); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:179:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:182:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:184:2: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration307);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:203:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:205:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition341);
            iv_ruleSignalDefinition=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDefinition351); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:212:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:215:28: ( ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:216:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:216:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:216:2: () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:216:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:217:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:225:2: ( (lv_Input_1_0= 'input' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:226:1: (lv_Input_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:226:1: (lv_Input_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:227:3: lv_Input_1_0= 'input'
                    {
                    lv_Input_1_0=(Token)match(input,14,FOLLOW_14_in_ruleSignalDefinition406); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:240:3: ( (lv_Output_2_0= 'output' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:241:1: (lv_Output_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:241:1: (lv_Output_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:242:3: lv_Output_2_0= 'output'
                    {
                    lv_Output_2_0=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition438); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSignalDefinition464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:259:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:260:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:260:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:261:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition481); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:277:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:277:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:281:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:282:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:282:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:283:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getTypeTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSignalDefinition526);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:299:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:299:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition539); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:303:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:304:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:304:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:305:3: lv_varInitialValue_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleSignalDefinition560);
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:321:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:321:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition575); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:325:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:326:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:326:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:327:3: lv_varCombineOperator_10_0= ruleCombineOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignalDefinition596);
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleSignalDefinition612); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:355:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:356:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:357:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition648);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition658); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:364:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:367:28: ( ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:368:1: ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:368:1: ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:368:2: () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:368:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:369:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVariableDefinition707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVariableKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:381:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:382:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:382:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:383:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleOperationDefinition"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:411:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:412:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:413:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition777);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition787); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:420:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:423:28: ( ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:424:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:424:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:424:2: () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:424:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:425:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOperationDefinition836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getExternKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:437:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:438:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:438:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:439:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getFunctionTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition863);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:455:2: ( (lv_name_3_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:456:1: (lv_name_3_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:456:1: (lv_name_3_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:457:3: lv_name_3_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition884);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOperationDefinition896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:477:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:478:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:478:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:479:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParamTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition923);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOperationDefinition935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition947); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:511:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:512:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:513:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction983);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction993); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:520:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:523:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:524:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:524:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:524:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:524:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==23||(LA9_0>=27 && LA9_0<=29)||(LA9_0>=31 && LA9_0<=32)||LA9_0==55||LA9_0==62||(LA9_0>=90 && LA9_0<=92)) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                int LA9_2 = input.LA(2);

                if ( (synpred11_InternalSynctext()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:525:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:525:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:526:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:526:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=27 && LA8_0<=29)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==EOF||(LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||LA8_0==23||LA8_0==25||(LA8_0>=31 && LA8_0<=32)||LA8_0==55||LA8_0==57||LA8_0==62||(LA8_0>=90 && LA8_0<=92)) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:527:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1041);
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
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:542:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1060);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:560:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:560:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLocalReaction1077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:564:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:565:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:565:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:566:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:566:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==23||(LA10_0>=31 && LA10_0<=32)||LA10_0==55||LA10_0==62||(LA10_0>=90 && LA10_0<=92)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:567:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction1100);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:582:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1119);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLocalReaction1135); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:612:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:613:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:614:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1171);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect1181); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:621:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:624:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:625:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:625:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:625:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:625:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:626:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSuspendEffect1230); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:646:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:647:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:648:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1266);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger1276); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:655:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_reactionTrigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:658:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:659:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:659:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:659:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:659:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:660:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:668:2: ( (lv_stateReaction_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:669:1: (lv_stateReaction_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:669:1: (lv_stateReaction_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:670:3: lv_stateReaction_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getStateReactionStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1334);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:686:2: (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:686:4: otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLocalReactionTrigger1347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:690:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    int alt11=2;
                    switch ( input.LA(1) ) {
                        case RULE_ID:
                        case RULE_INT:
                        case RULE_BOOL:
                        case RULE_FLOAT:
                        case RULE_HEX:
                        case RULE_STRING:
                        case 23:
                        case 31:
                        case 32:
                        case 55:
                        case 62:
                        case 90:
                        case 91:
                        case 92:
                            {
                            alt11=1;
                            }
                            break;
                        case 25:
                            {
                            int LA11_2 = input.LA(2);

                            if ( (synpred13_InternalSynctext()) ) {
                                alt11=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA11_3 = input.LA(2);

                            if ( (synpred13_InternalSynctext()) ) {
                                alt11=1;
                            }
                            }
                            break;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:692:3: lv_reactionTrigger_3_0= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerReactionTriggerParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1368);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:716:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:717:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:718:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1407);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1417); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:725:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:728:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:729:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:729:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:730:2: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1467);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:743:2: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1497);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:756:2: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1527);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:775:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:776:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:777:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1562);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1572); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:784:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:787:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:788:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:788:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:788:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:788:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:789:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEntry1621); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:809:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:810:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:811:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1657);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1667); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:818:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:821:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:822:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:822:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:822:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:822:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:823:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInside1716); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:843:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:844:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:845:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1752);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1762); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:852:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:855:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:856:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:856:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:856:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:856:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:857:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExit1811); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:877:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:878:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:879:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1847);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1857); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:886:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_labelPriority_1_0=null;
        Token otherlv_2=null;
        Token lv_delay_3_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:889:28: ( ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:890:1: ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:890:1: ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:890:2: () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:890:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:891:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:899:2: ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:899:3: ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':'
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:899:3: ( (lv_labelPriority_1_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:900:1: (lv_labelPriority_1_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:900:1: (lv_labelPriority_1_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:901:3: lv_labelPriority_1_0= RULE_INT
                    {
                    lv_labelPriority_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_labelPriority_1_0, grammarAccess.getReactionTriggerAccess().getLabelPriorityINTTerminalRuleCall_1_0_0()); 
                      		
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

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionTrigger1929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getColonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:921:3: ( (lv_delay_3_0= RULE_INT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred18_InternalSynctext()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:922:1: (lv_delay_3_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:922:1: (lv_delay_3_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:923:3: lv_delay_3_0= RULE_INT
                    {
                    lv_delay_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_delay_3_0, grammarAccess.getReactionTriggerAccess().getDelayINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReactionTriggerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"delay",
                              		lv_delay_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:939:3: ( (lv_expression_4_0= ruleExpression ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==23||(LA16_0>=31 && LA16_0<=32)||LA16_0==55||LA16_0==62||(LA16_0>=90 && LA16_0<=92)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:940:1: (lv_expression_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:940:1: (lv_expression_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:941:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getExpressionExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1975);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"Expression");
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
    // $ANTLR end "ruleReactionTrigger"


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:965:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:966:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:967:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2012);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2022); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:974:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:977:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:978:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:978:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:978:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:978:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:979:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:987:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:988:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:988:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:989:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2080);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1005:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1005:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1005:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1005:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleReactionEffect2101); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1010:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1011:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1011:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1012:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2123);
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
            	    break loop17;
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


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1036:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1037:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1038:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression2161);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression2171); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1045:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1048:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1049:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1049:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1050:2: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2221);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1061:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1061:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1061:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1062:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1070:2: ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1072:3: lv_operator_2_0= ruleMultiplicativeOperator2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperator2EnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator2_in_ruleNumericalMultiplyDivideExpression2254);
            	    lv_operator_2_0=ruleMultiplicativeOperator2();

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
            	              		"MultiplicativeOperator2");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1088:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1089:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1089:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1090:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2275);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleEventValueReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1114:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1115:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1116:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression2313);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression2323); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1123:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_1 = null;

        EObject lv_value_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1126:28: ( ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1127:1: ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1127:1: ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1127:2: () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1127:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1128:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleEventValueReferenceExpression2372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEventValueReferenceExpression2384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1144:1: ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1145:1: ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1145:1: ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1146:1: (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1146:1: (lv_value_3_1= ruleFeatureCall | lv_value_3_2= rulePreReferenceExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1147:3: lv_value_3_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression2407);
                    lv_value_3_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventValueReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_1, 
                              		"FeatureCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1162:8: lv_value_3_2= rulePreReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValuePreReferenceExpressionParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreReferenceExpression_in_ruleEventValueReferenceExpression2426);
                    lv_value_3_2=rulePreReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventValueReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_2, 
                              		"PreReferenceExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleEventValueReferenceExpression2441); if (state.failed) return current;
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


    // $ANTLR start "entryRulePreReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1192:1: entryRulePreReferenceExpression returns [EObject current=null] : iv_rulePreReferenceExpression= rulePreReferenceExpression EOF ;
    public final EObject entryRulePreReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1193:2: (iv_rulePreReferenceExpression= rulePreReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1194:2: iv_rulePreReferenceExpression= rulePreReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreReferenceExpression_in_entryRulePreReferenceExpression2477);
            iv_rulePreReferenceExpression=rulePreReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreReferenceExpression2487); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreReferenceExpression"


    // $ANTLR start "rulePreReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1201:1: rulePreReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) ;
    public final EObject rulePreReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_1 = null;

        EObject lv_value_3_2 = null;

        EObject lv_value_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1204:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1205:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1205:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1205:2: () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1205:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1206:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePreReferenceExpression2536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreReferenceExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePreReferenceExpression2548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1222:1: ( ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1223:1: ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1223:1: ( (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1224:1: (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1224:1: (lv_value_3_1= ruleFeatureCall | lv_value_3_2= ruleEventValueReferenceExpression | lv_value_3_3= rulePreReferenceExpression )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1225:3: lv_value_3_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePreReferenceExpression2571);
                    lv_value_3_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_1, 
                              		"FeatureCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1240:8: lv_value_3_2= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreReferenceExpressionAccess().getValueEventValueReferenceExpressionParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePreReferenceExpression2590);
                    lv_value_3_2=ruleEventValueReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_2, 
                              		"EventValueReferenceExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1255:8: lv_value_3_3= rulePreReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreReferenceExpressionAccess().getValuePreReferenceExpressionParserRuleCall_3_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreReferenceExpression_in_rulePreReferenceExpression2609);
                    lv_value_3_3=rulePreReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_3, 
                              		"PreReferenceExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePreReferenceExpression2624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPreReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreReferenceExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1285:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1286:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1287:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2660);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2670); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1294:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_ActiveStateReferenceExpression_2 = null;

        EObject this_EventValueReferenceExpression_3 = null;

        EObject this_PreReferenceExpression_4 = null;

        EObject this_ParenthesizedExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1297:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1298:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1298:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression )
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
            case 31:
                {
                alt21=4;
                }
                break;
            case 32:
                {
                alt21=5;
                }
                break;
            case 23:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1299:2: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2720);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1312:2: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2750);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1325:2: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2780);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1338:2: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2810);
                    this_EventValueReferenceExpression_3=ruleEventValueReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventValueReferenceExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1351:2: this_PreReferenceExpression_4= rulePreReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreReferenceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreReferenceExpression_in_rulePrimaryExpression2840);
                    this_PreReferenceExpression_4=rulePreReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PreReferenceExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1364:2: this_ParenthesizedExpression_5= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2870);
                    this_ParenthesizedExpression_5=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_5; 
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


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1387:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1388:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1389:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2909);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2919); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1396:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1399:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1400:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1400:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1401:2: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2969);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1414:2: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2999);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1427:2: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot3029);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1446:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1447:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1448:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot3064);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot3074); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1455:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1458:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1459:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1459:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1459:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStatechartRoot3111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1463:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1464:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1464:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1465:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot3132);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1489:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1490:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1491:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot3168);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot3178); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1498:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1501:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1502:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1502:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1502:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStateRoot3215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1506:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1507:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1507:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1508:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot3236);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1532:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1533:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1534:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot3272);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot3282); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1541:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1544:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1545:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1545:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1545:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTransitionRoot3319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1549:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1550:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1550:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1551:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3340);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1577:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1578:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1579:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3378);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification3388); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1586:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1589:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1590:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1590:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1590:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1590:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1591:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1599:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1599:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleStatechartSpecification3438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1603:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1604:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1604:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1605:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3459);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1621:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=37 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1622:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1622:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1623:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3482);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1647:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1648:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1649:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3519);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3529); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1656:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1659:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1660:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1660:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1661:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1661:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1662:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3574);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1686:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1687:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1688:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3609);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3619); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1695:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1698:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1699:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1699:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1700:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1700:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1701:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3664);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1727:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1728:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1729:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3701);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3711); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1736:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1739:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1740:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1740:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1741:2: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3761);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1754:2: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3791);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1775:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1776:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1777:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3828);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3838); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1784:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1787:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1788:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1788:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1788:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1788:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1789:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleInterfaceScope3887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1801:1: ( (lv_name_2_0= ruleXID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||(LA26_0>=36 && LA26_0<=55)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1802:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1802:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1803:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3908);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope3921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1823:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=21 && LA28_0<=22)||(LA28_0>=39 && LA28_0<=42)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1824:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1824:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1825:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1825:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 21:
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1826:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3944);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1841:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3963);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1856:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3982);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1882:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1883:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1884:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope4022);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope4032); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1891:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1894:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1895:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1895:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1895:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1895:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1896:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleInternalScope4081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalScope4093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1912:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||(LA30_0>=21 && LA30_0<=23)||LA30_0==25||(LA30_0>=27 && LA30_0<=29)||(LA30_0>=31 && LA30_0<=32)||(LA30_0>=39 && LA30_0<=42)||LA30_0==55||LA30_0==62||(LA30_0>=90 && LA30_0<=92)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1913:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1913:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1914:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1914:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case EOF:
            	    case RULE_ID:
            	    case RULE_INT:
            	    case RULE_BOOL:
            	    case RULE_FLOAT:
            	    case RULE_HEX:
            	    case RULE_STRING:
            	    case 23:
            	    case 25:
            	    case 27:
            	    case 28:
            	    case 29:
            	    case 31:
            	    case 32:
            	    case 55:
            	    case 57:
            	    case 62:
            	    case 90:
            	    case 91:
            	    case 92:
            	        {
            	        alt29=4;
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1915:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope4116);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1930:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope4135);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1945:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope4154);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1960:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope4173);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1988:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1989:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1990:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion4215);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion4225); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1997:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2000:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2002:2: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion4274);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2023:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2024:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2025:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4310);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition4320); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2032:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2035:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2036:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2036:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2036:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2036:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=40 && LA31_0<=42)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2037:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2037:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2038:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition4366);
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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEventDefinition4379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2058:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2059:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2059:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2060:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition4400);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2076:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2076:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventDefinition4413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2080:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2081:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2081:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2082:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4440);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2106:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2107:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2108:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4478);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4488); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2115:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2118:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2120:2: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4537);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2141:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2142:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2143:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4573);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4583); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2150:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2153:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2155:2: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4632);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2178:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2179:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2180:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4671);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4682); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2187:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2190:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2191:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2191:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2191:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2200:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleXID4746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2207:2: kw= 'interface'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleXID4765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2214:2: kw= 'internal'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2221:2: kw= 'event'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2228:2: kw= 'local'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2235:2: kw= 'in'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2242:2: kw= 'out'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2249:2: kw= 'var'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2256:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2263:2: kw= 'external'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2270:2: kw= 'operation'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2277:2: kw= 'default'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2284:2: kw= 'else'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2291:2: kw= 'entry'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2298:2: kw= 'exit'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID5012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2305:2: kw= 'always'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID5031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2312:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID5050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2319:2: kw= 'raise'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID5069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2326:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID5088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2333:2: kw= 'active'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleXID5107); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2346:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2347:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2348:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5148);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5159); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2355:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2358:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2359:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2359:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2360:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN5206);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2370:1: (kw= '.' this_XID_2= ruleXID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==56) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2371:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruleFQN5225); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN5247);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2397:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2398:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2399:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5296);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5306); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2406:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2409:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2410:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2410:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2410:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2410:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2411:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2419:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                case RULE_INT:
                case RULE_BOOL:
                case RULE_FLOAT:
                case RULE_HEX:
                case RULE_STRING:
                case 23:
                case 31:
                case 32:
                case 47:
                case 48:
                case 55:
                case 62:
                case 90:
                case 91:
                case 92:
                    {
                    alt35=1;
                    }
                    break;
                case 25:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred67_InternalSynctext()) ) {
                        alt35=1;
                    }
                    }
                    break;
                case 57:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred67_InternalSynctext()) ) {
                        alt35=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred67_InternalSynctext()) ) {
                        alt35=1;
                    }
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2420:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2420:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2421:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5364);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2437:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2437:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTransitionReaction5378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2441:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2442:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2442:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2443:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5399);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2459:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2459:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleTransitionReaction5414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2463:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID||LA37_0==58) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2464:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2464:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2465:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5435);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2489:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2490:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2491:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5474);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5484); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2498:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2501:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2502:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2502:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==EOF||(LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||LA39_0==23||LA39_0==25||(LA39_0>=31 && LA39_0<=32)||LA39_0==55||LA39_0==57||LA39_0==62||(LA39_0>=90 && LA39_0<=92)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2503:2: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5534);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2516:2: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5564);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2535:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2536:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2537:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5599);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5609); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2544:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2547:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2548:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2548:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2548:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2548:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2549:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2557:2: (otherlv_1= 'default' | otherlv_2= 'else' )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2557:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDefaultTrigger5659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2562:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDefaultTrigger5677); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2574:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2575:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2576:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5714);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty5724); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2583:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2586:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2587:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2587:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2588:2: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5774);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2601:2: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5804);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2620:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2621:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2622:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5839);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5849); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2629:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2632:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2633:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2633:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2633:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleEntryPointSpec5886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2637:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2638:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2638:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2639:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec5903); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2663:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2664:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2665:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5944);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5954); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2672:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2675:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2676:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2676:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2676:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2676:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2677:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2677:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2678:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec5996); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleExitPointSpec6013); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2708:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2709:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2710:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6051);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec6061); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2717:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2720:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2721:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2721:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2722:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2722:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2723:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6106);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2747:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2748:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2749:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6141);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec6151); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2756:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2759:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2760:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2760:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2760:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2760:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2761:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2761:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2762:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6197);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2778:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2779:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2779:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2780:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6218);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2796:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2797:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2797:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2798:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6239);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2822:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2823:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2824:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6275);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec6285); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2831:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2834:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2835:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2835:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2836:2: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6335);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2849:2: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6365);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2862:2: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6395);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2881:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2882:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2883:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6430);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent6440); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2890:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2893:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2894:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2894:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2894:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2894:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2895:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleEntryEvent6489); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2915:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2916:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2917:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6525);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6535); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2924:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2927:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2928:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2928:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2928:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2928:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2929:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleExitEvent6584); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2949:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2950:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2951:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6620);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6630); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2958:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2961:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2962:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2962:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2962:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2962:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2963:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2971:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2971:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAlwaysEvent6680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2976:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleAlwaysEvent6698); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2992:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2993:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2994:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6739);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6749); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3001:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3004:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3006:2: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6798);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3025:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3026:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3027:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6832);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6842); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3034:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3037:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3038:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3038:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3039:2: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6892);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3050:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18||(LA44_0>=78 && LA44_0<=87)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3050:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3050:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3051:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3059:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3060:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3060:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3061:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6925);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3077:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3078:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3078:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3079:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6946);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3103:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3104:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3105:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6984);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6994); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3112:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3115:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3116:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3116:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3117:2: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7044);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3128:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3128:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3128:2: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3129:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleConditionalExpression7068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3141:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3142:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3142:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3143:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7089);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConditionalExpression7101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3163:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3164:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3164:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3165:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7122);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3189:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3190:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3191:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7160);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression7170); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3198:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3201:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3202:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3202:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3203:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7220);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3214:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==60) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3214:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3214:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3215:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleLogicalOrExpression7244); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3227:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3228:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3228:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3229:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7265);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3253:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3254:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3255:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7303);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression7313); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3262:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3265:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3266:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3266:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3267:2: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7363);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3278:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==61) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3278:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3278:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3279:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLogicalAndExpression7387); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3291:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3292:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3292:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3293:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7408);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3317:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3318:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3319:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7446);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7456); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3326:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3329:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3330:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3330:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==23||(LA48_0>=31 && LA48_0<=32)||LA48_0==55||(LA48_0>=90 && LA48_0<=92)) ) {
                alt48=1;
            }
            else if ( (LA48_0==62) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3331:2: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7506);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3343:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3343:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3343:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3343:7: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3344:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleLogicalNotExpression7536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3356:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3357:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3357:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3358:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7557);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3382:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3383:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3384:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7594);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7604); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3391:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3394:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3395:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3395:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3396:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7654);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3407:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==63) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3407:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3407:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3408:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleBitwiseXorExpression7678); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3420:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3421:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3421:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3422:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7699);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3446:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3447:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3448:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7737);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7747); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3455:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3458:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3459:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3459:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3460:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7797);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3471:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==64) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3471:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3471:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3472:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseOrExpression7821); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3484:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3485:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3485:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3486:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7842);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3510:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3511:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3512:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7880);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7890); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3519:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3522:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3523:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3523:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3524:2: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7940);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3535:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==65) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3535:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3535:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3536:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleBitwiseAndExpression7964); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3548:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3549:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3549:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3550:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7985);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3574:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3575:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3576:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8023);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression8033); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3583:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3586:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3587:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3587:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3588:2: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8083);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3599:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==58||(LA52_0>=93 && LA52_0<=97)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3599:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3599:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3600:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3608:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3609:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3609:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3610:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8116);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3626:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3627:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3627:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3628:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8137);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3652:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3653:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3654:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression8175);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression8185); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3661:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3664:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3665:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3665:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3666:2: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8235);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3677:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=88 && LA53_0<=89)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3677:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3677:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3678:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3686:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3687:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3687:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3688:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression8268);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3704:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3705:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3705:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3706:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8289);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3730:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3731:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3732:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression8327);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression8337); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3739:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3742:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3744:2: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8387);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3755:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=90 && LA54_0<=91)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3755:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3755:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3756:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3764:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3765:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3765:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3766:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8420);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3782:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3783:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3783:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3784:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8441);
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


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3808:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3809:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3810:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8479);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8489); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3817:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3820:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3821:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3821:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_STRING)||LA55_0==23||(LA55_0>=31 && LA55_0<=32)||LA55_0==55) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=90 && LA55_0<=92)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3822:2: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8539);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3834:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3834:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3834:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3834:7: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3835:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3843:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3844:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3844:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3845:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8578);
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3861:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3862:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3862:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3863:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8599);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3887:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3888:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3889:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8636);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8646); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3896:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3899:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3900:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3900:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3900:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3900:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3901:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3909:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3910:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3910:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3911:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8704);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3935:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3936:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3937:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8740);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8750); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3944:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3947:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3948:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3948:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3949:2: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8800);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3960:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==56) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3960:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3960:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3961:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleFeatureCall8824); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3973:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3974:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3974:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3975:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8848); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3989:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==23) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3989:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3989:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3989:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3996:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3997:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,23,FOLLOW_23_in_ruleFeatureCall8882); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4010:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt57=2;
            	            int LA57_0 = input.LA(1);

            	            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==23||(LA57_0>=31 && LA57_0<=32)||LA57_0==55||LA57_0==62||(LA57_0>=90 && LA57_0<=92)) ) {
            	                alt57=1;
            	            }
            	            switch (alt57) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4010:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4010:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4011:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4011:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4012:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8917);
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

            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4028:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop56:
            	                    do {
            	                        int alt56=2;
            	                        int LA56_0 = input.LA(1);

            	                        if ( (LA56_0==30) ) {
            	                            alt56=1;
            	                        }


            	                        switch (alt56) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4028:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleFeatureCall8930); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4032:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4033:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4033:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4034:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8951);
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

            	            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleFeatureCall8967); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4062:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4063:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4064:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression9007);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression9017); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4071:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4074:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4075:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4075:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4075:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4075:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4076:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4084:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4085:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4085:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4086:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression9078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4100:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==23) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4100:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4100:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4100:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4107:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4108:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,23,FOLLOW_23_in_ruleElementReferenceExpression9112); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4121:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==23||(LA61_0>=31 && LA61_0<=32)||LA61_0==55||LA61_0==62||(LA61_0>=90 && LA61_0<=92)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4121:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4121:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4122:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4122:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4123:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9147);
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

                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4139:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==30) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4139:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleElementReferenceExpression9160); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4143:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4144:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4144:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4145:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9181);
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

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleElementReferenceExpression9197); if (state.failed) return current;
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


    // $ANTLR start "entryRuleActiveStateReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4173:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4174:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4175:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9235);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9245); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4182:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4185:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4186:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4186:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4186:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4186:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4187:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleActiveStateReferenceExpression9294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleActiveStateReferenceExpression9306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4203:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4204:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4204:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4205:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9333);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleActiveStateReferenceExpression9345); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4233:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4234:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4235:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9381);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9391); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4242:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4245:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4246:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4246:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4246:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4246:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4247:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParenthesizedExpression9440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4259:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4260:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4260:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4261:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9461);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParenthesizedExpression9473); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4289:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4290:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4291:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9509);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9519); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4298:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4301:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4302:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4302:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4303:2: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9569);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4316:2: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9599);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4329:2: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9629);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4342:2: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9659);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4355:2: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9689);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4374:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4375:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4376:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9724);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9734); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4383:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4386:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4387:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4387:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4387:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4387:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4388:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4396:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4397:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4397:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4398:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9788); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4422:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4423:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4424:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9829);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9839); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4431:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4434:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4436:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4444:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4445:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4445:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4446:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9893); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4470:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4471:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4472:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9934);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9944); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4479:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4482:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4483:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4483:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4483:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4483:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4484:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4492:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4493:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4493:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4494:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9998); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4518:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4519:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4520:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral10039);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral10049); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4527:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4530:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4531:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4531:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4531:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4531:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4532:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4540:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4541:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4541:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4542:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral10103); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4566:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4567:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4568:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10144);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral10154); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4575:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4578:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4579:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4579:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4579:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4579:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4580:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4588:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4589:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4589:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4590:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10208); if (state.failed) return current;
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


    // $ANTLR start "ruleMultiplicativeOperator2"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4614:1: ruleMultiplicativeOperator2 returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator2() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4616:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4617:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4617:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt64=1;
                }
                break;
            case 17:
                {
                alt64=2;
                }
                break;
            case 67:
                {
                alt64=3;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4617:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4617:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4617:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_ruleMultiplicativeOperator210263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperator2Access().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperator2Access().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4623:6: (enumLiteral_1= ':' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4623:6: (enumLiteral_1= ':' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4623:8: enumLiteral_1= ':'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_17_in_ruleMultiplicativeOperator210280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperator2Access().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperator2Access().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4629:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4629:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4629:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleMultiplicativeOperator210297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperator2Access().getModEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperator2Access().getModEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleMultiplicativeOperator2"


    // $ANTLR start "ruleCombineOperator"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4639:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4641:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4642:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4642:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt65=8;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt65=1;
                }
                break;
            case 69:
                {
                alt65=2;
                }
                break;
            case 70:
                {
                alt65=3;
                }
                break;
            case 71:
                {
                alt65=4;
                }
                break;
            case 72:
                {
                alt65=5;
                }
                break;
            case 73:
                {
                alt65=6;
                }
                break;
            case 74:
                {
                alt65=7;
                }
                break;
            case 75:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4642:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4642:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4642:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator10342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4648:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4648:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4648:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator10359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4654:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4654:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4654:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4660:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4660:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4660:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4666:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4666:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4666:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4672:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4672:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4672:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_73_in_ruleCombineOperator10427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4678:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4678:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4678:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_74_in_ruleCombineOperator10444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4684:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4684:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4684:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,75,FOLLOW_75_in_ruleCombineOperator10461); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4694:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4696:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4697:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4697:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4697:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4697:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4697:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleDirection10506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4703:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4703:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4703:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleDirection10523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4709:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4709:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4709:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleDirection10540); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4719:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4721:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4722:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4722:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==76) ) {
                alt67=1;
            }
            else if ( (LA67_0==77) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4722:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4722:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4722:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleTimeEventType10585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4728:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4728:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4728:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleTimeEventType10602); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4738:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4740:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4741:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4741:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt68=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt68=1;
                }
                break;
            case 78:
                {
                alt68=2;
                }
                break;
            case 79:
                {
                alt68=3;
                }
                break;
            case 80:
                {
                alt68=4;
                }
                break;
            case 81:
                {
                alt68=5;
                }
                break;
            case 82:
                {
                alt68=6;
                }
                break;
            case 83:
                {
                alt68=7;
                }
                break;
            case 84:
                {
                alt68=8;
                }
                break;
            case 85:
                {
                alt68=9;
                }
                break;
            case 86:
                {
                alt68=10;
                }
                break;
            case 87:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4741:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4741:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4741:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleAssignmentOperator10647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4747:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4747:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4747:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4753:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4753:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4753:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4759:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4759:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4759:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4765:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4765:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4765:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4771:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4771:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4771:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4777:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4777:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4777:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4783:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4783:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4783:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4789:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4789:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4789:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,85,FOLLOW_85_in_ruleAssignmentOperator10783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4795:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4795:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4795:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,86,FOLLOW_86_in_ruleAssignmentOperator10800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4801:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4801:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4801:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,87,FOLLOW_87_in_ruleAssignmentOperator10817); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4811:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4813:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4814:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4814:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==88) ) {
                alt69=1;
            }
            else if ( (LA69_0==89) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4814:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4814:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4814:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleShiftOperator10862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4820:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4820:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4820:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleShiftOperator10879); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4830:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4832:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4833:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4833:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==90) ) {
                alt70=1;
            }
            else if ( (LA70_0==91) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4833:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4833:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4833:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_90_in_ruleAdditiveOperator10924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4839:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4839:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4839:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_91_in_ruleAdditiveOperator10941); if (state.failed) return current;
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


    // $ANTLR start "ruleUnaryOperator"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4851:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4853:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4854:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4854:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt71=1;
                }
                break;
            case 91:
                {
                alt71=2;
                }
                break;
            case 92:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4854:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4854:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4854:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_90_in_ruleUnaryOperator10988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4860:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4860:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4860:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_91_in_ruleUnaryOperator11005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4866:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4866:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4866:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_92_in_ruleUnaryOperator11022); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4876:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4878:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4879:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4879:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt72=6;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt72=1;
                }
                break;
            case 94:
                {
                alt72=2;
                }
                break;
            case 58:
                {
                alt72=3;
                }
                break;
            case 95:
                {
                alt72=4;
                }
                break;
            case 96:
                {
                alt72=5;
                }
                break;
            case 97:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4879:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4879:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4879:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator11067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4885:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4885:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4885:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator11084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4891:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4891:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4891:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleRelationalOperator11101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4897:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4897:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4897:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator11118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4903:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4903:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4903:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator11135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4909:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4909:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4909:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,97,FOLLOW_97_in_ruleRelationalOperator11152); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4919:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4921:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4922:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4922:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt73=1;
                }
                break;
            case 99:
                {
                alt73=2;
                }
                break;
            case 100:
                {
                alt73=3;
                }
                break;
            case 101:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4922:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4922:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4922:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit11197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4928:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4928:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4928:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit11214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4934:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4934:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4934:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit11231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4940:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4940:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4940:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_101_in_ruleTimeUnit11248); if (state.failed) return current;
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

    // $ANTLR start synpred11_InternalSynctext
    public final void synpred11_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_trigger_0_1 = null;

        EObject lv_trigger_0_2 = null;


        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:525:1: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:525:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:525:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:526:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:526:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
        int alt77=2;
        int LA77_0 = input.LA(1);

        if ( ((LA77_0>=27 && LA77_0<=29)) ) {
            alt77=1;
        }
        else if ( (LA77_0==EOF||(LA77_0>=RULE_ID && LA77_0<=RULE_STRING)||LA77_0==23||LA77_0==25||(LA77_0>=31 && LA77_0<=32)||LA77_0==55||LA77_0==57||LA77_0==62||(LA77_0>=90 && LA77_0<=92)) ) {
            alt77=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 77, 0, input);

            throw nvae;
        }
        switch (alt77) {
            case 1 :
                // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:527:3: lv_trigger_0_1= ruleLocalReactionTrigger
                {
                pushFollow(FOLLOW_ruleLocalReactionTrigger_in_synpred11_InternalSynctext1041);
                lv_trigger_0_1=ruleLocalReactionTrigger();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:542:8: lv_trigger_0_2= ruleReactionTrigger
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                  	    
                }
                pushFollow(FOLLOW_ruleReactionTrigger_in_synpred11_InternalSynctext1060);
                lv_trigger_0_2=ruleReactionTrigger();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSynctext

    // $ANTLR start synpred13_InternalSynctext
    public final void synpred13_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_reactionTrigger_3_0 = null;


        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:692:3: lv_reactionTrigger_3_0= ruleReactionTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerReactionTriggerParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleReactionTrigger_in_synpred13_InternalSynctext1368);
        lv_reactionTrigger_3_0=ruleReactionTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSynctext

    // $ANTLR start synpred17_InternalSynctext
    public final void synpred17_InternalSynctext_fragment() throws RecognitionException {   
        Token lv_labelPriority_1_0=null;
        Token otherlv_2=null;

        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:899:3: ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:899:3: ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':'
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:899:3: ( (lv_labelPriority_1_0= RULE_INT ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:900:1: (lv_labelPriority_1_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:900:1: (lv_labelPriority_1_0= RULE_INT )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:901:3: lv_labelPriority_1_0= RULE_INT
        {
        lv_labelPriority_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred17_InternalSynctext1912); if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,17,FOLLOW_17_in_synpred17_InternalSynctext1929); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalSynctext

    // $ANTLR start synpred18_InternalSynctext
    public final void synpred18_InternalSynctext_fragment() throws RecognitionException {   
        Token lv_delay_3_0=null;

        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:922:1: ( (lv_delay_3_0= RULE_INT ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:922:1: (lv_delay_3_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:922:1: (lv_delay_3_0= RULE_INT )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:923:3: lv_delay_3_0= RULE_INT
        {
        lv_delay_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred18_InternalSynctext1948); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSynctext

    // $ANTLR start synpred22_InternalSynctext
    public final void synpred22_InternalSynctext_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1061:2: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1061:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1061:2: ()
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1062:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1070:2: ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1072:3: lv_operator_2_0= ruleMultiplicativeOperator2
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperator2EnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplicativeOperator2_in_synpred22_InternalSynctext2254);
        lv_operator_2_0=ruleMultiplicativeOperator2();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1088:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1089:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1089:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1090:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_synpred22_InternalSynctext2275);
        lv_rightOperand_3_0=ruleNumericalUnaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSynctext

    // $ANTLR start synpred67_InternalSynctext
    public final void synpred67_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_trigger_1_0 = null;


        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2420:1: ( (lv_trigger_1_0= ruleStextTrigger ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2420:1: (lv_trigger_1_0= ruleStextTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2420:1: (lv_trigger_1_0= ruleStextTrigger )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2421:3: lv_trigger_1_0= ruleStextTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStextTrigger_in_synpred67_InternalSynctext5364);
        lv_trigger_1_0=ruleStextTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred67_InternalSynctext

    // Delegated rules

    public final boolean synpred13_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA14_eotS =
        "\23\uffff";
    static final String DFA14_eofS =
        "\1\2\22\uffff";
    static final String DFA14_minS =
        "\1\4\1\0\21\uffff";
    static final String DFA14_maxS =
        "\1\134\1\0\21\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA14_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\1\4\2\15\uffff\1\2\1\uffff\1\2\5\uffff\2\2\26\uffff"+
            "\1\2\1\uffff\1\2\4\uffff\1\2\33\uffff\3\2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "899:2: ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSynctext()) ) {s = 18;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\52\uffff";
    static final String DFA18_eofS =
        "\1\1\51\uffff";
    static final String DFA18_minS =
        "\1\21\46\uffff\1\0\2\uffff";
    static final String DFA18_maxS =
        "\1\145\46\uffff\1\0\2\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\46\uffff\1\1\1\uffff";
    static final String DFA18_specialS =
        "\47\uffff\1\0\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\47\3\1\3\uffff\2\1\4\uffff\1\1\32\uffff\5\1\1\uffff\3\1"+
            "\2\50\12\uffff\16\1\1\uffff\11\1",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1061:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_39 = input.LA(1);

                         
                        int index18_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSynctext()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_39);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope151 = new BitSet(new long[]{0x40800001BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope170 = new BitSet(new long[]{0x40800001BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope189 = new BitSet(new long[]{0x40800001BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope208 = new BitSet(new long[]{0x40800001BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSignalDefinition406 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition438 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSignalDefinition464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition481 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleSignalDefinition499 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSignalDefinition526 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition539 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition560 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition596 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableDefinition707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition724 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperationDefinition836 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition863 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition884 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition896 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition923 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperationDefinition935 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1041 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1060 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLocalReaction1077 = new BitSet(new long[]{0x40800001848003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction1100 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1119 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalReaction1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSuspendEffect1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1334 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLocalReactionTrigger1347 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEntry1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInside1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExit1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1912 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReactionTrigger1929 = new BitSet(new long[]{0x40800001808003F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1948 = new BitSet(new long[]{0x40800001808003F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2080 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleReactionEffect2101 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2123 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2221 = new BitSet(new long[]{0x0000000000020002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator2_in_ruleNumericalMultiplyDivideExpression2254 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2275 = new BitSet(new long[]{0x0000000000020002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression2313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEventValueReferenceExpression2372 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEventValueReferenceExpression2384 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression2407 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_ruleEventValueReferenceExpression2426 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEventValueReferenceExpression2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_entryRulePreReferenceExpression2477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreReferenceExpression2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePreReferenceExpression2536 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePreReferenceExpression2548 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreReferenceExpression2571 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePreReferenceExpression2590 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_rulePreReferenceExpression2609 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePreReferenceExpression2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_rulePrimaryExpression2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatechartRoot3111 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot3168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateRoot3215 = new BitSet(new long[]{0x40800001BAE1C3F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot3272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTransitionRoot3319 = new BitSet(new long[]{0x42818001828003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStatechartSpecification3438 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3459 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3482 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInterfaceScope3887 = new BitSet(new long[]{0x00FFFFF000020010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3908 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope3921 = new BitSet(new long[]{0x0000078000600002L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3944 = new BitSet(new long[]{0x0000078000600002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3963 = new BitSet(new long[]{0x0000078000600002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3982 = new BitSet(new long[]{0x0000078000600002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInternalScope4081 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalScope4093 = new BitSet(new long[]{0x40800781BAE1C3F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope4116 = new BitSet(new long[]{0x40800781BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope4135 = new BitSet(new long[]{0x40800781BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope4154 = new BitSet(new long[]{0x40800781BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope4173 = new BitSet(new long[]{0x40800781BAE1C3F2L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion4215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition4366 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEventDefinition4379 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition4400 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventDefinition4413 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXID4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXID4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXID5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXID5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5206 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFQN5225 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5247 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5364 = new BitSet(new long[]{0x0200000002000002L});
    public static final BitSet FOLLOW_25_in_ruleTransitionReaction5378 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5399 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTransitionReaction5414 = new BitSet(new long[]{0x0400000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5435 = new BitSet(new long[]{0x0400000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultTrigger5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultTrigger5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEntryPointSpec5886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec5996 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleExitPointSpec6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6197 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6218 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEntryEvent6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExitEvent6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAlwaysEvent6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAlwaysEvent6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6892 = new BitSet(new long[]{0x0000000000040002L,0x0000000000FFC000L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6925 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6946 = new BitSet(new long[]{0x0000000000040002L,0x0000000000FFC000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7044 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleConditionalExpression7068 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7089 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditionalExpression7101 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7220 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicalOrExpression7244 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7265 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7363 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalAndExpression7387 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7408 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLogicalNotExpression7536 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7654 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBitwiseXorExpression7678 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7699 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseOrExpression7821 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7940 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBitwiseAndExpression7964 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7985 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8083 = new BitSet(new long[]{0x0400000000000002L,0x00000003E0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8116 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8137 = new BitSet(new long[]{0x0400000000000002L,0x00000003E0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression8175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8235 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression8268 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8289 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression8327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8387 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8420 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8441 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8578 = new BitSet(new long[]{0x00800001808003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8800 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFeatureCall8824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8848 = new BitSet(new long[]{0x0100000000800002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureCall8882 = new BitSet(new long[]{0x40800001818003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8917 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_30_in_ruleFeatureCall8930 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8951 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_24_in_ruleFeatureCall8967 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression9007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression9078 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleElementReferenceExpression9112 = new BitSet(new long[]{0x40800001818003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9147 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_30_in_ruleElementReferenceExpression9160 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9181 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_24_in_ruleElementReferenceExpression9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleActiveStateReferenceExpression9294 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActiveStateReferenceExpression9306 = new BitSet(new long[]{0x00FFFFF000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9333 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActiveStateReferenceExpression9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParenthesizedExpression9440 = new BitSet(new long[]{0x40800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParenthesizedExpression9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral10039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleMultiplicativeOperator210263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMultiplicativeOperator210280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleMultiplicativeOperator210297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCombineOperator10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCombineOperator10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCombineOperator10461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDirection10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDirection10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDirection10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTimeEventType10585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTimeEventType10602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssignmentOperator10647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssignmentOperator10783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAssignmentOperator10800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAssignmentOperator10817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleShiftOperator10862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleShiftOperator10879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAdditiveOperator10924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAdditiveOperator10941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUnaryOperator10988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUnaryOperator11005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleUnaryOperator11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRelationalOperator11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator11118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRelationalOperator11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit11197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit11214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit11231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleTimeUnit11248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_synpred11_InternalSynctext1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_synpred11_InternalSynctext1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_synpred13_InternalSynctext1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred17_InternalSynctext1912 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred17_InternalSynctext1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred18_InternalSynctext1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator2_in_synpred22_InternalSynctext2254 = new BitSet(new long[]{0x00800001808003F0L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_synpred22_InternalSynctext2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_synpred67_InternalSynctext5364 = new BitSet(new long[]{0x0000000000000002L});

}